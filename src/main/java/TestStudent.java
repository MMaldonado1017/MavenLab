import io.zipcoder.interfaces.Person;

public class TestStudent {
    public void testImplementation() {
        Student student = new Student(1, "John");
        assert student instanceof Learner;
    }

    public void testInheritance() {
        Student student = new Student(1, "John");
        assert student instanceof Person;
    }

    public void testLearn() {
        Student student = new Student(1, "John");
        student.learn(5.5);
        assert student.getTotalStudyTime().equals(5.5);
    }
}
