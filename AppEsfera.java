import java.util.Scanner;
/**
 * Escreva uma descrição da classe AppEsfera aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class AppEsfera
{
    public static void main(String args[]){
        double raio;
        Scanner in = new Scanner(System.in);
        Esfera e1 = new Esfera();
        System.out.println("Digite um valor para o raio para o e1:");
        raio = in.nextDouble();
        e1.setRaio(raio);
        e1.calculaArea();
        System.out.println(e1.getArea());
        e1.calculaVolume();
        System.out.println(e1.getVolume());
        System.out.println("Os dados do objeto e1 são: " + e1.toString());
        
    }
}
