--criando tabela exemplo
CREATE TABLE pessoa
( cd_pessoa     INTEGER,
  nm_pessoa     VARCHAR(20),
  ds_email      VARCHAR(50),
  dt_nascimento DATE DEFAULT '2023/10/30',
  PRIMARY KEY (cd_pessoa),
  UNIQUE KEY  (nm_pessoa)
);

-- inserindo dados na tabela sem especificar as colunas
INSERT INTO pessoa VALUES
( 1, 'Pessoa 1', 'pessoa1@email.com', '2020/01/01');

-- inserindo dados na tabela especificando as colunas
INSERT INTO pessoa (cd_pessoa, nm_pessoa, dt_nascimento)
				VALUES (2, 'pessoa 2', '2020/01/01');
								
-- inserindo dados na tabela especificando as colunas - default
INSERT INTO pessoa (cd_pessoa, nm_pessoa)
				VALUES (3, 'pessoa 3');
				
INSERT INTO pessoa (cd_pessoa, nm_pessoa, ds_email)
				VALUES (4, 'pessoa 4', 'pessoa4@email.com');

-- seleção básica de dados da tabela "pessoa"
SELECT * FROM pessoa;

-- descreve a estrutura da tabela
DESC pessoa;

-- alterando a coluna ds_email para "not null"
ALTER TABLE pessoa
MODIFY COLUMN ds_email VARCHAR(50) NOT NULL;

-- alterando dados de e-mail de UM registro
UPDATE pessoa 
SET ds_email = 'pessoa3@email.com'
WHERE cd_pessoa = 3;

-- excluindo UM registro
DELETE FROM pessoa
WHERE cd_pessoa = 1;

-- alterando a tabela para que a PK seja auto-incrementável
ALTER TABLE pessoa 
MODIFY COLUMN cd_pessoa INTEGER NOT NULL AUTO_INCREMENT;

INSERT INTO pessoa (nm_pessoa, ds_email)
				VALUES ('pessoa N', 'pessoaN@email.com');

-- criando uma tabela a partir de outra existente
CREATE TABLE pessoa2
AS
SELECT * FROM pessoa
WHERE 1 = 0;

-- inserindo dados de uma tabela a partir de outra
INSERT INTO pessoa2
SELECT * FROM pessoa;

------------------------------------------------------------------------------

INSERT INTO pessoa (nm_pessoa, ds_email, dt_nascimento)
				VALUE ('José Carlos', 'jc@email.com', '2023/01/01');
			
INSERT INTO pessoa (nm_pessoa, ds_email, dt_nascimento)
				VALUE ('Marina Sell', 'msell@gmail.com', '2022/10/01');
				
INSERT INTO pessoa (nm_pessoa, ds_email, dt_nascimento)
				VALUE ('José Buy', 'jbuy@gmail.com', '1999/12/31');

------------------------------------------------------------------------------