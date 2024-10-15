--V3__insert_first_data.sql

-- Inserindo dados na tabela candidato
INSERT INTO candidato (nome, email, telefone, curriculo_url) VALUES
('João Silva', 'joao.silva@example.com', '99999-1111', 'http://curriculos.com/joao-silva.pdf'),
('Maria Oliveira', 'maria.oliveira@example.com', '99999-2222', 'http://curriculos.com/maria-oliveira.pdf'),
('Carlos Souza', 'carlos.souza@example.com', '99999-3333', 'http://curriculos.com/carlos-souza.pdf'),
('Ana Costa', 'ana.costa@example.com', '99999-4444', 'http://curriculos.com/ana-costa.pdf');

-- Inserindo dados na tabela vaga
INSERT INTO vaga (titulo, descricao, status) VALUES
('Desenvolvedor Java', 'Desenvolvedor Java com experiência em Spring Boot e microservices.', 'ABERTA'),
('Analista de Sistemas', 'Análise de requisitos, desenvolvimento e manutenção de sistemas.', 'ABERTA'),
('Gerente de Projetos', 'Gestão de projetos de TI, controle de prazos e entregas.', 'ENCERRADA'),
('UI/UX Designer', 'Design de interfaces e experiências do usuário.', 'ABERTA');

-- Inserindo dados na tabela entrevista
INSERT INTO entrevista (candidato_id, data_hora, avaliador, feedback) VALUES
(1, '2024-10-20 09:00:00', 'Fernando Almeida', 'Candidato promissor, com boa experiência técnica.'),
(2, '2024-10-21 14:30:00', 'Juliana Pereira', 'Ótima comunicação e conhecimento em análise de sistemas.'),
(3, '2024-10-22 11:00:00', 'Roberto Santos', 'Experiência relevante, mas pode melhorar em metodologias ágeis.'),
(4, '2024-10-23 10:00:00', 'Fernanda Lima', 'Criativa e cheia de boas ideias para design.');


-- Inserindo dados na tabela contratacao
INSERT INTO contratacao (candidato_id, status) VALUES
(1, 'OFERTA_ENVIADA'),
(2, 'OFERTA_ACEITA'),
(3, 'CONTRATO_ASSINADO'),
(4, 'OFERTA_ENVIADA');

-- Inserindo dados na tabela inscricao
INSERT INTO inscricao (candidato_id, vaga_id) VALUES
(1, 1),  -- João Silva se inscreveu para Desenvolvedor Java
(1, 2),  -- João Silva se inscreveu para Analista de Sistemas
(2, 1),  -- Maria Oliveira se inscreveu para Desenvolvedor Java
(2, 4),  -- Maria Oliveira se inscreveu para UI/UX Designer
(3, 2),  -- Carlos Souza se inscreveu para Analista de Sistemas
(3, 3),  -- Carlos Souza se inscreveu para Gerente de Projetos
(4, 1);  -- Ana Costa se inscreveu para Desenvolvedor Java
