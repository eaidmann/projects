package officesuppliescheckingsystem;

public class login {
    protected String username;
    protected String password;
    protected String accountType;
    
    login(String uName, String uPass, String aType){
        username = uName;
        password = uPass;
        accountType = aType;
    }
    
    public void setUsername(String uName){
        username = uName;
    }
    
    public String getUsername(){
        return username;
    }
    
    public void setPassword(String uPass){
        password = uPass;
    }
    
    public String getPassword(){
        return password;
    }
}
