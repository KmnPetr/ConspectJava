CREATE TABLE Item (
                      id int GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
                      person_id int REFERENCES Person(id) ON DELETE SET NULL,
                      itemName varchar(100) NOT NULL
);