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

## Estrutura do Projeto

```bash
src/
├── main/
│   ├── java/
│   │   └── com/seuprojeto/rh/
│   │       ├── controller/   # Controllers
│   │       ├── domain/       # Entidades de domínio
│   │       ├── dto/          # Data Transfer Objects (DTOs)
│   │       ├── mapper/       # Mappers para conversão de entidades para DTOs
│   │       ├── repository/   # Interfaces de Repositórios
│   │       ├── service/      # Regras de negócio (Camada de Serviço)
│   └── resources/
│       ├── application.properties   # Configurações da aplicação
│       └── db/migration/            # Scripts de migração Flyway
