public class Main {
    public static void main(String[] args) {
        //ICustomerDal customerDal=new MySqlCustomerDal();
       // ICustomerDal customerDal1=new OracleCustomerDal();

        CustomerManager customerManager=new CustomerManager(new SqlServerCustomerDal());
        customerManager.add();

    }
}