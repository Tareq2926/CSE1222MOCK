package q1;

public class Test {
    public static void main(String[] args) {

        Worker worker = new Worker("Jubaear", 250);
        Supervisor supervisor = new Supervisor("Shamim", 500, "Managing");
        Director director =  new Director("Tareq", 1000, "Managing");

        System.out.println(worker);
        System.out.println(supervisor);
        System.out.println(director);
    }
}