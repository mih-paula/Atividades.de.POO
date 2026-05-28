create database escola;

use escola;

create table alunos(
id int primary key auto_increment,
nome varchar(100), 
curso varchar(50),
nota int
);

DESCRIBE alunos;

INSERT INTO alunos(nome, curso, nota) VALUES('Emily', 'Engenharia de computação', 10);
INSERT INTO alunos(nome, curso, nota) VALUES('Keven', 'Engenharia de computação', 6), ('Julia', 'Engenharia de materias', 7), ('João', 'Engenharia de minas', 5 );

SELECT * FROM alunos;

SELECT nome, curso FROM alunos;

SELECT * FROM alunos WHERE nota >= 7;

SELECT * FROM alunos WHERE nome = 'João';

UPDATE alunos SET nota = 8 WHERE id = 3;

UPDATE alunos SET curso = 'Engenharia de minas' WHERE id = 4;

SELECT * FROM alunos;

DELETE FROM alunos WHERE id = 5 ;
DELETE FROM alunos WHERE id = 6 ;
DELETE FROM alunos WHERE id = 7 ;

SELECT * FROM alunos;

DELETE FROM alunos WHERE id = 6;
DELETE FROM alunos WHERE id = 7;

SELECT * FROM alunos;




