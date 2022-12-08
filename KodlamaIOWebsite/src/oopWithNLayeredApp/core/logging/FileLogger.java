package oopWithNLayeredApp.core.logging;

public class FileLogger implements Logger{
    @Override
    public void instructorLog(String data) {
        System.out.println("Dosyaya loglandı: "+data);
    }

    @Override
    public void categoryLog(String data) {
        System.out.println("Veritabanına loglandı: "+data);
    }

    @Override
    public void courseLog(String data) {
        System.out.println("Veritabanına loglandı: "+data);
    }
}
