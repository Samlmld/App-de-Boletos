/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Samlml
 */
public class ViajeModDao {
      ArrayList <ViajeMod> Registros = new ArrayList();
      

       public ViajeModDao() {
        Registros=new ArrayList();
    }
       
    
    public void agregar_viaje(String Cliente,  String Destino,int Adulto,int Anciano,int Discapacitado,int Nino, int Total){
        Registros.add(new ViajeMod (Cliente,Destino,Adulto, Anciano,Discapacitado,Nino,Total));
   
    }
    
    public ArrayList <ViajeMod> mostrar_viajes(){
    
        return Registros;
    }
       
}
