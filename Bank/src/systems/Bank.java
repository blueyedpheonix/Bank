package systems;

public class Bank {
    private Client[] clients = new Client[100];

    public Bank() {
    }
    public double getBankBalance(){
        double sum = 0;
        for(int i = 0; i < clients.length; i++){
            if(clients[i] != null)
                sum += clients[i].getFortune();
        }
        return sum;
    }
    public void addClinet(Client client){
        int counter = 0;
        while(clients[counter] != null && counter < clients.length){
            counter++;
        }
        if(counter == clients.length)
            System.out.println("no more room for accounts");
        else
            clients[counter] = client;
    }
    public void removeClinet(int ID){
        int counter = 0;
        int clinentID = clients[counter].getID();
        while(clinentID != ID && counter < clients.length){
            if (clients[counter] != null) {
                clinentID = clients[counter].getID();
            }
            counter++;
        }
        if(clinentID != ID)
            System.out.println("this client ID does not exist");
        else{
            clients[counter] = null;
            for(int i = 0; i < clients.length - 1; i++){
                clients[i] = clients[i+1];
            }
        }
    }

    public Client[] getClients() {
        return clients;
    }

}
