package edu.sdccd.cisc191;
import java.util.Set;
//  Issue on how to import SpringFrameWork


public class Role extends Account {
    private String name;
    private Set<Account> users;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Set<Account> getUsers() {
        return users;
    }
    public void setUsers(Set<Account> users) {
        this.users = users;
    }
}
