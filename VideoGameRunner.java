class VideoGameRunner{
	 public static void main(String[] args) {
        // Create instances of VideoGame
        VideoGame[] videoGames = new VideoGame[3];
        videoGames[0] = new VideoGame("Cyberpunk 2077", "RPG", 2020);
        videoGames[1] = new VideoGame("The Witcher 3", "RPG", 2015);
        videoGames[2] = new VideoGame("Minecraft", "Sandbox", 2011);
		 for (VideoGame game : videoGames) {
            game.display();
		 }
	 }
}	 