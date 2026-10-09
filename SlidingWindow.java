import java.util.*;

public class SlidingWindow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size:");
        int n = sc.nextInt();

        System.out.println("Enter window size:");
        int k = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] res = new int[n - k + 1];
        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        res[0] = sum;

        for (int i = k; i < n; i++) {
            sum = sum - arr[i - k] + arr[i];
            res[i - k + 1] = sum;
        }

        System.out.println("Sum array:");
        System.out.println(Arrays.toString(res));

        sc.close();
    }
}
