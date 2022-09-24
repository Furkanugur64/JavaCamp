public class Main {

    public static void main(String[] args) {
        // Referance Type
        CustomerManager customerManager=new CustomerManager();

        CustomerManager customerManager2=new CustomerManager();
        customerManager=customerManager2;

        // customerManager2'nin referans numarası customerManager'a aktarıldı.
        // Böylece customerManager'ın referans numarası boşa çıkmış olur ve sonrasında Garbage Collection tarafından silinir

        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();

        // Value Type
        int sayi1=10;
        int sayi2=20;
        sayi2=sayi1;
        sayi1=30;
        System.out.println(sayi2);


        int [] sayilar1= {1,2,3};
        int [] sayilar2={4,5,6};

        sayilar2=sayilar1;
        sayilar1[0]=0;

        System.out.println(sayilar2[0]);


    }
}