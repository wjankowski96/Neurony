package ProjektPerceptronow;
public class perceptony
{
    public static void main(String[] args) {
        double[][] In = {{0,0,1},{0,0,1},{1,0,1},{1,1,1}};
        double[] OutAND = {0,0,0,1};
        double[] OutOR = {0,1,1,1};
        double[] OutNAND = {1,1,1,0};
        double[] OutNOR = {1,0,0,0};
        double[] OutXOR = {0,1,1,0};

        Perceptron neuronAND = new Perceptron(In,OutAND);
        Perceptron neuronOR = new Perceptron(In,OutOR,5,0.000001); 
        Perceptron neuronNAND = new Perceptron(In,OutNAND,10,0.0001,10000); 
        Perceptron neuronNOR = new Perceptron(In,OutNOR,25.0);
        Perceptron neuronXOR = new Perceptron(In,OutXOR,15,0.03,1000);

        //wywołanie metody uczenia neuronu
        neuronAND.uczenieNeuronu();
        //wywołanie metody wyświetlającej wyniki uczenia 
        neuronAND.printWynik();
        //wywołanie metody wyświetlającej wagi neuronu 
        neuronAND.printWagi();
        //wywołanie metody wyświetlającej błąd uczenia 
        neuronAND.printError();
        //wywołanie metody wyświetlającej liczbę epok uczenia 
        neuronAND.printEpochs();

        //wywołanie metody uczenia neuronu
        neuronOR.uczenieNeuronu();
        //wywołanie metody wyświetlającej wyniki uczenia 
        neuronOR.printWynik();
        //wywołanie metody wyświetlającej wagi neuronu 
        neuronOR.printWagi();
        //wywołanie metody wyświetlającej błąd uczenia 
        neuronOR.printError();
        //wywołanie metody wyświetlającej liczbę epok uczenia 
        neuronOR.printEpochs();

        //wywołanie metody uczenia neuronu
        neuronNAND.uczenieNeuronu();
        //wywołanie metody wyświetlającej wyniki uczenia 
        neuronNAND.printWynik();
        //wywołanie metody wyświetlającej wagi neuronu 
        neuronNAND.printWagi();
        //wywołanie metody wyświetlającej błąd uczenia 
        neuronNAND.printError();
        //wywołanie metody wyświetlającej liczbę epok uczenia 
        neuronNAND.printEpochs();

        //wywołanie metody uczenia neuronu
        neuronNOR.uczenieNeuronu();
        //wywołanie metody wyświetlającej wyniki uczenia 
        neuronNOR.printWynik();
        //wywołanie metody wyświetlającej wagi neuronu 
        neuronNOR.printWagi();
        //wywołanie metody wyświetlającej błąd uczenia 
        neuronNOR.printError();
        //wywołanie metody wyświetlającej liczbę epok uczenia 
        neuronNOR.printEpochs();

        //wywołanie metody uczenia neuronu
        neuronXOR.uczenieNeuronu();
        //wywołanie metody wyświetlającej wyniki uczenia 
        neuronXOR.printWynik();
        //wywołanie metody wyświetlającej wagi neuronu 
        neuronXOR.printWagi();
        //wywołanie metody wyświetlającej błąd uczenia 
        neuronXOR.printError();
        //wywołanie metody wyświetlającej liczbę epok uczenia 
        neuronXOR.printEpochs();
    }
}

