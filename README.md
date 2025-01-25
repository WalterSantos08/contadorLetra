# Contador de Caracteres em Java ✔️

Este programa em Java analisa uma palavra digitada pelo usuário e conta a frequência de cada caractere presente nela.

## 🗃 Descrição

O programa utiliza:

- Um mapa (`HashMap`) para armazenar cada caractere da palavra como uma chave e sua frequência como o valor correspondente.
- Um laço `for` para iterar sobre os caracteres da palavra e atualizar o mapa.
- Entrada do usuário para fornecer a palavra que será analisada.

O resultado exibe a contagem de cada caractere presente na palavra inserida.

## 🚀 Como executar

1. Certifique-se de ter o [Java JDK](https://www.oracle.com/java/technologies/javase-downloads.html) instalado em sua máquina.
2. Clone este repositório ou copie o código.
3. Compile o arquivo Java:
   ```bash
   javac contadorPalavra.java
   ```
4. Execute o programa:
   ```bash
   java contadorPalavra
   ```

## 🕹️ Como usar

1. Ao executar o programa, ele solicitará que você digite uma palavra.
2. Digite a palavra desejada e pressione Enter.
3. O programa exibirá a frequência de cada caractere na palavra digitada.

### Exemplo

Entrada:
```
Digite uma palavra:
aprendizado
```

Saída:
```
Contagem de caracteres:
'a' aparece 2 vez(es)
'p' aparece 1 vez(es)
'r' aparece 1 vez(es)
'e' aparece 1 vez(es)
'n' aparece 1 vez(es)
'd' aparece 2 vez(es)
'i' aparece 1 vez(es)
'z' aparece 1 vez(es)
'o' aparece 1 vez(es)
```

## 🗂 Estrutura do código

O código é composto por:

- **Leitura da entrada do usuário**: Usando `Scanner` para capturar a palavra digitada.
- **Armazenamento em mapa**: Um `HashMap` é usado para contar e armazenar a frequência de cada caractere.
- **Iteração sobre a palavra**: Com um laço `for` que analisa cada caractere e atualiza o mapa.
- **Exibição do resultado**: Utiliza um laço `for-each` para imprimir cada caractere e sua frequência.
