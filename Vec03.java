public class Vec03{
	public static void main(String[] args) {
		int v[] = {5,6,9,8,12,2};
		imprimirVector(v);
		ordernarVector(v);
		imprimirVector(v);
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