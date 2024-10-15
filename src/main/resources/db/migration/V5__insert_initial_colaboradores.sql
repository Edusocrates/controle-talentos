-- V5__insert_initial_colaboradores.sql
INSERT INTO colaborador (nome, endereco, cargo, departamento, supervisor_id) VALUES
('João da Silva', 'Rua A, 123', 'Desenvolvedor', 'TI', NULL),
('Maria Oliveira', 'Avenida B, 456', 'Gerente de Projetos', 'Gestão', NULL),
('Carlos Pereira', 'Travessa C, 789', 'Analista de Sistemas', 'TI', 2),
('Ana Costa', 'Rua D, 321', 'Estagiária', 'TI', 1),
('Fernanda Santos', 'Avenida E, 654', 'Coordenadora', 'RH', NULL);
