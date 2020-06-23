package desafio2.pkg2;
import java.util.Scanner;
/**
 *
 * @author troll
 */
public class Desafio22 {
    public static void main(String[] args) {
        int a, b, s;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Qual o primeiro valor?");
        a = ler.nextInt();
        System.out.println("Qual o segundo valor?");
        b = ler.nextInt();
        
        s = a+b;
        
        System.out.println("A soma dos dois valores é:"+s);
    }
    
}
