class Calculation{

    //int c = 10;
    //int d = 20;

    public static int add(int a, int b){
        // c = 20;    we can't access non-static variable in static methods.
        return a+b;
    }

    public static int mul(int a, int b){
        return a*b;
    }

}


class StaticMethod{
    public static void main(String[] args){

        int resadd = Calculation.add(2, 3);   // for calling static methods we dont need object we can add using class name
        System.out.println(resadd);


        int resmul = Calculation.mul(2, 3);
        System.out.println(resmul);



    }
}