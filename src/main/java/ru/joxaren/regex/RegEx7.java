package ru.joxaren.regex;

public class RegEx7 {

    static void employeeInfo(Employee employee){
        System.out.printf("%03d\t%12s\t%-12s\t%,10.1f\n",
                employee.id, employee.name,
                employee.surname, employee.salary * (1 + employee.bonusPct));
    }

    public static void main(String[] args) {

        Employee employee1 = new Employee(1, "Alex", "Fox", 1000, 0.2);
        Employee employee2 = new Employee(16, "Helen", "Yang", 1100, 0.15);
        Employee employee3 = new Employee(102, "Kiki", "Rubert", 1900, 0.12);

        employeeInfo(employee1);
        employeeInfo(employee2);
        employeeInfo(employee3);

        String s = String.format("%03d\t%12s\t%-12s\t%,10.1f\n", 17, "Nataly", "Bern", 100 * (1 + 0.4));
        System.out.println(s);
    }
}
