/*
Method Overloading means same method names but different parameter lists
Different parameter lists means
1. Different number of parameters
2. Different types of parameters
3. Different order of types 
like 
add(int a, double b)
add(double a, int b)
*/


class Calculator{
    public int add(int n1, int n2){
        return n1+n2;
    }

    public int add(int n1, int n2, int n3){
        return n1+n2+n3;
    }

    public double add(double n1, int n2){
        return n1+n2;
    }
}

public class MethodOverloading{
    public static void main(String[] args) {
       Calculator obj = new Calculator();
       double res = obj.add(2.3, 4);
       System.out.println(res);
    }
}