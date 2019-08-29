INSERT INTO USER(username, password, enabled)values ('admin', '{noop}admin', true);
INSERT INTO USER(username, password, enabled) values ('user', '{noop}user', true)
INSERT INTO USER_ROLE(username, role) values ('admin', 'ROLE_ADMIN');
INSERT INTO USER_ROLE(username, role) values ('user', 'ROLE_USER');
