

public class Main {
    public static void main(String[] args) {


        Student student1 = new Student("aby1","bakyt1",23,"man");
        Student student2 = new Student("aby2","bakyt2",25,"man");
        Student student3 = new Student("aizat","adina",26,"woman");
        Student [] students = {student1, student2, student3};

        School.getAllStudents(students);
        System.out.println();
        School.getAllBoys(students);
        System.out.println();
        School.getByName("peack",students);





    }
}