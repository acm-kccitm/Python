class Movie{
String title;
String genre;
int rating;

void playlist() {
System.out.println("playing the movie");

  }
}

public class MovieOb {

public static void main(String[] args){
  
  Movie one = new Movie();
  one.title = "Jumbo";
  one.genre = "Tragic";
  one.rating = 1;
  
  Movie two = new Movie();
  two.title = "Slick";
  two.genre = "Horror";
  two.rating = 3;
  
  one.playlist();
  }
}
