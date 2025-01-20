class Employee{
    int id;
    String name;
    double salary;


    public Employee() { }

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
    }
}

class PS005 {
    public static void main(String[] args) {
 
        Employee emp1 = new Employee(1, "rohit k", 50000.0);
        Employee emp2 = new Employee(2, "hemanth", 60000.0);
        System.out.println(emp1); 
        System.out.println(emp2);
        emp1.setName("anirudh");
        emp1.setSalary(55000.0);
        System.out.println("\nUpdated Employee Details:");
        System.out.println(emp1);
        System.out.println("\nEmployee 2 ID: " + emp2.getId());
        System.out.println("Employee 2 Name: " + emp2.getName());
        System.out.println("Employee 2 Salary: " + emp2.getSalary());
    }
}
