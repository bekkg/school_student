public class Student {
    private  String name ;
    private  String firstname ;
    private int age ;
    private  String pol ;

    public Student(String name, String firstname, int age, String pol) {
        this.name = name;
        this.firstname = firstname;
        this.age = age;
        this.pol = pol;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPol(String pol) {
        this.pol = pol;
    }

    public String getName() {
        return name;
    }

    public String getFirstname() {
        return firstname;
    }

    public int getAge() {
        return age;
    }


    public String getPol() {
        return pol;
    }


    @Override
    public String toString() {
        return " Student {" +
                "name ='" + name + '\'' +
                ", firstname ='" + firstname + '\'' +
                ", age =" + age +
                ", pol ='" + pol + '\'' +
                '}';
    }
}
