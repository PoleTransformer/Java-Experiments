public class nthFactorial {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
    static int factorial(int n) {
        if(n <= 1) {
            return n;
        }
        return factorial(n-1)*n;
    }
}
