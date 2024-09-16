package SOLIDPrinciple.SingleResponsibilityPrinciple.correct;

public class InvoicePrinter {
    Invoice invoice;

    public InvoicePrinter(Invoice invoice){
        this.invoice = invoice;
    }

    public void print(){
        // print logic
    }
}
