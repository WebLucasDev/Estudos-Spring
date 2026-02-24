-- Categorias
INSERT INTO tb_categoria (id, nome) VALUES (1, 'Tecnologia');
INSERT INTO tb_categoria (id, nome) VALUES (2, 'Ficção Científica');

-- Autores
INSERT INTO tb_autor (id, nome, nacionalidade) VALUES (1, 'Martin Fowler', 'Britânico');
INSERT INTO tb_autor (id, nome, nacionalidade) VALUES (2, 'Andy Weir', 'Americano');

-- Livros
INSERT INTO tb_livro (id, titulo, isbn, ano_publicacao, categoria_id) VALUES (1, 'Refactoring', '978-0201485677', 1999, 1);
INSERT INTO tb_livro (id, titulo, isbn, ano_publicacao, categoria_id) VALUES (2, 'The Martian', '978-0553418026', 2011, 2);

-- Relacionamento Livro <-> Autor
INSERT INTO tb_livro_autor (livro_id, autor_id) VALUES (1, 1);
INSERT INTO tb_livro_autor (livro_id, autor_id) VALUES (2, 2);

-- Usuários
INSERT INTO tb_usuario (id, nome, email) VALUES (1, 'Ana Costa', 'ana@gmail.com');
INSERT INTO tb_usuario (id, nome, email) VALUES (2, 'Bruno Lima', 'bruno@gmail.com');

-- Empréstimos
INSERT INTO tb_emprestimo (id, data_retirada, data_devolucao, livro_id, usuario_id) VALUES (1, '2024-03-01T00:00:00Z', '2024-03-15T00:00:00Z', 1, 1);
INSERT INTO tb_emprestimo (id, data_retirada, data_devolucao, livro_id, usuario_id) VALUES (2, '2024-03-05T00:00:00Z', '2024-03-20T00:00:00Z', 2, 2);
INSERT INTO tb_emprestimo (id, data_retirada, data_devolucao, livro_id, usuario_id) VALUES (3, '2024-03-16T00:00:00Z', '2024-03-30T00:00:00Z', 2, 1);