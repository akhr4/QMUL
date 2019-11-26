class lab{
    public static void main(String[] args){
        //index 0 = size , index 1 = itterations 
        int[] array = new int[Integer.parseInt(args[0])];
        int x = 0;
        for (int i = 0; i < Integer.parseInt(args[1]) ; i++) {
            array[randomNum(0,(Integer.parseInt(args[0])))] = i*Integer.parseInt(args[0]);
        }

    }

    public static int randomNum(int UP , int LW){
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(UP) + (LW-1);
		return randomInt; 
	}
}