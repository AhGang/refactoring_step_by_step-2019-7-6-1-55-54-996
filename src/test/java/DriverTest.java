import com.sun.xml.internal.ws.policy.AssertionSet;
import com.tws.refactoring.Driver;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DriverTest {
    @Test
    public void should_get_driver_age_when_get_dirver_age() {
        //given
        Driver driver = new Driver(18);
        //when
        int driverAge = driver.getAge();
        //then
       // Assertions.assertNotNull(driverAge);
        Assertions.assertEquals(18,driverAge);
    }
}
