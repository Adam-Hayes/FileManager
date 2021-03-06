package FileManager;

import java.io.Serializable;

public class User implements Serializable {
    private String name;
    private String id;
    private String login;
    private String password;

    public User() {

    }

    public User(String name,String id,String login,String password){
    this.name = name;
    this.id = id;
    this.login=login;
    this.password=password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
