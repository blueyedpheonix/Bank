package systems;

public class Bank {
    private Client[] clients = new Client[100];
    private int Ccounter;
    private double balance;

// Constructor

    public Bank() {
    }

// Getters & Setters

    public void setBalance(){
        for(int i =0; i < clients.length; i++){
            balance += clients[i].getFortune();
        }
    }
    public double getBankBalance(){
        double sum = 0;
        for(int i = 0; i < clients.length; i++){
            if(clients[i] != null)
                sum += clients[i].getFortune();
        }
        return sum;
    }

// Functionality

    public void addClient(Client client){
        if(Ccounter > clients.length)
            System.out.println("there is no more room for Clients");
        else{
            clients[Ccounter] = client;
            Ccounter++;
        }
    }
    public void removeClinet(int ID){
        int position = -1;
        for(int i = 0; i < Ccounter; i++){
            if(clients[i].getID() == ID)
                position = i;
        }
        if(position != -1){
            this.balance += clients[position].getBalance();
            clients[position] = null;
            for(int i = position; i < Ccounter; i++){
                clients[i] = clients[i+1];
            }
            Ccounter--;
        }else{
            System.out.println("There is no client with this ID");
        }
    }

    public Client[] getClients() {
        return clients;
    }

    public void printClientDetails(Client client){
        System.out.println(client.toString());
    }

}
