package Exercise;
// simple sine wave kinda!



public class waves {
    public static void main(String[] args){
        int stars = 0;
        for (stars = 0; stars < 10; stars ++){
            // sleep for 1 second
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
            // print stars +1 times for each iteration
            for (int i = 0; i < stars; i++){
                System.out.print("*");
            }
            System.out.println();
            if (stars == 9){
                for (stars = 10; stars > 0; stars --){
                    // print stars -1 times for each iteration
                    for (int i = 0; i < stars; i++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
            // sleep for 1 second
        }


    }
    
}
