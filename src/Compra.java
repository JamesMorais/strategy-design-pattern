import java.math.BigDecimal;

public class Compra {
    BigDecimal valor;

    public Compra(BigDecimal valor) {
        this.valor = valor;
    }

    void processarCompra(EstrategiaPagamento estrategiaPagamento){
        estrategiaPagamento.pagar(valor);
    }

}
