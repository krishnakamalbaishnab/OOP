//simple employee class to understand and implement class and object
class Employee {
    public int salary;
    public String employeeName;

    public void setSalary(int sal) {
        salary = sal;
    }

    public void setEmployeeName(String name) {
        employeeName = name;
    }

    public int getSalary() {
        return salary;
    }

}

class Main {

    public static void main(String[] args) {

        Employee emp1 = new Employee();

        emp1.setEmployeeName("Rahul");

        emp1.setSalary(10000);

        System.out.println("Salary of " + emp1.employeeName + " is " + emp1.getSalary());

    }

}
