package Models;

public class Customer {
    private String name;
    private String profileId;

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

    public Customer(String name, String profileId) {
    this.name = name;
    this.profileId = profileId;
    }
}
