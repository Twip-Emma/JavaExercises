package account;

public class Account {
    private String account;
    private String password;
    private String name;

    public Account(String account, String password, String name) {
        this.account = account;
        this.password = password;
        this.name = name;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAccount() {
        return account;
    }

}
