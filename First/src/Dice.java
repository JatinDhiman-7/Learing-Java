 class Dice {
	 int Roll() {
		 double random=Math.random()*6;
		 return (int)Math.ceil(random);
	 }

	public static void main(String[] args) {
		Dice dice=new Dice();
		for(int i=0;i<10;i++) {
			System.out.println(dice.Roll());
		}
	}

}


//class Dice{
//	
//	public static void main(String[] args) {
//		
//	}
//}