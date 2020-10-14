import java.util.Scanner;

public class Q2 {
    public static void main(String args[]){
        String name;
        int birth_date, birth_month, birth_year, age;
        float monthly_salary, annual_salary, tax;

        Scanner n = new Scanner(System.in);

        System.out.println("Employee! enter your name: ");
        name = n.next();
        System.out.print("Enter your birth date: ");
        birth_date = n.nextInt();
        System.out.print("Enter your birth month: ");
        birth_month = n.nextInt();
        System.out.print("Enter your birth year: ");
        birth_year = n.nextInt();

        System.out.println("Enter your monthly salary in Rs. is: ");
        monthly_salary = n.nextFloat();
//        Taking current date i.e. 2020

        age  = 2020 - birth_year;

        annual_salary = monthly_salary * 12;

        if (annual_salary > 500000.00){
            tax = (annual_salary * 20) / 100;
        } else if (annual_salary > 400000.00){
            tax = (annual_salary * 15) / 100;
        } else if (annual_salary > 300000.00){
            tax = (annual_salary * 10) / 100;
        } else if (annual_salary > 200000.00){
            tax = (annual_salary * 5) / 100;
        } else {
            tax = 0;
        }

        System.out.println("The name is " + name);
        System.out.println("The age is " + age);
        System.out.println("The annual salary is Rs." + annual_salary);
        System.out.println("The tax amount is Rs." + tax);
    }
}
