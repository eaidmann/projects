package officesuppliescheckingsystem;

public class employee {
    protected String employeeName;
    protected int employeeID;
    protected int phoneNumber;
    
    public void setEmployeeName(String eName){
        employeeName = eName;
    }
    
    public String getEmployeeName(){
        return employeeName;
    }
    
    public void setEmployeeID(int eID){
        employeeID = eID;
    }
    
    public int getEmployeeID(){
        return employeeID;
    }
    
    public void setNoPhone(int pNum){
        phoneNumber = pNum;
    }
    
    public int getNoPhone(){
        return phoneNumber;
    }
}
