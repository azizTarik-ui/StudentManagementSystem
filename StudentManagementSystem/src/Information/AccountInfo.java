package Information;
public class AccountInfo {
    private String username;
    private String password;
    private int ID;
    private String email;
    
    AccountInfo()
    {
        
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getID() {
        return ID;
    }

    public String getEmail() {
        return email;
    }
    
}
