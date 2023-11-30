// pack12_9/Ex12_9.java
package pack12_9;
import sub2.Compute;

public class Ex12_9 {
    public static void main(String[] args) {
        Compute compute = new Compute();
        int resultAdd = compute.add(10, 5);
        int resultSub = compute.sub(10, 5);
        int resultMul = compute.mul(10, 5);
        double resultDiv = compute.div(10, 5);

        compute.show();

        System.out.println("Addition: " + resultAdd);
        System.out.println("Subtraction: " + resultSub);
        System.out.println("Multiplication: " + resultMul);
        System.out.println("Division: " + resultDiv);
    }
}
