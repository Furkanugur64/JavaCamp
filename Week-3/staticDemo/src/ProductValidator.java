public class ProductValidator {


    // static kullanılarak diğer sınıflarda sınıf ismi. ile ulaşabiliyoruz
    public static boolean isValid(Product product){
        if(product.price>0 && !product.name.isEmpty()){
            return true;
        }
        else
        {
            return false;
        }
    }
}
