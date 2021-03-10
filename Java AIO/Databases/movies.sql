USE movies;

-- Basic select statement
SELECT  title, year
FROM movie
ORDER BY year;

SELECT  *
FROM movie
ORDER BY year;

-- Narrowing the query
SELECT  title, year
FROM movie
WHERE year <= 1980
ORDER BY year;

-- Excluding rows
SELECT  title, year
FROM movie
WHERE year < 1970 or year > 1979
ORDER BY year;

-- Singleton selects
SELECT title, year 
FROM movie 
WHERE id = 7;

-- From What Something sounds like
SELECT title, year 
FROM movie
WHERE title lIKE "%princess%"; 

-- Column functions
SELECT COUNT(*), MIN(year) 
FROM movie;

SELECT COUNT(*) 
FROM movie
WHERE  year < 1970;

CREATE TABLE friend(
	lastname VARCHAR(50),
    firstname VARCHAR(50),
    movieid INT
);

INSERT INTO friend (lastname, firstname, movieid)
	values ("Haskell", "Eddie", 3);
INSERT INTO friend (lastname, firstname, movieid)
	values ("Haskell", "Eddie", 5);
INSERT INTO friend (lastname, firstname, movieid)
	values ("Cleaver", "Wally", 9);
INSERT INTO friend (lastname, firstname, movieid)
	values ("Mondello", "Lumpy", 2);
INSERT INTO friend (lastname, firstname, movieid)
	values ("Cleaver", "Wally", 3);

-- Selecting data from more than one table
SELECT lastname, firstname, title
FROM movie, friend
WHERE movie.id = friend.movieid;

SELECT title 
FROM movie, friend
WHERE movie.id = friend.movieid
AND lastname = "Haskell";

-- Avoiding duplicates
-- redundant outputs like below
SELECT lastname, firstname
FROM friend;
-- correct query
SELECT DISTINCT lastname, firstname
FROM friend;

-- Delete statement
DELETE FROM movie WHERE id = 10;

SELECT * FROM movie;

DELETE FROM friend
WHERE lastname = "Haskell";

DELETE FROM movie;

-- Update statement
UPDATE movie SET price = 18.95 WHERE id = 8;

-- Updating more than one columns
UPDATE friend SET lastname = "Bully", firstname = "Big"
WHERE lastname = "Haskell";

UPDATE  movie SET price = price * 1.1;
