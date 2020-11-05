package Models;

public class Room {
    private String fireSafety;
    private String address;

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

    public Room(String address, String fireSafety) {
    this.address = address;
    this.fireSafety = fireSafety;
    }
}
