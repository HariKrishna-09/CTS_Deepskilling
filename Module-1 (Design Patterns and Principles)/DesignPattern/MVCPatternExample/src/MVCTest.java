
public class MVCTest {

    public static void main(String[] args) {

        Student model = new Student("Hari Krishna", 101, "A");

        StudentView view = new StudentView();

        StudentController controller = new StudentController(model, view);

        System.out.println("Initial Student Details");
        controller.updateView();

        System.out.println();

        System.out.println("Updated Student Details");

        controller.setStudentName("Hari");
        controller.setStudentGrade("A+");

        controller.updateView();
    }
}
