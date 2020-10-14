class Employee{  
    int age;  
    String name;  
    String city;  
    void insert(int i, String n, String s) {  
        age=i;  
        name=n;  
        city=s;  
    }  
    void display(){
      
      System.out.println("The name is " + name);
      System.out.println("The age is " + age);
      System.out.println("The city is " + city);}  
}  
public class TestEmployee {  
public static void main(String[] args) {  
    Employee e1=new Employee();  
    Employee e2=new Employee();  

    e1.insert(23,"Jack","USA");  
    e2.insert(21,"Karim","UK");  

    e1.display();  
    e2.display();  

}  
}
