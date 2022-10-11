public class CustomerManager extends BaseLogger{

    private BaseLogger logger;

    public CustomerManager(BaseLogger logger) {
        this.logger = logger;
    }

    public void add(){

        System.out.println("Müşteri Eklendi");
        this.logger.log("Log Mesajı");

        //DatabaseLogger logger=new DatabaseLogger(); // Kötü kod
        //logger.Log("Log Mesajı");

        // new ile bir class'ı oluşturmak bağımlılık oluşturacağı için base class'ı
        // private olarak tanımlayıp constructor ile içini doldurup kullandık
    }
}
