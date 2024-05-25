CREATE DATABASE ecom_dbms_p1;
USE ecom_dbms_p1;
CREATE TABLE supplier (
    SUPP_ID INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    SUPP_NAME VARCHAR(50) NOT NULL,
    SUPP_CITY VARCHAR(50) NOT NULL,
    SUPP_PHONE VARCHAR(50) NOT NULL
);
create TABLE customer (
	CUS_ID INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    CUS_NAME VARCHAR(20) NOT NULL,
    CUS_PHONE VARCHAR(10) NOT NULL,
    CUS_CITY VARCHAR(30) NOT NULL,
    CUS_GENDER CHAR
);
CREATE TABLE category (
	CAT_ID INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    CAT_NAME VARCHAR(20) NOT NULL
);
CREATE TABLE product (
	PRO_ID INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    PRO_NAME VARCHAR(20) NOT NULL DEFAULT "Dummy",
    PRO_DESC VARCHAR(60),
    CAT_ID INT UNSIGNED,
    FOREIGN KEY (CAT_ID)
		REFERENCES category (CAT_ID)
);
CREATE TABLE supplier_pricing (
	PRICING_ID INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    PRO_ID INT UNSIGNED,
    FOREIGN KEY (PRO_ID)
		REFERENCES product (PRO_ID),
	SUPP_ID INT UNSIGNED,
    FOREIGN KEY (SUPP_ID)
		REFERENCES supplier (SUPP_ID),
	SUPP_PRICE INT UNSIGNED DEFAULT 0
);
CREATE TABLE orders (
	ORD_ID INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    ORD_AMOUNT INT UNSIGNED NOT NULL,
    ORD_DATE DATE NOT NULL,
    CUS_ID INT UNSIGNED,
    FOREIGN KEY (CUS_ID)
		REFERENCES customer (CUS_ID),
	PRICING_ID INT UNSIGNED,
    FOREIGN KEY (PRICING_ID)
		REFERENCES supplier_pricing (PRICING_ID)
);
CREATE TABLE rating (
	RAT_ID INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    ORD_ID INT UNSIGNED,
    FOREIGN KEY (ORD_ID)
		REFERENCES orders (ORD_ID),
	RAT_RATSTARS INT UNSIGNED NOT NULL
);

USE ecom_dbms_p1;
insert into supplier values(1, "Rajesh Retails", "Delhi", 1234567890),
						   (2, "Appario Ltd.", "Mumbai", 2589631470),
                           (3, "Knome products", "Banglore", 9785462315),
                           (4, "Bansal Retails", "Kochi", 8975463285),
                           (5, "Mittal Ltd.", "Lucknow", 7898456532);
                           
insert into customer values(1, "AAKASH", 9999999999, "DELHI", 'M');
insert into customer values(2, "AMAN", 9785463215, "NOIDA", "M");
insert into customer values(3, "NEHA", 9999999999, "MUMBAI", "F");
insert into customer values(4, "MEGHA", 9994562399, "KOLKATA", "F");
insert into customer values(5, "PULKIT", 7895999999, "LUCKNOW", "M");

insert into category values(1, "BOOKS");
insert into category values(2, "GAMES");
insert into category values(3, "GROCERIES");
insert into category values(4, "ELECTRONICS");
insert into category values(5, "CLOTHES");

insert into product values(1, "GTA V", "Windows 7 and above with i5 processor and 8GB RAM", 2);
insert into product values(2, "TSHIRT", "SIZE-L with Black, Blue and White variations", 5);
insert into product values(3, "ROG LAPTOP", "Windows 10 with 15inch screen, i7 processor, 1TB SSD", 4);
insert into product values(4, "OATS", "Highly Nutritious from Nestle", 3);
insert into product values(5, "HARRY POTTER", "Best Collection of all time by J.K Rowling", 1);
insert into product values(6, "MILK", "1L Toned MIlk", 3);
insert into product values(7, "Boat Earphones", "1.5Meter long Dolby Atmos", 4);
insert into product values(8, "Jeans", "Stretchable Denim Jeans with various sizes and color", 5);
insert into product values(9, "Project IGI", "compatible with windows 7 and above", 2);
insert into product values(10, "Hoodie", "Black GUCCI for 13 yrs and above", 5);
insert into product values(11, "Rich Dad Poor Dad", "Written by RObert Kiyosaki", 1);
insert into product values(12, "Train Your Brain", "By Shireen Stephen", 1);

insert into supplier_pricing values(1, 1, 2, 1500);
insert into supplier_pricing values(2, 3, 5, 30000);
insert into supplier_pricing values(3, 5, 1, 3000);
insert into supplier_pricing values(4, 2, 3, 2500);
insert into supplier_pricing values(5, 4, 1, 1000);
insert into supplier_pricing values(6, 12, 2, 780);
insert into supplier_pricing values(7, 12, 4, 789);
insert into supplier_pricing values(8, 3, 1, 31000);
insert into supplier_pricing values(9, 1, 5, 1450);
insert into supplier_pricing values(10, 4, 2, 999);
insert into supplier_pricing values(11, 7, 3, 549);
insert into supplier_pricing values(12, 7, 4, 529);
insert into supplier_pricing values(13, 6, 2, 105);
insert into supplier_pricing values(14, 6, 1, 99);
insert into supplier_pricing values(15, 2, 5, 2999);
insert into supplier_pricing values(16, 5, 2, 2999);

insert into orders values(101, 1500, '2021-10-06', 2, 1);
insert into orders values(102, 1000, '2021-10-12', 3, 5);
insert into orders values(103, 30000, '2021-09-16', 5, 2);
insert into orders values(104, 1500, '2021-10-05', 1, 1);
insert into orders values(105, 3000, '2021-08-16', 4, 3);
insert into orders values(106, 1450, '2021-08-18', 1, 9);
insert into orders values(107, 789, '2021-09-01', 3, 7);
insert into orders values(108, 780, '2021-09-07', 5, 6);
insert into orders values(109, 3000, '2021-01-10', 5, 3);
insert into orders values(110, 2500, '2021-09-10', 2, 4);
insert into orders values(111, 1000, '2021-09-15', 4, 5);
insert into orders values(112, 789, '2021-09-16', 4, 7);
insert into orders values(113, 31000, '2021-09-16', 1, 8);
insert into orders values(114, 1000, '2021-09-16', 3, 5);
insert into orders values(115, 3000, '2021-09-16', 5, 3);
insert into orders values(116, 99, '2021-09-17', 2, 14);

insert into rating values(1, 101, 4);
insert into rating values(2, 102, 3);
insert into rating values(3, 103, 1);
insert into rating values(4, 104, 2);
insert into rating values(5, 105, 4);
insert into rating values(6, 106, 3);
insert into rating values(7, 107, 4);
insert into rating values(8, 108, 4);
insert into rating values(9, 109, 3);
insert into rating values(10, 110, 5);
insert into rating values(11, 111, 3);
insert into rating values(12, 112, 4);
insert into rating values(13, 113, 2); 
insert into rating values(14, 114, 1);
insert into rating values(15, 115, 1);
insert into rating values(16, 116, 0);
    
/* Display the total number of customers based on gender who have placed individual orders of worth at least Rs.3000 */
SELECT 
    c.CUS_GENDER, COUNT(DISTINCT c.CUS_ID)
FROM
    customer AS c
        JOIN
    orders AS o ON c.CUS_ID = o.CUS_ID
WHERE
    ORD_AMOUNT >= 3000
GROUP BY c.CUS_GENDER;

/* Display all the orders along with product name ordered by a customer having Customer_Id=2 */
SELECT 
    o.ORD_ID, p.PRO_NAME
FROM
    orders AS o
        JOIN
    supplier_pricing AS sp ON o.PRICING_ID = sp.PRICING_ID
        JOIN
    product AS p ON sp.PRO_ID = p.PRO_ID
WHERE
    o.CUS_ID = 2;

/* Display the Supplier details who can supply more than one product */
SELECT 
    s.*
FROM
    supplier AS s
WHERE
    s.SUPP_ID IN (SELECT 
            SUPP_ID
        FROM
            supplier_pricing
        GROUP BY SUPP_ID
        HAVING COUNT(DISTINCT PRO_ID) > 1);

USE ecom_dbms_p1;

/* Find the least expensive product from each category and print the table with category id, name, product name and price of the product */
SELECT 
    c.CAT_ID, c.CAT_NAME, p.PRO_NAME, sp.SUPP_PRICE
FROM
    category AS c
        JOIN
    product AS p ON c.CAT_ID = p.CAT_ID
        JOIN
    supplier_pricing AS sp ON p.PRO_ID = sp.PRO_ID
WHERE
    sp.SUPP_PRICE = (SELECT 
            MIN(SUPP_PRICE)
        FROM
            supplier_pricing
                JOIN
            product ON supplier_pricing.PRO_ID = product.PRO_ID
        WHERE
            CAT_ID = c.CAT_ID)
ORDER BY c.CAT_ID;








    
