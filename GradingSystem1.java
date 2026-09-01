import java.util.*;
public class GradingSystem1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your marks");
        int marks=sc.nextInt();
        if(marks<35){
            System.out.println("Student is fail");
        }else if(marks>=35 && marks<45){
            System.out.println("Student is passed");
        }else if(marks>=45 && marks<70){
            System.out.println("student is passed in third class");
        }else if(marks>=70 && marks<85){
            System.out.println("student is passed in second class");
        }else{
            System.out.println("first class");
        }sc.close();
    }
    
}
