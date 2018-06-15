public class Mat03{
	public static void main(String[] args) {
		//Planilla: Cuánto desembolsará la empresa por EP y el total
		String ep[]={"Sis","Amb","Civil"};
		int ent[][] = {	{1500,1600,1700},
						{1100,1700,2000},
						{1200,1900,2500},
						{1200,1900,2500}
					  };
		int[] semi = calSueldo(ent);

		for (int i=0;i<semi.length ;i++ ) {
			System.out.println(""+ep[i]+"="+semi[i]);
		}
		
	}
	public static int[] calSueldo(int A[][]) {
		int[] semi = new int[A[0].length];
		for (int j=0; j< A[0].length ; j++ ) {
			semi[j]=0;
			for (int i=0;i<A.length ;i++ ) {
				semi[j] = semi[j]+A[i][j];
			}
		}
		return semi;
	}
}