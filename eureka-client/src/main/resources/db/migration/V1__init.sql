CREATE TABLE products
(
    id          bigserial PRIMARY KEY,
    article     varchar(20)  not null,
    title       varchar(255) not null,
    description varchar(1000),
    price       int           default 0,
    avg_score   numeric(2, 1) default 5,
    created_at  timestamp     default current_timestamp,
    updated_at  timestamp     default current_timestamp
);

INSERT INTO products (article, title, price, description)
VALUES ('12344', 'product_1', 1, 'Description of product 1'),
       ('54345', 'product_2', 2, 'Description of product 2'),
       ('32455', 'product_3', 3, 'Description of product 3'),
       ('23456', 'product_4', 4, 'Description of product 4'),
       ('84676', 'product_5', 5, 'Description of product 5'),
       ('12256', 'product_6', 6, 'Description of product 6'),
       ('67544', 'product_7', 7, 'Description of product 7'),
       ('55637', 'product_8', 8, 'Description of product 8'),
       ('88766', 'product_9', 9, 'Description of product 9'),
       ('13434', 'product_10', 10, 'Description of product 10'),
       ('44532', 'product_11', 11, 'Description of product 11'),
       ('86788', 'product_12', 12, 'Description of product 12'),
       ('00986', 'product_13', 13, 'Description of product 13'),
       ('11467', 'product_14', 14, 'Description of product 14'),
       ('47367', 'product_15', 15, 'Description of product 15'),
       ('27654', 'product_16', 16, 'Description of product 16'),
       ('98987', 'product_17', 17, 'Description of product 17'),
       ('92347', 'product_18', 18, 'Description of product 18'),
       ('83867', 'product_19', 19, 'Description of product 19'),
       ('33478', 'product_20', 20, 'Description of product 20');
