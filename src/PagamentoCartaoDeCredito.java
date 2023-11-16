import java.math.BigDecimal;

public class PagamentoCartaoDeCredito implements EstrategiaPagamento{
    @Override
    public void pagar(BigDecimal valor) {
        System.out.println("O cliente pagou " + valor + " reais no crédito." );
    }
}
