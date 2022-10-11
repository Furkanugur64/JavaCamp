public class CustomerManager {

    private Customer _customer;
    private ICreditManager _creditManager;

    public CustomerManager(Customer customer, ICreditManager creditManager) {
        this._customer = customer;
        this._creditManager = creditManager;
    }

    public void save() {
        System.out.println("müşteri kaydedildi : ");
    }

    public void delete() {
        System.out.println("müşteri silindi : ");
    }

    public void giveCredit() {
        _creditManager.calculate();
        System.out.println("kredi verildi");
    }
}
