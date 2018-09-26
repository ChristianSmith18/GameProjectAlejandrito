package Pasapalabra;

import static Pasapalabra.Ventana_Jframe.n;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.*;

public class Juego_Jframe extends JFrame {
    public JPanel juego;
    public JButton b2,b3;
    public ImageIcon mu;
    
    public void Juego_Jframe() throws IOException, LineUnavailableException, UnsupportedAudioFileException{
        
        setTitle("\t\tJUEGO");//Se establece el titulo
        setSize(500,500);// Se establecen las dimensiones 
        setLocationRelativeTo(null); // Se centra la ventana
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        
        iniciar_Componentes();
    }
    private void iniciar_Componentes() throws IOException, LineUnavailableException, UnsupportedAudioFileException{
        
        colocar_Paneles();
        colocar_Botones();
    }
    private void colocar_Paneles() throws IOException{
        juego=new JPanel(); // Creación del panel
        
        juego.setBackground(Color.decode("#043BBA")); //de esta forma se le añade color al panel 
        juego.setLayout(null); //Dar permiso para poder mover la etiqueta sobre el panel
        this.getContentPane().add(juego); // Se añade el panel a la ventana
    }
    private void colocar_Botones(){
        JButton b2= new JButton();
        b2.setBounds(10, 610, 40, 40);
        b2.setMnemonic('s');
        mu= new ImageIcon("musica.png");
        b2.setIcon(new ImageIcon(mu.getImage().getScaledInstance(b2.getWidth(),b2.getHeight(),Image.SCALE_SMOOTH)));
        b2.setBackground(Color.decode("#1976D2"));
        b2.addActionListener((ActionEvent ae) -> {
            n++;/*
            if (n%3 == 0) {
                son.loop(Clip.LOOP_CONTINUOUSLY);
                b2.setBounds(10, 610, 40, 40);
                b2.setMnemonic('s');
                mu= new ImageIcon("musica.png");
                b2.setIcon(new ImageIcon(mu.getImage().getScaledInstance(b2.getWidth(),b2.getHeight(),Image.SCALE_SMOOTH)));
                b2.setBackground(Color.decode("#1976D2"));
                son2.stop();
            } 
            else if (n%3 == 1){
                son.stop();
                b2.setBounds(10, 610, 40, 40);
                b2.setMnemonic('s');
                mu= new ImageIcon("musica2.png");
                b2.setIcon(new ImageIcon(mu.getImage().getScaledInstance(b2.getWidth(),b2.getHeight(),Image.SCALE_SMOOTH)));
                b2.setBackground(Color.decode("#1976D2"));
                son2.loop(Clip.LOOP_CONTINUOUSLY);;
            }
            else if (n%3 == 2){
                son2.stop();
                b2.setBounds(10, 610, 40, 40);
                b2.setMnemonic('s');
                mu= new ImageIcon("mute.png");
                b2.setIcon(new ImageIcon(mu.getImage().getScaledInstance(b2.getWidth(),b2.getHeight(),Image.SCALE_SMOOTH)));
                b2.setBackground(Color.decode("#1976D2"));
            }*/
        }
        juego.add(b2);
        JButton b3= new JButton();
        b3.setBounds(640, 10, 40, 40);
        b3.setMnemonic('i');
        ImageIcon ins= new ImageIcon("Instrucciones.png");                
        b3.setIcon(new ImageIcon(ins.getImage().getScaledInstance(b3.getWidth(), b3.getHeight(), Image.SCALE_SMOOTH)));
        b3.setBackground(Color.decode("#1976D2"));
        b3.addActionListener((ActionEvent ae) -> {
            son.stop();
            son2.stop();
            son3.loop(Clip.LOOP_CONTINUOUSLY);
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
            /*son3.stop();
            if (n%3 == 0) {
                son.loop(Clip.LOOP_CONTINUOUSLY);
                son2.stop();
            } 
            else if (n%3 == 1){
                son.stop();
                son2.loop(Clip.LOOP_CONTINUOUSLY);;
            }
            else if (n%3 == 2){
                son2.stop();
            } */ 
        }
        juego.add(b3);
    }
    /*public void musica() throws LineUnavailableException, UnsupportedAudioFileException, IOException{
        son.open(AudioSystem.getAudioInputStream(new File("musica_pasala2.wav")));
        son2.open(AudioSystem.getAudioInputStream(new File("titanic2.wav")));
        son3.open(AudioSystem.getAudioInputStream(new File("amorfoda2.wav")));
        son.loop(Clip.LOOP_CONTINUOUSLY);*/
    }
    
}
