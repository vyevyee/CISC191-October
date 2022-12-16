package edu.sdccd.cisc191;
import java.util.Set;
import org.springframework.boot.SpringApplication;

/**
 * User class will have access to registration
 * Known as User Account Registration
 * Resources: https://hellokoding.com/registration-and-login-example-with-spring-security-spring-boot-spring-data-jpa-hsql-jsp/
 */

/**
 * Player user --> For access to login and logout
 *  Make user to login, logout, access files
 *  Lambda expressions: block of code that consist of parameters and returns a value
 *  Meta Space (in place of PermGen) grows automatically by default
 */

/**
 * CrudRepository = Spring data interface
 * Propertties: Save, findById, delete, count etc
 */

@SpringBootApplication

public class Account {

    private Long id;
    private String userName;
    private String password;
    private String passWordConfirm;
    private Set<Role> roles;

//  Role is a subclass from User
//  Constructors for each objects, setters and getters to obtain information from the users account

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getPassWordConfirm() {
        return passWordConfirm;
    }
    public void setPassWordConfirm(String passWordConfirm) {
        this.passWordConfirm = passWordConfirm;
    }
    public Set<Role> getRoles() {
        return roles;
    }
    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

}
//  Application properties: Will start to update once the beginning steps of the code is finished
