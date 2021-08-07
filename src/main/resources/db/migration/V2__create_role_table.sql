CREATE TABLE IF NOT EXISTS role
(
    id   uuid    NOT NULL default uuid_generate_v4(),
    name varchar NOT NULL
);