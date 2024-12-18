package VendingMachine.state;

import VendingMachine.Inventory.Coin;
import VendingMachine.Inventory.Item;

import java.util.List;
import VendingMachine.VendingMachine;

public class DispenseState implements State {
    DispenseState(VendingMachine vendingMachine, int codeNumber) throws Exception{
        System.out.println("Machine is in dispense state");
        dispenseProduct(vendingMachine, codeNumber);
    }
    @Override
    public void clickOnInsertCoinButton(VendingMachine vendingMachine) throws Exception {

    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine vendingMachine) throws Exception {

    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception {

    }

    @Override
    public void chooseProduct(VendingMachine vendingMachine, int codeNumber) throws Exception {

    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        throw new Exception("change can not be done in dispense state");
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine vendingMachine) throws Exception {
        return null;
    }

    @Override
    public Item dispenseProduct(VendingMachine vendingMachine, int codeNumber) throws Exception {
        Item item = vendingMachine.getInventory().getItem(codeNumber);
        vendingMachine.getInventory().updateSoldOutItem(codeNumber);
        System.out.println("Product has been dispensed. Thank you for useing this Vending Machine.");
        vendingMachine.setState(new IdleState());
        return item;

    }

    @Override
    public void updateInventory(VendingMachine vendingMachine, Item item, int codeNumber) throws Exception {

    }
}

