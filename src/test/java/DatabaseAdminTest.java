import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before() {
        databaseAdmin = new DatabaseAdmin("Rudy", "GH543219J", 40000);
    }

    @Test
    public void hasName() {
        assertEquals("Rudy", databaseAdmin.getName());
    }

    @Test
    public void hasNI() {
        assertEquals("GH543219J", databaseAdmin.getNI());
    }

    @Test
    public void hasSalary() {
        assertEquals(40000, databaseAdmin.getSalary());
    }

    @Test
    public void canRaiseSalary() {
        databaseAdmin.raiseSalary(8000);
        assertEquals(48000, databaseAdmin.getSalary());
    }

    @Test
    public void canPayBonus() {
        assertEquals(400, databaseAdmin.payBonus(), 0.01);
    }

    @Test
    public void cannotLowerSalary() {
        databaseAdmin.raiseSalary( -1000);
        assertEquals(40000, databaseAdmin.getSalary());
    }

    @Test
    public void canChangeName() {
        databaseAdmin.setName("James");
        assertEquals("James", databaseAdmin.getName());
    }

    @Test
    public void changeNamePreventEmptyString() {
        databaseAdmin.setName("");
        assertEquals("Rudy", databaseAdmin.getName());
    }

    @Test
    public void changeNamePreventNull() {
        databaseAdmin.setName(null);
        assertEquals("Rudy", databaseAdmin.getName());
    }
}
