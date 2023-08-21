#!bin/bash

# compiles the java scripts

push(){
    git add .
    git commit -am "added scripts"
    git push 
}





cc(){
    echo "compiling c++ file: $1 output:$2"
    g++ -shared -fPIC "$1" -o  "$2"
}

compileJ(){
    javaFile=${1::-5}
    echo "compiling java file: $1 output filename:$javaFile"
    cd ./Exercise
    javac "$1" 

    echo "java file: $javaFile"
    echo ""
    java "$javaFile".java



}   

Jbin(){
    echo "compiling binary file: $1 output:$2"
    jar cfe "$1".jar Exercise."$1" Exercise/"$1".class
    java -jar "$1".jar
}
"${@:1}" "${@:3}"
