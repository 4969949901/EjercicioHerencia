
package ejerciciounoherenciaabsts;

//clase publica que hereda metodos o funciones de la clase figuras Geomettricas
public class FigurasPlanas extends FigurasGeometricas {
    
    public FigurasPlanas(){}//constructor vacio
    
    public FigurasPlanas(double base, double altura, int lado) {//constructor con parametros
        super.altura=altura;
        super.base=base;
        super.lado=lado;
    }

    //metodos de clase
    public int Cuadrado(){
        int lado1 = 3,lado2=3,lado3=3,lado4=3;
        
        int mult =lado1+lado2+lado3+lado4;
       
    return mult;
    }
    
    public int Triangulo(){
        int lado1 = 3,lado2=3,lado3=3;
        
        int suma =lado1+lado2+lado3;
       
    return suma;
    }
    //metodos sobreescritos de la clase figuras geometricas 
    @Override
    public double CalcularArea(double base,double altura) {
        
        return base*altura;
    }

    @Override
    public double Calcularperimetro(double lado) {
        
    
    return lado;
    }
}
