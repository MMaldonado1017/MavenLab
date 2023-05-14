import io.zipcoder.interfaces.Person;

public class TestPerson {
    public void testConstructor() {
        Person person = new Person(1, "John");
        assert person.getId() == 1;
        assert person.getName().equals("John");
    }

    public void testSetName() {
        Person person = new Person(1, "John");
        person.setName("Jane");
        assert person.getName().equals("Jane");
    }
}
