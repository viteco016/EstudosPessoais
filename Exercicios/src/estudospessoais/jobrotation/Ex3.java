package estudospessoais.jobrotation;

public class Ex3 {
// 3) Dado um vetor que guarda o valor de faturamento diário de uma distribuidora, faça um programa, na linguagem que desejar, que calcule e retorne:
// • O menor valor de faturamento ocorrido em um dia do mês;
// • O maior valor de faturamento ocorrido em um dia do mês;
// • Número de dias no mês em que o valor de faturamento diário foi superior à média mensal.		
		public static void main(String[] args) {
			Scanner entrada = new Scanner(System.in);

			System.out.print("Digite o número de dias do mês: ");
			int numDias = entrada.nextInt();

			double[] faturamento = new double[numDias];

			for (int i = 0; i < numDias; i++) {
				System.out.print("Digite o faturamento do dia " + (i + 1) + ": ");
				faturamento[i] = entrada.nextDouble();
			}

			double menorFaturamento = faturamento[0];
			for (int i = 1; i < numDias; i++) {
				if (faturamento[i] < menorFaturamento) {
					menorFaturamento = faturamento[i];
				}
			}

			double maiorFaturamento = faturamento[0];
			for (int i = 1; i < numDias; i++) {
				if (faturamento[i] > maiorFaturamento) {
					maiorFaturamento = faturamento[i];
				}
			}

			double somaFaturamento = 0;
			for (int i = 0; i < numDias; i++) {
				somaFaturamento += faturamento[i];
			}
			double mediaFaturamento = somaFaturamento / numDias;

			int numDiasAcimaDaMedia = 0;
			for (int i = 0; i < numDias; i++) {
				if (faturamento[i] > mediaFaturamento) {
					numDiasAcimaDaMedia++;
				}
			}
			
			entrada.close();
			
			System.out.println("Menor faturamento: " + menorFaturamento);
			System.out.println("Maior faturamento: " + maiorFaturamento);
			System.out.println("Dias com faturamento acima da média: " + numDiasAcimaDaMedia);
		}
	}
