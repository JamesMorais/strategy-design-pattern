# Operação de Pagamento

## Padrão de Projeto: Strategy

Este repositório demonstra a implementação do padrão de projeto Strategy em uma operação de pagamento simulada. Para entender melhor o funcionamento, consideremos uma simples operação de compra, que consiste em escolher o valor do produto e, em seguida, selecionar a estratégia de pagamento entre cartão de crédito ou débito.

### Classes e Elementos Principais:

- **ConcreteStrategy:**
  - **PagamentoCartaoDebito:** Implementa a interface EstrategiaPagamento, definindo a operação de pagamento para transações via cartão de débito.
  - **PagamentoCartaoCredito:** Implementa a interface EstrategiaPagamento, definindo a operação de pagamento para transações via cartão de crédito.

- **Interface:**
  - **EstrategiaPagamento:** Define a operação de pagamento que as classes ConcreteStrategy devem implementar.

- **Context:**
  - **Compra:** Representa o contexto da operação de pagamento, delegando a execução da operação à ConcreteStrategy escolhida.

Este README tem como objetivo fornecer uma compreensão clara do padrão de projeto Strategy implementado neste projeto específico. Ao destacar as relações entre as classes PagamentoCartaoDebito, PagamentoCartaoCredito, EstrategiaPagamento e Compra, buscamos proporcionar uma visão abrangente da estrutura flexível e desacoplada que o padrão de projeto Strategy oferece. Isso permite a fácil extensão do sistema para incluir novas estratégias de pagamento no futuro.
