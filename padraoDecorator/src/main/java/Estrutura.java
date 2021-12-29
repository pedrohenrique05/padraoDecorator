

public class Estrutura extends FinancaDecorator{

    public Estrutura(IFinanca financa){
        super(financa);
    }
    @Override
    public String getComprovante() {
        return "Pagamento estrutural";
    }
}
