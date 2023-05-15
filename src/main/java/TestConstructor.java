import io.zipcoder.interfaces.Person;

public class TestConstructor {
    public void testImplementation() {
        Instructor instructor = new Instructor(1, "Jane");
        assert instructor instanceof Teacher;
    }

    public void testInheritance() {
        Instructor instructor = new Instructor(1, "Mack");
        assert instructor instanceof Person;
    }

    public void testTeach() {
        Instructor instructor = new Instructor(1, "Mack");
        Student student = new Student(2, "Mula");
        instructor.teach(student, 3.5);
        assert student.getTotalStudyTime().equals(3.5);
    }

    public void testLecture() {
        Instructor instructor = new Instructor(1, "Jane");
        Student student1 = new Student(2, "John");
        Student student2 = new Student(3, "Jane");
        Student[] students = {student1, student2};

        instructor.lecture(students, 6.0);

        assert student1.getTotalStudyTime().equals(3.0);
        assert student2.getTotalStudyTime().equals(3.0);
    }
}
