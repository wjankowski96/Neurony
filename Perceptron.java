package ProjektPerceptronow;
import java.util.Random;
import java.util.Arrays;
public class Perceptron
{
    private double[][] in; //wzorcowa tablica wejsciowa 
    private double[] out; //wzorcowa tablica wyjsciowa 
    private double lr = 10; //predkosc uczenia perceptronu 
    private double maxError = 0.001;; //maksymalny bład 
    private int maxEpochs = 10000; //maksymalna liczba epok 
    private double[] wagi; //tablica z wagami
    private double error; //błąd uczenia
    private int epochs; //liczba epok

    public Perceptron(double[][] in, double[] out) 
    {
        this.in = in;
        this.out = out;
    }
    public Perceptron(double[][] in, double[] out, double lr) 
    { 
        this.in=in;
        this.out=out; 
        this.lr=lr;
    }
    public Perceptron(double[][] in, double[] out, double lr, double maxError) 
    { 
        this.in=in;
        this.out=out; 
        this.lr=lr; 
        this.maxError=maxError;
    }
    public Perceptron(double[][] in, double[] out, double lr, double maxError, int maxEpochs) 
    {
        this.in=in; 
        this.out=out; 
        this.lr=lr; 
        this.maxError=maxError; 
        this.maxEpochs=maxEpochs;
    }
    private double[] losujWagi()
    {
        Random rand = new Random();
        double[] wgs = new double[this.out.length];
        for (int i=0; i<this.in[0].length; i++)
        {
            wgs[i] = 2*rand.nextDouble()-1;
        }
        return wgs;
    }
    public void uczenieNeuronu()
    {
        this.epochs = 0;
        this.error = 1;
        double[] y = new double[this.out.length];
        double[] zeros = new double[this.out.length];
        double[] blad = new double[this.out.length];
        double[] poprawka = new double[this.out.length];
        this.wagi = losujWagi();

        while (this.error>this.maxError && this.epochs<this.maxEpochs) 
        {
            y = zeros.clone();
            blad = zeros.clone();
            poprawka = zeros.clone();
            for(int i=0;i<this.out.length;i++) 
            {
                for(int j=0;j<this.in[0].length;j++) 
                {
                    y[i]+=this.in[i][j]*this.wagi[j];
                }
                y[i]=Sigmoid.f(y[i]); 
                blad[i]=this.out[i]-y[i]; 
                poprawka[i]=blad[i]*Sigmoid.der(y[i]); 
            }
            for (int k=0;k<this.in[0].length;k++) 
            { 
                double sum=0;
                for(int l=0;l<this.out.length;l++) 
                { 
                    sum+=this.in[l][k]*poprawka[l];
                }
                this.wagi[k]+=this.lr*sum;
            }
            this.error = 0;
            for (int m=0; m<this.out.length; m++)
            {
                this.error+=Math.pow(blad[m], 2)/this.out.length;
            }
            this.epochs++;
        }
    }
    public void printWynik()
    {
        System.out.println("Uczenie pojedynczego perceptronu do realizacji funkcji logicznej: ");
        System.out.println("Wynik neuronu | Wynik wzorcowy"); 
        double[] Yspr=new double[this.out.length];
            for(int i=0;i<this.out.length;i++) 
            {
                for(int j=0;j<this.in[0].length;j++) 
                { 
                    Yspr[i]+=this.in[i][j]*this.wagi[j];
                }
                Yspr[i]=Sigmoid.f(Yspr[i]); 
                System.out.println(Yspr[i]+" | "+this.out[i]);
            }
                System.out.println(""); //pusty wiersz na końcu
    }
    public void printWagi() {
        System.out.println(Arrays.toString(wagi));
    }
    
    public void printError() {
        System.out.println( "Blad uczenia neuronu: " + maxError);
    }
    
    public void printEpochs() {
        System.out.println( "Liczba epok uczenia: " + maxEpochs);
    }
    



    
}