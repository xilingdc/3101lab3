public class BuddyInfo {

    private String name;
    private int phone;
    private String address;
    public BuddyInfo() {
    }


    public BuddyInfo(String name, String address, int num) {
        this.name = name;
        this.address=address;
        this.phone=num;
    }


    public String getName() {
        return name;
    }

    public int getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }


}
