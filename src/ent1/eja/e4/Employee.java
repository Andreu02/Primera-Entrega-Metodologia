package ent1.eja.e4;

public class Employee {
    //ZONA DE ATRIBUTOS
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    //ZONA DE METODOS
        //constructores
    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

        //getters y setters
    public int getId() {
        return id;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getName(){
        return firstName + " " + lastName;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

        //otros
    public int getAnnualSalary() {
        return salary * 12;
    }
    public int raiseSalary(int percent) {
        this.salary += this.salary * percent / 100;
        return this.salary;
    }
    @Override
    public String toString() {
        return "Employee [id=" + id + ",name=" + firstName +" "+ lastName + ", salary=" + salary + "]";
    }
}
