package models;

import java.util.ArrayList;
import java.util.List;

public class Locker {
    private final String id;
    private final List<Slot> slots;

    public Locker(String id, List<Slot> slots) {
        this.id = id;
        this.slots = slots;
    }

    public void addSlot(final Slot newSlot){
        this.slots.add(newSlot);
    }

    public String getId() {
        return id;
    }

    public List<Slot> getSlots() {
        return slots;
    }

    public List<Slot> getAvailableSlots(){
        final List<Slot> result = new ArrayList<>();
        for(Slot slot : this.slots){
            if(slot.isAvailable()){
                result.add(slot);
            }
        }

        return result;
    }
}
