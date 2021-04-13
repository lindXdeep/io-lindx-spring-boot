SHOW databases;

USE engdb;

SHOW TABLES;

CREATE TABLE engdb.users(
  `id` BIGINT(24) NOT NULL AUTO_INCREMENT,
  `email` VARCHAR(255) NOT NULL,
  `password` VARCHAR(256) NOT NULL,

  PRIMARY KEY(`id`),
  UNIQUE INDEX `email_UNIQUE` (`email` ASC) VISIBLE
);

CREATE TABLE roles(
  `id` BIGINT(24) NOT NULL AUTO_INCREMENT,
  `role_name` VARCHAR(50) NOT NULL,

  PRIMARY KEY(`id`),
  UNIQUE INDEX `role_name_UNIQUE` (`role_name` ASC) VISIBLE
);

CREATE TABLE user_roles(
  user_id BIGINT(24) NOT NULL,
  role_id BIGINT(24) NOT NULL,

  FOREIGN KEY(user_id) REFERENCES users(id),
  FOREIGN KEY(role_id) REFERENCES roles(id),

  UNIQUE (user_id, role_id)
)

INSERT INTO users(`email`, `password`)
  VALUES('Tom', '12345' );

INSERT INTO roles(`role_name`)
  VALUES("ADMIN");

INSERT INTO user_roles(`user_id`, `role_id`)
  VALUES(1,1);


DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS roles;
DROP TABLE IF EXISTS user_roles;

DESCRIBE `users`;
DESCRIBE `roles`;
DESCRIBE `user_roles`;

SELECT * FROM `users`;
SELECT * FROM `roles`;
SELECT * FROM `user_roles`;

TRUNCATE `user_roles`;
TRUNCATE `users`;
TRUNCATE `roles`;

