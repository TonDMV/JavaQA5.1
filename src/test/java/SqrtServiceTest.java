import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.sqr.SqrtService;

public class SqrtServiceTest {

    @Test
    public void TestFindTheSquares() {
        SqrtService service = new SqrtService();

        int actual = service.calcSqrt(200, 300);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestFindMinSquares() {
        SqrtService service = new SqrtService();

        int actual = service.calcSqrt(200, 250);
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestFindMaxSquares() {
        SqrtService service = new SqrtService();

        int actual = service.calcSqrt(100, 9802);
        int expected = 90;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestFindSquaresUnderMinNumber() {
        SqrtService service = new SqrtService();

        int actual = service.calcSqrt(0, 99);
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void TestFindSquaresAboveMaxNumber() {
        SqrtService service = new SqrtService();

        int actual = service.calcSqrt(9802, 10000);
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }


}