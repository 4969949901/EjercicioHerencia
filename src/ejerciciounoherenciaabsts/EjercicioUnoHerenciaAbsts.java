
package ejerciciounoherenciaabsts;
//clasificacion figuras geometricas: planas,volumetricas.
public class EjercicioUnoHerenciaAbsts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ejercicio de Herencia por clasificacion: Figuras geometricas clasificación-->figuras planas y figuras volumetricas.
        FigurasPlanas objeto =new FigurasPlanas();
     
        
        
        System.out.println("La suma de todos los lados del cuadrado es: \n");
        System.out.println(objeto.Cuadrado());
         System.out.println("La suma de todos los lados del triangulo es: \n");
        System.out.println(objeto.Triangulo());
         System.out.println("El calculo del area de la figura  plana es: \n");
        System.out.println(objeto.CalcularArea(5, 7));
    }
    
}
