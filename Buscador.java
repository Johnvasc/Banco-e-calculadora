import java.util.Scanner;

public class Buscador{
  static Scanner scan2 = new Scanner(System.in);
  public static int deNumeros(String numero, Conta ct[], int elementos){
    for(int i=0; i<elementos; i++){
      if(numero.equals(ct[i].numero)) return -1;
    }
    return 1;
  }
  public static int deContas(Conta ct[], int elementos){
    System.out.println("Insira o numero da conta");
    String NumConta = scan2.next();
    for(int i=0; i<elementos; i++){
      if(NumConta.equals(ct[i].numero)) return i;
    }
    return -1;
  }
}
