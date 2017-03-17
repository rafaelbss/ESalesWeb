CREATE TABLE product_type (
    code BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE product (
    code BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
    sku VARCHAR(50) NOT NULL,
    name VARCHAR(80) NOT NULL,
    description TEXT NOT NULL,
    value DECIMAL(10, 2) NOT NULL,
    commission DECIMAL(10, 2) NOT NULL,
    origin VARCHAR(50) NOT NULL,
    code_product_type BIGINT(20) NOT NULL,
    FOREIGN KEY (code_product_type) REFERENCES product_type(code)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO product_type VALUES (0, 'Book');
INSERT INTO product_type VALUES (0, 'Computer');