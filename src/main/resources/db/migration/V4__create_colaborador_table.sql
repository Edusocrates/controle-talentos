-- V4__create_colaborador_table.sql

CREATE TABLE colaborador (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    endereco VARCHAR(255) NOT NULL,
    cargo VARCHAR(255) NOT NULL,
    departamento VARCHAR(255) NOT NULL,
    supervisor_id BIGINT,
    CONSTRAINT fk_supervisor FOREIGN KEY (supervisor_id) REFERENCES colaborador (id) ON DELETE SET NULL
);