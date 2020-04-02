package model;

public class Client extends Persoana{
    public Client(int id,String nume,String CNP, String telefon)
    {
       super(id,nume,CNP,telefon);
    }

    public String toString() {
        return "Client " + super.toString();
    }
    public int getByid()
    {
        return this.getid();
    }

}
