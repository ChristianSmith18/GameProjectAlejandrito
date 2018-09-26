/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pasapalabra;

import java.io.IOException;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;


public class Main_Ventana {
    public static void main (String [] args) throws IOException, LineUnavailableException, UnsupportedAudioFileException{
        Ventana_Jframe v1= new Ventana_Jframe();
    
        v1.setVisible(true); //Se hace visible la ventana
        v1.musica();
    }
}
