create extension if not exists "uuid-ossp";

create table account (
    id uuid not null default uuid_generate_v4(),
    username varchar not null,
    password varchar not null,
    email varchar not null,
    role varchar not null,
    created_at timestamp not null default now(),
    updated_at timestamp null
);

ALTER TABLE account ADD PRIMARY KEY (id);
CREATE INDEX IF NOT EXISTS username_idx ON account (username);