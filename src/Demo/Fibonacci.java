
public class Fibonacci {
    static int i;
    static int j;
    static int k;

    public static void fib(int i, int j) {
        System.out.println("Fibonacci Program");
        if (i + j < 100) {
            c = i + j;
            System.out.println(k);
            i = j;
            j = k;
            fib(i, j);
        }
    }

    public static void main(String[] args) {
        System.out.println(i + "\n" + ++j);
        fib(i, j);
    }
}
