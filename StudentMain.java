import java.util.Scanner;

public class StudentMain {
    public static void showInfo(Student st){
        System.out.println("Name :"+st.getName());
        System.out.println("Name :"+st.getStudyYear());
        System.out.println("Name :"+st.getScore());
        System.out.println("Name :"+st.getGrade());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student student = new Student();

        System.out.print("Enter student name : ");
        student.setName(scanner.next());
        System.out.print("Enter student year : ");
        student.setStudyYear(scanner.nextInt());
        System.out.print("Enter mid-term Score : ");
        student.addPoint(scanner.nextInt());
        System.out.print("Enter final Score : ");
        student.addPoint(scanner.nextInt());

        System.out.println();
        showInfo(student);
    }
}
