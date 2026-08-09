import java.util.ArrayList;
public class arrayListaddition11 {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(4);
        al.add(5);
        al.add(0);
        al.add(9);
        al.add(8);
        al.add(10);
        int sum=0;
        for(int i=0;i<al.size();i++){
            sum=sum+al.get(i);
        }
        System.out.println(sum);
        System.out.println(sum/al.size());

    }
}
