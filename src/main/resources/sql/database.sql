-- -----------------------------------------------------
-- Schema ticket_selling_platform
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `ticket_selling_platform` DEFAULT CHARACTER SET utf8 ;
USE `ticket_selling_platform` ;
-- -----------------------------------------------------
-- Table `ticket_selling_platform`.`users`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ticket_selling_platform`.`users` (
    `id` INT AUTO_INCREMENT PRIMARY KEY COMMENT 'Primary key of the table',
    `first_name` VARCHAR(255) NOT NULL COMMENT 'Firts name',
    `last_name` VARCHAR(255) NOT NULL COMMENT 'Last name',
    `email` VARCHAR(255) UNIQUE NOT NULL COMMENT 'Address email',
    `password` VARCHAR(60) NOT NULL COMMENT 'Password',
	`created_at` TIMESTAMP DEFAULT NOW() COMMENT 'Date of creation.')
ENGINE = InnoDB
COMMENT = 'Table containing user information.' ;
-- -----------------------------------------------------
-- Table `ticket_selling_platform`.`events`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ticket_selling_platform`.`events` (
  `id` INT AUTO_INCREMENT PRIMARY KEY COMMENT 'Primary key of the table',
  `name` VARCHAR(45) NULL COMMENT 'Event name.',
  `description` TEXT NULL COMMENT 'Event description.',
  `datetime_of_event` DATETIME NOT NULL COMMENT 'Date and time of the event.',
  `created_at` TIMESTAMP DEFAULT NOW() COMMENT 'Date of creation.')
ENGINE = InnoDB
COMMENT = 'Table containing events information.' ;
-- -----------------------------------------------------
-- Table `ticket_selling_platform`.`tickets`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ticket_selling_platform`.`tickets` (
  `id` INT AUTO_INCREMENT PRIMARY KEY COMMENT 'Primary key of the table',
  `event_id` INT NOT NULL COMMENT 'Event id.',
  `price` VARCHAR(45) NULL COMMENT 'Event price.',
  `max_tickets_qty` INT NOT NULL COMMENT 'Max quantity of tickets for event',
  `created_at` TIMESTAMP DEFAULT NOW() COMMENT 'Date of creation.')
ENGINE = InnoDB
COMMENT = 'Table containing price information.';
-- -----------------------------------------------------
-- Table `ticket_selling_platform`.`reservations`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ticket_selling_platform`.`reservations` (
  `event_id` INT NOT NULL COMMENT 'Event id.',
  `ticket_id` INT NOT NULL COMMENT 'Price id.',
  `user_id` INT NOT NULL COMMENT 'User id.',
  `quantity` INT NOT NULL COMMENT 'Quantity of tickets.',
  FOREIGN KEY(event_id) REFERENCES events(id),
  FOREIGN KEY(ticket_id) REFERENCES tickets(id),
  FOREIGN KEY(user_id) REFERENCES users(id),
  PRIMARY KEY(event_id, user_id) COMMENT 'One the one event user can go only once.', 
  created_at TIMESTAMP DEFAULT NOW() COMMENT 'Date of creation.')
ENGINE = InnoDB
COMMENT = 'Table containing reservation information.';