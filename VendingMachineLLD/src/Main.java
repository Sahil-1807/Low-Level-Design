import VendingMachine.Inventory.Coin;
import VendingMachine.Inventory.Item;
import VendingMachine.Inventory.ItemShelf;
import VendingMachine.Inventory.ItemType;
import VendingMachine.VendingMachine;
import VendingMachine.state.State;

public class Main {
    public static void main(String args[]){
        VendingMachine vendingMachine = new VendingMachine();

        try{
            fillUpInventory(vendingMachine);
            displayInventory(vendingMachine);

            System.out.println("Clicking on Insert Coin button.");
            State currentVendingState = vendingMachine.getState();
            currentVendingState.clickOnInsertCoinButton(vendingMachine);

            currentVendingState = vendingMachine.getState();
            currentVendingState.insertCoin(vendingMachine, Coin.NICKEL);
            currentVendingState.insertCoin(vendingMachine, Coin.QUARTER);

            System.out.println("Clicking on product selection button.");
            currentVendingState.clickOnStartProductSelectionButton(vendingMachine);

            currentVendingState = vendingMachine.getState();
            currentVendingState.chooseProduct(vendingMachine, 101);

            displayInventory(vendingMachine);

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private static void fillUpInventory(VendingMachine vendingMachine){
        ItemShelf[] slots = vendingMachine.getInventory().inventory;
        for (int i = 0; i < slots.length; i++) {
            Item newItem = new Item();
            if(i >=0 && i<3) {
                newItem.setType(ItemType.COKE);
                newItem.setPrice(12);
            }else if(i >=3 && i<5){
                newItem.setType(ItemType.PEPSI);
                newItem.setPrice(9);
            }else if(i >=5 && i<7){
                newItem.setType(ItemType.JUICE);
                newItem.setPrice(13);
            }else if(i >=7 && i<10){
                newItem.setType(ItemType.SODA);
                newItem.setPrice(7);
            }
            slots[i].setItem(newItem);
            slots[i].setSoldOut(false);
        }
    }

    private static void displayInventory(VendingMachine vendingMachine){

        ItemShelf[] slots = vendingMachine.getInventory().inventory;
        for (int i = 0; i < slots.length; i++) {

            System.out.println("CodeNumber: " + slots[i].getCode() +
                    " Item: " + slots[i].getItem().getType().name() +
                    " Price: " + slots[i].getItem().getPrice() +
                    " isAvailable: " + !slots[i].isSoldOut());
        }
    }
}