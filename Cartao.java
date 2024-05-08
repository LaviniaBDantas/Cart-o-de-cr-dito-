import java.util.ArrayList;
import java.util.Scanner;

public class Cartao {
    private float limite;
    ArrayList<Compra> compras= new ArrayList<>();
    public Cartao(int limite){
        this.limite=limite;
    }
    public float getLimite() {
        return limite;
    }
    public int efetuaCompra(Compra compra){
        if (compra.getValor()<=this.getLimite()){
            compras.add(compra);
            this.limite-=compra.getValor();
            return 1;
        }else{
            return 0;
        }
    }


}
