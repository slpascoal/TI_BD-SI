/*
    CRIAÇÃO DE TABELAS
*/

CREATE TABLE Usuario (
	Login VARCHAR (20) PRIMARY KEY NOT NULL,
	Senha VARCHAR (20) NOT NULL
);

CREATE TABLE Pessoa (
	ID INT PRIMARY KEY NOT NULL,
	Nome VARCHAR(30),
	Email VARCHAR(30),
	Login VARCHAR(20),
	CONSTRAINT fk_Login FOREIGN KEY (Login) REFERENCES Usuario (Login)
);

CREATE TABLE Operacao (
	SaldoAtual INT,
	ID INT,
	CONSTRAINT fk_INT FOREIGN KEY (ID) REFERENCES Pessoa (ID)
);

CREATE TABLE Receita (
	Valor INT NOT NULL,
	Resumo VARCHAR(100),
	ID INT,
	CONSTRAINT fk_INT FOREIGN KEY (ID) REFERENCES Pessoa (ID)
);

CREATE TABLE Despesa (
	Valor INT NOT NULL,
	Resumo VARCHAR(100),
	ID INT,
	CONSTRAINT fk_INT FOREIGN KEY (ID) REFERENCES Pessoa (ID)
);

CREATE TABLE Transacao (
	Valor INT NOT NULL,
	Resumo VARCHAR(100),
	ID INT,
	CONSTRAINT fk_INT FOREIGN KEY (ID) REFERENCES Pessoa (ID)
);

/*
                            TESTES
*/

INSERT INTO Usuario (Login, senha) VALUES ('LoginTeste', 'SenhaTeste')

select * from Usuario