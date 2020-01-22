## HowToGraph - GraphQL with Sangria Tutorial codebase

A code for GraphQL-Sangria Tutorial. Visit [HowtoGraphql.com](http://howtographql.com) to learn more.  



### Explanation
Setup the project, please read: https://www.howtographql.com/graphql-scala/1-getting-started/
sbt new marioosh/howtographql-scala-sangria.g8

First query:
https://www.howtographql.com/graphql-scala/2-preparing-first-query/

```bash
sbt run
```


### Running the example

```bash
sbt ~reStart
```
If the website will not be available the lessons are stored in the PDF files.

SBT will automatically compile and restart the server whenever the source code changes.

After the server is started you can run queries interactively using [GraphiQL](https://github.com/graphql/graphiql) by opening [http://localhost:8080](http://localhost:8080) in a browser.

Use different PORT if you've changed it int he configuration.

### Database Configuration

This example uses an in-memory [H2](http://www.h2database.com/html/main.html) SQL database. The schema and example data will be re-created every time server starts.

If you would like to change the database configuration or use a different database, then please update `src/main/resources/application.conf`.
