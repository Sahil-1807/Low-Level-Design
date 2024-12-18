package VendingMachine.state;

import VendingMachine.Inventory.Coin;
import VendingMachine.Inventory.Item;
import VendingMachine.VendingMachine;

import java.util.List;

public class HasMoneyState implements State {

    public HasMoneyState(){
        System.out.println("currently vending machine is in has money state.");
    }
    @Override
    public void clickOnInsertCoinButton(VendingMachine vendingMachine) throws Exception {

    }

    @Override
    public void clickOnStartProductSelectionButton(VendingMachine vendingMachine) throws Exception {
        vendingMachine.setState(new SelectionState());
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception {
        System.out.println("Accept the coin");
        vendingMachine.getCoinList().add(coin);
    }

    @Override
    public void chooseProduct(VendingMachine vendingMachine, int codeNumber) throws Exception {

    }

    @Override
    public int getChange(int returnChangeMoney) throws Exception {
        throw new Exception("Change can not happen");
    }

    @Override
    public List<Coin> refundFullMoney(VendingMachine vendingMachine) throws Exception {
        System.out.println("return the full amount");
        vendingMachine.setState(new IdleState());
        return vendingMachine.getCoinList();
    }

    @Override
    public Item dispenseProduct(VendingMachine vendingMachine, int codeNumber) throws Exception {
        throw new Exception("first choose the product");
    }

    @Override
    public void updateInventory(VendingMachine vendingMachine, Item item, int codeNumber) throws Exception {

    }
}
