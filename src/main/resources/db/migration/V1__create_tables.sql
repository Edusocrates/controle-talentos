-- Criação da tabela de Departamentos
CREATE TABLE departamentos (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL
);

-- Criação da tabela de Vagas
CREATE TABLE vagas (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(255) NOT NULL,
    descricao TEXT NOT NULL,
    salario DECIMAL(10, 2) NOT NULL,
    departamento_id BIGINT NOT NULL,
    CONSTRAINT fk_vaga_departamento FOREIGN KEY (departamento_id) REFERENCES departamentos(id)
);

-- Criação da tabela de Candidatos
CREATE TABLE candidatos (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL UNIQUE,
    telefone VARCHAR(20) NOT NULL,
    data_nascimento DATE NOT NULL,
    curriculo_url VARCHAR(500) NOT NULL
);

-- Criação da tabela de Entrevistas
CREATE TABLE entrevistas (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    data_entrevista TIMESTAMP NOT NULL,
    feedback TEXT NOT NULL,
    candidato_id BIGINT NOT NULL,
    vaga_id BIGINT NOT NULL,
    CONSTRAINT fk_entrevista_candidato FOREIGN KEY (candidato_id) REFERENCES candidatos(id),
    CONSTRAINT fk_entrevista_vaga FOREIGN KEY (vaga_id) REFERENCES vagas(id)
);
