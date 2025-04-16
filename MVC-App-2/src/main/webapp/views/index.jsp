<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>My Project</title>
</head>
<body>
    <h3>Book Details</h3>
    <form action="book" method="get">
        Book ID: <input type="text" name="id">
        <input type="submit" value="Search"/>
    </form>
    <hr/>
    <!-- Display error message if present -->
    <p>${errorMessage}</p>
    
    Book Id: ${book.bookId}<br/>
    Book Name: ${book.bookName}<br/>
    Book Price: ${book.bookPrice}<br/>
    Book Author: ${book.bookAuthor}<br/>
    ${error}
</body>
</html>
