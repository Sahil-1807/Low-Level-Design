package InventoryManagementLLD.PaymentManagement;

public class UPIPaymentMode implements PaymentMode{

    @Override
    public boolean makePayment() {
        return true;
    }
}
