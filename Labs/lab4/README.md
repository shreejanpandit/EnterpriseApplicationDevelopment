# Lab 4

## Objective

- To create a form using java servlet

## Theory

- `Java Servlet` is a Java programming language class that extends the capabilities of a server hosting the Java-based web application. It enables a Java-based web application to dynamically generate HTML, XML, or any other type of content that can be sent to a client's web browser.
- Java Servlets can be used to process requests and generate dynamic content, such as responding to an HTML form, accessing a database, or sending and receiving cookies.

## Steps

- Create a `dynamic web project` inside the **Eclipse IDE**. *Note: check the generate web xml file when creating the project*
- Create a package for my demo I have created a package as `lab`.
- Create a `java file` inside the package.
- Create a class that extends `HttpServlet` from `jakarta.servlet.http` package
- Create a `doGet` function with `HttpServletRequest and HttpServletResponse` as argument.
- Create a `PrintWriter` using the `HttpServletResponse` argument's `getWriter()` function and use the `PrintWriter` to print html tags.
- Add a annotation `@WebServlet("/somepath")` to create a web xml info of the class.
- Run the file or the whole project.
