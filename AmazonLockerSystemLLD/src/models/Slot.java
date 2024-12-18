package models;

import java.util.Date;

public class Slot {
    private final String slotId;
    private final Size size;
    private final Locker locker;
    private LockerItem currentLockerItem;
    private Date allocationDate;

    public Slot(String slotId, Size size, Locker locker) {
        this.slotId = slotId;
        this.size = size;
        this.locker = locker;
    }

    synchronized public void allocatePackage(final LockerItem newLockerItem) throws Exception {
        if(this.currentLockerItem != null){
            throw new Exception("Locker is already allocated to some other user");
        }
        this.currentLockerItem = newLockerItem;
        this.allocationDate = new Date();
    }

    synchronized public void deallocateLocker(){
        this.currentLockerItem = null;
    }

    synchronized public boolean isAvailable(){
        return this.currentLockerItem == null;
    }
}
