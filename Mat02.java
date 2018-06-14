public class Mat02{
	public static void main(String[] args) {
		//Planilla: Cuánto desembolsará la empresa por EP y el total
		String ep[]={"Sis","Amb","Civil"};
		int ent[][] = {	{1500,1600,1700},
						{1100,1700,2000},
						{1200,1900,2500},
						{1200,1900,2500}
					  };
		int semi=0;
		int suma=0;
		for (int j=0; j< ent[0].length ; j++ ) {
			semi=0;
			for (int i=0;i<ent.length ;i++ ) {
				System.out.print("\t"+ent[i][j]);
				semi = semi+ent[i][j];
				suma = suma + ent[i][j];
			}
			System.out.print("semi="+semi+"\n");
		}
		System.out.print("\nsuma="+suma);
		
	}
}