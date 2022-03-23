package officesuppliescheckingsystem;

public class supplies {
    protected String suppliesName;
    protected int quantity;
    protected double price;
    
    supplies(){
        suppliesName = "";
        quantity = 0;
        price = 0;
    }
    
    supplies(String sName, int sQuan, double sPrice){
        suppliesName = sName;
        quantity = sQuan;
        price = sPrice;
    }
    
    public void setSuppliesName(String sName){
        suppliesName = sName;
    }
    
    public String getSuppliesName(){
        return suppliesName;
    }
    
    public void setQuantity(int sQuan){
        quantity = sQuan;
    }
    
    public int getQuantity(){
        return quantity;
    }
    
    public void setPrice(double sPrice){
        price = sPrice;
    }
    
    public double getPrice(){
        return price;
    }
    
    public int calculateSupplies(int oldQuan, int needQuan){
        int currentQuantity;
        currentQuantity = oldQuan - needQuan;
        return currentQuantity;
    }
    
    public int updateSupplies(int oldQuan, int newQuan){
        int currentQuantity;
        currentQuantity = oldQuan + newQuan;
        return currentQuantity;
    }
}
