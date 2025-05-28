import javax.swing.*;


interface Bank {
    String getAccountName();
    String getAccountNumber();
    String getPhoneNumber();
}


class NabilBank implements Bank {
    private String accountName;
    private String accountNumber;
    private String phoneNumber;

    @Override
    public String getAccountName() {
        accountName = JOptionPane.showInputDialog("Enter the account name:");
        return accountName;
    }

    @Override
    public String getAccountNumber() {
        accountNumber = JOptionPane.showInputDialog("Enter the account number:");
        return accountNumber;
    }

    @Override
    public String getPhoneNumber() {
        phoneNumber = JOptionPane.showInputDialog("Enter the phone number associated with your account:");
        return phoneNumber;
    }

    // Optional: Getter methods if needed outside the class
    public String getStoredAccountName() {
        return accountName;
    }

    public String getStoredAccountNumber() {
        return accountNumber;
    }

    public String getStoredPhoneNumber() {
        return phoneNumber;
    }
}


public class InheritanceAndInterface {
    public static void main(String[] args) {
        NabilBank nabil = new NabilBank();


        String name = nabil.getAccountName();
        String number = nabil.getAccountNumber();
        String phone = nabil.getPhoneNumber();


        String message = "Account Details:\n" +  "Name: " + name + "\n" + "Account Number: " + number + "\n" +   "Phone Number: " + phone;

        JOptionPane.showMessageDialog(null, message);
    }
}