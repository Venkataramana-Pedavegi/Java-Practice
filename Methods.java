import java.util.ArrayList;

    public class Methods {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Ram");
        names.add("Ravi");
        names.add("Sita");
        System.out.println(names);
        System.out.println(names.get(0));
        names.remove("Ravi");
         System.out.println(names);
    }

}

