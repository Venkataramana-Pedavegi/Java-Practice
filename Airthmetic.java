
    import java.util.Scanner;

public class Airthmetic {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int a = scanner.nextInt();
            int c = scanner.nextInt();
            int b = (a+c)%2;
            if(b%2==0){
                  System.out.println((a+c)/2);  

            }else{
                System.out.println("-1");
            }
        }
        scanner.close();
    }
}

    

