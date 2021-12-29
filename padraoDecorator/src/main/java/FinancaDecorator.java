

public abstract class FinancaDecorator implements IFinanca {

    private IFinanca financa;
    public String comprovante;
    public FinancaDecorator(IFinanca financa) {
        this.financa = financa;
    }

    public IFinanca getFinanca(){
        return this.financa;
    }

    public void setIFinanca(IFinanca financa){
        this.financa = financa;
    }

    //public abstract float getValorEspecifico();
    public abstract String getComprovante();
    @Override
    public int getID() {
        return this.financa.getID();
    }

    @Override
    public float getValor() {
        return this.financa.getValor();
    }

    @Override
    public String getTipoOperacao() {
        return this.financa.getTipoOperacao() +" | "+this.getComprovante();
    }

    public void setComprovante(String comprovante){
        this.comprovante = comprovante;
    }
}
