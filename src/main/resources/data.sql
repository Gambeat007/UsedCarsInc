INSERT INTO CUSTOMER (id, name, mail)
VALUES
(1, 'Jan Nowak', 'nowak@usedcars.com'),
(2, 'Łukasz Nowak', 'lukasz.nowak@gmail.com');

INSERT INTO VEHICLE (id, make, model, fuel_type, prod_year, price, customer_id)
VALUES
(1, 'Opel', 'Vectra', 'Gasoline', '1994', '1000.00', 1),
(2, 'Opel', 'Omega', 'Gasoline', '1999', '3000', 1),
(3, 'Honda', 'Accord', 'Gasoline', '2002', '4500', 1),
(4, 'Skoda', 'Superb', 'Diesel', '2018', '32000', 2);