package kodlama.io.core.logging;

public class DatabaseLogger implements Logger {
    @Override
    public void log(String data) {
        System.out.println("Veritabanı ile loglama işlemi yapıldı.");
    }
}
