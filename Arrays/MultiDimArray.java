public class MultiDimArray{

    public static void main(String args[]){

        int arr[][] = new int[3][4];                    // we can think this as arr has 3 rows and each row as one array and each array has 4 elements. So total 3 arrays and each array has 4 elements

        for (int i=0; i<3; i++){                        // i will loop at row level
            for (int j=0; j<4; j++){                    // j will loop at column level
                arr[i][j] = (int)(Math.random()*10);    // Math.random is an inbuilt function which gives random values. Math return double values to we are multipling with 10 to get a single digit number and type casting to int because our array is of type int.
               
            }
        }

        for (int i=0; i<3; i++){                        // i will loop at row level
            for (int j=0; j<4; j++){                    // j will loop at column level
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        //we can also use the enhanced for loop to retrive the elements. Both will do the same job.

        for(int i[] : arr){                             // i will get an entire array so we have to mention with []
            for (int j : i){                            // from each array i we are retriving singe element
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}