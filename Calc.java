import java.lang.Math;

public class Calc{
  public static double sd(double n1, double n2, char sinal){
    if(sinal == '+') return n1+n2;
    else return n1-n2;
  }
  public static double mult(double n1, double n2){ return n1*n2;}
  public static double div(double n1, double n2){
    if(n2==0){ System.out.println("impossível dividir por zero!"); return 0;}
    else return n1/n2;
  }
  public static double pote(double n1, double n2){ return Math.pow(n1, n2);}
  public static double sqrt(double n1, double n2){ return Math.pow(n1, (1/n2));}
  public static double sin(double n1){return Math.sin(n1);}
  public static double cos(double n1){return Math.cos(n1);}
  public static double tan(double n1){return Math.tan(n1);}
}
