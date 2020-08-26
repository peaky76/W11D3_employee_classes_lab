import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before() {
        developer = new Developer("Alina", "ZY987654X", 50000);
    }

    @Test
    public void hasName() {
        assertEquals("Alina", developer.getName());
    }

    @Test
    public void hasNI() {
        assertEquals("ZY987654X", developer.getNI());
    }

    @Test
    public void hasSalary() {
        assertEquals(50000, developer.getSalary());
    }

    @Test
    public void canRaiseSalary() {
        developer.raiseSalary(7000);
        assertEquals(57000, developer.getSalary());
    }

    @Test
    public void canPayBonus() {
        assertEquals(500, developer.payBonus(), 0.01);
    }

    @Test
    public void cannotLowerSalary() {
        developer.raiseSalary( -1000);
        assertEquals(50000, developer.getSalary());
    }

    @Test
    public void canChangeName() {
        developer.setName("Jane");
        assertEquals("Jane", developer.getName());
    }

    @Test
    public void changeNamePreventEmptyString() {
        developer.setName("");
        assertEquals("Alina", developer.getName());
    }

    @Test
    public void changeNamePreventNull() {
        developer.setName(null);
        assertEquals("Alina", developer.getName());
    }

}
