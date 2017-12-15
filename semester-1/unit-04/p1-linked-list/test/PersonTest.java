import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PersonTest {


    @Test
    public void defaultConstructorTest() {

        Person p = new Person();
        assertEquals("", p.getFirstName());
        assertEquals("", p.getLastName());
    }

    @Test
    public void twoArgumentConstructorTest() {

        Person p1 = new Person("John", "Doe");
        assertEquals("John", p1.getFirstName());
        assertEquals("Doe", p1.getLastName());    
    }

    @Test
    public void setNameTest() {

        Person p = new Person();
        p.setName("Jane", "Doe");
        assertEquals("Jane", p.getFirstName());
        assertEquals("Doe", p.getLastName());   
    }


    @Test
    public void toStringTest() {

        Person p = new Person("John", "Doe");
        Person p1 = new Person("Jane", "Doe");

        assertEquals("John Doe", p.toString());
        assertEquals("Jane Doe", p1.toString());
    }

    @Test
    public void compareToUsingId() {

        Person p = new Person("John", "Doe");
        Person p1 = new Person("John", "Doe");
        assertEquals(-1, p.compareTo(p1));
    }

    @Test
    public void compareToLastName() {

        Person p = new Person("a", "z");
        Person p1 = new Person("a", "a");
        
        assertEquals(1, p.compareTo(p1));
    }

    @Test
    public void compareToFirstName() {

        Person p = new Person("a", "a");
        Person p1 = new Person("z", "a");

        assertEquals(-1, p.compareTo(p1));
    }

    @Test
    public void compareToSamePerson() {

        Person p = new Person("a", "z");
        assertEquals(0, p.compareTo(p));
    }
}
