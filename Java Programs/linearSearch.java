import java.util.*;

class linearSearch{
    public static void main(String args[]){
        int[] array = new int[4];
        
        for(int i = 0; i < 4; i++){
            System.out.println("Enter array num at " + i);
            Scanner fc = new Scanner(System.in);
            array[i] = fc.nextInt();
        }

        int find;
        System.out.println("Enter the number you find:" );
        Scanner sc = new Scanner(System.in);
        find = sc.nextInt();

        for(int j = 0; j < 4; j++){
            if(array[j] == find){
                System.out.println("Your Num " + find + " finding at this index: " + j);
                break;
            }
        }
    }
}