// Illustrate the concept-Encapsulation with the Payment Gateway System.
// The class should encapsulate private data members such as transaction ID, payer name, payee name, amount, 
// payment method, and transaction status. Provide appropriate public getter and setter methods to access and 
// modify these details securely. Also include a method to display the transaction summary.

class Payment{
    private String TransactionId;
    private String PayerName;
    private String payeeName;
    private double amount;
    private String payMethod;
    private String status;
    
    //getter and setter for transaction Id.
    public String getTransId(){
        return TransactionId;
    }
    public void setTransId(String TransactionId){
        this.TransactionId = TransactionId;
    }

    public String getPayerName(){
        return PayerName;
    }
    public void setPayerName(String PayerName){
        this.PayerName = PayerName;
    }

    public String getPayeeName(){
        return payeeName;
    }
    public void setPayeeName(String payeeName){
        this.payeeName = payeeName;
    }
    
    public double getAmount(){
        return amount;
    }
    public void setAmount(double amount){
        this.amount = amount;
    }

    public String getPayMethod() {
        return payMethod;
    }
    public void setPayMethod(String payMethod) {
        this.payMethod = payMethod;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public void processTransaction() {
        if (amount > 0 && payMethod != null && !payMethod.isEmpty()) {
            status = "Success";
        } else {
            status = "Failed";
        }   
    }

    public void dispalyDetails(){
        System.out.println("Transaction Id: " + TransactionId);
        System.out.println("Payer Name : " + PayerName);
        System.out.println("Payee Name : " + payeeName);
        System.out.println("Amount : " + amount);
        System.out.println("Payment Method : " + payMethod);
        System.out.println("Status : " + status);
    }
    
}

public class Q1{
    public static void main(String[] args) {
        Payment newton = new Payment();
        
        newton.setTransId("CNRDHFKK23");
        newton.setPayerName("Mark");
        newton.setPayeeName("newton");
        newton.setAmount(0);
        newton.setPayMethod("online");
        // newton.setStatus("Success");
        newton.processTransaction();

        newton.dispalyDetails();
    }
}