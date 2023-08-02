package sg.edu.rp.c346.id22023689.mymovies;

public class Movies {

    private String title;
    private String genre;
    private int year;
    private String rating;

    public Movies(String title, String genre, int year, String rating) {
        this.title = title;
        this.genre = genre;
        this.year = year;
        this.rating = rating;
    }

    public String getTitle() {return title;}

    public String getGenre() {return genre;}

    public int getYear() {return year;}

    public String getRating() {return rating;}


}
