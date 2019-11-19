DROP TABLE IF EXISTS student;
 
CREATE TABLE student (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  age INT(250) NOT NULL,
  grade INT(250) NOT NULL,
);
 
INSERT INTO student (name, age, grade) VALUES
  ('Dude', 123, 11),
  ('Max', 22, 3),
  ('Sup', 10, 21);