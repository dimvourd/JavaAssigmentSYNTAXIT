import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> movieDurations = Arrays.asList(90, 85, 75, 60, 120, 150, 125);
        final int flightDuration = 250;

        List<Integer> recommendedMovies = getRecommendedMovies(movieDurations, flightDuration);
        System.out.println("Recommended movies: " + recommendedMovies);
    }

    public static List<Integer> getRecommendedMovies(List<Integer> moviesDuration,int flightDuration){
        List<Integer> movies = new ArrayList<>(2);
        int maxDuration = flightDuration - 30;
        int totalDuration=0;

        for(int i = 0; i < moviesDuration.size(); i++){
            for(int j = i + 1; j < moviesDuration.size(); j++){

                if(moviesDuration.get(i)+moviesDuration.get(j) <= maxDuration &&
                        moviesDuration.get(i)+moviesDuration.get(j) > totalDuration){

                    totalDuration = moviesDuration.get(i)+moviesDuration.get(j);
                    movies.clear();
                    movies.add(i);
                    movies.add(j);
                }
            }
        }

        return movies;
    }
}
