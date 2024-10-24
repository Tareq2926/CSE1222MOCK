package q1;

public class Worker {
    private String name;
    private int wage;

    public Worker(String name, int wage) {
        this.name = name;
        this.wage = wage;
    }

    public String getName() {
        return name;
    }

    public int getWage() {
        return wage;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n" +
                "Wage: " + wage + "\n";
    }
}