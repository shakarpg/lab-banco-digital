### Lab da DIO: Criando um Banco Digital com Java
Este projeto é a implementação de um sistema bancário simples em Java, demonstrando os princípios da Programação Orientada a Objetos (POO). Ele foi desenvolvido como parte de um desafio de laboratório, com o objetivo de simular operações bancárias básicas como saques, depósitos e transferências entre contas corrente e poupança.

### 📝 Descrição
O sistema simula a interação entre clientes e um banco. Um cliente pode possuir uma ou mais contas (seja corrente ou poupança), e cada conta possui as funcionalidades essenciais para realizar transações financeiras. O projeto está estruturado de forma a separar as responsabilidades entre as classes Cliente, Conta, ContaCorrente, ContaPoupanca e Banco.

### ✨ Funcionalidades
Criação de Contas: Permite a criação de contas do tipo Corrente e Poupança.

Operações Bancárias:

sacar(double valor): Realiza um saque da conta, se houver saldo suficiente.

depositar(double valor): Adiciona um valor ao saldo da conta.

transferir(double valor, Conta contaDestino): Transfere fundos para outra conta.

Impressão de Extrato: Exibe o histórico de transações e informações da conta, como agência, número e saldo.

### 🛠️ Tecnologias Utilizadas
O projeto foi construído utilizando as seguintes tecnologias:

Java: Linguagem de programação principal.

Lombok: Biblioteca para reduzir código boilerplate (getters, setters, construtores, etc.).

### 🚀 Como Executar o Projeto
Para executar este projeto, você precisará ter o Java Development Kit (JDK) instalado em sua máquina.

Clone o repositório:

Bash

git clone https://github.com/shakarpg/lab-banco-digital.git
Abra em sua IDE preferida:

Abra o projeto em uma IDE como IntelliJ IDEA, Eclipse ou VS Code.

Aguarde a IDE carregar as dependências (se houver, como o Lombok).

Execute a classe principal:

Encontre a classe Main (ou a classe que contém o método public static void main(String[] args)) no pacote src/main/java.

Clique com o botão direito sobre ela e selecione a opção "Run" (Executar).

STRUCTURE Estrutura do Projeto
/lab-banco-digital
|-- /src
|   |-- /main
|   |   |-- /java
|   |   |   |-- /br/com/bancodigital
|   |   |   |   |-- Banco.java
|   |   |   |   |-- Cliente.java
|   |   |   |   |-- Conta.java
|   |   |   |   |-- ContaCorrente.java
|   |   |   |   |-- ContaPoupanca.java
|   |   |   |   |-- IConta.java
|   |   |   |   |-- Main.java
|-- pom.xml (ou build.gradle)
|-- README.md
