-- Categorias de Produto
INSERT INTO tb_categoria_produto (id, nome) VALUES (1, 'Informática');
INSERT INTO tb_categoria_produto (id, nome) VALUES (2, 'Eletrônicos');

-- Produtos
INSERT INTO tb_produto (id, nome, descricao, preco, categoria_produto_id) VALUES (1, 'Notebook Gamer', 'Notebook para alto desempenho', 4500.00, 1);
INSERT INTO tb_produto (id, nome, descricao, preco, categoria_produto_id) VALUES (2, 'Mouse Sem Fio', 'Mouse wireless com longa duração de bateria', 150.00, 1);
INSERT INTO tb_produto (id, nome, descricao, preco, categoria_produto_id) VALUES (3, 'Fone Bluetooth', 'Fone com cancelamento de ruído', 300.00, 2);

-- Clientes
INSERT INTO tb_cliente (id, nome, email, telefone) VALUES (1, 'Carlos Mendes', 'carlos@gmail.com', '(11) 91234-5678');
INSERT INTO tb_cliente (id, nome, email, telefone) VALUES (2, 'Fernanda Rocha', 'fernanda@gmail.com', '(21) 99876-5432');

-- Pedidos
INSERT INTO tb_pedido (id, momento, status, cliente_id) VALUES (1, '2024-01-10T00:00:00Z', 'ENTREGUE', 1);
INSERT INTO tb_pedido (id, momento, status, cliente_id) VALUES (2, '2024-01-15T00:00:00Z', 'PAGO', 2);
INSERT INTO tb_pedido (id, momento, status, cliente_id) VALUES (3, '2024-01-20T00:00:00Z', 'AGUARDANDO', 1);

-- Itens do Pedido 1 (Carlos: Notebook + 2x Mouse)
INSERT INTO tb_item_pedido (pedido_id, produto_id, quantidade, preco_unitario) VALUES (1, 1, 1, 4500.00);
INSERT INTO tb_item_pedido (pedido_id, produto_id, quantidade, preco_unitario) VALUES (1, 2, 2, 150.00);

-- Itens do Pedido 2 (Fernanda: Fone + Mouse)
INSERT INTO tb_item_pedido (pedido_id, produto_id, quantidade, preco_unitario) VALUES (2, 3, 1, 300.00);
INSERT INTO tb_item_pedido (pedido_id, produto_id, quantidade, preco_unitario) VALUES (2, 2, 1, 150.00);

-- Itens do Pedido 3 (Carlos: 2x Fone)
INSERT INTO tb_item_pedido (pedido_id, produto_id, quantidade, preco_unitario) VALUES (3, 3, 2, 300.00);