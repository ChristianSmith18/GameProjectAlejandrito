package Pasapalabra;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.*;

public class Ventana_Jframe extends JFrame{
    public JPanel panel,juego;
    public JButton b1,b2,b3;
    public ImageIcon mu;
    public static String username;
    public static int n=0;
    Clip sonido= AudioSystem.getClip();    
    Clip sonido2= AudioSystem.getClip();
    Clip sonido3= AudioSystem.getClip();
    
    
    public Ventana_Jframe() throws IOException, LineUnavailableException, UnsupportedAudioFileException{
        
        setTitle("\tPASAPALABRA");//Se establece el titulo
        setSize(700,700);// Se establecen las dimensiones 
        setLocationRelativeTo(null); // Se centra la ventana
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        
        iniciar_Componentes();
        
    }
    private void iniciar_Componentes() throws IOException, LineUnavailableException, UnsupportedAudioFileException{
        username=JOptionPane.showInputDialog(null, "Ingrese su nombre de usuario:", "Jugador");
        if (username.compareTo("") == 0) {
            username= "Jugador";
        }
        colocar_Paneles();
        colocar_Etiquetas();
        colocar_Botones();
    }
    private void colocar_Paneles() throws IOException{
        panel=new JPanel(); // Creación del panel
        
        panel.setBackground(Color.decode("#043BBA")); //de esta forma se le añade color al panel 
        panel.setLayout(null); //Dar permiso para poder mover la etiqueta sobre el panel
        this.getContentPane().add(panel); // Se añade el panel a la ventana  
        
        
        juego=new JPanel();
    }
    private void colocar_Etiquetas(){
        JLabel etiqueta= new JLabel(); // Se crea una etiqueta
        
        etiqueta.setText("PASAPALABRA");//Establecer que "dirá" la etiqueta
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
        etiqueta.setBounds(150, 30, 400, 100); //Establecer donde queremos que se inicie la etiqueta y las medidas que queresmo que tenga
     
        etiqueta.setForeground(Color.decode("#ECF0F1"));//Cambiar el color a las letras de la etiqueta
        //etiqueta.setOpaque(true);// Permitir cambiar el fondo de la etiqueta
        //etiqueta.setBackground(Color.white);//Determinar el color del fondo de la etiqueta
        etiqueta.setFont(new Font("Impact",Font.CENTER_BASELINE,50));//Establecer la fuente del texto
        panel.add(etiqueta);// se le agrega la etiqueta al panel
        
        
        ImageIcon foto=new ImageIcon("linux.png");
        JLabel imagen= new JLabel();
        imagen.setBounds(155, 210, 390, 390);
        imagen.setIcon(new ImageIcon(foto.getImage().getScaledInstance(imagen.getWidth(),imagen.getHeight() , Image.SCALE_SMOOTH)));
        panel.add(imagen);
        
        ImageIcon nib=new ImageIcon("nibaldo.png");
        JLabel nb= new JLabel();
        nb.setBounds(300, 105, 85, 85);
        nb.setIcon(new ImageIcon(nib.getImage().getScaledInstance(nb.getWidth(),nb.getHeight() , Image.SCALE_SMOOTH)));
        panel.add(nb);
        
        
        JLabel nombre= new JLabel("Bienvenido "+username+"!");
        nombre.setHorizontalAlignment(SwingConstants.CENTER);
        nombre.setBounds(150, 590, 400, 100);
        nombre.setForeground(Color.decode("#ECF0F1"));
        nombre.setFont(new Font("MyriadSetPro-Semibold", 1 , 25));
        panel.add(nombre);
        
    }
    private void colocar_Botones(){
        JButton b1= new JButton();
        b1.setText("Jugar");
        b1.setBounds(580,610,100,40);
        b1.setMnemonic('A');//Habilitar boton del teclado+alt para hacer funcionar un boton
        b1.setForeground(Color.WHITE);
        b1.setFont(new Font("bauhauss 93",Font.BOLD,20));//Se establece la fuente de la letra del boton
        b1.setEnabled(true);//Habilitar o deshabilitar el boton
        b1.setBackground(Color.decode("#1976D2"));
        b1.addActionListener((ActionEvent ae) -> {
            JOptionPane.showMessageDialog(null,"EL juego todavía no está listo, espera un momento");
            dispose();
            Juego_Jframe v= new Juego_Jframe();    
            v.setVisible(true);
            try {
                v.Juego_Jframe();
                sonido.stop();
                sonido2.stop();
                sonido3.stop();
            } catch (IOException ex) {
                Logger.getLogger(Ventana_Jframe.class.getName()).log(Level.SEVERE, null, ex);
            } catch (LineUnavailableException ex) {
                Logger.getLogger(Ventana_Jframe.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnsupportedAudioFileException ex) {
                Logger.getLogger(Ventana_Jframe.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        panel.add(b1);
        
        JButton b2= new JButton();
        b2.setBounds(10, 610, 40, 40);
        b2.setMnemonic('s');
        mu= new ImageIcon("musica.png");
        b2.setIcon(new ImageIcon(mu.getImage().getScaledInstance(b2.getWidth(),b2.getHeight(),Image.SCALE_SMOOTH)));
        b2.setBackground(Color.decode("#1976D2"));
        b2.addActionListener((ActionEvent ae) -> {
            n++;
            if (n%3 == 0) {
                sonido.loop(Clip.LOOP_CONTINUOUSLY);
                b2.setBounds(10, 610, 40, 40);
                b2.setMnemonic('s');
                mu= new ImageIcon("musica.png");
                b2.setIcon(new ImageIcon(mu.getImage().getScaledInstance(b2.getWidth(),b2.getHeight(),Image.SCALE_SMOOTH)));
                b2.setBackground(Color.decode("#1976D2"));
                sonido2.stop();
            } 
            else if (n%3 == 1){
                sonido.stop();
                b2.setBounds(10, 610, 40, 40);
                b2.setMnemonic('s');
                mu= new ImageIcon("musica2.png");
                b2.setIcon(new ImageIcon(mu.getImage().getScaledInstance(b2.getWidth(),b2.getHeight(),Image.SCALE_SMOOTH)));
                b2.setBackground(Color.decode("#1976D2"));
                sonido2.loop(Clip.LOOP_CONTINUOUSLY);;
            }
            else if (n%3 == 2){
                sonido2.stop();
                b2.setBounds(10, 610, 40, 40);
                b2.setMnemonic('s');
                mu= new ImageIcon("mute.png");
                b2.setIcon(new ImageIcon(mu.getImage().getScaledInstance(b2.getWidth(),b2.getHeight(),Image.SCALE_SMOOTH)));
                b2.setBackground(Color.decode("#1976D2"));
            }
        }
        panel.add(b2);
        
        JButton b3= new JButton();
        b3.setBounds(640, 10, 40, 40);
        b3.setMnemonic('i');
        ImageIcon ins= new ImageIcon("Instrucciones.png");                
        b3.setIcon(new ImageIcon(ins.getImage().getScaledInstance(b3.getWidth(), b3.getHeight(), Image.SCALE_SMOOTH)));
        b3.setBackground(Color.decode("#1976D2"));
        b3.addActionListener((ActionEvent ae) -> {
            sonido.stop();
            sonido2.stop();
            sonido3.loop(Clip.LOOP_CONTINUOUSLY);
            JOptionPane.showMessageDialog(null,"El juego consiste en acertar las  veinticinco palabras,\n" +
"cada una de las cuales se corresponde con una letra del\n" +
"rosco para la que se ofrece una definición relativa a un\n" +
"concepto Físico.  Los  aciertos  se  reflejarán  en  las \n" +
"letras mediante el color verde,  mientras que los fallos \n" +
"se mostrarán en color rojo. Las cuestiones no respondidas\n" +
"o \"pasapalabra\" se mostrarán en color amarillo.\n" +
"\n" +
"Para completar el rosco se dispone de un tiempo x.\n" +
"\n" +
"El juego permite dos modalidades: La tipo 1, en la que al \n" +
"seleccionar cada una de las letras del rosco se presenta\n" +
"la definición y se deberá escoger la respuesta entre las\n" +
"cuatro diferentes posibilidades que se ofrecen para cada\n" +
"letra en el menú desplegable. La tipo 2, en la cual las \n" +
"preguntas deberán ser leidas en voz alta por un presentador,\n" +
"que deberá marcar en el menú si las respuestas son correctas,\n" +
"incorrectas o \"pasapalabra\". En el siguiente enlace se ofrece\n" +
"un fichero de excel con una relación de roscos para hacerlos \n" +
"con la modalidad tipo 2.", "Intrucciones del Juego", 1);
            sonido3.stop();
            if (n%3 == 0) {
                sonido.loop(Clip.LOOP_CONTINUOUSLY);
                sonido2.stop();
            } 
            else if (n%3 == 1){
                sonido.stop();
                sonido2.loop(Clip.LOOP_CONTINUOUSLY);;
            }
            else if (n%3 == 2){
                sonido2.stop();
            }  
        }
        panel.add(b3);
    }
    public void musica() throws LineUnavailableException, UnsupportedAudioFileException, IOException{
        sonido.open(AudioSystem.getAudioInputStream(new File("musica_pasala2.wav")));
        sonido2.open(AudioSystem.getAudioInputStream(new File("titanic2.wav")));
        sonido3.open(AudioSystem.getAudioInputStream(new File("amorfoda2.wav")));
        sonido.loop(Clip.LOOP_CONTINUOUSLY);
    }
    }