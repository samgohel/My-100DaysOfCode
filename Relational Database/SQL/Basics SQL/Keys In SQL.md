# SQL KEYS

> ### Primary Key (PK)

- **_Uniquely_** identifies each record in a table.

- Must contain UNIQUE values, and cannot contain **_NULL_** values.

- A table can have only **_ONE primary key_**.

* We Can create table with multiple fields as primary key.

- When multiple columns are used as a primary key, it is known as **_composite primary key_**.

- Primary key enforces the entity **_integrity_** of the table.

- The main advantage of this **_uniqueness_** is that we get fast access.

> ### Foreign Key (FK)

- The FOREIGN KEY constraint is used to prevent actions that would destroy links between tables.

- A FOREIGN KEY is a field (or collection of fields) in one table, that refers to the PRIMARY KEY in another table.

- The table with the foreign key is called the **_child table_**, and the table with the primary key is called the referenced or **_parent table_**.

- The FOREIGN KEY constraint prevents invalid data from being inserted into the foreign key column, because it has to be one of the values contained in the parent table.

> ### Unique Key in SQL

- The UNIQUE constraint ensures that all values in a column are different.

- A unique key is a set of one or more than one fields/columns of a table that uniquely identify a record in a database table.

- It can accept only one null value and it cannot have duplicate values.

- The unique key and primary key both provide a guarantee for uniqueness for a column or a set of columns.

- There is an automatically defined unique key constraint within a primary key constraint.

- There may be many unique key constraints for one table, but only one PRIMARY KEY constraint for one table.

* Unique key is used because it creates a non-clustered index by default.
