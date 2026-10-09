public class Ascii1 {
    public static void main(String[] args){
        String s="hello";
        int sol=0;
        for(int i=0;i<s.length()-1;i++){
            int a=i;
            int b=i+1;
            System.out.println(a + " " +b);
            char first=s.charAt(a);
            char second=s.charAt(b);
            int as1=first;
            int as2=second;
            int temp=Math.abs(as1-as2);
            System.out.println(temp);
            sol=sol+temp;


        }
        System.out.println(sol);
    }
    
}
