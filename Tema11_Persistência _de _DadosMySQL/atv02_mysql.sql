CREATE DATABASE Loja;

USE loja;

create table produtos(
id INT PRIMARY KEY auto_increment,
nome VARCHAR(100) NOT NULL,
preco DECIMAL(10,2), 
quantidade INT
);

DESCRIBE produtos;

INSERT INTO produtos(nome, preco, quantidade) VALUES ('Biscoito', 5.0, 50);

INSERT INTO produtos(nome, preco, quantidade) VALUES('Bolacha', 2.50, 15), ('Bolo', 15.0, 15), ('Sorvete', 10.0, 10);

SELECT * FROM produtos;

SELECT nome, preco FROM produtos;

SELECT * FROM produtos WHERE preco > 2.50;

SELECT * FROM produtos WHERE nome = 'Bolacha';

UPDATE produtos SET preco = 5.50 WHERE id = 1;

UPDATE produtos SET quantidade = 20 WHERE nome = 'Bolacha';

DELETE FROM produtos WHERE id = 3;
DELETE FROM produtos WHERE id = 2;


SELECT * FROM produtos;
