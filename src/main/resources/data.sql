DELETE FROM user;
INSERT INTO user VALUES (0, unix_timestamp(now()), unix_timestamp(now()), 'john.doe@example.com', 'John', 'Doe', 'user', 'password');
INSERT INTO user VALUES (0, unix_timestamp(now()), unix_timestamp(now()), 'john.doe@example.com', 'John', 'Doe', 'user1', 'password');
INSERT INTO user VALUES (0, unix_timestamp(now()), unix_timestamp(now()), 'john.doe@example.com', 'John', 'Doe', 'user2', 'password');
INSERT INTO user VALUES (0, unix_timestamp(now()), unix_timestamp(now()), 'john.doe@example.com', 'John', 'Doe', 'user3', 'password');