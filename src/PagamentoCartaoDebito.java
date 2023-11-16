import java.math.BigDecimal;

public class PagamentoCartaoDebito implements EstrategiaPagamento{
    @Override
    public void pagar(BigDecimal valor) {
        System.out.println("Pagou no débito" +valor);
    }
}
