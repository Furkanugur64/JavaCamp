public class Main {

    public static void main(String[] args) {

        Customer customer=new Customer();
       Employee employee=new Employee();

       EmployeeManager employeeManager=new EmployeeManager();
       CustomerManager customerManager=new CustomerManager();


       employeeManager.List();
       employeeManager.Add();
       employeeManager.BestEmployee();

       customerManager.List();
       customerManager.Add();
       
    }
}
