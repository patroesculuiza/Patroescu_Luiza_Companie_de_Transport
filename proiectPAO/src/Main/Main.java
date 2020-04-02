package Main;

import model.*;
import service.*;
import repository.*;
import java.util.ArrayList;

public class Main {

    public static ClientService clientService;
    public static SoferService soferService;
    public static RutaService rutaService;
    public static MasinaService masinaService;
    public static ProdusService produsService;
    public static ReviewService reviewService = new ReviewService();

    public static void main(String[]args)
    {
       masinaService=new MasinaService();
        clientService=new ClientService();
        soferService=new SoferService();
        rutaService=new RutaService();
        produsService=new ProdusService();
        String[]a={"Polo","Baia","Novaci","Tg-Jiu"};
        Ruta ruta=new Ruta(a,"Polo","Tg-Jiu");
        rutaService.addRuta(ruta);
        Masina m=new Masina("12","b2","albastru",ruta,123);
        masinaService.addMasina(m);
        Client client = new Client(234, "LUIza", "44844393", "07****323");
        clientService.addClient(client);
        Sofer sofer=new Sofer(2342,"Marian","454533","07***32",m,232,ruta);
        soferService.addSofer(sofer);
        System.out.println(ruta.toString());
        System.out.println(sofer.toString());
        System.out.println(client.toString());
        System.out.println(m.toString());



    }



}
