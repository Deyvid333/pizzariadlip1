USE master if exists (select * FROM SYS.databases WHERE name='pizariad_db')
 
DROP DATABASE pizzariad_db

GO
 
CREATE DATABASE pizzariad

GO
 
USE pizzariad_db

GO

CREATE TABLE Categoria (

  id bigint NOT NULL IDENTITY (1,1) PRIMARY KEY,

  nome VARCHAR (100) NOT NULL,

  descricap VARCHAR (100) NOT NULL,

  cod_status BIT NOT NULL
 
  )
 
CREATE TABLE Produto (

  id BIGINT NOT NUll IDENTITY (1,1) PRIMARY KEY,

  nome VARCHAR (100) NOT NULL,

  tipo VARCHAR (45) NULL,

  descricao VARCHAR (250) NULL, 

  valor_compra DECIMAL (5,2) NULL,

  valor_venda DECIMAL (5,2) NULL,

  quantidade_estoque INT NULL,

  cod_status BIT NOT NULL,

  categoria_id BIGINT NOT NULL,

  CONSTRAINT fk_produto_categoria_id FOREIGN KEY (categoria_id) REFERENCES Categoria (id)
 
)
 
CREATE TABLE Usuario ( 

  id BIGINT NOT NULL IDENTITY (1,1) PRIMARY KEY, 

  nome VARCHAR (100) NULL,

  cpf VARCHAR (15) NULL,

  tipo_usuario VARCHAR (45) NOT NULL, 

  EMAIL VARCHAR (45) NOT NULL,

  SENHA VARCHAR (20) NOT NULL,

  SEXO VARCHAR (20) NOT NULL,

  LOGRADURO VARCHAR (45) NULL,

  CEP VARCHAR (10) NULL,

  BAIRRO VARCHAR (45) NULL,

  CIDADE VARCHAR (45) NULL,

  UF CHAR (2),

  COD_STATUS BIT NOT NULL,
 
)
 
CREATE TABLE Telefone (

  ID BIGINT NOT NULL IDENTITY (1,1) PRIMARY KEY,

  DDD VARCHAR (5) NOT NULL,

  NUMERO VARCHAR (15) NOT NULL,

  COD_STATUS BIT NOT NULL, 

  USUARIO_ID BIGINT NOT NULL, 

  CONSTRAINT fk_telefone_usuario_id FOREIGN KEY (usuario_id) REFERENCES Usuario(id)
 
  )
 
CREATE TABLE Pedido (

  ID BIGINT NOT NULL IDENTITY (1,1) PRIMARY KEY,

  valor_pedido DECIMAL(5,2) NULL,

  data_hora_pedido DATETIME2 NOT NULL,

  data_hora_entrega DATETIME2 NULL, 

  status VARCHAR(20) NOT NULL,

  COD_STATUS BIT NOT NULL, 

  CLIENTE_ID BIGINT NOT NULL, 

  CONSTRAINT fk_telefone_usuario_id FOREIGN KEY (cliente_id) REFERENCES Usuario(id)

)
 
CREATE TABLE ItemPedido (

  id BIGINT NOT NUll IDENTITY (1,1) PRIMARY KEY,

  valor_unitario DECIMAL (5,2) NULL,

  quantidade_estoque INT NULL,

  cod_status BIT NOT NULL,

  produto_ID BIGINT NOT NULL,

  categoria_id BIGINT NOT NULL,

  CONSTRAINT fk_itemPedido_produto_id FOREIGN KEY (produto_ID) REFERENCES produto (id),

  CONSTRAINT fk_itemPedido_pedido_id FOREIGN KEY (pedido_id) REFERENCES Pedido (id),

  )
 

