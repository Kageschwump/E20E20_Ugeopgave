package Models;

public class Room {
    private String fireSafety;
    private String address;
    private int capacity;

    public String getFireSafety() {
        return fireSafety;
    }

    public void setFireSafety(String fireSafety) {
        this.fireSafety = fireSafety;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Room(String address, String fireSafety, int capacity) {
        this.address = address;
        this.fireSafety = fireSafety;
        this.capacity = capacity;
    }

}
