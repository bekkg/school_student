import java.util.Arrays;

public class School {
    private  String name ;
    private Student [] students ;

    public School(String name, Student [] students) {
        this.name = name;
        this.students = students;
    }



    public void setName(String name) {
        this.name = name;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public Student[] getStudents() {
        return students;
    }



    public static void getAllStudents(Student [] students){
        for (int i = 0; i < students.length; i++) {
           System.out.println (students [i] );
        }
    }
    public  static  void getByName(String name , Student [] students){

        for (int i = 0; i < students.length; i++) {
            System.out.println(name + " студенти: " + students[i].getName());
        }

    }
    public  static  void getAllBoys (Student [] students){
       for (Student student6: students)
           if(student6.getPol().equals("man")) {
               System.out.println(student6);
           }
    }


}
