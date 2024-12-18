package VendingMachine.Inventory;

public class Inventory {
    public ItemShelf[] inventory = null;

    public Inventory(int count){
        inventory = new ItemShelf[count];
        emptyAllInventory();
    }

    public void emptyAllInventory(){
        int startCode = 101;
        for(int i = 0; i < inventory.length; i++){
            ItemShelf space = new ItemShelf();
            space.setCode(startCode);
            space.setSoldOut(false);
            inventory[i] = space;
            startCode++;
        }
    }

    public void addItem(Item item, int codeNumber) throws Exception{
        for(ItemShelf itemShelf : inventory){
            if(itemShelf.getCode() == codeNumber){
                if(itemShelf.isSoldOut()){
                    itemShelf.setItem(item);
                    itemShelf.setSoldOut(false);
                }
                else{
                    throw new Exception("you can not add item here as item is present already.");
                }
            }
        }
    }

    public Item getItem(int codeNumber)throws Exception{
        for(ItemShelf itemShelf : inventory){
            if(itemShelf.isSoldOut()){
                throw new Exception("item is already sold out");
            }
            else{
                return itemShelf.getItem();
            }
        }

        throw new Exception("invalid code");
    }

    public void updateSoldOutItem(int codeNumber){
        for(ItemShelf itemShelf : inventory){
            if(itemShelf.getCode() == codeNumber){
                itemShelf.setSoldOut(true);
            }
        }
    }

}
