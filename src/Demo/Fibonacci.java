package Demo;
public class Fibonacci {
    static int a,b,c;
    public static void fib(int a,int b){
        if(a+b<100){
          c=a+b;
            System.out.println(c);
            a=b;
            b=c;
            fib(a,b);
        }
    }
    public static void main(String[] args) {
        System.out.println(a +"\n" + ++b);
        fib(a,b);
    }
}
