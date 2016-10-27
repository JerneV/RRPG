package rpgPackage;

public class Player {
	//Declaring some variables I'll probably use
	
	//Player Name, not sure if I'll even use this
	String name;
	//Strength of player
	int power;
	
	//Setter for name, so we can easily change it later 
	public void setName(String n){
		name = n;
	}
	//Getter for name, so we can easily get the name later if we need it
	public String getName(){
		return name;
	}
	//Setter for the powerlvl, should come in handy when player gets new weapon
	public void setPower (int p){
		power = p;
	}
	//Getter for powerlvl, for when we need to kill some monsters
		public int getPower(){
		return power;
	}
}

//Inventory Shizzle, te moe om het af te maken
//https://www.youtube.com/watch?v=xIPLpGOjZqQ