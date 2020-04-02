Companie de Transport
-Clase:
--
Client
Persoana  defineste o persoana


Sofer extends Persoana 


Client extends Persoana


Produs  produsul transportat


Review - recenzie data de client pentru compania de transport


Companie - contine numele si locatia companiei 


Ruta - locul plecarii si al destinatiei, si orase intermediare



-Actiuni:
--
ClientService -removeClient --scoare un client din lista


              -findbyid --gaseste clientul dupa id
              
              
              -allClienti -- afiseaza toti clientii
              
              
             
 MasinaService -addMasina --adauga o masina in lista
 
 
               -removeMasina--scoate masina din lista
               
               
 ProdusService -addProdus --adauga produs in lista
 
 
               -removeProdus -- elimina din lista
               
               
 ReviewService  -addReview --adauga review
 
 
                -removeReview --elimina review
                
                
 RutaService    -addRuta --adauga ruta
 
 
                -removeRuta--elimina ruta
                
                
 SoferService   -addSofer --adauga sofer
 
 
                -removeSofer--elimina sofer
