public class Task14 {
	public void execute() {
		int target = 200;
		int[] coinSizes = { 1, 2, 5, 10, 20, 50, 100, 200 };
		int[] ways = new int[target+1];
		ways[0] = 1;
		for (int i = 0; i < coinSizes.length; i++) {
		    for (int j = coinSizes[i]; j <= target; j++) {
		        ways[j] += ways[j - coinSizes[i]];
		    }
		}
		System.out.println("We have "+ways[target]+" different ways that can 200 be made using any number of coins");
	}
}