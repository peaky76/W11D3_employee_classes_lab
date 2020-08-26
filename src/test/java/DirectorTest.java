import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before() {
        director = new Director("Rebeka", "RF123456D", 58000, "Risk Management", 1000000);
    }

    @Test
    public void hasNI() {
        assertEquals("RF123456D", director.getNI());
    }

    @Test
    public void hasSalary() {
        assertEquals(58000, director.getSalary());
    }

    @Test
    public void hasDeptName() {
        assertEquals("Risk Management", director.getDeptName());
    }

    @Test
    public void hasBudget() {
        assertEquals(1000000, director.getBudget(), 0.01);
    }

    @Test
    public void canRaiseSalary() {
        director.raiseSalary(10000);
        assertEquals(68000, director.getSalary());
    }

    @Test
    public void canPayBonus() {
        assertEquals(1160, director.payBonus(), 0.01);
    }

    @Test
    public void cannotLowerSalary() {
        director.raiseSalary( -1000);
        assertEquals(58000, director.getSalary());
    }

    @Test
    public void canChangeName() {
        director.setName("Ruben");
        assertEquals("Ruben", director.getName());
    }

    @Test
    public void changeNamePreventEmptyString() {
        director.setName("");
        assertEquals("Rebeka", director.getName());
    }

    @Test
    public void changeNamePreventNull() {
        director.setName(null);
        assertEquals("Rebeka", director.getName());
    }

}
