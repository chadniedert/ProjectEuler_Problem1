class Main {
  public static void main(String[] args) {
    int sum = 0;
	for(int i = 1; i <= 999; i++)
	{
		if (i % 3 == 0 || i % 5 == 0)
		{
			sum += i;
			System.out.println(i + " is a multiple of either 3 or 5 (or both)");
		}
	}
	System.out.println("Sum: " + sum);
  }
}