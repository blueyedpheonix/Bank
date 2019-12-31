package systems;

public class PlatinumClient extends Client {
    public PlatinumClient(String name, int balance) {
        super(name, balance);
        commissionRate = 1.05;
    }

    @Override
    public String toString() {
        return "Platinum Client " + getID();
    }
}
