# Consulta de Bancos – BrasilAPI (Java)

Projeto em Java para consumo da **BrasilAPI**, utilizando `HttpClient` para requisições HTTP e **Gson** para conversão de JSON em objetos Java.

O objetivo do projeto é praticar:
- Consumo de APIs REST
- Desserialização de JSON
- Organização de código em camadas
- Validação de entrada do usuário
- Boas práticas em aplicações Java de console

---

## 🛠️ Tecnologias utilizadas

- **Java 24**
- **Maven**
- **HttpClient (java.net.http)**
- **Gson**
- **BrasilAPI**

---

## 📂 Estrutura do projeto

src/main/java

├── principal
│ └── PrincipalBrasilApi.java

├── service
│ └── BrasilApiService.java

└── modelos
└── Banco.java

### 📁 Descrição das pastas
- **principal** → Ponto de entrada da aplicação (interação com o usuário)
- **service** → Regras de negócio e integração com a API
- **modelos** → Classes que representam os dados retornados pela API

---

## 🚀 Funcionalidades

- Consulta de banco pelo **código bancário**
- Validação de entrada do usuário
- Tratamento de banco inexistente
- Loop para múltiplas consultas
- Saída formatada no console

---
### 💻 Exemplo de uso  

Digite o código do banco (ou 0 para sair):
237

===== BANCO =====

Código: 237

Nome: Banco Bradesco S.A.

Nome completo: Banco Bradesco S.A.

ISPB: 60746948

=================
