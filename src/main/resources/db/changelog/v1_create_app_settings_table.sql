CREATE SEQUENCE IF NOT EXISTS hibernate_sequence START WITH 1 INCREMENT BY 1;

CREATE TABLE app_settings
(
    id          INTEGER NOT NULL,
    msg_path    VARCHAR(255),
    time_out    INTEGER NOT NULL,
    work_status BOOLEAN NOT NULL,
    CONSTRAINT pk_appsettings PRIMARY KEY (id)
);