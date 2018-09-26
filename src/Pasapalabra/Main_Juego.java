/*package Pasapalabra;
import java.io.*;

//public class Main_Juego {
    /*public static void main(String [] args)throws IOException{

        String[][] rosco1= { {"ANTONIO","2° nombre de uno de los creadores de este juego."}, // Definición de las palabras que contiene el Rosco
                        {"BARRER","Accion que se lleva a cabo con una escoba."},
                        {"COLLAR","Elemento decorativo ubicado en el cuello."},
                        {"DADO","Elemento de 6 caras que se utiliza en juegos de mesa."},
                        {"EINSTEIN","Apellido de famoso Físico/Matemático."},
                        {"FOME","Cuando tu amigo se tira un mal chiste, este es catalogado de..."},
                        {"GALLO","Animal famoso por hacer su sonido tipico muy de madrugada."},
                        {"HERTZ","Unidad con que se mide la frecuencaia"},
                        {"IGLESIA","Templo Cristiano"},
                        {"JUGOSA","Si una fruta bota mucho jugo decimos que está muy..."},
                        {"KIOSKO","Almacen pero más chico."},
                        {"LIQUIDO","Estado de la materia donde la fuerza de cohesion entre las particulas es media."},
                        {"MORIR","La unica certeza que tenemos en nuestra vida es que vamos a..."},
                        {"NORTE","Las brujulas apuntan hacia el..."},
                        {"ORNAMENTO","Adorno o motivo decorativo que sirve para embellecer una cosa."},
                        {"PADRINO","Película emblemática de mafiosos, \"El... \""},
                        {"QATAR","País ubicado en el este de la península arábiga."},
                        {"RABIA","Gran resentimiento hacia una persona a causa de una ofensa o un daño recibidos."},
                        {"SUERTE","Para ganar un loto \"Necesitas tener mucha...\""},
                        {"TURBANTE","Tira larga de tela que se enrolla en la cabeza, usualmente vista en el medio oriente."},
                        {"UNICORNIO","Animal mitológico caracterizado por tener un cuerno."},
                        {"VAGABUNDO","Persona que no tiene casa ni trabajo y va de un lugar a otro."},
                        {"WHATSAPP","Aplicación popular de mensajería instantánea."},
                        {"XUXA","Nombre de la autora de la canción \"...ilari lari larie, oh oh oh...\""},
                        {"YUXTAPONER","Poner una cosa junto a otra sin interposición de ningún nexo o elemento de relación."},
                        {"ZORRO","Famoso personaje que dejaba una \"Z\" como marca."}};
            String[][] rasca1={{"APAÑAR","Acción de acompañar a tu amigo a todas"},
                       {"BAJON","Hambre tipica que da durante un carrete como a las 4 de la mañana."},
                       {"CHUCHA","Cuando mandamos a alguien lejos, lo mandamos a la..."},
                       {"DOBLAO","Cuando alguien curaoh, decimos que anda más \"...\" que un wantan"},
                       {"ENRROLLADO","Cuando tu amigo se da mil vueltas y la piensa mucho decimos que es muy..."},
                       {"FLOJEAR","Acción de quedarse todo un día acostado sin hacer nada."},
                       {"GAUCHA","Sinonimo de pedir una favor, pedir una.."},
                       {"HACHAZO","Malestar matutino producido por el exceso de alcohol la noche anterior"},
                       {"INFLA","Cuando alguien no te pesca podriamos decir que no te..."},
                       {"JUGO","Cuando en vez de hacer algo productivo, te pones a webiar, podriamos decir que estay puro dando..."},
                       {"K",""},
                       {"LONGI","Aquel que no cacha una, \"Eri terrible de...\""},
                       {"MACABEO","Cuando a un amigo lo maneja la polola decimos que es terrible de..."},
                       {"NANAI","Cuando alguien se siente mal, se le hace un..."},
                       {"ONCE","Comida que está entre el almuerzo y la cena"},
                       {"PARACAIDISTA","Cuando alguien no estaba invitado y llega igual a la fiesta, decimos que es un..."},
                       {"QUEQUE","Palabra con doble sentido, el más decente, un postre que nos hacen las abuelitas para la once"},
                       {"R",""},
                       {"SACO","Cuando alguien es muy tonto, se dice que es un \"... de wea\""},
                       {"T","\"A palabras necias .... sordos\""},
                       {"U",""},
                       {"V",""},
                       {"WEON","En la RAE significa amigo"},
                       {"X",""},
                       {"YESO","Cuando te fracturas, te lo ponen en el hospital."},
                       {"ZAMORANO","Uno de los mejores cabeceadores en la historia del futbol chileno"}};
    
        
        Rosco J1= new Rosco(rosco1);
        
        J1.nombre();
        J1.repetición();
        J1.impresión_Puntaje();
    }
}