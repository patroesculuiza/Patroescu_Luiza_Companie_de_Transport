package service;
import model.Client;
import java.util.Scanner;
import repository.ClientRepository;
import java.util.ArrayList;
public class ClientService {

    private ClientRepository clientRepository;
    public ClientService()
    {
        clientRepository=new ClientRepository();
    }
    public void addClient(Client c){
        clientRepository.addClient(c);
    }

    public ClientRepository getClientRepository() {
        return clientRepository;
    }
    public void removeClient(Client c){
        clientRepository.removeClient(c);
    }
    public Client findbyid(int id)
    {
        return clientRepository.findbyid(id);
    }
    public String allClienti()
    {
        StringBuilder b = new StringBuilder();
        for(Client c : clientRepository.getClienti())
        {
            b.append(c.toString()).append("\n");
        }
        return b.toString();
    }
    //mai completeaza
}
