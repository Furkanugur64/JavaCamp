public class Main {

    public static void main(String[] args) {

        CreditManager creditManager = new CreditManager();
		creditManager.calculate();
		creditManager.calculate();
		creditManager.save();

		Customer customer = new Customer();
		customer.id = 1;
		customer.city = "Uşak";

		CustomerManager customerManager = new CustomerManager(customer,new TeacherCreditManager());
		customerManager.save();
		customerManager.delete();

		Company company = new Company();
		company.taxNumber="1245";
		company.companyName="Samsung";
		company.id=100;

		CustomerManager customerManager2 = new CustomerManager(company,new CarCreditManager());
     	customerManager2.save();
		customerManager2.delete();

		Person person = new Person();
		person.nationalIdentity="111111111111";


        CustomerManager customerManager3 = new CustomerManager(new Customer(), new TeacherCreditManager());
        customerManager3.giveCredit();
    }
}
