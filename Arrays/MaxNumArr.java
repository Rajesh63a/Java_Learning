public class MaxNumArr{

    public static void main(String[] args){
        int num[] = {-2,-8,-9,-7,-3};

        for (int i: num){
            System.out.print(i+ " ");
        }
        int j = num[0];
        for (int i: num){
            if(j < i){
                j = i;
            }
            
        }
        System.out.println("\nThe largest number in the array is: " + j);

    }
}