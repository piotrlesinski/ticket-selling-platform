INSERT INTO tickets (event_id, price, max_available_qty) VALUES 
(1, 100, 1000),
(2, 120, 2500);

INSERT INTO events (name, description, datetime_of_event, ticket_id) VALUES 
('Opener festival 2020', 'A music festival which takes place on the North coast of Poland, in Gdynia. It is considered one of the biggest and most popular annual music festivals held in Poland.', '2020-07-01 18:00:00', 1),
('Tomorrowland festival 2020', 'A Belgian electronic dance music festival held in Boom, Belgium. Tomorrowland was first held in 2005 and has since become one of the world/''s largest and most notable music festivals.', '2020-07-17 20:00:00', 2);

INSERT INTO users (first_name, last_name, email, password) VALUES
('Jan', 'Kowalski', 'jan.kowalski@wp.pl', 'password'),
('Jan', 'Nowak', 'jan.nowak@wp.pl', 'password'),
('Pan', 'Tadeusz', 'pan.tadeusz@wp.pl', 'password');

INSERT INTO reservations (event_id, user_id, quantity) VALUES
(1, 1, 1),
(1, 2, 2),
(1, 3, 2),
(2, 2, 2),
(2, 1, 1);