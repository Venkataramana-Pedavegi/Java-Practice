public class PalindromString {
    public static void main(String[] args){
        String s="madam";
        String sol="";
        for(int i=s.length() -1;i>=0;i--){
            sol=sol + s.charAt(i);
        }
        if(sol.equals(s)){
            System.out.println("yeah! it's a palindrom");
        }else{
            System.out.println("it's not a palindrom");
        }
    }
    
}
