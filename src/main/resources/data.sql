--DROP TABLE users IF EXISTS;

CREATE TABLE users (
  id INTEGER GENERATED BY DEFAULT AS IDENTITY(START WITH 100, INCREMENT BY 1) PRIMARY KEY,
  name VARCHAR(30),
  age INTEGER,
  neptunKod VARCHAR(30)
);

INSERT INTO users (name, age, neptunKod) VALUES ('mkyong', 25, 'KKF543');
INSERT INTO users (name, age, neptunKod) VALUES ('alex', 30, 'J43LTM');
INSERT INTO users (name, age, neptunKod) VALUES ('joel', 18, 'A1A2A3');