
package palindromo;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Palindromo extends JFrame implements ActionListener {

    private JButton botonV;
    private JTextField caja;
    private JLabel texto1;
    private JLabel texto2;
    private JLabel texto3;
    private JLabel texto4;
    private JLabel confirmacion;
    private JLabel longitud;
    private JLabel inversa;
    private JLabel repetidas;
    
    
      public Palindromo(){
        super();
        configurarVentana();
        crearComponentes();
            //setIconImage(new ImageIcon(getClass().getResource("/calculadora/Calculator_30001.PNG")).getImage());
    }
    
     private void  configurarVentana(){
        this.setTitle("Palindromo");
        this.setSize(300, 400);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setResizable(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
     
     private void crearComponentes(){
     
        caja = new JTextField();
        caja.setBounds(100, 10, 100, 30);
        this.add(caja);
        
        botonV = new JButton();
        botonV.setText("Verificar");
        botonV.setBounds(120, 100, 100, 20);
        botonV.addActionListener(this);
        this.add(botonV);
        
        texto1 = new JLabel();
        texto1.setText("Longitud:");
        texto1.setBounds(50, 200, 100, 30);
        this.add(texto1);
        
        longitud = new JLabel();
        longitud.setBounds(120, 200, 100, 30);
        this.add(longitud);
        
        texto2 = new JLabel();
        texto2.setText("Palindromo:");
        texto2.setBounds(40, 150, 100, 30);
        this.add(texto2);
        
        confirmacion = new JLabel();
        confirmacion.setBounds(120, 150, 100, 30);
        this.add(confirmacion);
        
        texto3 = new JLabel();
        texto3.setText("inversa:");
        texto3.setBounds(40, 250, 100, 30);
        this.add(texto3);
        
        inversa = new JLabel();
        inversa.setBounds(120, 250, 100, 30);
        this.add(inversa);
        
        texto4 = new JLabel();
        texto4.setText("Repetidas:");
        texto4.setBounds(40, 300, 100, 30);
        this.add(texto4);
        
        repetidas = new JLabel();
        repetidas.setBounds(120, 300, 100, 30);
        this.add(repetidas);
        
        }
     
     public void actionPerformed(ActionEvent e){
         String palabra = caja.getText();
         String cantidad;
         String pinversa = "";
         char[] letras;
         char[] Linversa = null;
         letras = palabra.toCharArray();
         
         int cont=0;
        
         if(e.getSource()== botonV){
             cantidad = String.valueOf(palabra.length());
             longitud.setText(cantidad);
         for(int i = palabra.length()-1; i>=0; i--){
             pinversa += Character.toString(palabra.charAt(i));
         }
            Linversa = pinversa.toCharArray();
            inversa.setText(pinversa);
             
          if(palabra.equals(pinversa)){
                confirmacion.setText("Si");
            }else{
              confirmacion.setText("No");
          }  
     
         }
         for(int i=0; i<palabra.length(); i++){
              if(letras[i] == Linversa[i]){
                  System.out.println("letras"+letras[i]);
                  System.out.println("lista inversa"+Linversa[i]);
                  cont++;
                }
          }
          String nrepetidas;
          nrepetidas = String.valueOf(cont);
          repetidas.setText(nrepetidas);
    }
     
    public static void main(String[] args) {
         Palindromo ventana = new Palindromo();
        ventana.setVisible(true);
    }

 
    
    
}
