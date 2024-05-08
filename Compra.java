public class Compra {
    private float valor;
    private String descricao;
    public Compra(float valor, String desc){
        this.valor=valor;
        this.descricao=desc;
    }
    public float getValor() {
        return valor;
    }
    public String getDescricao() {
        return descricao;
    }
    public String toString() {
        return this.getDescricao()+" - "+this.getValor();
    }
}
