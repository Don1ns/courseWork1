import java.util.Objects;

public class Employee {
    private final String fullName;
    private byte department;
    private double salary;
    private static int counter;
    private final int id;

    public Employee(String fullName, byte department, double salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id = getCounter();
        counter++;
    }

    @Override
    public String toString() {
        return String.format("| ID: %2s | Отдел: %1s | Ф.И.О: %-30s | Зарплата: %-8s руб. |", id, department, fullName, salary);
    }

    public String getFullName() {
        return fullName;
    }

    public byte getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public static int getCounter() {
        return counter;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(byte department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return department == employee.department && Double.compare(employee.salary, salary) == 0 && id == employee.id && Objects.equals(fullName, employee.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, department, salary, id);
    }
}
