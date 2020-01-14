INSERT INTO `events` (`name`, `description`, `datetime_of_event`) VALUES
('Opener festival 2020', 'A music festival which takes place on the North coast of Poland, in Gdynia. It is considered one of the biggest and most popular annual music festivals held in Poland.', '2020-07-01 18:00:00'),
('Tomorrowland festival 2020', 'A Belgian electronic dance music festival held in Boom, Belgium. Tomorrowland was first held in 2005 and has since become one of the world/''s largest and most notable music festivals.', '2020-07-17 20:00:00');

INSERT INTO `tickets` (`event_id`, `price`, `max_tickets_qty`) VALUES
(1, 100, 1000),
(2, 120, 2500);
