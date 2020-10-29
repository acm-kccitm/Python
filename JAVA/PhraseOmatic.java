public class PhraseOmatic {
	public static void main (String[] args){
		
	String[] wordListOne = {"24/7", "Multi-tier", "30,000 foot", "B-to-B", "Win-Win", "Front-end", "Web-Based", "persiaisve", "Smart", "Six-Sigma", "Critical-Path"};
	
    String[] wordListTwo = {"empowered", "sticky", "value-added", "oriented", "centric", "distributed", "clustered", "branded", "outside-the-box", "positioned", "networked", "focussed", "aligned", "cooperative", "accelerated", "leveraged", "shared"};   	
		
	String[] wordListThree = {"process", "solution", "architechture", "core competency", "stratergy", "mindshare", "portal", "space", "vision", "paradigm", "mission"};	
	
	int oneLength = wordListOne.length;
	int twoLength = wordListTwo.length;
	int threeLength = wordListThree.length;
	
	
	int rand1 = (int) (Math.random() * oneLength);
	int rand2 = (int) (Math.random() * twoLength);
	int rand3 = (int) (Math.random() * threeLength);
	
	String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
	
	System.out.println("What we need is a " + phrase);
	
	}
		
}	 