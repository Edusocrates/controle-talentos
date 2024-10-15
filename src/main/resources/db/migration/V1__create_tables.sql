-- V1__create_tables.sql
CREATE TABLE candidato (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL UNIQUE,
    telefone VARCHAR(255) NOT NULL,
    curriculo_url VARCHAR(255) NOT NULL
);

CREATE TABLE entrevista (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    candidato_id BIGINT NOT NULL,
    data_hora TIMESTAMP NOT NULL,
    avaliador VARCHAR(255) NOT NULL,
    feedback TEXT,
    CONSTRAINT fk_candidato FOREIGN KEY (candidato_id) REFERENCES candidato (id) ON DELETE CASCADE
);

CREATE TABLE contratacao (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    candidato_id BIGINT NOT NULL,
    status VARCHAR(255) NOT NULL,
    CONSTRAINT fk_candidato_contratacao FOREIGN KEY (candidato_id) REFERENCES candidato (id) ON DELETE CASCADE
);
