create database pessoa;

Use pessoa;

create table pessoas(
id INT PRIMARY KEY auto_increment,
nome VARCHAR(100) NOT NULL,
idade INT, 
email VARCHAR(50)
);

Describe pessoas;

INSERT INTO pessoas (nome, idade, email) VALUES ('Emily', 21, 'emilepaula@gmail.com');


SELECT * FROM pessoas; 

SELECT nome, idade FROM pessoas;

SELECT * FROM pessoas WHERE nome = 'Emily';

UPDATE pessoas SET nome = 'Emily Cristine' WHERE id = 1;

SELECT * FROM pessoas;


DELETE from pessoas WHERE id=1;  

SELECT * FROM pessoas;

