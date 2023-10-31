/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package veterinaria;

import Entidades.Cliente;
import Vistas.PanelUsuario;
import conexion.ClienteData;
import conexion.Conectar;
import conexion.VisitaData;

/**
 *
 * @author Cristian
 */
public class Veterinaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PanelUsuario panel =new PanelUsuario();
        panel.setVisible(true);
        panel.setLocationRelativeTo(null);
        panel.setResizable(false);


//        for (int i = 0; i < VisitaData.consultaPeso(3).length; i++) {
//            System.out.println(VisitaData.consultaPeso(3)[i]);
//        }
        
//        Cliente cliente = new Cliente(123, "gabi", "Gonzales", "las floridas", "154111", "marcelo", 1);
        //ClienteData.cargaCliente(cliente);
//        ClienteData.modificarCliente(cliente);
//ClienteData.eliminarCliente(1);
    }
    
}
