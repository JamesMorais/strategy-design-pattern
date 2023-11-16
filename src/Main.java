import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        BigDecimal valor = new BigDecimal("10");
        Compra compra = new Compra(valor);

        compra.processarCompra(new PagamentoCartaoDebito());
    }
}