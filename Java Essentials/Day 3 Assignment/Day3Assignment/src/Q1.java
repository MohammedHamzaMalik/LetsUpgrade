import java.util.Scanner;

public class Q1 {
    public static void main(String args[]){
        float English, Maths, Science, Computer, Hindi;
        double percentage;
        Scanner ns = new Scanner(System.in);
//        Taking input marks of all the subjects
        System.out.print("Enter the marks of English: ");
        English = ns.nextFloat();
        System.out.print("Enter the marks of Maths: ");
        Maths = ns.nextFloat();
        System.out.print("Enter the marks of Science: ");
        Science = ns.nextFloat();
        System.out.print("Enter the marks of Computer: ");
        Computer = ns.nextFloat();
        System.out.print("Enter the marks of Hindi: ");
        Hindi = ns.nextFloat();

//        Calculating Percentage
        percentage = ((English + Maths + Science + Computer + Hindi) / 500.0) * 100;

//        Printing Percentage and grade
        System.out.println("Percentage= " + percentage);

        if (percentage >= 80) {
            System.out.println("Grade is A");
        } else if (percentage >= 70){
            System.out.println("Grade is B");
        } else if (percentage >= 60){
            System.out.println("Grade is C");
        } else if (percentage >= 50){
            System.out.println("Grade is D");
        } else if (percentage >= 40){
            System.out.println("Grade is E");
        } else{
            System.out.println("Sorry, you are fail!");
        }

    }
}
