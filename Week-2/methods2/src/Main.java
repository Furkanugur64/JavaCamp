public class Main {

    public static void main(String[] args) {

        String mesaj="Bugün hava çok güzel.";
        String yenimesaj=mesaj.substring(0,2);

        System.out.println(topla(5,3));

      int x= topla2(2,3,4,6,5,6);
      System.out.println(x);
    }

    public static void ekle(){
        System.out.println("Eklendi");
    }

    public static void sil(){
        System.out.println("Silindi");
    }
    public static void guncelle(){
        System.out.println("Günellendi");
    }

    public static int topla(int i,int j){

        return i+j;
    }

    public static int topla2(int... sayilar){

        int toplam=0;
        for(int sayi:sayilar){
            toplam+=sayi;
        }

        return toplam;
    }
}
