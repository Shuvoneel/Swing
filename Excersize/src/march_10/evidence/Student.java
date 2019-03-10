package march_10.evidence;

public class Student {

    private int id;
    private String name;
    private String gender;
    private String email;
    private String course;
    private String round;
    private String comments;

    public Student() {
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
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

    public String getComments() {
        return comments;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
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

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Student(int id, String name, String gender, String email, String course, String round, String comments) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.course = course;
        this.round = round;
        this.comments = comments;
    }

}
