public class Animuthyam6 {
    public static void main(String [] args){
        int ar[]={6,5,4,3,9,45,67,34,30};
        int count=0;
        for(int i=0;i<ar.length;i++){
            if( ar[i]%2 == 0 || ar[i]%3 == 0){
                count++;
            }
        }
        System.out.println(count);
    }
    
}
