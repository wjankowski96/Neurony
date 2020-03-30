package ProjektPerceptronow;



public class Sigmoid {

	
    public static double f(double x) 
    {
        return 1.0 / (1 + Math.pow(Math.E, -x));
    }
    
    public static double der(double x) 
    {
        return 1.0 * x * (1 - x);
        
    }
    
}