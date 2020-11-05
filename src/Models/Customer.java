package Models;

public class Customer {
    private String name;
    private String profileId;
    private int credit;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfileId() {
        return profileId;
    }

    public void setProfileId(String profileId) {
        this.profileId = profileId;
    }

    public Customer(String name, String profileId, int credit) {
    this.name = name;
    this.profileId = profileId;
    this.credit = credit;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }
}
