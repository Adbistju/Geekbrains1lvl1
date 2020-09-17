public class Main {
    public static byte H = 1;
    public static void main (String[]args){
        initVariable();
        System.out.println(mathematicalOperation(5,3,8,2));
        System.out.println(mathComparison(8,10));
        System.out.println(positiveOrNegative(3));
        System.out.println(helloUserName("Anakin"));
        age(1900);
    }
    public static void ubung(){

        System.out.println("Задание " + H++ + ".");
    }
    public static void initVariable(){
        ubung();
        byte b = 24;
        short s = 1024;
        int i = 16777216;
        long l = 1600L;
        float f = 432543.0f;
        double d = 12.654365436;
        boolean bool = false;
        char c = 'A';
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(bool);
        System.out.println(c);
    }
    public static int mathematicalOperation(int a, int b, int c, int d){
        ubung();
       int f = a * (b + (c / d));
       return f;
    }
    public static boolean mathComparison(int a , int b){
        ubung();
         return  true==a+b<=20&&a+b>=10;
    }
    public static String positiveOrNegative(int a){
        ubung();
        if (a>=0){
            return "Число положителное!";
        }else{
            return "Число отрицательное!";
        }
    }
    public static String helloUserName(String F){
        ubung();
        return "Hello, " + F + "!";
    }
    public static void age(int age){
        ubung();
        if (age%4==0&&age%400==0^age%100!=0){
            System.out.println(age + " год, является високосным.");
        }else {System.out.println(age + " год, не является високосным.");}
    }
}