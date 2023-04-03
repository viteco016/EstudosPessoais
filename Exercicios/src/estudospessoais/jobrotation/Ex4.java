package estudospessoais.jobrotation;

public class Ex4 {

	    public static void main(String[] args) {

	        double faturamentoTotal = 0.0;
	        double faturamentoSP = 67_836.43;
	        double faturamentoRJ = 36_678.66;
	        double faturamentoMG = 29_229.88;
	        double faturamentoES = 27_165.48;
	        double faturamentoOutros = 19_849.53;

	        faturamentoTotal = faturamentoSP + faturamentoRJ + faturamentoMG + faturamentoES + faturamentoOutros;

	        double percentualSP = (faturamentoSP / faturamentoTotal) * 100;
	        double percentualRJ = (faturamentoRJ / faturamentoTotal) * 100;
	        double percentualMG = (faturamentoMG / faturamentoTotal) * 100;
	        double percentualES = (faturamentoES / faturamentoTotal) * 100;
	        double percentualOutros = (faturamentoOutros / faturamentoTotal) * 100;

	        System.out.printf("Percentual de representação de SP: %.2f%%\n", percentualSP);
	        System.out.printf("Percentual de representação de RJ: %.2f%%\n", percentualRJ);
	        System.out.printf("Percentual de representação de MG: %.2f%%\n", percentualMG);
	        System.out.printf("Percentual de representação de ES: %.2f%%\n", percentualES);
	        System.out.printf("Percentual de representação de Outros: %.2f%%\n", percentualOutros);
	    }
	}

