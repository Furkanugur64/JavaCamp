public class Main {

    public static void main(String[] args) {

        Product product2=new Product(1,"Laptop","Dell Laptop",23000,3);
        Product product = new Product();
        product.setId(2);
        product.setName("Laptop");
        product.setPrice(15000);
        product.setDescription("Asus Laptop");
        product.setStockAmount(5);

        ProductManager productManager = new ProductManager();
        productManager.Add(product);


        System.out.println(product2.getKod());
    }
}
