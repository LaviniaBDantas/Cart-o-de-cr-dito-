import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int op,limite; Scanner s=new Scanner(System.in);
        System.out.println("Digite o limite do cartao");
        limite=s.nextInt();

        Cartao card=new Cartao(limite);
        do{
            System.out.println("Digite o valor da compra");
            float valor=s.nextFloat();
            s.nextLine();
            System.out.println("Digite a descrição da compra");
            String desc=s.nextLine();

            Compra compra = new Compra(valor,desc);
            if(card.efetuaCompra(compra)==0){
                System.out.println("Compra negada.Limite insuficiente.");
                op=0;
            }
            else{
                System.out.println("Digite 0 para sair ou 1 para continuar");
                op=s.nextInt();
            }
        }while(op==1);
        card.compras.sort(Comparator.comparing(Compra::getValor));
        System.out.println("COMPRAS REALIZADAS:");
        System.out.println(card.compras);
        System.out.println("Saldo do cartão: "+card.getLimite());
    }
}
