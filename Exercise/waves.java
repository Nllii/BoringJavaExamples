package Exercise;
// simple sine wave kinda!



public class waves {
    public static void main(String[] args)
    {
        int stars = 0;
        for (stars = 0; stars < 10; stars ++){
            // print stars -1 times for each iteration
            for (int i = 0; i < stars; i++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (stars = 10; stars > 0; stars --){
            // print stars -1 times for each iteration
            for (int i = 0; i < stars; i++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }

    
    
}
