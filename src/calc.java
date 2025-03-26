package src;
public class calc {

    public void add(int a, int b) {
        int sum = a + b;
        System.out.println(sum);

    }
    public int subtract(int a, int b) {
        return a - b;
    }
    public int multiply(int a, int b) {
        return a * b;
    }
    public int divide(int a, int b) {
        if (a == 0){
            System.out.println("Error");
            return 0;
        }
        return a / b;
    }
}
