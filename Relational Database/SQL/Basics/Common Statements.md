# Common Statements And Clauses

> ### SELECT & FROM

- SELECT indicates which column(s) we want to be given the data for.

- FROM specifies from which table(s) we want to select the columns.

* If we want to be provided with the data from all columns in the table we use "\*".

* it is common and best practice to capitalize all SQL commands, like SELECT and FROM, and keep everything else in your query lower case.

* It is common to use underscores and avoid spaces in column names.

* It is considered best practice to put a semicolon at the end of each statement, which also allows us to run multiple queries at once if our environment allows this.

> ### LIMIT

- The LIMIT statement is useful when we want to see just the first few rows of a table.

- This can be much faster for loading than if we load the entire dataset.

- The LIMIT command is always the very last part of a query.

> ### ORDER BY

- The ORDER BY statement allows us to sort our results using the data in any column.

- Using ORDER BY in a SQL query only has temporary effects, for the results of that query.

- The ORDER BY statement always comes in a query after the SELECT and FROM statements, but before the LIMIT statement.

- DESC can be added after the column in your ORDER BY statement to sort in descending order, as the default is to sort in ascending order.

- When we provide a list of columns in an ORDER BY command, the sorting occurs using the leftmost column in our list first, then the next column from the left, and so on.

> ### WHERE

- Using the WHERE statement, we can display subsets of tables based on conditions that must be met.

- we can also think of the WHERE command as filtering the data.

- Common operators that are useful with the WHERE' statement.

  - ">" (greater than)
  - "<" (less than)
  - ">=" (greater than or equal to)
  - "<=" (less than or equal to)
  - "=" (equal to)
  - "!=" (not equal to)

- The WHERE statement can also be used with non-numeric data.

- Commonly when we are using WHERE with non-numeric data fields, we use the LIKE, NOT, or IN operators.

> ### Derived Columns

- Creating a new column that is a combination of existing columns is known as a derived column (or "calculated" or "computed" column).

- Usually we want to give a name, or "alias," to our new column using the AS keyword.

- This derived column, and its alias, are generally only temporary, existing just for the duration of our query.

- While using arithmetic operators to generate derived column the operations follow PEMDAS rule (Same as BODMAS – Brackets Order Division Multiplication Addition and Subtraction).
  - P – Parentheses [{()}]
  - E – Exponents (Powers and Roots)
  - MD- Multiplication and Division (left to right) (× and ÷)
  - AS – Addition and Subtraction (left to right) (+ and -)

> ### Logical Operators

- **_LIKE_**
  - Allows us to perform operations similar to using WHERE and =, but for cases when we might not know exactly what we are looking for.
  - The LIKE operator is extremely useful for working with text.
  - The LIKE operator is frequently used with %.
  - we will need to use single quotes for the text we pass to the LIKE operator, because of this lower and uppercase letters are not the same within the string.

```sql
SELECT column1, column2, ...
FROM table_name
WHERE columnN LIKE pattern;
```

- **_IN_**
  - Allows us to perform operations similar to using WHERE and =, but for more than one condition.
  - The IN operator is useful for working with both numeric and text columns.
  - This operator allows us to use an =, but for more than one item of that particular column.

```sql
SELECT column_name(s)
FROM table_name
WHERE column_name IN (value1, value2, ...);

SELECT column_name(s)
FROM table_name
WHERE column_name IN (SELECT STATEMENT);
```

- **_NOT_**
  - Used with IN and LIKE to select all of the rows NOT LIKE or NOT IN a certain condition.
  - By specifying NOT LIKE or NOT IN, we can grab all of the rows that do not meet a particular criteria.
  - The NOT operator is an extremely useful operator for working with IN and NOT operator.

```sql
SELECT column1, column2, ...
FROM table_name
WHERE NOT condition;

SELECT * FROM Customers
WHERE Country='Germany' AND (City='Berlin' OR City='München');
```

- **_AND & BETWEEN_**

  - Allow us to combine operations where all combined conditions must be true.
  - The AND operator is used within a WHERE statement to consider more than one logical clause at a time.
  - Sometimes we can make a cleaner statement using BETWEEN than we can using AND.

- **_OR_**
  - Allows us to combine operations where at least one of the combined conditions must be true.
  - LIKE, IN, NOT, AND, and BETWEEN logic can all be linked together using the OR operator.

```sql
SELECT column1, column2, ...
FROM table_name
WHERE condition1 OR condition2 OR condition3 ...;

SELECT * FROM Customers
WHERE Country='Germany' OR Country='Spain';
```
