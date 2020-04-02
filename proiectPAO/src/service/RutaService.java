package service;
import model.Ruta;
import repository.RutaRepository;
import java.util.ArrayList;
public class RutaService {
    private RutaRepository rutaRepository;
    public RutaService(){
        rutaRepository=new RutaRepository();
    }
    public void addRuta(Ruta r)
    {
        rutaRepository.addRuta(r);
    }
    public void removeRuta(Ruta r){
        rutaRepository.removeRuta(r);
    }
}
