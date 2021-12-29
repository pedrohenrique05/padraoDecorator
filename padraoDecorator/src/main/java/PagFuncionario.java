

public class PagFuncionario extends FinancaDecorator{

    public PagFuncionario(IFinanca financa){
        super(financa);
    }

    @Override
    public String getComprovante() {
        return "Pagamento funcionario";
    }
}
