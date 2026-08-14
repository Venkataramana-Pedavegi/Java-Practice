import java.util.ArrayList;

public class FactorialOrder {

    public static ArrayList<Integer> primeFac(int n) {

        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 2; i <= n; i++) {

            if (n % i == 0) {
                result.add(i);

                while (n % i == 0) {
                    n = n / i;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int n = 100;

        ArrayList<Integer> result = primeFac(n);

        System.out.println(result);
    }
}