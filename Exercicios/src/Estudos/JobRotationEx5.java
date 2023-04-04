package estudospessoais.Estudos;

public class JobRotationEx5 {

	public static void main(String[] args) {
// Escreva um programa que inverta os caracteres de um string.

		String original = "invetido";

		char[] caracteres = original.toCharArray();

		
		for (int i = 0; i < caracteres.length / 2; i++) {
			char temp = caracteres[i];
			caracteres[i] = caracteres[caracteres.length - 1 - i];
			caracteres[caracteres.length - 1 - i] = temp;
		}

		String invertida = new String(caracteres);
		
		System.out.println("Original: " + original);
		System.out.println("Invertida: " + invertida);
	}
}
