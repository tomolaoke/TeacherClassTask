//TeacherClassTask

class Human {
    protected String name;
    protected String role;

    public Human(String name) {
        this.name = name;
        this.role = "Human";
    }

    public void printResponsibilities() {
        System.out.println("Responsibilities of a human: Exist and be kind.");
    }
}

class Teacher extends Human {
    private boolean sacked;
    private double salary;

    public Teacher(String name, double salary) {
        super(name);
        this.role = "Teacher";
        this.sacked = false;
        this.salary = salary;
    }

    public void getRaise(double amount) {
        this.salary += amount;
        System.out.println(name + " received a raise of $" + amount + ". New salary: $" + salary);
    }

    public void sack() {
        this.sacked = true;
        System.out.println(name + " has been sacked.");
    }

    public boolean isSacked() {
        return sacked;
    }

    @Override
    public void printResponsibilities() {
        System.out.println("Responsibilities of a teacher: Teach students, grade assignments, and maintain a positive learning environment.");
    }
}

public class Module6JavaIVAssignmentDay22 {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Richards Oke", 50000.0);
        teacher1.printResponsibilities(); // Call the printResponsibilities() method
        teacher1.getRaise(5000.0);
        teacher1.sack();
        System.out.println("Is " + teacher1.name + " sacked? " + teacher1.isSacked());
    }
}
