<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Book Management System</title>
</head>
<body>
    <h1>Book Management System</h1>
    
    <h3>Add a New Book</h3>
    <form action="AddBookServlet" method="POST">
        <label for="name">Book Name:</label>
        <input type="text" id="name" name="name" required><br><br>
        <label for="isbn">ISBN:</label>
        <input type="text" id="isbn" name="isbn" required><br><br>
        <input type="submit" value="Add Book">
    </form>

    <h3>Delete a Book</h3>
    <form action="DeleteBookServlet" method="POST">
        <label for="deleteIsbn">ISBN:</label>
        <input type="text" id="deleteIsbn" name="isbn" required><br><br>
        <input type="submit" value="Delete Book">
    </form>

<h3>Update a Book</h3>
<form action="UpdateBookServlet" method="POST">
    <label for="oldIsbn">Old ISBN:</label>
    <input type="text" id="oldIsbn" name="oldIsbn" required><br><br>
    <label for="newName">New Name:</label>
    <input type="text" id="newName" name="newName" required><br><br>
    <label for="newIsbn">New ISBN:</label>
    <input type="text" id="newIsbn" name="newIsbn" required><br><br>
    <input type="submit" value="Update Book">
</form>

    <h3>List All Books</h3>
    <form action="ListBooksServlet" method="GET">
        <input type="submit" value="List Books">
    </form>
</body>
</html>
