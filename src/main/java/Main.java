import ru.netology.sqr.SqrtService;

public class Main {
    public static void main(String[] args) {
        SqrtService service = new SqrtService();
        int actual = service.calcSqrt(200, 300);
        System.out.println(actual);
    }
}