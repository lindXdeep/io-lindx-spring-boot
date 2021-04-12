SHOW databases;
USE engdb;
CREATE TABLE users (
  `id` BIGINT(20) NOT NULL,
  `email` VARCHAR(255) NOT NULL,
  `password` VARCHAR(255) NOT NULL,
  PRIMARY kEY(id),
  UNIQUE index `email_UNIQUE` (`email` ASC) VISIBLE
);

drop table users;
