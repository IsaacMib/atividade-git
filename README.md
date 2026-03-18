# Atividade Complementar I - Professor Arthur

Repositório com exercícios organizados em arquivos separados para facilitar estudo e apresentação.

Repositório publicado: https://github.com/IsaacMib/atividade-git

- Versão Python: 12 exercícios
- Versão Java: 12 exercícios

## Estrutura

### Python (`src/`)

- `src/01_conversor_medidas.py`
- `src/02_calculadora_desconto.py`
- `src/03_analisador_texto.py`
- `src/04_idade_em_dias.py`
- `src/05_reajuste_salarial.py`
- `src/06_par_ou_impar.py`
- `src/07_maior_de_tres.py`
- `src/08_tabuada_personalizada.py`
- `src/09_validador_senha.py`
- `src/10_estatisticas_lista.py`
- `src/11_dicionario_precos.py`
- `src/12_desafio_final.py`

### Java (`java/`)

- `java/Ex01ConversorMedidas.java`
- `java/Ex02CalculadoraDesconto.java`
- `java/Ex03AnalisadorNome.java`
- `java/Ex04IdadeEmDias.java`
- `java/Ex05ReajusteSalarial.java`
- `java/Ex06ParOuImpar.java`
- `java/Ex07MaiorDeTres.java`
- `java/Ex08TabuadaFor.java`
- `java/Ex09ValidadorSenhaWhile.java`
- `java/Ex10EstatisticasArray.java`
- `java/Ex11BuscaArrayList.java`
- `java/Ex12DesafioFinalCadastro.java`

## Como executar

### Python

No terminal, entre na pasta do projeto e rode o arquivo desejado:

```bash
python3 src/01_conversor_medidas.py
```

Você pode trocar o nome do arquivo para executar qualquer exercício.

### Java

No terminal, compile e execute a classe desejada:

```bash
javac java/Ex01ConversorMedidas.java
java -cp java Ex01ConversorMedidas
```

Você pode trocar o nome da classe para executar os outros exercícios.

## Lista de exercícios

### Python

1. Conversor de Medidas
2. Calculadora de Desconto
3. Analisador de Texto
4. Idade em Dias
5. Reajuste Salarial
6. Par ou Ímpar
7. Maior de Três
8. Tabuada Personalizada
9. Validador de Senha
10. Estatísticas de Lista
11. Dicionário de Preços
12. Desafio Final (Cadastro de 3 alunos com média)

### Java

1. Conversor de Medidas
2. Calculadora de Desconto
3. Analisador de Nome
4. Cálculo de Idade em Dias
5. Reajuste Salarial
6. Par ou Ímpar
7. Maior de Três (sem `Math.max()`)
8. Tabuada com `for`
9. Validador de Senha com `while`
10. Estatísticas de Array
11. Busca em Lista (`ArrayList`)
12. Desafio Final (Classe `Aluno` + média + situação)

## Publicar no GitHub

### 1) Inicializar Git local

```bash
git init
git add .
git commit -m "feat: atividade complementar com exercícios em Python e Java"
```

### 2) Criar repositório no GitHub

Opção A (site):
- Acesse https://github.com/new
- Nome sugerido: `atividade-complementar-1-prof-arthur`
- Crie o repositório vazio (sem README, .gitignore e licença)

Opção B (GitHub CLI):

```bash
gh repo create atividade-complementar-1-prof-arthur --public --source=. --remote=origin --push
```

### 3) Conectar e enviar (caso tenha criado pelo site)

```bash
git remote add origin https://github.com/SEU_USUARIO/atividade-complementar-1-prof-arthur.git
git branch -M main
git push -u origin main
```

---
Feito para fins acadêmicos (Atividade Complementar I).
