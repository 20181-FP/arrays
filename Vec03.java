public class Vec03{
	public static void main(String[] args) {
		int v[] = {5,6,9,8,12,2};
		int x[] = {15,16,19,18,112,13};
		imprimirVector(v);
		ordernarVector(v);
		imprimirVector(v);
		
		int pos=buscarEnVector(12,v);
		if(pos>=0)
			System.out.println("12 está en la pos="+pos);
		else
			System.out.println("12 No existe");

	}
	public static int buscarEnVector(int b, int v[]){
			for (int i=0;i<v.length;i++ ) {
				if (b == v[i]) {	
					return i;
				}
			}
			return -1;
		
	}

	public static void ordernarVector(int v[]){
		for (int j=0;j<v.length ;j++ ){
			for (int i=0;i<v.length-j-1;i++ ) {
				int tem = 0;
				if (v[i] > v[i+1]) {
					tem=v[i];
					v[i]=v[i+1];
					v[i+1]=tem;
					System.out.println("es mayor");
				}
			}
		}
	}
	public static void imprimirVector(int v[]){
		System.out.println("===");
		for (int i=0;i<v.length ;i++ ) {
			System.out.println("v["+i+"]="+v[i]);
		}
	}
}