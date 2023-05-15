import io.zipcoder.interfaces.Person;

public class TestPerson {
    public void testConstructor() {
        Person person = new Person(1, "Mack");
        assert person.getId() == 1;
        assert person.getName().equals("Mack");
    }

    public void testSetName() {
        Person person = new Person(1, "Mack");
        person.setName("Mac");
        assert person.getName().equals("Mac");
    }
}
