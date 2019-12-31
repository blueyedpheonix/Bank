package systems;

public class RegularClient extends Client {


    public RegularClient(String name, int balance) {
        super(name, balance);
        commissionRate = 1.01;
    }



    @Override
    public String toString() {
        return "Regular Client " + getID();
    }
}
