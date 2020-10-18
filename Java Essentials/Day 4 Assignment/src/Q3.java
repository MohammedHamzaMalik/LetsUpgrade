import java.util.Scanner;

public class Q3 {
    public static void main(String[] args){
        int ar[] = new int[5];
        int a, b, c, d, e, add;

        Scanner n = new Scanner(System.in);

        System.out.print("Enter first element of array :");
        ar[0] = n.nextInt();
        System.out.print("Enter second element of array :");
        ar[1] = n.nextInt();
        System.out.print("Enter third element of array :");
        ar[2] = n.nextInt();
        System.out.print("Enter fourth element of array :");
        ar[3] = n.nextInt();
        System.out.print("Enter fifth element of array :");
        ar[4] = n.nextInt();

        for(int i=0;i<ar.length;i++) {//length is the property of array
            System.out.println(ar[i]);
        }
        add = ar[0] + ar[1] + ar[2] + ar[3] + ar[4];
        System.out.println("The sum of all the elements of the array is : " + add);
    }
}
