CREATE TABLE roles_users
(
    user_id UUID NOT NULL,
    role_id UUID NOT NULL,
    PRIMARY KEY (user_id, role_id),
    FOREIGN KEY (user_id) REFERENCES account (id),
    FOREIGN KEY (role_id) REFERENCES role (id)
);
