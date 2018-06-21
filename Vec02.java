public class Vec02{
	public static void main(String[] args) {
		int v[] = {5,6,7,8,12,2};
		String h[] = {"Hola", "Juan", "Maria"};
		String in[] = invertirVector(h);
		imprimirVector(h);
		imprimirVector(in);
	}

	public static int[] invertirVector(int v[]){
		int[] vi = new int[v.length];
		int k=0;
		for (int i= v.length-1 ;i>=0 ;i-- ) {
			vi[k]=v[i];
			k++;
		}
		return vi;
	}

	public static String[] invertirVector(String v[]){
		String[] vi = new String[v.length];
		int k=0;
		for (int i= v.length-1 ;i>=0 ;i-- ) {
			vi[k]=v[i];
			k++;
		}
		return vi;
	}


	public static void imprimirVector(int v[]){
		System.out.println("===");
		for (int i=0;i<v.length ;i++ ) {
			System.out.println("v["+i+"]="+v[i]);
		}
	}
	public static void imprimirVector(String v[]){
		System.out.println("===");
		for (int i=0;i<v.length ;i++ ) {
			System.out.println("v["+i+"]="+v[i]);
		}
	}
}