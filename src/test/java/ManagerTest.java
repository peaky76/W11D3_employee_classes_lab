import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before() {
        manager = new Manager("Robert", "AB123456C", 35000, "Testing");
    }

    @Test
    public void hasName() {
        assertEquals("Robert", manager.getName());
    }

    @Test
    public void hasNI() {
        assertEquals("AB123456C", manager.getNI());
    }

    @Test
    public void hasSalary() {
        assertEquals(35000, manager.getSalary());
    }

    @Test
    public void hasDeptName() {
        assertEquals("Testing", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(5000);
        assertEquals(40000, manager.getSalary());
    }

    @Test
    public void canPayBonus() {
        assertEquals(350, manager.payBonus(), 0.01);
    }

    @Test
    public void cannotLowerSalary() {
        manager.raiseSalary( -1000);
        assertEquals(35000, manager.getSalary());
    }

    @Test
    public void canChangeName() {
        manager.setName("Tomek");
        assertEquals("Tomek", manager.getName());
    }

    @Test
    public void changeNamePreventEmptyString() {
        manager.setName("");
        assertEquals("Robert", manager.getName());
    }

    @Test
    public void changeNamePreventNull() {
        manager.setName(null);
        assertEquals("Robert", manager.getName());
    }

}
