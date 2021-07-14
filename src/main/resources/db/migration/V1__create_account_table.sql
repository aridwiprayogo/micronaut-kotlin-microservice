create extension if not exists "uuid-ossp";

create table Account (
    id uuid not null default uuid_generate_v4(),
    username varchar not null,
    password varchar not null,
    email varchar not null,
    role varchar not null,
    created_at timestamp not null default now()
);

ALTER TABLE Account ADD PRIMARY KEY id;