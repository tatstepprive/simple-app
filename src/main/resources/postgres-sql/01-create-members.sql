-- POSTGRES 

CREATE TABLE member
(
    id SERIAL PRIMARY KEY,
    last_name character varying(255) NOT NULL,
    first_name character varying(255) NOT NULL
);


CREATE INDEX member_last_name_idx ON member (last_name);

