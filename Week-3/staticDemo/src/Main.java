public class Main {
    public static void main(String[] args) {
        Product product=new Product();
        product.id=1;
        product.name="Mouse";
        product.price=380;
        ProductManager productManager=new ProductManager();
        productManager.add(product);


        DatabaseHelper.Connection.createConnection();
        DatabaseHelper.Crud.Update();
        // Static kullanımı örnek
    }
}