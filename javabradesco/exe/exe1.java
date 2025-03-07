// Crie um programa que imprima o primeiro nome de uma pessoa e o seu ultimo nome.

public class exe1 {
    public static void main(String [] args) {

        String PrimeiroNome = "Lucas";
        String UltimoNome = "Mota";
        String NomeCompleto = NomeCompleto(PrimeiroNome, UltimoNome);
        System.out.println(NomeCompleto);

    }

    public static String NomeCompleto(String PrimeiroNome, String Ultimonome) {
        return PrimeiroNome.concat(" ").concat(Ultimonome);
    }
}
