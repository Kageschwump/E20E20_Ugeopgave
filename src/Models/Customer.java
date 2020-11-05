package Models;

public class Customer {
    private String name;
    private String profileId;
    private Credit credit;
    private int age;

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


    public Credit getCredit() {
        return credit;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Customer(String name, String profileId, Credit credit, int age) {
        this.name = name;
        this.profileId = profileId;
        this.credit = credit;
        this.age = age;
    }

    public int getCustomerCredit(){
        return credit.getValue();
    }
}
