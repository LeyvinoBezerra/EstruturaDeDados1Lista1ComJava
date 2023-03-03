package lista1package;

public class QQ38 {

    private static final Object T = null;
	public <T> QQ38(T objeto)
    {
        System.out.println("Imprimindo toString");
        this.useToString(objeto);
    }

    public <T> QQ38(T[]vetor)
    {
        System.out.println("Imprimindo objeto com vetor sem toString");
        this.imprimirVetor(vetor);
    }

    public <T> QQ38(T[]vetor, T objeto)
    {
        this.useToString(objeto);
        System.out.println();
        this.imprimirVetor(vetor);
    }

    private <T> void useToString(T objeto)
    {
        System.out.println(objeto.toString());
    }

    private <T> void imprimirVetor(T[]vetor)
    {
        for(int i = 0; i < vetor.length; i++)
        {
            System.out.println(i + "° = " + vetor[i]);
        }
    }
    public static void main() {
    	
    	
    }
}
