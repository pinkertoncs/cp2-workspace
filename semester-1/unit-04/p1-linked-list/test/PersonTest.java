import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PersonTest {


    @Test
    public void defaultConstructorTest() {

        Person p = new Person();
        assertEquals(p.getFirstName(), "");
        assertEquals(p.getLastName(), "");
    }

    @Test
    public void twoArgumentConstructorTest() {

        Person p1 = new Person("John", "Doe");
        assertEquals(p1.getFirstName(), "John");
        assertEquals(p1.getLastName(), "Doe");    
    }

    @Test
    public void setNameTest() {

        Person p = new Person();
        p.setName("Jane", "Doe");
        assertEquals(p.getFirstName(), "Jane");
        assertEquals(p.getLastName(), "Doe");   
    }


    @Test
    public void toStringTest() {

        Person p = new Person("John", "Doe");
        Person p1 = new Person("Jane", "Doe");

        assertEquals(p.toString(), "John Doe");
        assertEquals(p1.toString(), "Jane Doe");
    }

    @Test
    public void compareToUsingId() {

        Person p = new Person("John", "Doe");
        Person p1 = new Person("John", "Doe");
        assertEquals(p.compareTo(p1), -1);
    }

    @Test
    public void compareToLastName() {

        Person p = new Person("a", "z");
        Person p1 = new Person("a", "a");
        
        assertEquals(p.compareTo(p1), 1);
    }

    @Test
    public void compareToFirstName() {

        Person p = new Person("a", "a");
        Person p1 = new Person("z", "a");

        assertEquals(p.compareTo(p1), -1);
    }

    @Test
    public void compareToSamePerson() {

        Person p = new Person("a", "z");
        assertEquals(p.compareTo(p), 0);
    }
}
