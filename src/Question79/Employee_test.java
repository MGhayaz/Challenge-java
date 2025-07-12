package Question79;
 class Employee_test {
    public static void main(String[] args) {
        Employee emp = new Employee("ghayaz",22,270000);
        System.out.println(emp.displayEmployeeDetails());
        System.out.println(emp.getAge());
        emp.setSalary(9999999);
        System.out.println(emp.getSalary());
    }
}
