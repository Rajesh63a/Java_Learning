class Test{
    //final int x = 20;  // once declared cannot be reassinged
    int x = 20;
}

class Final{
    public static void main(String[] args){
    final Test t = new Test();
    //t = new Test();                 // cannot assign a value to final variable t
    t.x = 10;

    System.out.println(t.x);
}
}