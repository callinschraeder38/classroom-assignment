public class ClassroomAssignmentProject {
    public static void main(String[] args) {
        System.out.println("Hello, this is your student's class!");
        int numStudents = 5;
        // Add students to the classroom
        for (int i = 0; i < numStudents; i++) {
            String name = "Student " + (i + 1);
            System.out.println(name + ", a great learner.");
        }
    }
}
