public class Employee{

    public String name;
    private double salary;
    public Employee (String empName1){
        name = empName1;
    }

    public void setSalary(double empSal){
        salary = empSal;
    }

    public void printEmp(){
        System.out.println("name:" + name);
        System.out.println("salary:" + salary);
    }

    public static void main(String args[]){
        Employee empOne = new Employee("RUNOOB");
        empOne.setSalary(1000);
        empOne.printEmp();
        System.out.println(empOne.salary);
    }

}