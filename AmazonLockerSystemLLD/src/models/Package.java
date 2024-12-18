package models;

public class Package implements LockerItem{

    private final String id;
    private final Size size;

    public Package(String id, Size size) {
        this.id = id;
        this.size = size;
    }

    public String getId() {
        return id;
    }

    @Override
    public Size getSize() {
        return null;
    }
}
