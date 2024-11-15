import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] data = new int[5];
		int[][] result = new int[5][5];
		data[0] = 0;
		for (int i=1;i<5;i++) {
			data[i] = sc.nextInt();
		}
		
		for (int i=0;i<5;i++) {
			for (int j=i;j<5;j++) {
				int distance = getDistance(i,j, data);
				result[i][j] = distance;
				result[j][i] = distance;
			}
		}
		for (int i=0;i<5;i++) {
			System.out.println(result[i][0]+" "+result[i][1]+" "+result[i][2]+" " + result[i][3]+" "+result[i][4]);
		}
		
	}

	private static int getDistance(int start, int end, int[] data) {
		// TODO Auto-generated method stub
		if (start == end) return 0;
		int distance = 0;
		int x=start;
		int y=end;
		if (end<start) {
			x=end;
			y=start;
		}
		
		for (int i=x;i<y;i++) {
			distance +=data[i+1];
		}
		return distance;
	}

}
