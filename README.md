```markdown
# 🚀 Java Collections: Manipulação Avançada de Estruturas de Dados

Este repositório reúne uma série de exercícios práticos desenvolvidos em **Java**, com foco na exploração e implementação do ecossistema de **Java Collections Framework** (`List`, `Set`, `Map`, `Queue`) e Programação Orientada a Objetos (POO).

---

## 📂 Lista de Exercícios e Funcionalidades

A coleção foi projetada para cobrir os principais cenários de armazenamento, busca e gerenciamento de coleções dinâmicas de dados:

* **Exercício 01 (ArrayList)**: Lista de compras dinâmica que cadastra produtos e calcula a quantidade total de itens inseridos utilizando métodos básicos da API `List`.
* **Exercício 02 (ArrayList de Decimais)**: Sistema de controle de notas acadêmicas que armazena dados em um `ArrayList<Double>`, processa a média aritmética da turma e avalia se o desempenho atingiu a meta estipulada (Média >= 7.0).
* **Exercício 03 (HashSet)**: Controle de presença estudantil que utiliza a interface `Set` para filtrar e eliminar de forma automática qualquer entrada de dados duplicada, garantindo a integridade da contagem final de alunos únicos presentes.
* **Exercício 04 (HashMap)**: Sistema de mapeamento chave-valor estruturado para vincular números de matrícula (`Integer`) aos nomes dos alunos (`String`), permitindo operações de busca direta, remoção indexada e listagem total de registros.
* **Exercício 05 (Queue / Fila)**: Simulador de atendimento de recepção que adota o conceito FIFO (*First-In, First-Out*) utilizando a interface `Queue`. O programa controla as chamadas, gerencia o próximo elemento da fila via `peek()` e atualiza os estados com o método `poll()`.
* **Exercício 06 (CRUD e Coleções de Objetos)**: Sistema completo de biblioteca que gerencia objetos da classe `Livro` dentro de um vetor dinâmico. Possui lógica embarcada para atualização de estado lógico de disponibilidade de empréstimos e devoluções.
* **Exercício 07 (Gerenciamento de Fluxos Complexos)**: Sistema de controle de comandas e pedidos de uma lanchonete. O programa gerencia objetos customizados da classe `Pedido` com máquina de estados integrada (`PENDENTE`, `PREPARANDO`, `FINALIZADO`), busca binária por ID e acumuladores financeiros para o faturamento do caixa.

---

## 🛠️ Tecnologias e Conceitos Aplicados

* **Linguagem**: Java
* **Estruturas Praticadas**:
    * `ArrayList` (Listas dinâmicas indexadas)
    * `HashSet` (Coleções de elementos únicos sem ordenação fixa)
    * `HashMap` (Estrutura de dicionário baseada em Chave-Valor)
    * `Queue` / `LinkedList` (Implementação de filas de prioridade e atendimento)
* **Lógica de Negócio**: Manipulação de métodos nativos da API como `add()`, `size()`, `get()`, `remove()`, `put()`, `peek()`, `poll()`, e iterações com laços condicionais avançados.

---

## 🚀 Como Executar

1. Certifique-se de ter o **JDK** configurado no seu terminal.
2. Compile o arquivo que deseja testar (exemplo para o exercício 07):
   ```bash
   javac Exercicio_07.java

```

3. Inicie o programa compilado:
```bash
java Exercicio_07

```



---

**Desenvolvido por Lucas Nery Miranda**
*Estudante de Ciência da Computação - UNA*