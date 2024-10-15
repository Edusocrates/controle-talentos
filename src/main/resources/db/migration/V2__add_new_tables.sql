-- V2__add_new_tables.sql

CREATE TABLE vaga (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(255) NOT NULL,
    descricao TEXT NOT NULL,
    status VARCHAR(20) NOT NULL CHECK (status IN ('ABERTA', 'ENCERRADA'))
);

CREATE TABLE inscricao (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    candidato_id BIGINT NOT NULL,
    vaga_id BIGINT NOT NULL,
    CONSTRAINT fk_candidato_inscricao FOREIGN KEY (candidato_id) REFERENCES candidato (id) ON DELETE CASCADE,
    CONSTRAINT fk_vaga_inscricao FOREIGN KEY (vaga_id) REFERENCES vaga (id) ON DELETE CASCADE
);
