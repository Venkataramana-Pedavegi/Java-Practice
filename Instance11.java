public class Instance11 {
    String name;
    int age;
    public void display(){
        System.out.println("Name:" +name);
        System.out.println("Age:" +age);
    }
    public static void main(String[] args) {
      Instance11 I1= new Instance11();
      I1.name="Ramana";
      I1.age=18;
    Instance11 I2= new Instance11();
        I2.name="Chinni";
        I2.age=20;
        I1.display();
        I2.display();
    }
}
