package model;
//poate scot orase intermediare
public class Ruta {
    private String[] orase_intrmd;
    private String plecare, destinatie;
    public  Ruta(String[] orase_intrmd,String plecare, String destinatie)
    {
        this.destinatie=destinatie;
        this.orase_intrmd=orase_intrmd;
        this.plecare=plecare;
    }

    public String[] getOrase_intrmd()
    {
        return orase_intrmd;
    }
   public void setOrase_intrmd(String[] orase_intrmd)
   {
       this.orase_intrmd=orase_intrmd;
   }
    public String getDestinatie()
    {
        return destinatie;
    }
    public void setDestinatie(String destinatie)
    {
        this.destinatie=destinatie;
    }
    public String getPlecare()
    {
        return plecare;
    }
    public void setPlecare(String plecare)
    {
        this.plecare=plecare;
    }

    public String toString() {
        StringBuilder b = new StringBuilder();
        b.append("Orase intermediare: ");
        for(int i = 0; i < orase_intrmd.length-1 ;i++)
            b.append(orase_intrmd[i]).append(' ');

        return " Plecare: " +plecare +"\n"+
                " Destinatie: " + destinatie+"\n"+
                b.toString() +"\n";

    }
}
