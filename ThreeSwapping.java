class ThreeSwapping {
    public static void main(String[] args) {
        int x=1;
		int y=2;
		int z;
		z=x;
		x=y;
		y=z;
		x=x%y;
		
        System.out.println("value of x: " + x);
		System.out.println("value of y: " + y);
		System.out.println("value of x: " + x);
        
    }
}