package model;

public class Usuario {
    private String username;
    private String password;
    private int type; // 1 = admin, 0 = cliente

    public Usuario(String username, String password, int type) {
        this.username = username;
        this.password = password;
        this.type = type;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getType() {
        return type;
    }
}
