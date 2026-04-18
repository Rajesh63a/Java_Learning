class SingleDim{

    public static void main(String[] args){

     //   int arr[] = {1,2,3,4,5}   we can declare array in two ways this one direct initialization

        int num[] = new int[5];
        num[0] = 1;
        num[1] = 2;
        num[2] = 3;
        num[3] = 4;
        num[4] = 5;

        for (int i=0; i<5; i++){
            System.out.println(num[i]);
        }

    }
}