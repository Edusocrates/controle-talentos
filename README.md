Sistema de RH - Recrutamento e Gestão de Colaboradores
Descrição do Projeto
Este é um sistema de Recursos Humanos desenvolvido para facilitar o processo de recrutamento e a gestão de colaboradores. Ele oferece funcionalidades que vão desde o cadastro e triagem de candidatos até o agendamento de entrevistas e o gerenciamento de colaboradores contratados. O sistema é construído com Java 17 e Spring Boot 3.3.4, utilizando Spring Data JPA para integração com banco de dados, e Flyway para versionamento e migração de banco de dados. Além disso, o Swagger é utilizado para documentar as APIs.

Funcionalidades Implementadas
Recrutamento

Cadastro de Candidatos: Permite que candidatos se inscrevam para vagas abertas, com informações básicas como nome, e-mail, telefone e URL do currículo.
Triagem de Candidatos: Sistema realiza a triagem automática de candidatos com base em critérios definidos.
Agendamento de Entrevistas: O sistema permite o agendamento de entrevistas, bem como a consulta de entrevistas agendadas.
Feedback de Entrevista: Os gestores podem fornecer feedback detalhado sobre os candidatos após a entrevista.
Processo de Contratação: O sistema permite a gestão do status da contratação de candidatos, como oferta enviada, aceita ou contrato assinado.
Gestão de Colaboradores

Cadastro de Colaboradores: Permite o cadastro completo dos dados dos novos colaboradores, como nome, endereço, cargo, departamento e supervisor.
Gerenciamento de Vagas: O sistema possibilita o cadastro de novas vagas, bem como a consulta de candidatos inscritos e o status da vaga.
APIs Documentadas: O sistema tem toda a sua API documentada utilizando o Swagger, que pode ser acessado para explorar e testar os endpoints disponíveis.

Tecnologias Utilizadas
Java 17
Spring Boot 3.3.4
Spring Data JPA
Spring Security
Flyway (para migração de banco de dados)
H2 Database (banco de dados em memória para desenvolvimento)
Swagger/OpenAPI (para documentação das APIs)
Lombok (para reduzir boilerplate no código)
Jakarta Validation (para validação de dados nos DTOs)
Estrutura do Projeto
O projeto segue uma arquitetura baseada em camadas, garantindo a separação clara das responsabilidades. As principais camadas são:

Controller: Responsável pela interação com os clientes da API e mapeamento dos endpoints.
Service: Contém a lógica de negócio.
Repository: Responsável pela comunicação com o banco de dados.
DTOs: Usados para transferir dados entre as camadas de forma eficiente e segura.
Mappers: Convertem entre as entidades de domínio e os DTOs.
Endpoints
Candidatos

Cadastrar candidatos
Consultar candidatos
Ver todas as entrevistas agendadas de um candidato
Candidatar-se a uma vaga
Consultar vagas para as quais o candidato se inscreveu
Vagas

Criar novas vagas
Atualizar status de uma vaga
Listar todas as vagas
Consultar vagas por nome (usando busca por similaridade)
Entrevistas

Agendar uma nova entrevista
Listar todas as entrevistas agendadas para uma data específica
Consultar feedback da entrevista
Colaboradores

Cadastrar novos colaboradores
Configuração do Banco de Dados
O projeto usa H2 Database para o ambiente de desenvolvimento. O banco de dados é configurado no arquivo application.properties, e o Flyway é utilizado para gerenciar as migrações.

Script de Migração (Flyway)
O Flyway gerencia a criação e atualização das tabelas de banco de dados. Os scripts de criação das tabelas são definidos na pasta src/main/resources/db/migration. Um exemplo de migração básica pode ser encontrado no arquivo V1__create_tables.sql.

Inserção de Dados Iniciais
O projeto inclui um script para inserir dados iniciais no banco de dados. Você pode configurar os dados de teste no arquivo V2__insert_initial_data.sql.

Documentação das APIs
A documentação completa das APIs está disponível via Swagger. Você pode acessar a interface do Swagger para explorar e testar os endpoints no seguinte endereço:

Swagger UI: http://localhost:8080/swagger-ui/index.html

Como Executar o Projeto
Clone o repositório do projeto:

git clone <url_do_repositorio>


Navegue até o diretório do projeto:

cd sistema-rh

Compile e execute a aplicação:

./mvnw spring-boot:run

Acesse a aplicação em:

http://localhost:8080

Para acessar a documentação da API via Swagger:

http://localhost:8080/swagger-ui/index.html

Contribuições
Contribuições são bem-vindas! Se você tiver ideias de melhorias ou novas funcionalidades, sinta-se à vontade para abrir uma issue ou enviar um pull request.

