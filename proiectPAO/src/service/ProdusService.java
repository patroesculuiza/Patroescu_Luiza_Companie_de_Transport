package service;
import model.Produs;
import repository.ProdusRepository;
import java.util.ArrayList;
public class ProdusService {
    private ProdusRepository produsRepository;
    public ProdusService()
    {
        produsRepository=new ProdusRepository();
    }
    public void addProdus(Produs p){
        produsRepository.addProdus(p);
    }
    public void removeProdus(Produs p){
        produsRepository.removeProdus(p);
    }
    //find by id
}
