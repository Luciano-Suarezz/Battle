package Utils;

public class Sleep {
    public static void Main(int tiempo){
        try {
            Thread.sleep(tiempo);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
