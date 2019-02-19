class DownCasting{

   public static void main(String args[]){
       Game game2=new Chess();
	   
	   if(game2 instanceof Cricket){
	       Cricket cricket = (Cricket)game2;
		   game2.play();
		   game2.noOfPlayers();
		   game2.winner("B");
	   }
	   else if(game2 instanceof Chess){
	          Chess chess=(Chess) game2;
			  game2.play();
			  game2.noOfPlayers();
			  game2.winner("B");
	   }
   }
}