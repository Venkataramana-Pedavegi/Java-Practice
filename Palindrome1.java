public class Palindrome1 {
    public static void main(String [] args){
        String s="abbaba";
        int n=s.length();
        boolean palindrom=true;
        for(int i=0; i<n/2;i++){
            if(s.charAt(i)!=s.charAt(n-i-1)){
                palindrom=false;
                break;
            }
        }
        if(palindrom){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
    
}
