import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Movie.Builder builder = new Movie.Builder("Fast and Furious 5", 2011 );

        List<Place> location = new ArrayList<Place>();
        location.add(new Place("Rio de Janeiro"));
        location.add(new Place("Los Angeles"));
        location.add(new Place("Miami"));

        builder.director(new Person("Justin", "Lin"));
        builder.writer(new Person("Chris", "Morgan"));
        builder.locations(location);

        List<String> languages = new ArrayList<String>();
        languages.add("English");
        languages.add("Japanese");
        languages.add("French");

        builder.series("The Matrix");

        List<Person> cast = new ArrayList<Person>();
        cast.add(new Person("Vin", "Diesel"));
        cast.add(new Person("Paul", " Walker"));
        cast.add(new Person("Joaquim", "De Almeida"));
        builder.cast(cast);

        List<String> genres = new ArrayList<String>();
        genres.add("Action");
        genres.add("Adventure");
        genres.add("Crime");
        genres.add("Thriller");
        builder.genres(genres);

        builder.isNetflix(false);
        builder.isIndependent(false);
        builder.isTelevision(false);

        Movie movie = builder.build();

        System.out.println(movie);
    }
}
