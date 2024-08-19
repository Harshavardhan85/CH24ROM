class VideoGame {
    private String title;
    private String genre;
    private int releaseYear;

    public VideoGame(String title, String genre, int releaseYear) {
        this.title = title;
        this.genre = genre;
        this.releaseYear = releaseYear;
    }

    public void display() {
        System.out.println("VideoGame Title: " + title + ", Genre: " + genre + ", Release Year: " + releaseYear);
    }
}