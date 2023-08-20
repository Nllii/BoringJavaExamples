package Exercise;
// import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class fancyIncrements {
    public static void main(String[] args){
        int base_number;
        System.out.println("base_number"+"\t"+"first_number" +"\t");

        for (base_number = 1; base_number <=14; base_number++){
            int first_number = base_number , second_number =base_number, third_number = base_number;
            double fourth_num = base_number;

            first_number+=2;
            second_number-=2;
            third_number*=2;
            fourth_num/=2;

            System.out.println(base_number + "\t" + first_number +"\t");




        }
    }
  
    
    
}
