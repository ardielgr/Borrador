package patrones.view;

import javax.swing.*;
import java.awt.BorderLayout;

public class View {
      
    private JFrame frame;
    private JLabel label;
    private JButton button;
    private JButton button2;
    private JCheckBox check;
    private JCheckBox check2;
    private JCheckBox check3;
    private JPanel Pane;

    
    public View(String text){
        frame = new JFrame("CodEraser");                                    
        frame.getContentPane().setLayout(new BorderLayout());                                          
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);           
        frame.setSize(200,200);        
        frame.setVisible(true);
        Pane = new JPanel();
        
//        label = new JLabel(text);
//        frame.getContentPane().add(label, BorderLayout.CENTER);
        check = new JCheckBox("Random Change");
       // frame.add(check);
        Pane.add(check, BorderLayout.CENTER);
       // frame.getContentPane().add(check,BorderLayout.CENTER);
        
        check2 = new JCheckBox(" Change");
        Pane.add(check2);
//        frame.getContentPane().add(check,BorderLayout.NORTH);
        
        check3 = new JCheckBox("nge");
        Pane.add(check3);
//        frame.getContentPane().add(check,BorderLayout.CENTER);
        frame.add(Pane);
        
        button2 = new JButton("Abrir Archivo");        
        frame.getContentPane().add(button2, BorderLayout.WEST); 
        
        button = new JButton("Ejecutar");
        frame.getContentPane().add(button, BorderLayout.EAST);
    }
        
    public JButton getButton(){
        return button;
    }
    
    public JButton getButton2(){
    	return button2;
    }
    
    public JCheckBox getCB(){
    	return check;
    }
    
    public JCheckBox getCB2(){
    	return check2;
    }
    
    public JCheckBox getCB3(){
    	return check3;
    }
    
    
    public void setText(String text){
        label.setText(text);
    }
    
    
}