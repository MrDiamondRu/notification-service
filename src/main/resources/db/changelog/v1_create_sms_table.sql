CREATE TABLE sms
(
    id     UUID    NOT NULL,
    phone  VARCHAR(255),
    text   VARCHAR(255),
    flash  INTEGER NOT NULL,
    date   TIMESTAMP WITHOUT TIME ZONE,
    status BOOLEAN NOT NULL,
    spam   BOOLEAN NOT NULL,
    code   VARCHAR(255),
    CONSTRAINT pk_sms PRIMARY KEY (id)
);