package kodlama.io.core.logging;

public class FileLogger implements Logger {
    @Override
    public void log(String data) {
        System.out.println("Dosya ile loglama işlemi yapıldı.");
    }
}
