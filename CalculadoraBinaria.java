public class CalculadoraBinaria {
    String somar(String a, String b){
        int numA = Integer.parseInt(a, 2);
        int numB = Integer.parseInt(b, 2);
        return Integer.toBinaryString(numA + numB);
    }
    String subtrair(String a, String b){
        int numA = Integer.parseInt(a, 2);
        int numB = Integer.parseInt(b, 2);
        return Integer.toBinaryString(numA - numB);
    }
}
