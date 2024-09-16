package SOLIDPrinciple.SingleResponsibilityPrinciple.correct;

public class InvoiceDao {
    Invoice invoice;

    public InvoiceDao(Invoice invoice){
        this.invoice = invoice;
    }

    public void saveToDB(){
        // saving logic 
    }
}
