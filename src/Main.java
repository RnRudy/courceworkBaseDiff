// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Employee.separate();
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Рокицкий Степан Дмитриевич", 3, 49_000);
        employees[1] = new Employee("Сильванов Олег Палыч", 2, 51_000);
        employees[2] = new Employee("Аканде Адейеми Аль", 1, 104_500);
        employees[3] = new Employee("Труцко Валентин Альбертович", 5, 78_000);
        employees[4] = new Employee("Потешкина Алина Сильвестровна", 4, 66_600);
        employees[5] = new Employee("Труев Антон Максимович", 2, 52_000);
        employees[6] = new Employee("Биткова Полина Рудольфовна", 4, 55_000);
        employees[7] = new Employee("Стрыга Кирилл Михайлович", 5, 60_000);
        employees[8] = new Employee("Филль Виталий Симёнович", 1, 73_000);
        employees[9] = new Employee("Пташка Людмила Сергеевна", 3, 48_000);
        Employee.allEmployees(employees);
        Employee.eTotalSalary(employees);
        Employee.separate();
        System.out.println("Сумма трат на заработную плату общая | " + Employee.eTotalSalary(employees) + " рублей.");
        System.out.println("Среднее значение зарплат | " + Employee.averageSalary(employees) + " руб.");
        System.out.println("Самая высокая зарплата | " + Employee.eMaxSalary(employees));
        System.out.println("Самая маленькая зарплата | " + Employee.eMinSalary(employees));
        System.out.println("|Общий список сотрудников|" + "\n");
        Employee.employeeList(employees);
    }
}