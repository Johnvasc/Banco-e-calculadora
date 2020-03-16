import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int opcao1;
    System.out.println("1 - Calculadora\n2 - Banco");
    opcao1 = scanner.nextInt();
    if(opcao1 == 1){
      Calculadora c1 = new Calculadora();
      c1.calc();
    }
    else if(opcao1 == 2){
      Banco b1 = new Banco();
      b1.bancointer();
    }
    else if(opcao1 == 3){
      System.out.println("Escolha a opção desejada:\n 1) Testa Claculadora\n 2) Testa Conta \n 3) Testa Banco");
      int opcao = scanner.nextInt();
      switch(opcao) {
        case 1: testaCalculadora();
                break;
                
        case 2: testaConta();
              break;
              
        case 3: testaBanco();
              break;
              
        default: System.out.println("Opção inexistente!");
              break;
      }
    }
    
  }
  public static void testaCalculadora() {
    System.out.println("Teste de soma e diminuicao");
    
  }

  public static void testaConta() {
    //escreva o código de teste aqui
  }
  
  public static void testaBanco() {
    
  }
}
