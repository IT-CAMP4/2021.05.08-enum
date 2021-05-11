package pl.camp.it;

public class User {
    private String login;
    private String name;
    private String surname;
    private String password;
    private Sex sex;

    public User(String login, String name, String surname, String password, Sex sex) {
        this.login = login;
        this.name = name;
        this.surname = surname;
        this.password = password;
        this.sex = sex;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }
}
