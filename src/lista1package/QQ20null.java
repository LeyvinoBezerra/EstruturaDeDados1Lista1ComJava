package lista1package;

import java.util.Scanner;

public class QQ20null {
	
	public QQ20null(double invIni, double invMens, int meses, double jurosMen)
	    {
	        System.out.println("Rendimento Mensal: R$ " + this.rendimentoMensal( invMens, jurosMen));
	        System.out.println("Saldo acumulado: R$ " + this.saldoAcumulado(invIni,  invMens, meses, jurosMen));
	    }

	    private double rendimentoMensal(double invMens, double jurosMen)
	    {
	        double montante = invMens * Math.pow((1+jurosMen), 1);
	        return montante;
	    }

	    private double saldoAcumulado(double invIni, double invMens, int meses, double jurosMen)
	    {
	        double saldo = 0;
	        saldo += this.rendimentoMensal(invIni, jurosMen);
	        for(int i = 0; i < meses; i++)
	        {
	            saldo += this.rendimentoMensal(invMens, jurosMen);
	        }
	        return saldo;
	    
	    }
	public static void main(String[] arg) {
		
		QQ20null q = new QQ20null(20000, 6000, 5, 1.2);
		
		System.out.println("\n " + q.toString());
		
	
	
	}
	}

