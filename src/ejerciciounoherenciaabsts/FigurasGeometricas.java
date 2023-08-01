
package ejerciciounoherenciaabsts;

//Clase padre--->abstract
public abstract class FigurasGeometricas  {
    //Declaración de atributos
     protected double base;
     public double altura;
     public int lado;
     public String nombre;
            
    
    public abstract double CalcularArea(double base,double altura);
    public abstract double Calcularperimetro(double lado);


    
    
    
}
