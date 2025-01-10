CREATE TABLE connection_properties
(
    id            INTEGER PRIMARY KEY AUTOINCREMENT,
    host_name     TEXT NOT NULL,
    port          TEXT NOT NULL,
    user_name     TEXT NOT NULL,
    password      TEXT NOT NULL,
    database_name TEXT NOT NULL
);
