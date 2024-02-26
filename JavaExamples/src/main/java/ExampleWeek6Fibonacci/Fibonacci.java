package ExampleWeek6Fibonacci;

public class Fibonacci {
    // PSET 2B Qn 1
    private int[] data;
    private int max;
    private int calls;

    Fibonacci(int max){
        data = new int[max]; // array of ints has elements 0
    }

    public int getFibonacciNumber(int n){
        // put the base cases in the data array
        data[0] = 0; // already 0 but just say it again
        data[1] = 1;
        // call fibrecursive <- leave it to you
        return 0;

    }

    private int fibRecursive(int n){
        if( n <= 1 ){ // base case
            return data[n];
        }else if( data[n] > 0){
            // subproblem already calculated and stored
            return data[n];
        }else{
            data[n] = fibRecursive(n-1) + fibRecursive(n-2);
            return data[n];
        }
    }

    public int getCalls(){
        return 0;
    }

    public int[] getData(){
        return null;
    }
}
