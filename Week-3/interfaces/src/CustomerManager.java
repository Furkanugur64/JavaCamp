public class CustomerManager {

    private ICustomerDal _CustomerDal;

    public CustomerManager(ICustomerDal _CustomerDal) {
        this._CustomerDal = _CustomerDal;
    }

    public void add(){
        // iş kodları burada yazılır
        _CustomerDal.add();
    }
}
