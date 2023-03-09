insert into onl_jee_w_17.roles(name) values ('ADMIN'), ('USER');

insert into onl_jee_w_17.users(first_name, last_name, email, password) values('Jan', 'Kowalski', 'jan.kowalski@coderslab.pl', '{bcrypt}$2a$12$J1rA0tGIbtXKK9Z.oyXDheyz2s9QDsfH77pJQ70RygvIehNJlRPzO');

insert into onl_jee_w_17.users_roles(user_entity_id, roles_id) values (1, 1);