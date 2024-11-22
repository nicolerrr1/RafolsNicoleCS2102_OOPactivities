public class ArtistDemo {
    public static void main(String[] args) {
        // instance of Artist
        Artist artist = new Artist("Katy Perry", "American", 40, "Music");
        artist.displayInfo();

        System.out.println();

        Singer singer = new Singer("Kim SeolA", "Korean", 29, "Music", Genre.POP);
        singer.displayInfo();
        System.out.println();

        Painter painter = new Painter("Fernando Amorsolo", "Filipino", 45, "Painting", Medium.OIL);
        painter.displayInfo();
        System.out.println();

        Writer writer = new Writer("Madeline Miller", "English", 46, "Writing", WritingStyle.DRAMA);
        writer.displayInfo();
        System.out.println();

        Dancer dancer = new Dancer("Lee Yeoreum", "Korean", 25, "Dancing", DanceStyle.HIPHOP);
        dancer.displayInfo();
    }
}