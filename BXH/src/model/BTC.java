
package model;

import java.io.Serializable;


public class BTC implements Serializable{
    private String ID;
    private String name;
    private String username;
    private String password;
    private String role;

    public BTC() {
        super();
    }

    public BTC( String name, String username, String password, String role) {
        super();
        this.name = name;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    
    
}
