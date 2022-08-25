import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterTest {
    @Test
    public void addPoster() {
        String movie1 = "movie1";
        String movie2 = "movie2";
        String movie3 = "movie3";
        String movie4 = "movie4";
        String movie5 = "movie5";

        Poster poster = new Poster();

        poster.addPoster(movie1);
        poster.addPoster(movie2);
        poster.addPoster(movie3);
        poster.addPoster(movie4);
        poster.addPoster(movie5);

        String[] expected = {
                movie1,
                movie2,
                movie3,
                movie4,
                movie5,
        };
        String[] actual = poster.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void lastPoster() {

        String movie1 = "movie1";
        String movie2 = "movie2";
        String movie3 = "movie3";
        String movie4 = "movie4";
        String movie5 = "movie5";

        Poster poster = new Poster(5);

        poster.addPoster(movie1);
        poster.addPoster(movie2);
        poster.addPoster(movie3);
        poster.addPoster(movie4);
        poster.addPoster(movie5);

        String[] expected = {
                movie5,
                movie4,
                movie3,
                movie2,
                movie1,
        };
        String[] actual = poster.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void lastLimitPoster() {
        String movie1 = "movie1";
        String movie2 = "movie2";
        String movie3 = "movie3";
        String movie4 = "movie4";
        String movie5 = "movie5";

        Poster poster = new Poster(10);

        poster.addPoster(movie1);
        poster.addPoster(movie2);
        poster.addPoster(movie3);
        poster.addPoster(movie4);
        poster.addPoster(movie5);

        String[] expected = {
                movie5,
                movie4,
                movie3,
                movie2,
                movie1,
        };
        String[] actual = poster.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void lessLastLimitPoster() {

        String movie1 = "movie1";
        String movie2 = "movie2";
        String movie3 = "movie3";
        String movie4 = "movie4";
        String movie5 = "movie5";

        Poster poster = new Poster(3);

        poster.addPoster(movie1);
        poster.addPoster(movie2);
        poster.addPoster(movie3);
        poster.addPoster(movie4);
        poster.addPoster(movie5);

        String[] expected = {

                movie5,
                movie4,
                movie3,
        };
        String[] actual= poster.findLast();
        Assertions.assertArrayEquals(expected,actual);

    }

}
