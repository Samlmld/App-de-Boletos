/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Samlml
 */
public class ViajeMod {
    
    private String Cliente;
    private String Destino;
    private int Adulto;
    private int Anciano;
    private int Discapacitado;
    private int Nino;
    private int Total ;

    public ViajeMod(String Cliente, String Destino, int Adulto, int Anciano, int Discapacitado, int Nino, int Total) {
       this.Cliente=Cliente;
       this.Destino=Destino;
       this.Adulto=Adulto;
       this.Anciano=Anciano;
       this.Discapacitado=Discapacitado;
       this.Nino=Nino;
       this.Total=Total;
    }

    public String getCliente() {
        return Cliente;
    }

    public void setCliente(String Cliente) {
        this.Cliente = Cliente;
    }

    public String getDestino() {
        return Destino;
    }

    public void setDestino(String Destino) {
        this.Destino = Destino;
    }

    public int getAdulto() {
        return Adulto;
    }

    public void setAdulto(int Adulto) {
        this.Adulto = Adulto;
    }

    public int getAnciano() {
        return Anciano;
    }

    public void setAnciano(int Anciano) {
        this.Anciano = Anciano;
    }

    public int getDiscapacitado() {
        return Discapacitado;
    }

    public void setDiscapacitado(int Discapacitado) {
        this.Discapacitado = Discapacitado;
    }

    public int getNino() {
        return Nino;
    }

    public void setNino(int Nino) {
        this.Nino = Nino;
    }

    public int getTotal() {
        return Total;
    }

    public void setTotal(int Total) {
        this.Total = Total;
    }
    
    
    
    
    
}
