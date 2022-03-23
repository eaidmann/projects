package officesuppliescheckingsystem;

import javax.swing.JOptionPane;
import java.time.LocalDateTime;

public class OfficeSuppliesCheckingSystem {

    public static void main(String[] args) {
        String dQuan;
        int userChoice, disQuan;
        String finChoice;
        String loginUsername, loginPass, loginType;
        LocalDateTime accessTime = LocalDateTime.now();
        
        //Supplies Initialization
        supplies i1 = new supplies("A4 Paper", 10, 9.70);
        supplies i2 = new supplies("Printer Ink", 10, 36.40);
        supplies i3 = new supplies("Whiteboard Marker", 10, 2.20);
        supplies i4 = new supplies("Mineral Water 150ml", 20, 1.00 );
        supplies i5 = new supplies("Stapler Bullet", 50, 1.50);
        
        //User Initialization
        login u1 = new login("shichibukai", "boahancock", "employee");
        login u2 = new login("emperor", "luffy", "administrator");
        
        //Login Username UI
        loginUsername = JOptionPane.showInputDialog("Enter Username : ");
        loginPass = JOptionPane.showInputDialog("Enter Password : ");
        loginType = JOptionPane.showInputDialog("Enter Account Type (employee or administrator)");
        
        if(u1.username.equals(loginUsername) && u1.password.equals(loginPass) && u1.accountType.equals(loginType)){
        //Display Menu Panel and User Choose Action
        String choice = JOptionPane.showInputDialog("<--Welcome to Office Supplies Checking System-->"
        + "\nDate Access : " + accessTime
        + "\n\nPlease Choose Your Action :\n"
        + "1. Display Supplies Menu\n"
        + "2. Exit\n");
        userChoice = Integer.parseInt(choice);
        
        switch(userChoice){
            case 1 : {
            char fChoice;
            do{
                String disChoice = JOptionPane.showInputDialog("<--SUPPLIES DISPLAY MENU-->"
                        + "\nSupplies Name - Supplies Quantity - Supplies Price (each)"
                        + "\n1." + i1.suppliesName + " - " + i1.quantity + " - RM" + i1.price
                        + "\n2." + i2.suppliesName + " - " + i2.quantity + " - RM" + i2.price
                        + "\n3." + i3.suppliesName + " - " + i3.quantity + " - RM" + i3.price
                        + "\n4." + i4.suppliesName + " - " + i4.quantity + " - RM" + i4.price
                        + "\n5." + i5.suppliesName + " - " + i5.quantity + " - RM" + i5.price
                        + "\n\n<<CHOOSE YOUR ACTION>>\n"
                        + "1. Choose Supply to take (by typing 1-[Supply Number] )\n"
                        + "2. Logout System\n");
                
                switch(disChoice){
                    case "1-1" : dQuan = JOptionPane.showInputDialog("Enter Your Quantity : ");
                    disQuan = Integer.parseInt(dQuan);
                    i1.quantity = i1.calculateSupplies(i1.quantity, disQuan);
                    break;
                    
                    case "1-2" : dQuan = JOptionPane.showInputDialog("Enter Your Quantity : ");
                    disQuan = Integer.parseInt(dQuan);
                    i2.quantity = i2.calculateSupplies(i2.quantity, disQuan);
                    break;
                    
                    case "1-3" : dQuan = JOptionPane.showInputDialog("Enter Your Quantity : ");
                    disQuan = Integer.parseInt(dQuan);
                    i3.quantity = i3.calculateSupplies(i3.quantity, disQuan);
                    break;
                    
                    case "1-4" : dQuan = JOptionPane.showInputDialog("Enter Your Quantity : ");
                    disQuan = Integer.parseInt(dQuan);
                    i4.quantity = i4.calculateSupplies(i4.quantity, disQuan);
                    break;
                    
                    case "1-5" : dQuan = JOptionPane.showInputDialog("Enter Your Quantity : ");
                    disQuan = Integer.parseInt(dQuan);
                    i5.quantity = i5.calculateSupplies(i5.quantity, disQuan);
                    break;
                    
                    case "2" : JOptionPane.showMessageDialog(null, "Successfully Logged Out from System!");
                    System.exit(0);
                    break;
                    
                    default : JOptionPane.showMessageDialog(null, "Wrong Keyword, Please Try Again!");
                }
                finChoice = JOptionPane.showInputDialog("Do you want to return to display menu ? (Y-Yes, N-No) : ");
                fChoice = finChoice.charAt(0);
            }while(fChoice == 'y' || fChoice == 'Y');
        }
            
                break;
            
            case 2 :System.exit(0);
                break;
                
            default : JOptionPane.showMessageDialog(null, "Wrong Keyword, Please Try Again!");
        }
        }else if(u2.username.equals(loginUsername) && u2.password.equals(loginPass) && u2.accountType.equals(loginType)){
            //Display Menu Panel and User Choose Action
        String choice = JOptionPane.showInputDialog("<--Welcome to Office Supplies Checking System (Administrator)-->"
        + "\nDate Access : " + accessTime
        + "\n\nPlease Choose Your Action :\n"
        + "1. Display Supplies Menu\n"
        + "2. Exit\n");
        userChoice = Integer.parseInt(choice);
        
        switch(userChoice){
            case 1 : {
            char fChoice;
            do{
                String disChoice = JOptionPane.showInputDialog("<--SUPPLIES DISPLAY MENU-->"
                        + "\nSupplies Name - Supplies Quantity - Supplies Price (each)"
                        + "\n1." + i1.suppliesName + " - " + i1.quantity + " - RM" + i1.price
                        + "\n2." + i2.suppliesName + " - " + i2.quantity + " - RM" + i2.price
                        + "\n3." + i3.suppliesName + " - " + i3.quantity + " - RM" + i3.price
                        + "\n4." + i4.suppliesName + " - " + i4.quantity + " - RM" + i4.price
                        + "\n5." + i5.suppliesName + " - " + i5.quantity + " - RM" + i5.price
                        + "\n\n<<CHOOSE YOUR ACTION>>\n"
                        + "1. Choose Supply to take (by typing 1-[Supply Number] )\n"
                        + "2. Update Supply (by typing 2-[SupplyNumber] )\n"
                        + "3. Logout System\n");
                
                switch(disChoice){
                    case "1-1" : dQuan = JOptionPane.showInputDialog("Enter Your Quantity : ");
                    disQuan = Integer.parseInt(dQuan);
                    i1.quantity = i1.calculateSupplies(i1.quantity, disQuan);
                    break;
                    
                    case "1-2" : dQuan = JOptionPane.showInputDialog("Enter Your Quantity : ");
                    disQuan = Integer.parseInt(dQuan);
                    i2.quantity = i2.calculateSupplies(i2.quantity, disQuan);
                    break;
                    
                    case "1-3" : dQuan = JOptionPane.showInputDialog("Enter Your Quantity : ");
                    disQuan = Integer.parseInt(dQuan);
                    i3.quantity = i3.calculateSupplies(i3.quantity, disQuan);
                    break;
                    
                    case "1-4" : dQuan = JOptionPane.showInputDialog("Enter Your Quantity : ");
                    disQuan = Integer.parseInt(dQuan);
                    i4.quantity = i4.calculateSupplies(i4.quantity, disQuan);
                    break;
                    
                    case "1-5" : dQuan = JOptionPane.showInputDialog("Enter Your Quantity : ");
                    disQuan = Integer.parseInt(dQuan);
                    i5.quantity = i5.calculateSupplies(i5.quantity, disQuan);
                    break;
                    
                    case "2-1" : dQuan = JOptionPane.showInputDialog("Enter the Quantity : ");
                    disQuan = Integer.parseInt(dQuan);
                    i1.quantity = i1.updateSupplies(i1.quantity, disQuan);
                    break;
                    
                    case "2-2" : dQuan = JOptionPane.showInputDialog("Enter the Quantity : ");
                    disQuan = Integer.parseInt(dQuan);
                    i2.quantity = i2.updateSupplies(i2.quantity, disQuan);
                    break;
                    
                    case "2-3" : dQuan = JOptionPane.showInputDialog("Enter the Quantity : ");
                    disQuan = Integer.parseInt(dQuan);
                    i3.quantity = i3.updateSupplies(i3.quantity, disQuan);
                    break;
                    
                    case "2-4" : dQuan = JOptionPane.showInputDialog("Enter the Quantity : ");
                    disQuan = Integer.parseInt(dQuan);
                    i4.quantity = i4.updateSupplies(i4.quantity, disQuan);
                    break;
                    
                    case "2-5" : dQuan = JOptionPane.showInputDialog("Enter the Quantity : ");
                    disQuan = Integer.parseInt(dQuan);
                    i5.quantity = i5.updateSupplies(i5.quantity, disQuan);
                    break;
                    
                    
                    case "3" : JOptionPane.showMessageDialog(null, "Successfully Logged Out from System!");
                    System.exit(0);
                    break;
                    
                    default : JOptionPane.showMessageDialog(null, "Wrong Keyword, Please Try Again!");
                }
                finChoice = JOptionPane.showInputDialog("Do you want to return to display menu ? (Y-Yes, N-No) : ");
                fChoice = finChoice.charAt(0);
            }while(fChoice == 'y' || fChoice == 'Y');
        }
            
                break;
            
            case 2 :System.exit(0);
                break;
                
            default : JOptionPane.showMessageDialog(null, "Wrong Keyword, Please Try Again!");
        }
        }else{
            JOptionPane.showMessageDialog(null, "Username and Password NOT FOUND!");
        }
        
        
        
    }
}
