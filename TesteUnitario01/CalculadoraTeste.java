class CalculadoraTeste{

  static Calculadora calc = new Calculadora();
  public static void assertiva(double n1, double n2) {
    if(n1 == n2) {
      System.out.println("O teste passou!");
    } else {
      System.out.println("O teste falhou!");
    }
  }

  public static void testSomarCT01(){
    Calculadora calc = new Calculadora();
    double x = 10, y = 5, resultadoAtual;
    
    resultadoAtual = calc.somar(x, y);

    System.out.print("Teste somar CT01: ");
    assertiva(resultadoAtual, 15);
  }

  public static void testSomarCT02(){
    
    Calculadora calc = new Calculadora();
    double x = -10, y = -5, resultadoAtual;

    resultadoAtual = calc.somar(x, y);
    
    System.out.print("Teste somar CT02: ");
    assertiva(resultadoAtual, -15.0);
  }

   public static void testSomarCT03(){
    
    Calculadora calc = new Calculadora();
    double x = 10, y = 0, resultadoAtual;

    resultadoAtual = calc.somar(x, y);
    
    System.out.print("Teste somar CT03: ");
    assertiva(resultadoAtual, 10);
  }

  public static void testSomarCT04(){
    
    Calculadora calc = new Calculadora();
    double x = -10, y = 0, resultadoAtual;

    resultadoAtual = calc.somar(x, y);
    
    System.out.print("Teste somar CT04: ");
    assertiva(resultadoAtual, -10);
  }

   public static void testSomarCT05(){
    
    Calculadora calc = new Calculadora();
    double x = 10.5, y = 5.25, resultadoAtual;

    resultadoAtual = calc.somar(x, y);
    
    System.out.print("Teste somar CT05: ");
    assertiva(resultadoAtual, 15.75);
  }

   public static void testSomarCT06(){
    
    Calculadora calc = new Calculadora();
    double x = -10.5, y = -5.25, resultadoAtual;

    resultadoAtual = calc.somar(x, y);
    
    System.out.print("Teste somar CT06: ");
    assertiva(resultadoAtual, -15.75);
  }

     public static void testSomarCT07(){
    
    Calculadora calc = new Calculadora();
    double x = 10.5, y = 0, resultadoAtual;

    resultadoAtual = calc.somar(x, y);
    
    System.out.print("Teste somar CT07: ");
    assertiva(resultadoAtual, 10.5);
  }

    public static void testSomarCT08(){
    
    Calculadora calc = new Calculadora();
    double x = -10.5, y = 0, resultadoAtual;

    resultadoAtual = calc.somar(x, y);
    
    System.out.print("Teste somar CT08: ");
    assertiva(resultadoAtual, -10.5);
  }

  public static void testSubtracaoCT01(){
    
    Calculadora calc = new Calculadora();
    double x = 1, y = 2, resultadoAtual;

    resultadoAtual = calc.subtracao(x, y);
    
    System.out.print("Teste subtracao CT01: ");
    assertiva(resultadoAtual, -1);
  }

  public static void testSubtracaoCT02(){
    
    Calculadora calc = new Calculadora();
    double x = -1, y = -2, resultadoAtual;

    resultadoAtual = calc.subtracao(x, y);
    
    System.out.print("Teste subtracao CT02: ");
    assertiva(resultadoAtual, 1);
  }

  public static void testSubtracaoCT03(){
    
    Calculadora calc = new Calculadora();
    double x = 1, y = 0, resultadoAtual;

    resultadoAtual = calc.subtracao(x, y);
    
    System.out.print("Teste subtracao CT03: ");
    assertiva(resultadoAtual, 1);
  }

  public static void testSubtracaoCT04(){
    
    Calculadora calc = new Calculadora();
    double x = -10, y = 0, resultadoAtual;

    resultadoAtual = calc.subtracao(x, y);
    
    System.out.print("Teste subtracao CT04: ");
    assertiva(resultadoAtual, -10);
  }

  public static void testSubtracaoCT05(){
    
    Calculadora calc = new Calculadora();
    double x = 1.6, y = 1.4, resultadoAtual;

    resultadoAtual = calc.subtracao(x, y);
    
    System.out.print("Teste subtracao CT05: ");
    assertiva(resultadoAtual, 0.2);
  }

  public static void testSubtracaoCT06(){
    
    Calculadora calc = new Calculadora();
    double x = -1.6, y = -1.4, resultadoAtual;

    resultadoAtual = calc.subtracao(x, y);
    
    System.out.print("Teste subtracao CT06: ");
    assertiva(resultadoAtual, -0.2);
  }

  public static void testSubtracaoCT07(){
    
    Calculadora calc = new Calculadora();
    double x = 1.6, y = 0, resultadoAtual;

    resultadoAtual = calc.subtracao(x, y);
    
    System.out.print("Teste subtracao CT07: ");
    assertiva(resultadoAtual, 1.6);
  }

  public static void testSubtracaoCT08(){
    
    Calculadora calc = new Calculadora();
    double x = -1.6, y = 0, resultadoAtual;

    resultadoAtual = calc.subtracao(x, y);
    
    System.out.print("Teste subtracao CT08: ");
    assertiva(resultadoAtual, -1.6);
  }

}