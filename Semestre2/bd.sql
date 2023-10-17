-- Criação da tabela Usuário
CREATE TABLE Usuario (
    ID INT AUTO_INCREMENT PRIMARY KEY,
    Email VARCHAR(255) NOT NULL,
    Nome VARCHAR(255) NOT NULL,
    DataNascimento DATE,
    Genero VARCHAR(50),
    EnderecoCompleto TEXT,
    NumeroTelefone VARCHAR(20),
    TipoUsuario ENUM('Particular', 'Profissional') NOT NULL
);

-- Criação da tabela Anúncio
CREATE TABLE Anuncio (
    ID INT AUTO_INCREMENT PRIMARY KEY,
    Titulo VARCHAR(255) NOT NULL,
    Descricao TEXT,
    Categoria VARCHAR(100) NOT NULL,
    Tipo VARCHAR(100),
    Situacao ENUM('Novo', 'Usado') NOT NULL,
    CEP VARCHAR(10) NOT NULL,
    PrecoVenda DECIMAL(10, 2),
    PrazoValidade DATE,
    Valor DECIMAL(10, 2),
    NivelPrioridade INT,
    Classificacao ENUM('Gratuito', 'Bronze', 'Prata', 'Ouro', 'Outros') NOT NULL,
    UsuarioID INT,
    FOREIGN KEY (UsuarioID) REFERENCES Usuario(ID)
);

-- Criação da tabela Região
CREATE TABLE Regiao (
    ID INT AUTO_INCREMENT PRIMARY KEY,
    NomeRegiao VARCHAR(255) NOT NULL
);

-- Criação da tabela CEPsRegiao
CREATE TABLE CEPsRegiao (
    ID INT AUTO_INCREMENT PRIMARY KEY,
    RegiaoID INT,
    CEP VARCHAR(10) NOT NULL,
    FOREIGN KEY (RegiaoID) REFERENCES Regiao(ID)
);

-- Criação da tabela Mensagem
CREATE TABLE Mensagem (
    ID INT AUTO_INCREMENT PRIMARY KEY,
    RemetenteID INT,
    DestinatarioID INT,
    TextoMensagem TEXT NOT NULL,
    DataHora DATETIME NOT NULL,
    IndicativoLeitura BOOLEAN DEFAULT FALSE,
    AnuncioID INT,
    FOREIGN KEY (RemetenteID) REFERENCES Usuario(ID),
    FOREIGN KEY (DestinatarioID) REFERENCES Usuario(ID),
    FOREIGN KEY (AnuncioID) REFERENCES Anuncio(ID)
);

-- Criação da tabela MotivoExclusao
CREATE TABLE MotivoExclusao (
    ID INT AUTO_INCREMENT PRIMARY KEY,
    AnuncioID INT,
    Motivo VARCHAR(255) NOT NULL,
    DataHoraExclusao DATETIME NOT NULL,
    FOREIGN KEY (AnuncioID) REFERENCES Anuncio(ID)
);
