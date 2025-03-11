package HUSTack;

public class factorial {
    public static long calculateFactorial(int n){
        if(n == 1) return 1;
        return n * calculateFactorial(n - 1);
    }
    public static void main(String[] args) {
        
    }
}
