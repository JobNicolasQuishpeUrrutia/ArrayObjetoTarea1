/*
    Array de Objetos
 */
package arrayobjetotarea1;

/**
 * @author Quishpe Urrutia Job Nicolas
 */
class Emision_Motor{
    public String especificacion;
    String unidades;
    public int valor;
    Emision_Motor(String especificacion,String unidades, int valor){
        this.especificacion=especificacion;
        this.unidades=unidades;
        this.valor=valor;
    }  
}
public class ArrayObjetoTarea1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("                                UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE");
        System.out.println("                                            Sede Latacunga\n");
        System.out.println("Alumno: Quishpe Urrutia Job Nicolas");
        System.out.println("Docente: Ing. Luis Alberto Guerra Cruz");
        System.out.println("Asignatura: Programación");
        System.out.println("NRC:7450");
        System.out.println("Tema: Array de Objetos \n");
        
        Emision_Motor [] arreglo;
        arreglo = new Emision_Motor[10];
        
        System.out.println("Especificaciones del Motor de Combustión Interna (MCI)y sus valores: \n");
        
        arreglo[0]=new Emision_Motor("Modelo","Z16SE", 2005);       // Modelo del motor
        arreglo[1]=new Emision_Motor("Potencia","Hp:", 100);        // Potencia máxima del motor
        arreglo[2]=new Emision_Motor("Cilindrada","cc:", 1597);     // Cilindrada del motor
        arreglo[3]=new Emision_Motor("Carrera","mm:", 81);          // Carrera del pistón
        arreglo[4]=new Emision_Motor("Relación de compresion","--", 9/1); // Relación de compresión
        arreglo[5]=new Emision_Motor("Torque","Nm:", 138);           // Torque máximo motor
        arreglo[6]=new Emision_Motor("Revoluciones máximas","rpm:",5600); //rpm máximas
        arreglo[7]=new Emision_Motor("Hidrocarburos","HC %:",40);             // Emisiones contaminantes
        arreglo[8]=new Emision_Motor("Monóxido de Carbono","CO %:",21);     // del motor
        arreglo[9]=new Emision_Motor("Óxidos de Nitrógeno","NOx %:",32);
        
        for(int i=0;i<arreglo.length;i++)
            System.out.println("Especificaciones técnicas del motor en "+i+" son: "+
                    arreglo[i].especificacion+" ->> "+arreglo[i].unidades+" "+arreglo[i].valor);
    }  
}