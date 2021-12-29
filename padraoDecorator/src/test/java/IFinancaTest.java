import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IFinancaTest {

    @Test
    void deveRetornarApenasTipoOperacao(){
        IFinanca financa = new FinancaGeral(1,100,"Controle");
        assertEquals("Controle",financa.getTipoOperacao());
    }

    @Test
    void deveRetornarComprovanteEstrutura(){
        IFinanca financa = new Estrutura(new FinancaGeral(2,100,"Controle"));

        assertEquals("Controle | Pagamento estrutural",financa.getTipoOperacao());
    }

    @Test
    void deveRetornarComprovantePagFuncionario(){
        IFinanca financa = new PagFuncionario(new FinancaGeral(3,100,"Controle"));

        assertEquals("Controle | Pagamento funcionario",financa.getTipoOperacao());
    }

    @Test
    void deveRetornarComprovantePagAluno(){
        IFinanca financa = new PagAluno(new FinancaGeral(4,100,"Controle"));

        assertEquals("Controle | Mensalidade recebida",financa.getTipoOperacao());
    }

    @Test
    void deveRetornarComprovanteEstruturaPagFuncionario(){
        IFinanca financa = new PagFuncionario(new Estrutura(new FinancaGeral(5,100,"Controle")));

        assertEquals("Controle | Pagamento estrutural | Pagamento funcionario",financa.getTipoOperacao());
    }

    @Test
    void deveRetornarComprovanteEstruturaPagFuncionarioPagAluno(){
        IFinanca financa = new PagAluno(new PagFuncionario(new Estrutura(new FinancaGeral(6,100,"Controle"))));

        assertEquals("Controle | Pagamento estrutural | Pagamento funcionario | Mensalidade recebida",financa.getTipoOperacao());
    }

}