# Sistema de RH - Recrutamento e Gestão de Colaboradores

## Descrição do Projeto

Este sistema de RH foi desenvolvido para gerenciar o processo de recrutamento e a gestão de colaboradores de uma organização. Ele inclui funcionalidades para cadastro de candidatos, agendamento de entrevistas, feedback de entrevistas, processo de contratação, além do cadastro de novos colaboradores com seus respectivos departamentos, cargos e supervisores.

## Funcionalidades Implementadas

### Recrutamento
- **Cadastro de Candidatos**: Permite o registro de informações básicas como nome, e-mail, telefone e o envio de um currículo.
- **Triagem Automática de Currículos**: Baseada em palavras-chave e critérios definidos.
- **Agendamento de Entrevistas**: O sistema permite agendar entrevistas e notificá-las ao candidato e avaliadores.
- **Feedback de Entrevistas**: Gestores podem fornecer feedback detalhado sobre os candidatos entrevistados.
- **Processo de Contratação**: Permite enviar ofertas de trabalho, aceitar ou rejeitar e acompanhar o status de contratação.

### Gestão de Colaboradores
- **Cadastro Completo de Colaboradores**: Nome, endereço, cargo, departamento e supervisor.
- **Avaliações de Desempenho**: Registra avaliações e feedback contínuo sobre os colaboradores.

## Tecnologias Utilizadas
- **Java 17**
- **Spring Boot 3.3.4**
- **H2 Database** (Banco de Dados em Memória)
- **Flyway** (Controle de Versão do Banco de Dados)
- **Lombok** (Redução de Boilerplate no Código)
- **Swagger** (Documentação de APIs)



## Configuração do Banco de Dados
O projeto está configurado para usar o banco de dados em memória H2 durante o desenvolvimento. A migração de dados é gerenciada pelo Flyway, com scripts localizados em src/main/resources/db/migration/.

## Script de Migração (Flyway)
Os scripts para criar as tabelas e relacionamentos estão no formato SQL e são automaticamente aplicados no startup da aplicação.

## Inserção de Dados Iniciais
Após a criação das tabelas, alguns dados iniciais são inseridos automaticamente no banco de dados para facilitar o desenvolvimento e os testes.

## Documentação das APIs
A documentação das APIs pode ser acessada através da interface do Swagger.

Swagger UI: http://localhost:8080/swagger-ui/index.html

## Estrutura do Projeto

```bash
src/
├── main/
│   ├── java/
│   │   └── com/edusocrates/RM358568/controle_talentos
│   │       ├── api/controller/   # Controllers
│   │       ├── dominio/model       # Entidades de domínio
│   │       ├── dominio/dto/          # Data Transfer Objects (DTOs)
│   │       ├── aplicacao/mapper/       # Mappers para conversão de entidades para DTOs
│   │       ├── infratestrutura/repositorio/   # Interfaces de Repositórios
│   │       ├── infratestrutura/configuracao/   # Gerenciamento de Configurações
│   │       ├── aplicacao/service/      # Regras de negócio (Camada de Serviço)
│   └── resources/
│       ├── application.properties   # Configurações da aplicação
│       └── db/migration/            # Scripts de migração Flyway

