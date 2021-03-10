DROP DATABASE IF EXISTS movies;
CREATE DATABASE movies;
USE movies;
CREATE TABLE movie (
    id INT NOT NULL AUTO_INCREMENT,
    title VARCHAR(50),
    year INT,
    price DECIMAL(8, 2),
    PRIMARY KEY (id)
);
INSERT INTO movie (title, year, price)
    VALUES ("It's a Wonderful Life",1946 ,14.95);
INSERT INTO movie (title, year, price)
    VALUES ("Young Frankenstein", 1974, 16.95);
INSERT INTO movie (title, year, price)
    VALUES ("Star Wars", 1977,17.95);
INSERT INTO movie (title, year, price)
    VALUES ("The Princess Bride", 1987, 16.95);
INSERT INTO movie (title, year, price)
    VALUES ("Glory", 1989, 14.95);
INSERT INTO movie (title, year, price)
    VALUES ("The Game", 1997, 14.95);
INSERT INTO movie (title, year, price)
    VALUES ("Shakespeare in Love", 1998,19.95);
INSERT INTO movie (title, year, price)
    VALUES ("Zombieland", 2009, 18.95);
INSERT INTO movie (title, year, price)
    VALUES ("The King's Speech", 2010, 17.85);
INSERT INTO movie (title, year, price)
    VALUES ("Star Trek Into Darkness", 2013, 19.95);