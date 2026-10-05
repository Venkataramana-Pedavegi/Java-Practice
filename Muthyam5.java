public class Muthyam5 {
    public static void main(String[] args) {
        int arr[]={ 1,2,3,1,5,6,1,2};
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 1){
                count = count+1;
            }
        }
        System.out.println(count);
    }
    
}
