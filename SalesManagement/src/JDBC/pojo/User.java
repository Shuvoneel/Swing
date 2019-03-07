
package JDBC.pojo;

public class User {
    private int id;
    private String fullname;
    private String username;
    private String password;
    private String mobile;
    private Role role;

    public User() {
    }

    public User(int id, String fullname, String username, String password, String mobile, Role role) {
        this.id = id;
        this.fullname = fullname;
        this.username = username;
        this.password = password;
        this.mobile = mobile;
        this.role = role;
    }

    public User(String fullname, String username, String password, String mobile, Role role) {
        this.fullname = fullname;
        this.username = username;
        this.password = password;
        this.mobile = mobile;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public String getFullname() {
        return fullname;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getMobile() {
        return mobile;
    }

    public Role getRole() {
        return role;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setRole(Role role) {
        this.role = role;
    }
    
    
}
