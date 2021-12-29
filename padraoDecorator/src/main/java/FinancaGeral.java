

public class FinancaGeral implements IFinanca{

    private int id;
    private float valor;
    private String tipoOperacao;

    public FinancaGeral(int id, float valor, String tipoOperacao) {
        this.id = id;
        this.valor = valor;
        this.tipoOperacao = tipoOperacao;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public void setTipoOperacao(String tipoOperacao) {
        this.tipoOperacao = tipoOperacao;
    }

    @Override
    public int getID() {
        return this.id;
    }

    @Override
    public float getValor() {
        return this.valor;
    }

    @Override
    public String getTipoOperacao() {
        return this.tipoOperacao;
    }
}
