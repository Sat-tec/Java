import java.util.*;

class primenum{
    public static void main(String args[]){
        int[] array = new int[4];

        for(int i = 0; i < 4; i++){
            System.out.println("Enter array num at " + i);
            Scanner sc = new Scanner(System.in);
            array[i] = sc.nextInt();
        }
        int counter = 0;
        
       for(int j =0; j <=3; j++){
        int num = array[j];
        

        for(int t = 1; t <= 4; t++){
            if(num % t == 0){
                counter = counter + 1;
                
            }
        }

        if(counter > 2){
            System.out.println("Not Prime: " + num);
        }else{
            
            System.out.println("prime num: " + num);
        }
       }
    }
}