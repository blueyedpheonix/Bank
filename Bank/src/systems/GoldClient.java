package systems;

public class GoldClient extends Client {
    public GoldClient(String name, int balance) {
        super(name, balance);
        commissionRate = 1.03;
    }

    @Override
    public String toString() {
        return "Gold Client " + getID();
    }
}
