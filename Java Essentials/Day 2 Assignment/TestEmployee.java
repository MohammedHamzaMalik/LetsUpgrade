package Assignment1;

class Employee{
    String name;
    int age;
    String city;

    void insert(String n, int a, String c){
    age = a;
    name = n;
    city = c;
}
    void display(){
        System.out.println("The name is " + name);
        System.out.println("The age is " + age);
        System.out.println("The city is " + city);
    }
}

public class TestEmployee{
    public static void main(String[] args){
        Employee e1 = new Employee();
        Employee e2 = new Employee();
        e1.insert( "Amy", 24, "Georgia");
        e2.insert( "Haris",22, "Waterloo");
        e1.display();
        e2.display();
    }
}
