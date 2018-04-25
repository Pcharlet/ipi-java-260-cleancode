public class BowlingGame {

    private int[] rolls= new int[21];
    private int frame;

	public int score() {
		int score=0;
		for (int i=0;i<20;i+=2) {
			if (rolls[i]==10) {// strike
				score += rolls[i]+rolls[i+2]+rolls[i+3];
				
			}else if (rolls[i]+rolls[i+1]==10 ) {//spare
				score+=rolls[i]+rolls[i+1]+rolls[i+2];
				
			}else {
				score+=rolls[i]+rolls[i+1];
			}
		}
		return score;
    }
    
	
	

    public void roll(int numberPins) {
        rolls[frame++]=numberPins;
    }
    
}
