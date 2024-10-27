package hn.proyprimerparcial.areasfg_junit_app;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }


	
	@SuppressWarnings("null")
	public double arecta(double base, double altura) {
		double area;
		
		if(base <= 0 || altura <= 0) {
			//System.out.print("No se permiten lados menor a cero");
			area=0.00;
		}		else {
			return base*altura;
		}
		return area;
	}


	public double atri(double base, double altura) {
		double area;
		if(base <= 0 || altura <= 0) {
			
			area=0.00;
		}		else {
			return (base*altura)/2;
		}
		return area;
		
	}


	public double acircu(double pi, double radio) {
		// TODO Auto-generated method stub
		
		double area;
		if(radio <= 0 ) {
			
			area=0.00;
		}		else {
			return pi*radio*radio;
		}
		return area;
	}



	public double acuadra(double lado) {
		// TODO Auto-generated method stub
	
			return lado*lado;
		
		
		
	}
	
	
}
