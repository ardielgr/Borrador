package patrones.Principal;

import javax.swing.SwingUtilities;

import patrones.model.*;
import patrones.view.*;
import patrones.controller.*;

public class Main
{
    public static void main(String[] args) {           
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {                                           
               // Model model = new Model(0);
                GestionFichero gesFich = new GestionFichero();
                View view = new View("-"); 
                Controller controller = new Controller(gesFich,view);
                controller.contol();

            }
        });  
    }
}