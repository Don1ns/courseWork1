public class EmployeeBook {

    private final Employee[] staff;

    public EmployeeBook() {
        this.staff = new Employee[10];
    }

    public void addEmployee(String fullName, byte department, double salary) {
        for (int i = 0; i < staff.length; i++) {
            if (staff[i] == null) {
                Employee newEmployee = new Employee(fullName, department, salary);
                staff[i] = newEmployee;
                break;
            }
        }
    }

    public void removeEmployee(String fullName) {
        for (int i = 0; i < staff.length; i++) {
            if (staff[i].getFullName().equals(fullName)) {
                System.out.println(staff[i].getFullName() + " удален");
                staff[i] = null;
                return;
            }
        }
    }

    public void printAllEmployees() {
        for (int i = 0; i < staff.length; i++) {
            if (staff[i] != null) {
                System.out.println(staff[i].toString());
            }
        }
    }

    public double countTotalSalary() {
        int totalSalary = 0;
        for (int i = 0; i < staff.length; i++) {
            if (staff[i] != null) {
                totalSalary += staff[i].getSalary();
            }
        }
        return totalSalary;
    }

    public String findEmployeeMinSalary() {
        int employeeMinSalary = 0;
        for (int i = 1; i < staff.length; i++) {
            if (staff[i] != null && staff[employeeMinSalary].getSalary() > staff[i].getSalary()) {
                employeeMinSalary = i;
            }
        }
        return staff[employeeMinSalary].toString();
    }

    public String findEmployeeMaxSalary() {
        int employeeMaxSalary = 0;
        for (int i = 1; i < staff.length; i++) {
            if (staff[i] != null && staff[employeeMaxSalary].getSalary() < staff[i].getSalary()) {
                employeeMaxSalary = i;
            }
        }
        return staff[employeeMaxSalary].toString();
    }

    public double countAverageTotalSalary() {
        return countTotalSalary() / staff.length;
    }

    public void printFullNameAllEmployees() {
        for (int i = 0; i < staff.length; i++) {
            if (staff[i] != null) {
                System.out.println(staff[i].getFullName());
            }
        }
    }

    public void indexSalary(int index) {
        for (int i = 0; i < staff.length; i++) {
            if (staff[i] != null) {
                double finalSalary = staff[i].getSalary() + (staff[i].getSalary() * ((double) index / 100));
                staff[i].setSalary(finalSalary);
            }
        }
    }

    public String findEmployeeMinSalaryInDepartment(byte department) {
        double minSalary = 100_000.0d;
        int employeeIndexMinSalary = 0;
        for (int i = 0; i < staff.length; i++) {
            if (staff[i] != null && minSalary >= staff[i].getSalary() && staff[i].getDepartment() == department) {
                minSalary = staff[i].getSalary();
                employeeIndexMinSalary = i;
            }
        }
        return staff[employeeIndexMinSalary].toString();
    }

    public String findEmployeeMaxSalaryInDepartment(byte department) {
        double maxSalary = 0.0d;
        int employeeIndexMaxSalary = 0;
        for (int i = 0; i < staff.length; i++) {
            if (staff[i] != null && maxSalary <= staff[i].getSalary() && staff[i].getDepartment() == department) {
                maxSalary = staff[i].getSalary();
                employeeIndexMaxSalary = i;
            }
        }
        return staff[employeeIndexMaxSalary].toString();
    }

    public double countTotalSalaryDepartment(byte department) {
        double totalSalary = 0.0d;
        for (int i = 0; i < staff.length; i++) {
            if (staff[i] != null && staff[i].getDepartment() == department) {
                totalSalary += staff[i].getSalary();
            }
        }
        return totalSalary;
    }

    public double countAverageTotalSalaryDepartment(byte department) {
        double totalSalary = 0.0d;
        int conterEmployees = 0;
        for (int i = 0; i < staff.length; i++) {
            if (staff[i] != null && staff[i].getDepartment() == department) {
                totalSalary += staff[i].getSalary();
                conterEmployees++;
            }
        }
        return totalSalary / conterEmployees;
    }

    public void indexSalaryDepartment(byte department, int index) {
        for (int i = 0; i < staff.length; i++) {
            if (staff[i] != null && staff[i].getDepartment() == department) {
                double finalSalary = staff[i].getSalary() + (staff[i].getSalary() * ((double) index / 100));
                staff[i].setSalary(finalSalary);
            }
        }
    }

    public void printEmployeesDepartment(byte department) {
        for (int i = 0; i < staff.length; i++) {
            if (staff[i] != null && staff[i].getDepartment() == department) {
                System.out.printf("\n| ID: %1s | Ф.И.О: %-30s | Зарплата: %-8s |", staff[i].getId(), staff[i].getFullName(), staff[i].getSalary());
            }
        }
    }

    public void printEmployeesSalaryLess(double salary) {
        for (int i = 0; i < staff.length; i++) {
            if (staff[i] != null && staff[i].getSalary() < salary) {
                System.out.printf("\n| ID: %1s | Ф.И.О: %-30s | Зарплата: %-8s |", staff[i].getId(), staff[i].getFullName(), staff[i].getSalary());
            }
        }
    }

    public void printEmployeesSalaryGreat(double salary) {
        for (int i = 0; i < staff.length; i++) {
            if (staff[i] != null && staff[i].getSalary() >= salary) {
                System.out.printf("\n| ID: %1s | Ф.И.О: %-30s | Зарплата: %-8s |", staff[i].getId(), staff[i].getFullName(), staff[i].getSalary());
            }
        }
    }

    public void changeEmployee(String fullName, byte department, double salary) {
        for (int i = 0; i < staff.length; i++) {
            if (staff[i] != null && staff[i].getFullName().equals(fullName)) {
                staff[i].setDepartment(department);
                staff[i].setSalary(salary);
                return;
            }
        }
    }

    public void printDepartmentEmployees() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < staff.length; j++) {
                if (staff[j] != null && staff[j].getDepartment() == i) {
                    System.out.printf("\n| Отдел: %1s | Ф.И.О: %-30s |", staff[j].getDepartment(), staff[j].getFullName());
                }
            }
        }

    }

}
