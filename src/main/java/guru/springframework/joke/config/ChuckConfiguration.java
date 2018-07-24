package guru.springframework.joke.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// We still have the private final property in JokeServiceImpl, but we replaced the constructor so that it gets wired up
// and our application cotinues as before. This is a little bit cleaner implementation. Even though ChuckNorrisQuotes is
// a hard class, this is a good situation where we are using a Java Configuration because this class is coming from an
// external jar and you will use this a lot when you are programming in the Spring Framework when you are dealing with
// external jars from an open source project or possibly from another team that you don't control the source code. So
// you bring in another dependency but you want to utilize that dependency within your application.
@Configuration
public class ChuckConfiguration {

    @Bean
    public ChuckNorrisQuotes chuckNorrisQuotes() {
        return new ChuckNorrisQuotes();
    }
}
