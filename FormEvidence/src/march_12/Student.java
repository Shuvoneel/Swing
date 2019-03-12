package march_12;

public class Student {

    private int id;
    private String name;
    private int age;
    private String gender;
    private String email;
    private String course;
    private String round;
    private String message;

    public Student() {
    }

    public Student(int id, String name, int age, String gender, String email, String course, String round, String message) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.email = email;
        this.course = course;
        this.round = round;
        this.message = message;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public String getCourse() {
        return course;
    }

    public String getRound() {
        return round;
    }

    public String getMessage() {
        return message;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setRound(String round) {
        this.round = round;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
}
