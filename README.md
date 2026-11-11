# Servlet, Jersey, and Jackson examples

Java web learning project containing servlet examples, Jersey REST resources, and Jackson object-mapping examples.

## Layout

- `src/main/java/api/`: REST resources and person model.
- `src/main/java/json/`: JSON mapping examples.
- `src/main/java/yourServlet.java`: servlet example.
- `pom.xml`: Maven WAR configuration.

## Development

Import `pom.xml` into a Java IDE. The project uses the older `javax.servlet` APIs and needs a compatible servlet container for deployment. Review the configured dependency and compiler versions before building with a current JDK.

The Maven packaging command is `mvn package`; it has not been verified during this documentation update.
