public class Main {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();

        employeeBook.addEmployee("Глушкова Ева Ивановна", (byte) 1, 34_150);
        employeeBook.addEmployee("Киселев Ян Артёмович", (byte) 2, 44_900);
        employeeBook.addEmployee("Михайлов Лев Макарович", (byte) 2, 42_382);
        employeeBook.addEmployee("Соловьев Адам Даниилович", (byte) 1, 31_500);
        employeeBook.addEmployee("Мельникова Мила Михайловна", (byte) 2, 48_350);
        employeeBook.addEmployee("Калинина Амелия Денисовна", (byte) 1, 34_700);

        employeeBook.printAllEmployees();
        employeeBook.removeEmployee("Соловьев Адам Даниилович");
        employeeBook.addEmployee("Авдеева Ангелина Сергеевна", (byte) 1, 31_700);
        employeeBook.printAllEmployees();

        System.out.println("Сумма затрат на зарплаты в месяц\n" + employeeBook.countTotalSalary());
        System.out.println("Сотрудник с минимальной зарплатой\n" + employeeBook.findEmployeeMinSalary());
        System.out.println("Сотрудник с максимальной зарплатой\n" + employeeBook.findEmployeeMaxSalary());
        System.out.println("Среднее значение зарплат\n" + employeeBook.countAverageTotalSalary());
        employeeBook.printFullNameAllEmployees();

        employeeBook.indexSalary(5);
        employeeBook.printAllEmployees();

        System.out.println("employeeBook.findEmployeeMinSalaryInDepartment() = " + employeeBook.findEmployeeMinSalaryInDepartment((byte) 2));
        System.out.println("employeeBook.findEmployeeMaxSalaryInDepartment() = " + employeeBook.findEmployeeMaxSalaryInDepartment((byte) 2));
        System.out.println("employeeBook.countTotalSalaryDepartment() = " + employeeBook.countTotalSalaryDepartment((byte) 2));
        System.out.println("employeeBook.countAverageTotalSalaryDepartment((byte) 2) = " + employeeBook.countAverageTotalSalaryDepartment((byte) 2));
        employeeBook.indexSalaryDepartment((byte) 2, 5);
        employeeBook.printAllEmployees();
        employeeBook.printEmployeesDepartment((byte) 1);
        System.out.println();
        employeeBook.printEmployeesSalaryLess(50000);
        System.out.println();
        employeeBook.printEmployeesSalaryGreat(36435);
        System.out.println();
        System.out.println();

        employeeBook.changeEmployee("Калинина Амелия Денисовна", (byte) 2, 48_000);
        employeeBook.printAllEmployees();
        employeeBook.printDepartmentEmployees();
    }
}