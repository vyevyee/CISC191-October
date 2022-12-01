package edu.sdccd.cisc191;
import java.util.Set;

public class Role extends User {
    private String name;
    private Set<User> users;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Set<User> getUsers() {
        return users;
    }
    public void setUsers(Set<User> users) {
        this.users = users;
    }
}
