public class MusicalShow extends Show {

    Person musicAuthor; //автор музыки
    String librettoText; //текст либретто

    public MusicalShow(String title, int duration, Director director, Person musicAuthor, String librettoText) {
        super(title, duration, director);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public void printLibretto() {
        System.out.println("Либретто: " + librettoText);
    }
}
