package VendingMachine.state;

import VendingMachine.Inventory.Coin;
import VendingMachine.Inventory.Item;
import VendingMachine.VendingMachine;

import java.util.List;

public class SelectionState implements State {

    public SelectionState(){
        System.out.println("Currently Vending machine is in SelectionState");
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
        Item item = vendingMachine.getInventory().getItem(codeNumber);

        int paidByUser = 0;
        for(Coin coin : vendingMachine.getCoinList()){
            paidByUser += coin.value;
        }

        if(paidByUser >= item.getPrice()){
            if(paidByUser > item.getPrice()){
                getChange(paidByUser - item.getPrice());
            }
            vendingMachine.setState(new DispenseState(vendingMachine, codeNumber));
        }
        else{
            refundFullMoney(vendingMachine);
            throw new Exception("Insufficient amount");
        }
    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        System.out.println("User getting monery return : " + returnChangeMoney);
        return returnChangeMoney;
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine vendingMachine) throws Exception {
        return null;
    }

    @Override
    public Item dispenseProduct(VendingMachine vendingMachine, int codeNumber) throws Exception {
        return null;
    }

    @Override
    public void updateInventory(VendingMachine vendingMachine, Item item, int codeNumber) throws Exception {

    }
}

