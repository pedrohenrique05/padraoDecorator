

public class PagAluno extends FinancaDecorator{

    public PagAluno(IFinanca financa){
        super(financa);
    }

    @Override
    public String getComprovante() {
        return "Mensalidade recebida";
    }

}
