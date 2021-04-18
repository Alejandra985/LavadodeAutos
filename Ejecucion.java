/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;
    import javax.swing.UIManager;
    import javax.swing.UnsupportedLookAndFeelException;
    import com.mycompany.lavadodeautos.Controlador;
    import com.mycompany.lavadodeautos.Modelo;
    import com.mycompany.lavadodeautos.Vista;

public class Ejecucion {
    public static void main(String arf[]) {
        
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (UnsupportedLookAndFeelException e) {
          } catch (ClassNotFoundException e) {
            } catch (InstantiationException e) {
              } catch (IllegalAccessException e) {
                }
        
        Modelo modelo = new Modelo();
        Vista vista = new Vista();
        Controlador controlador = new Controlador(modelo, vista);
        
        controlador.iniciarVista();
        
    }
    
}
