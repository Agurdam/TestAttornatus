INSERT INTO tb_person (name, birth) VALUES ('teste 1', '1995-01-01');
INSERT INTO tb_person (name, birth) VALUES ('teste 2', '2000-01-10');

INSERT INTO tb_address (neighborhood, street, number, city, CEP, main_address, person_id)
VALUES ('Bairro Teste', 'Rua Teste', '123', 'Cidade Teste', '12345-678', TRUE, 1);

INSERT INTO tb_address (neighborhood, street, number, city, CEP, main_address, person_id)
VALUES('Bairro Teste 2', 'Rua Teste 2', '321', 'Cidade Teste 2', '12345-678', FALSE, 1);

INSERT INTO tb_address (neighborhood, street, number, city, CEP, main_address, person_id)
VALUES('Bairro Teste 3', 'Rua Teste 3', '123', 'Cidade Teste 3', '12345-678', TRUE, 2);

INSERT INTO tb_address (neighborhood, street, number, city, CEP, main_address, person_id)
VALUES('Bairro Teste 4', 'Rua Teste 4', '321', 'Cidade Teste 4', '12345-678', FALSE, 2);






