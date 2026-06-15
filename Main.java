//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    CalculadoraBinaria calculadoraBinaria = new CalculadoraBinaria();
    CalculadoraDecimal calculadoraDecimal = new AdaptadorCalculadora(calculadoraBinaria);

    int res = calculadoraDecimal.somar(10, 5);
    int res2 = calculadoraDecimal.multiplicar(10,5);
    int res3 = calculadoraDecimal.subtrair(10,5);

    System.out.println(res);
    System.out.println(res2);
    System.out.println(res3);
}
