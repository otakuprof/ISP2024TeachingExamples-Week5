package ExampleWeek6Fibonacci;

public class FirstTry {

    public static int calls; // default zero

    public static void main(String[] args) {
        System.out.println( "Fibonacci Numbber:"+ fib(9));
        System.out.println("fib is called " + calls + " times");
    }

    public static int fib(int n){
        if( n < 0) throw new IllegalArgumentException();
        calls++; // everytime this function is called, +1
        // don't forget the return
        if( n <= 1){
            return n;
        }else{
            return fib(n-1) + fib(n-2);
        }
    }

}
