public class Main {

    public static void main(String[] args) {

        DortIslem dortIslem=new DortIslem();

       int toplam= dortIslem.Topla(6,3);
        int fark= dortIslem.Cikar(6,3);
        int bolum= dortIslem.Bol(6,3);
        int carpim= dortIslem.Carp(6,3);


        System.out.println("Toplam ="+toplam);
        System.out.println("Fark ="+fark);
        System.out.println("bölüm ="+bolum);
        System.out.println("Çarpım ="+carpim);

    }
}
