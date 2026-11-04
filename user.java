public class User {
    private int id;
    private String username;
    private String email;
    private String salt;
    private String passwordHash;

    public User(int id, String username, String email, String salt, String passwordHash) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.passwordHash = passwordHash;
        this.salt = salt;
    }

    public int getId(){
        return id;
    }

    public String getUsername(){
        return username;
    }

    public String getEmail(){
        return email;
    }

    public String getSalt() {
        return salt;
    }

    public String getPassword(){
        return passwordHash;
    }

    public void setPassword(String password){
        this.passwordHash = password;
    }

    public void setUsername(String username){
        this.username = username;
    }
    
}




