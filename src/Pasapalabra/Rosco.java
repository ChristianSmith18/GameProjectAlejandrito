package Pasapalabra;
    
import java.io.*;
public class Rosco  {
    /**
     * Este juego es conocido como la fase final del famoso programa "Pasapalabra".
     * Tiene una metodología similar y tiene una restricción de que solo puede decir "Pasapalabra" 2 veces.
     */

    // Atributos
    public static String[] letras= {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N","O", "P", "Q", "R", "S", "T", "U", "V", "W", "X","Y","Z","!"};
       /* "static" permite que cualquier cambio que se le haga al arreglo con el programa en proceso, se mantenga en todo lo que queda de proceso*/
    public String[][] palabras= new String [26][2];// "final" debido a que esta matriz no se modificará dentro del programa
    public String letra_Actual,estado_Letra;//definición de estados, tanto del programa; como     
    public String i_Palabra,request, nickName,paso="PASO";
    public static int puntaje;// puntaje;Sumará o restará puntaje dependiendo del n° de vueltas
    public int vueltas,c;//vueltas;Será un contador que irá aumentadndo de 1 en 1, hasta completar las 3 vueltas */
    public static boolean validador_Vueltas=true;// Este validador nos servirá para saber cuando debe terminar el juego
    public int tiempo;
    
    //Métodos
    
    //Método Constructor; Este método lo usaremos para asignarle valor al atributo "palabras"
    public Rosco(String[][] i){
        palabras= i; 
    }
    //Método nombre; Este metodo se encargará de pedirle el nombre al usuario
    public void nombre()throws IOException{
        BufferedReader entrada=new BufferedReader (new InputStreamReader(System.in));
        System.out.print("Ingrese su nombre de usuario: ");
        nickName=entrada.readLine();
    }
    //Método identificar_Palabra; Este metodo retorna la primera letra de cada palabra del arreglo.
    public String identificar_Palabra(int h){
        char z = 0;
        String x;
        x= palabras[h][0];
        z=x.charAt(0);
        String y = Character.toString(z); 
        return y;
    }
    //Método respuesta; Este método recibirá la respuesta del usuario y se la asignara a la variable request
    public void respuesta() throws IOException{
            String r;
            BufferedReader entrada=new BufferedReader (new InputStreamReader(System.in));
            request=(entrada.readLine()).toUpperCase();
    }
    //Método comparación; Este método será quien como parámetro reciba una respuesta, la compare y asigne un pje si corresponde
    public void comparador(int i){
        if (request.compareTo(palabras[i][0]) == 0) {
            System.out.println("\n \t   Correcto!\n");
            Rosco.letras[i]="1";
            Rosco.puntaje= Rosco.puntaje + 24/vueltas;
        } else if (request.compareTo(paso) == 0) {
            System.out.println("\n \t   PASAPALABRA\n");
        } else {
            System.out.println("\n \t   Incorrecto!\n");
            Rosco.letras[i]="0";              			
        }
    }
    //Método repetición; Este método, será el principal y hará que el juego pueda repetirse hasta 3 veces
    public void repetición() throws IOException{
        for (int d=1;d<4;d++){
            System.out.println("\n\tVuelta n° "+d+"\n");
            vueltas=d;
            if (validador_Vueltas==true){
                for (int i=0;i<26;i++){
                    if (letras[i]=="1" || letras[i]=="0"){
                        c++;
                    if (c==26) validador_Vueltas=false;
                    }
                }
            }
            recorrido();
        }
    }
    //Método recorrido
    public void recorrido()throws IOException {
        for (int i=20; i<26;i++){
                    letra_Actual=Rosco.letras[i];
                    i_Palabra= identificar_Palabra(i);
                    if (letra_Actual.compareTo(i_Palabra)==0){
                        System.out.println("    Comienza con "+letra_Actual);
                        System.out.println(palabras[i][1]);
                        respuesta();
                        comparador(i);
                }           
            }  
    }
    //Método impresión_Puntaje; Este método se encargará de mostrar el puntaje obtenido
    public void impresión_Puntaje(){
        System.out.println("\t"+nickName +" tu puntaje es: "+Rosco.puntaje+"\n");
        System.out.println("\n\tGRACIAS POR JUGAR AL ROSCO");
        for (int i=0; i<26;i++){
            System.out.println(Rosco.letras[i]);
        }
    }
    
    //Timer
    public void clock()throws IOException{
        tiempo=0;
        for (int i=1; i<16;i++){
            System.out.print(i+",");
            delay_Segundo();
            tiempo=i;
        }
    }
    //delay_Segund0;le dara al cronometro el segundo de delay que necesitamos
    private static void delay_Segundo(){
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){Thread.currentThread().interrupt();}
    }
}