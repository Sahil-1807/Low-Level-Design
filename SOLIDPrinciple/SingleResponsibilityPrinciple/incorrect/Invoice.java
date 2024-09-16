package SOLIDPrinciple.SingleResponsibilityPrinciple.incorrect;

public class Invoice {
    private  Marker marker;
    private  int quantity;

    public Invoice(Marker marker, int quantity){
        this.marker = marker;
        this.quantity = quantity;
    }

    public int calculateTotal(){
        int price = ((marker.price) * this.quantity);
        return price;
    }

    public void printInvoice(){

    }

    public void saveToDB(){

    }
}
// here we are performing three operations and due to all of these we may have to 
// change the invoid logic which do not follow single responsibility
// principal which state that we should have only one reason to change any class

// so we can solve this problem by dividing all these jobs in different class