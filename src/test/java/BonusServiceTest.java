import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.homeworkmavn.BonusService;


public class BonusServiceTest {
    @Test
    void shouldCalculateForRegisteredAndUnderLimit() {
        BonusService service = new BonusService();
        long amount = 1000;
        boolean registered = true;
        long expected = 30;
        long actual = service.calculate(amount, registered);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForRegisteredAndOverLimit() {
        BonusService service = new BonusService();
        long amount = 1_000_000;
        boolean registered = true;
        long expected = 500;
        long actual = service.calculate(amount, registered);

        Assertions.assertEquals(expected, actual);
    }
    @Test
            void shouldCalculateForRegisteredAndStillLimit(){
        BonusService service = new BonusService();
        long amount = 500;
        boolean registered = true;
        long expected =15;
        long actual = service.calculate(amount, registered);

        Assertions.assertEquals(expected, actual);

    }
    @Test
    void shouldCalculateForRegisteredAndNegativeLimit(){
        BonusService service = new BonusService();
        long amount = -100;
        boolean registered = true;
        long expected =-3;
        long actual = service.calculate(amount, registered);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void shouldCalculateForNotRegisteredAndUnderLimit(){
        BonusService service = new BonusService();
        long amount = 1000;
        boolean registered = false;
        long expected = 10;
        long actual = service.calculate(amount, registered);

        Assertions.assertEquals(expected, actual);
    }

}




