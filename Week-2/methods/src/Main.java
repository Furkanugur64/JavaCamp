public class Main {

    public static void main(String[] args) {
        sayiBulmaca();
    }


    public static void sayiBulmaca(){


        int [] sayilar=new int [] {1,2,5,7,9,0};
        int aranacak=5;
        boolean varmi=false;

        for(int i=0;i<sayilar.length-1;i++)
        {
            varmi=true;
            break;
        }


        if(varmi) {
            mesajVer("Sayı Mevcuttur"+  aranacak);
        }
        else {
            mesajVer("Sayı Mevcut Değildir"+aranacak);
            
        }
    }

    public static void mesajVer(String mesaj){
        System.out.println(mesaj);

    }
}
