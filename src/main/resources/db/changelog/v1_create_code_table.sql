CREATE TABLE code
(
    id                    UUID NOT NULL,
    number                VARCHAR(255),
    date_added TIMESTAMP WITHOUT TIME ZONE,
    date_of_last_activity TIMESTAMP WITHOUT TIME ZONE,
    CONSTRAINT pk_code PRIMARY KEY (id)
);