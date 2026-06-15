public class AdaptadorCalculadora implements CalculadoraDecimal{
    private CalculadoraBinaria calculadora;

    public AdaptadorCalculadora(CalculadoraBinaria calculadora){
        setCalculadora(calculadora);
    }

    public int somar(int a, int b){
        String A = Integer.toBinaryString(a);
        String B = Integer.toBinaryString(b);
        String resultado = calculadora.somar(A, B);

        return Integer.parseInt(resultado, 2);
    }
    public int subtrair(int a, int b){
        String A = Integer.toBinaryString(a);
        String B = Integer.toBinaryString(b);
        String resultado = calculadora.subtrair(A, B);

        return Integer.parseInt(resultado, 2);
    }
    public int multiplicar(int a, int b){
        return a * b;
    }

    public CalculadoraBinaria getCalculadora() {
        return calculadora;
    }

    public void setCalculadora(CalculadoraBinaria calculadora) {
        this.calculadora = calculadora;
    }
}
