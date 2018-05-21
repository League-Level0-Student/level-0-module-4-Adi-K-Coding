import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
String whatPet= JOptionPane.showInputDialog("What pet do you want?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		for (int  i= 0; happinessLevel < 7; ) {
			
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "What do yu want to do to make your "+whatPet+" happy?", "Things to do for yor "+whatPet, 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Cuddle", "Food/Water", "Take it for a walk" }, null);

			// 5. Use user input to call the appropriate method created in step 4.
if(task == 0) {
	cuddle(whatPet);
}if(task == 1) {
	foodOrWater(whatPet);
}if(task == 2) {
	walk(whatPet);
}
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
		}
	 JOptionPane.showMessageDialog(null, "Good job, you love your "+whatPet+".");

	}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.

static void cuddle(String petType) {
	happinessLevel = happinessLevel+2;
	JOptionPane.showMessageDialog(null,"You cuddled your "+petType+"\nPet Happiness Level:"+happinessLevel);
}

static void foodOrWater(String petType) {
	happinessLevel = happinessLevel+2;
	JOptionPane.showMessageDialog(null,"You gave yor "+petType+ " food and water."+"\nPet Happiness Level:"+happinessLevel);

}
static void walk(String petType) {
	happinessLevel = happinessLevel+1;
	JOptionPane.showMessageDialog(null,"You took your "+petType+" for a walk"+"\nPet Happiness Level:"+happinessLevel);

}
}