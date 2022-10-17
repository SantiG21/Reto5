package usa.mintic.retos.model.reports;

import usa.mintic.retos.model.Client;

public class Clients {

    private int total;
    private Client client;

    public Clients(int total, Client client){
        this.total=total;
        this.client=client;
    }


    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
