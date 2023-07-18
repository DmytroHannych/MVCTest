CREATE TABLE authe (
  username VARCHAR(45) NOT NULL PRIMARY KEY,
  password VARCHAR(100) NOT NULL,
  role VARCHAR(45) NOT NULL);

INSERT INTO authe (username,password,role) VALUES
('user', '$2a$12$H/8alTqVKQ5Rnr4stdDvd.gP.OlKJ7/AIRCfJmBBnVGcqtge91SKS', 'user')

