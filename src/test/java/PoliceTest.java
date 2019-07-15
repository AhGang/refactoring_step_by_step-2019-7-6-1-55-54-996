import com.tws.refactoring.Driver;
import com.tws.refactoring.Police;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PoliceTest {
    @Test
    public void should_get_bool_when_check_dirver_age_equal_18() {
        //given
        Driver driver = new Driver(18);
        Police police = new Police();
        //when
        boolean result = police.checkDriver(driver);
        //then
        Assertions.assertEquals(true,result);
    }
    @Test
    public void should_get_bool_when_check_dirver_age_less_18() {
        //given
        Driver driver = new Driver(17);
        Police police = new Police();
        //when
        boolean result = police.checkDriver(driver);
        //then
        Assertions.assertEquals(false,result);
    }
    @Test
    public void should_get_bool_when_check_dirver_age_equal_20() {
        //given
        Driver driver = new Driver(20);
        Police police = new Police();
        //when
        boolean result = police.checkDriver(driver);
        //then
        Assertions.assertEquals(true,result);
    }
}
