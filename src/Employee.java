public class Employee {
    private String name;
    private int department;
    private double salary;
    private int ID;
    private static int count = 1;

    public Employee(String name, int department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.setID(count++);
    }

    public String getName() {
        return name;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Сотрудник — " + "ФИО: " + name + "\n" + "Департамент: " + department + "\n" + "Зарплата: " + salary + " руб" + "\n" + "ID сотрудника: " + ID + "\n";
    }

    public static void allEmployees(Employee[] employees) {
        for (Employee i : employees) {
            System.out.println(i);
        }
    }

    public static double eTotalSalary(Employee[] employees) {
        double totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
        }
        return totalSalary;
    }

    public static double averageSalary(Employee[] employees) {
        return eTotalSalary(employees) / 2;
    }

    public static Employee eMaxSalary(Employee[] employees) {
        Employee maxSalary = null;
        for (Employee i : employees) {
            if (maxSalary == null || i.getSalary() > maxSalary.getSalary()) {
                maxSalary = i;
            }
        }
        return maxSalary;
    }

    public static Employee eMinSalary(Employee[] employees) {
        Employee minSalary = null;
        for (Employee i : employees) {
            if (minSalary == null || i.getSalary() < minSalary.getSalary()) {
                minSalary = i;
            }
        }
        return minSalary;
    }

    public static void employeeList(Employee[] employees) {
        for (Employee i : employees) {
            System.out.println(i.getName());
        }
    }
    public static void separate() {
        System.out.println("—————————————————————" + "\n");
    }
}
