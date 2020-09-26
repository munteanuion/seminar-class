package com.company;

import javax.print.DocFlavor;

class telefon
{
     private String marca;
     private int anul;
     private int pret;

     public telefon(String marca, int anul, int pret)
     {
            this.marca = marca;
            this.anul = anul;
            this.pret = pret;
     }

    public String printtel()
    {

        return ("Marca: " + this.marca + ", anul " + this.anul + ", Pretul: " + this.pret);
    }

    public void setMarca(String marca) {

         this.marca = marca;
    }

    public void setAnul(int anul) {

         this.anul = anul;
    }

    public void setPret(int pret) {

         this.pret = pret;
    }
}
