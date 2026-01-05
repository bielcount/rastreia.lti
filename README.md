# rastreia.lti

Sistema **Java de console** que simula funcionalidades básicas de um **sistema de rastreamento de cargas**, com foco educacional e arquitetura organizada em MVC.

---

## 📦 Visão Geral

O **RASTREIA.LTI** é uma aplicação Java executada via terminal (CLI), desenvolvida para fins educacionais, que simula um sistema de rastreamento de cargas.

O projeto permite autenticação de usuários com diferentes perfis e interação com menus específicos, demonstrando conceitos fundamentais como:

- Separação de responsabilidades  
- Fluxo de controle  
- Organização de código em camadas  

---

## ⚙️ Funcionalidades

- Login com dois tipos de usuário:
  - **Administrador**
  - **Cliente**
- Exibição de menus de operações conforme o perfil do usuário
- Listagem de cargas
- Interação via terminal (console)
- Estrutura organizada em **MVC (Model–View–Controller)**

---

## 🗂️ Estrutura do Projeto

O código-fonte está localizado na pasta `src/`, organizado da seguinte forma:

```text
src/
├── controller/   # Controle do fluxo da aplicação (login, menus)
├── model/        # Entidades do sistema (ex.: usuário, carga)
├── repository/   # Camada de acesso a dados (simulada)
├── view/         # Interação com o usuário via console
├── util/         # Classes utilitárias (ex.: configurações)
└── App.java      # Ponto de entrada da aplicação

✅ Pré-requisitos
Java Development Kit (JDK)

Recomendado: JDK 17 ou superior
(Opcional) Visual Studio Code
Extensão recomendada: Extension Pack for Java

🔧 Configuração
A aplicação utiliza credenciais configuradas via arquivo de propriedades.

Passos para configuração
- Localize o arquivo application.properties.example na raiz do projeto
- Faça uma cópia e renomeie para application.properties
- Preencha as credenciais conforme o exemplo abaixo:

properties
Copiar código
admin.username=admin
admin.password=admin123
admin.role=1

cliente.username=cliente
cliente.password=cliente123
cliente.role=0

⚠️ Observação:
Os valores de admin.role e cliente.role devem ser numéricos, pois o sistema realiza conversão para inteiro.

▶️ Como Executar o Projeto

✅ Opção 1 — Executar pelo VS Code (recomendado)
- Abra a pasta do projeto no VS Code
- Certifique-se de que o JDK está configurado corretamente
- Abra o arquivo App.java
- Clique em Run

💻 Opção 2 — Executar pelo terminal

🐧 Linux / 🍎 macOS
bash

Copiar código
mkdir -p bin
find src -name "*.java" > sources.txt
javac -d bin @sources.txt
java -cp bin App

💻 Windows (PowerShell)
powershell

Copiar código
mkdir bin -ErrorAction SilentlyContinue
Get-ChildItem -Recurse -Filter *.java src | % { $_.FullName } > sources.txt
javac -d bin @sources.txt
java -cp bin App

🧑‍💻 Uso do Sistema
- Ao iniciar a aplicação, será exibida uma tela de boas-vindas
- Informe o usuário e a senha configurados no arquivo application.properties
- Para encerrar o sistema, digite 0 no campo de usuário
- Após login bem-sucedido, o menu correspondente ao perfil será exibido

📝 Observações
O projeto não utiliza frameworks web ou interface gráfica
Não há dependências externas configuradas
O foco do projeto é aprendizado e simulação de fluxo de sistema

📄 Licença
Este projeto é de uso educacional e aberto para estudo e aprendizado.
