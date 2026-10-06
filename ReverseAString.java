public class ReverseAString {
    public static void main(String[] args){
        String s= "Chapri";
        String ans=" ";

        for(int i=s.length();i>=0;i--){
            ans=ans+s.charAt(i);
        }
        System.out.println(ans);
    }
    
}
