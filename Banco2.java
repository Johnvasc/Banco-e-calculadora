public class Banco{
  private Conta[] contas;
  private int indice = 0;
  public Banco(){
    contas = new Conta[100];
  }
  public void cadastrar(Conta conta){
    contas[indice] = conta;
    indice++;
  }
  private Conta procurar(String numero){
    int i = 0;
    boolean achou = false;
    while((!achou) && (i < indice)){
      if (contas[i].getNumero().equals(numero)){
        achou = true;
      }
      else{
        i++;
      }
    }
    if(achou == true){
      return contas[i];
    }
    else{
      return null;
    }
  }
  public void debitar(String numero, double valor){
    Conta conta;
    conta = procurar(numero);
    if(conta != null){
      conta.debitar(valor);
    }
    else{
      System.out.println("conta inexistente!");
    }
  }
  public void creditar(String numero, double valor){
    Conta conta;
    conta = procurar(numero);
    if(conta != null){
      conta.creditar(valor);
    }
    else{
      System.out.println("conta inexistente!");
    }
  }
  public double saldo(String numero){
    Conta conta;
    conta = procurar(numero);
    if(conta != null){
      return conta.getSaldo();
    }
    else{
      System.out.println("conta inexistente!");
    }
}
  public void transferir(String origem, String destino, double valor){
    Conta conta1;
    Conta conta2;
    conta1 = procurar(origem);
    if(conta1 != null){
      conta2 = procurar(destino);
      if(conta2 != null){
        conta1.debitar(valor);
        conta2.creditar(valor);
      }
      else{
        System.out.println("conta nao encontrada");
      }
    }
    else{
      System.out.println("conta nao encontrada");
    }
  }
}
