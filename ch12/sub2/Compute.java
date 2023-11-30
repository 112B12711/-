// sub2/Compute.java
package sub2;
import sub1.MyMath;

public class Compute extends MyMath {
    private double ans;

    @Override
    public int add(int a, int b) {
        ans = a + b;
        return (int) ans;
    }

    @Override
    public int sub(int a, int b) {
        ans = a - b;
        return (int) ans;
    }

    @Override
    public int mul(int a, int b) {
        ans = a * b;
        return (int) ans;
    }

    @Override
    public double div(int a, int b) {
        if (b != 0) {
            ans = (double) a / b;
            return ans;
        } else {
            System.out.println("Error: Division by zero");
            return Double.NaN; // Not a Number
        }
    }

    public void show() {
        System.out.println("ans=" + ans);
    }

    public static void main(String[] args) {
        Compute cmp = new Compute();
        cmp.mul(3, 5); // 計算 3*5
        cmp.show();   // 此行會回應"ans=15"字串
    }
}
