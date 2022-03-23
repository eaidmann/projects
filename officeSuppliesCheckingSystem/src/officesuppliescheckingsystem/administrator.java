package officesuppliescheckingsystem;

public class administrator extends employee{
    protected String positionType;
    
    public void setPositionType(String pType){
        positionType = pType;
    }
    
    public String getPositionType(){
        return positionType;
    }
    
    public void setAdminDetail(int empID, String empName, int empPhone, String pType){
        setEmployeeID(empID);
        setEmployeeName(empName);
        setNoPhone(empPhone);
        setPositionType(pType);
    }
}
