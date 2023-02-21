INSERT INTO person (id, FIO, date_of_birth)
VALUES (1, 'John Doe', '1980-01-01'),
       (2, 'Jane Doe', '1985-01-01'),
       (3, 'Bob Smith', '1975-01-01');

INSERT INTO book (id, title, author, year, person_id)
VALUES (1, 'The Great Gatsby', 'F. Scott Fitzgerald', 1925, 1),
       (2, 'To Kill a Mockingbird', 'Harper Lee', 1960, 1),
       (3, 'Pride and Prejudice', 'Jane Austen', 1813, 2),
       (4, 'The Catcher in the Rye', 'J.D. Salinger', 1951, 2),
       (5, '1984', 'George Orwell', 1949, 3),
       (6, 'Animal Farm', 'George Orwell', 1945, 3),
       (7, 'The Lord of the Rings', 'J.R.R. Tolkien', 1954, 3);