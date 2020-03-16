import java.util.Scanner;
import java.lang.String;

public class Banco{
  int contador = 0; int Nconta, ok;
  Conta ct[] = new Conta[30];
  Scanner scan = new Scanner(System.in);
  public void bancointer(){
    int escolha; String NumeroDaConta;
    do{
      System.out.println("escolha uma opção:\n1 - cadastrar\n2 - creditar\n3 - debitar\n4 - saldo\n5 - transferir\n0 - sair");
      escolha = scan.nextInt();
      if(escolha==1){
        System.out.println("Insira o numero da conta nova");
        NumeroDaConta = scan.next();
        ok = Buscador.deNumeros(NumeroDaConta, ct, contador);
        if(ok==1){
          ct[contador] = new Conta();
          ct[contador].numero = NumeroDaConta; contador++;
          System.out.println("conta adicionada com sucesso!");
        }
        else System.out.println("conta nao adicionada: ou numero ja existe, ou o numero maximo de contas foi excedido!");
      }
      else if(escolha==2){
        Nconta = Buscador.deContas(ct, contador);
        if(Nconta == -1) System.out.println("essa conta nao existe!");
        else{
          System.out.println("insira o valor a depositar");
          double valor = scan.nextDouble();
          ct[Nconta].creditar(valor);
          System.out.println("o valor foi adicionado!");
        }
      }
      else if(escolha==3){
        Nconta = Buscador.deContas(ct, contador);
        if(Nconta == -1) System.out.println("essa conta nao existe!");
        else{
          System.out.println("insira a quantia a debitar");
          double valor = scan.nextDouble();
          ct[Nconta].debitar(valor);
          System.out.println("o valor foi retirado!");
        }
        
      }
      else if(escolha==4){
        int i = Buscador.deContas(ct, contador);
        if(i==-1) System.out.println("numero de conta invalido");
        else{
          System.out.println("o saldo eh de:"+(ct[i].saldo));
        }
      }
      else if(escolha==5){
        System.out.println("1: conta que vai receber.\n2: conta que vai transferir");
        int receber = Buscador.deContas(ct, contador);
        int transf = Buscador.deContas(ct, contador);
        if(receber == transf) System.out.println("Erro: contas iguais!");
        else{
          System.out.println("insira a quantia a transferir");
          double valor = scan.nextDouble();
          transferir(receber, transf, valor, ct);
        }
      }
    }while(escolha != 0);
  }
  public void transferir(int receptor, int enviador, double valor, Conta ct[]){
    if(valor>ct[enviador].saldo) System.out.println("saldo insuficiente para transferir");
    else{
      ct[enviador].saldo -= valor;
      ct[receptor].saldo += valor;
      System.out.println("o valor foi transferido com sucesso!");
    }
  }
}
