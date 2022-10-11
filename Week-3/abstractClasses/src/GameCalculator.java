public abstract class GameCalculator {

    public abstract void hesapla();
    // bu metodu ise override ederek değiştirmek zorunda

    public final void gameOver(){
        System.out.println("Oyun Bitti");
        // bu sınıfı kim kullanırsa bu metodu olduğu gibi kullanmak zorundadır !!
        // eğer final vermezsek değiştirilebilir
    }
}
