CREATE TABLE if NOT EXISTS dog (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    breed VARCHAR(60) NOT NULL,
    size INT NOT NULL,
    activity INT NOT NULL,
    coat_care INT NOT NULL
);