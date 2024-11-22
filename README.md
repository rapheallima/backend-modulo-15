# Fábrica de Carros com Abstract Factory

Este projeto implementa o padrão de design **Abstract Factory** para simular uma fábrica de carros.

## Estrutura do Projeto

- **Interface `Car`**  
  Define o contrato para todos os carros, independentemente do tipo ou categoria.

- **Produtos Concretos**  
  - `SUV` e `Sedan`, nas versões:
    - **Econômica**
    - **De Luxo**

- **Interface `CarFactory`**  
  Define métodos para criar SUVs e Sedans.

- **Fábricas Concretas**  
  - `LuxuryCarFactory`: Produz carros de luxo.  
  - `EconomyCarFactory`: Produz carros econômicos.

- **Classe `Main`**  
  Demonstra a utilização das fábricas para criar diferentes tipos de carros.

## Funcionamento

- **LuxuryCarFactory**: Gera SUVs e Sedans de luxo.  
- **EconomyCarFactory**: Gera SUVs e Sedans econômicos.

## Benefícios

- Implementação flexível e extensível para diferentes tipos de carros.  
- Separação clara da lógica de criação e do uso dos objetos.

## Exemplo de Saída

```plaintext
Montando um SUV de luxo.
Montando um Sedan de luxo.
Montando um SUV econômico.
Montando um Sedan econômico.
