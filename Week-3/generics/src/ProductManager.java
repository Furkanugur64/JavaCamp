public class ProductManager {

private IProductDal _productDal;

    public ProductManager(IProductDal _productDal) {
        this._productDal = _productDal;
    }

    public void add(){
        _productDal.add();
    }
}
