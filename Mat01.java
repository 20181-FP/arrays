public class Mat01{
	public static void main(String[] args) {
		//Matriz de 2x3
		int ent[][] = {	{5,6,7},
						{1,2,3}
					  };
		//System.out.println("ent[0][0]="+ent[0][0]);
		for (int i=0;i<ent.length ;i++ ) {
			for (int j=0; j< ent[0].length ; j++ ) {
				System.out.println("ent["+i+","+j+"]="+ent[i][j]);
			}
		}
		for (int i=0;i<ent.length ;i++ ) {
			for (int j=0; j< ent[0].length ; j++ ) {
				System.out.print("\t"+ent[i][j]);
			}
			System.out.print("\n");
		}
	}
}