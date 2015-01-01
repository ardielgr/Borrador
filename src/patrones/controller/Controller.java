package patrones.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

import patrones.model.*;
import patrones.view.*;

public class Controller {

    private Model model;
    private View view;
    private ActionListener actionListener;
    private ActionListener actionListener2;
    private ActionListener actionListener3;
    private ActionListener actionListener4;
    private ActionListener actionListener5;
    
    
    
    private Directory directory;
    public GestionFichero abrirfichero;
    
    ICodificacion codificar;
    
    public ArrayList<String> Lista = new ArrayList();
    public ArrayList<String> Lista2 = new ArrayList();
    public String ListaOpciones = "";
    
    public Controller(GestionFichero gesFich, View view){
        this.abrirfichero = gesFich;
        this.view = view;
                          
    }
    
    public void contol(){        
        actionListener = new ActionListener() {
              public void actionPerformed(ActionEvent actionEvent) {                  
         		

            	  try {
    					
            			
        				//abrirfichero = new GestionFichero();
        				//abrirfichero.abrirFichero(Lista2);
            			
            			if (ListaOpciones == "Random Change"){
            				codificar = new RawChange();
            			}
            			ArrayList<String> zzz = abrirfichero.abrirFichero( Lista2 );
                  	  for (int i = 0 ; i < 7; i++){
                  		  

            			ArrayList<String> temp = codificar.codificarArrayList(zzz  );
            			
            			abrirfichero.escribirFichero( temp );
                  	  }
                  	   abrirfichero.eliminarFichero();
            		//	codificar.modificarFichero(abrirfichero.OpenFile());
    					
    				} catch (IOException e) {
    					// TODO Auto-generated catch block
    					e.printStackTrace();
    				}
              }
        };
    
        actionListener2 = new ActionListener(){
        	public void actionPerformed(ActionEvent actionEvent) {
        		Lista2 = calldirectory();
 
        		
        	}
        };
        
        actionListener3 = new ActionListener(){
        	public void actionPerformed(ActionEvent actionEvent) {
        		System.out.println("Imprime " +actionEvent.getActionCommand());
        		ListaOpciones = actionEvent.getActionCommand();
        	}
        	
        };
   
        
        view.getButton().addActionListener(actionListener); 
        view.getButton2().addActionListener(actionListener2);
        view.getCB().addActionListener(actionListener3);
        view.getCB2().addActionListener(actionListener3);
        view.getCB3().addActionListener(actionListener3);
    }


	private ArrayList<String> calldirectory() {
		// TODO Auto-generated method stub
		directory = new Directory();
		Lista = directory.geteleccion();
		return Lista;
	}


}