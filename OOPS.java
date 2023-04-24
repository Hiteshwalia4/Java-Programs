class Employee{
    int id;
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
}
class Cellphone{
    public void ring(){
        System.out.println("Ringing huehuehue...");
    }

    public void vibrate(){
        System.out.println("Vibrating huehuehue...");
    }
}
public class OOPS {
    public static void main(String[] args) {
        /*
        Employee e1 = new Employee();
        e1.setName("Hitesh");
        e1.id=101;
        e1.salary=100000;
        System.out.println(e1.id);
        System.out.println(e1.getName());
        System.out.println(e1.getSalary());  */

        Cellphone mi = new Cellphone();
        mi.ring();
        mi.vibrate();
    }
}
