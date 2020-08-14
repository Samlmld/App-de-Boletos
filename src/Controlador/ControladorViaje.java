/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ViajeMod;
import Modelo.ViajeModDao;
import Vista.JFViajes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Samlml
 */
public class ControladorViaje implements ActionListener {

     private JFViajes jviaje;
    private ViajeModDao viajeDAO;
    double total;
    
    
    public ControladorViaje(JFViajes jviaje,ViajeModDao viajeDAO ){
    this.jviaje = jviaje;
    this.viajeDAO=viajeDAO;
    
    this.jviaje.btnCalcular.addActionListener(this);
    this.jviaje.btnGuardar.addActionListener(this);
    this.jviaje.btnConsultarTodo.addActionListener(this);


    
}
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource()==jviaje.btnCalcular) {
            
            int a=0;
            int b=0;
            int c=0;
            int d=0;
          
         a = (Integer.parseInt(jviaje.txtAdulto.getText()) * 100 );
         b = (Integer.parseInt(jviaje.txtAnciano.getText()) * 50 );
         c = (Integer.parseInt(jviaje.txtDiscapacitado.getText()) * 50 );
         d =  (Integer.parseInt(jviaje.txtNino.getText()) * 40 );
         
        
          jviaje.txtMostraAdulto.setText(String.valueOf(a));
           jviaje.txtMostraAnciano.setText(String.valueOf(b));
            jviaje.txtMostraDiscapacitado.setText(String.valueOf(c));
             jviaje.txtMostraNino.setText(String.valueOf(d));
             
             jviaje.txtTotalt.setText(String.valueOf(a+b+c+d));
            
          
         
    }
         if (ae.getSource()==jviaje.btnGuardar) {
             
              
             viajeDAO.agregar_viaje(jviaje.txtCliente.getText(),jviaje.txtDestino.getText(), Integer.parseInt(jviaje.txtAdulto.getText()), Integer.parseInt(jviaje.txtAnciano.getText()),Integer.parseInt(jviaje.txtDiscapacitado.getText()), Integer.parseInt(jviaje.txtNino.getText()), Integer.parseInt(jviaje.txtTotalt.getText()));
               /*Comprabacion que guarde*/System.out.println(viajeDAO.mostrar_viajes().get(0).getCliente());
               jviaje.txtCliente.setText(null);
               jviaje.txtDestino.setText(null);
               jviaje.txtAdulto.setText(null);
               jviaje.txtAnciano.setText(null);
               jviaje.txtDiscapacitado.setText(null);
               jviaje.txtNino.setText(null);
               
               
               jviaje.txtMostraAdulto.setText(null);
               jviaje.txtMostraAnciano.setText(null);
               jviaje.txtMostraDiscapacitado.setText(null);
               jviaje.txtMostraNino.setText(null);
               jviaje.txtTotalt.setText(null);
             }
         
         
         if (ae.getSource()==jviaje.btnConsultarTodo) {
            DefaultTableModel TablaModelol=new DefaultTableModel();
            
            jviaje.jtViajes.setModel(TablaModelol);
            
            TablaModelol.addColumn("CLIENTE");
            TablaModelol.addColumn("DESTINO");
            TablaModelol.addColumn("ADULTO");
            TablaModelol.addColumn("ANCIANO");
            TablaModelol.addColumn("DISCAPACITADO");
             TablaModelol.addColumn("NIÑO");
              TablaModelol.addColumn("TOTAL");
            
            if (viajeDAO.mostrar_viajes().size()>0) {
                Object[] columna = new Object[7];
                
                for (int i = 0; i < viajeDAO.mostrar_viajes().size(); i++) {
                    columna[0]=viajeDAO.mostrar_viajes().get(i).getCliente();
                    columna[1]=viajeDAO.mostrar_viajes().get(i).getDestino();
                    columna[2]=viajeDAO.mostrar_viajes().get(i).getAdulto();
                    columna[3]=viajeDAO.mostrar_viajes().get(i).getAnciano();
                    columna[4]=viajeDAO.mostrar_viajes().get(i).getDiscapacitado();
                     columna[5]=viajeDAO.mostrar_viajes().get(i).getNino();
                      columna[6]=viajeDAO.mostrar_viajes().get(i).getTotal();
                            
                   TablaModelol.addRow(columna);
        }
         }
    
       
    
}}}
    
