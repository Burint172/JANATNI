public class StudentMain {
    public static void main(String[] args) {
        student S1=new student();

        S1.name ="Malee";
        S1.id = "251310001";
        S1.showStatus();
        S1.doHomework(10);

        S1.doHomework(15);
        S1.showStatus();

        S1.takeExam(15);
        S1.showStatus();

        student S2=new student();

    }
}
