public class Main {
    public static void main(String[] args) {

        // Abstrac Classlar newlenemez !!!

        WomanGameCalculator womanGameCalculator=new WomanGameCalculator();
        womanGameCalculator.hesapla();
        womanGameCalculator.gameOver();

        GameCalculator  gameCalculator=new WomanGameCalculator();
        gameCalculator.hesapla();

    }
}