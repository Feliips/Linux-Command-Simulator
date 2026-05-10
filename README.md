# 🐧Linux Command Simulator
![DIO](https://img.shields.io/badge/DIO-Project-blue)
![Linux](https://img.shields.io/badge/Linux-Terminal-black?logo=linux)
![Status](https://img.shields.io/badge/status-concluido-success)
Projeto desenvolvido como solução de desafio de programação da DIO.

O objetivo do desafio é simular descrições de comandos básicos do terminal Linux utilizando STDIN e STDOUT.

---

# Tecnologias

- ![JavaScript](https://img.shields.io/badge/JavaScript-F7DF1E?logo=javascript&logoColor=black)
- ![Java](https://img.shields.io/badge/Java-ED8B00?logo=openjdk&logoColor=white)
- ![Python](https://img.shields.io/badge/Python-3776AB?logo=python&logoColor=white)

---

# Conceitos Utilizados

- Entrada e saída padrão (STDIN / STDOUT)
- Estruturas condicionais
- Manipulação de strings
- Lógica de programação

---

# Lógica do Desafio

O programa recebe uma string representando um comando Linux.

Utilizamos estruturas condicionais para verificar qual comando foi informado.

Dependendo da entrada:
- retornamos a descrição correta;
- ou informamos que o comando é inválido.

---

# Fluxo

1. Ler entrada do usuário;
2. Comparar o comando;
3. Exibir descrição correspondente;
4. Caso não exista, retornar:
```text
comando invalido
```
