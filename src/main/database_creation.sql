CREATE DATABASE IF NOT EXISTS adlister_db;

DROP DATABASE adlister_db;


use adlister_db;

CREATE TABLE users (
    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    username VARCHAR(50) NOT NULL,
    email  VARCHAR(100) NOT NULL,
    password TEXT NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE ads (
    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    user_id INT UNSIGNED NOT NULL,
    title  VARCHAR(100) NOT NULL,
    description TEXT NOT NULL,
    PRIMARY KEY (id),
        CONSTRAINT fk_user FOREIGN KEY (user_id)
        REFERENCES users(id)
);

INSERT INTO users (id, username, email, password)
VALUES (1, 'Joshua', 'joshus@iccc.com', 'pickles');

INSERT INTO ads (id, user_id, title, description)
VALUES (1, 1, 'playstation 3', 'slightly used playstation'),
 (2, 1, 'lawn mower', 'push lawnmower');

