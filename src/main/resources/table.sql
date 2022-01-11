DROP TABLE IF EXISTS product CASCADE;
DROP SEQUENCE IF EXISTS global_seq;

CREATE SEQUENCE global_seq START WITH 1;

CREATE TABLE product(
	id INTEGER PRIMARY KEY DEFAULT nextval('global_seq'),
	name VARCHAR NOT NULL,
	brand VARCHAR NOT NULL,
	type VARCHAR NOT NULL,
	price INTEGER NOT NULL
    );

INSERT INTO public.product(name, brand, type, price) VALUES ('Пена для умывания','Art&Fact', 'Cleansing', 200);
INSERT INTO public.product(name, brand, type, price) VALUES ('Крем для рук','Laboratorium', 'Moistening', 450);
INSERT INTO public.product(name, brand, type, price) VALUES ('Тоник','Lush', 'Moistening', 600);
INSERT INTO public.product(name, brand, type, price) VALUES ('Парфюм','Lush', 'Perfume', 1000);
INSERT INTO public.product(name, brand, type, price) VALUES ('Маска для лица','Onme', 'Recovery', 1400);