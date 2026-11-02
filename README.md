# Resolução exercício Beecrowd1177

## Descrição de problema
Faça um programa que leia um valor T e preencha um vetor N[1000] com a sequência de valores de 0 até T-1 repetidas vezes, conforme exemplo abaixo. Imprima o vetor N.

## Como Funciona
1. **Entrada de Dados:**
   - O programa lê o valor inteiro `T` introduzido pelo utilizador através do `Scanner`.
   - Inicializa-se um vetor de inteiros `N` com tamanho 1000.
2. **Processamento e Preenchimento:**
   - Um laço `for` percorre as posições do vetor de `i = 0` até `i < 1000`.
   - Para `i > 0`, o valor da posição atual é definido como o valor anterior mais 1 (`N[i] = N[i - 1] + 1`). Para `i = 0`, a posição inicia por padrão com 0.
   - Caso o valor armazenado em `N[i]` atinja o limite `T`, a contagem é reiniciada subtraindo `T` do valor (`N[i] = N[i] - T`), fazendo o valor voltar a `0`.
3. **Saída de Dados:**
   - Em cada passo do laço, imprime imediatamente a mensagem formatada no console: `"N[" + i + "] = " + N[i]`.
