class Avenger {
    String name, power, weapon, planet;
    int age;

    void getDetails(String n, int a, String p, String w, String pt){
        name = n;
        age= a;
        power = p;
        weapon = w;
        planet = pt;
    }

    void displayDetails(){
        System.out.println("The name of this avenger is " + name);
        System.out.println("Age of the avenger is " + age);
        System.out.println("Power of this avenger is " + power);
        System.out.println("It's weapon is " + weapon);
        System.out.println("It is from planet " + planet);
    }
}
public class Q1 {
    public static void main(String args[]){
            Avenger a1 =new Avenger();
            Avenger a2 = new Avenger();
            a1.getDetails("Thor", 1500, "Thunder","Hammer", "Asgard");
            a2.getDetails("CA", 30, "Body", "Shield", "Earth");
            a1.displayDetails();
            a2.displayDetails();
            String avg[] = new String[5];
            avg[0] = a1.name;
//            avg[1] = a1.age;
            avg[2] = a1.power;
            avg[3] = a1.weapon;
            avg[4] = a1.planet;

            String avg2[] = new String[5];
            avg2[0] = a2.name;
    //            avg2[1] = a2.age;
            avg2[2] = a2.power;
            avg2[3] = a2.weapon;
            avg2[4] = a2.planet;

            for(int i=0;i<avg.length;i++)//length is the property of array
                System.out.println(avg[i]);

            for(int j=0;j<avg2.length;j++)//length is the property of array
                System.out.println(avg2[j]);


    }
}
