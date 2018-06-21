public class Vec04{ //CRUD
	public static void main(String[] args) {
		String h[] = {"Hola", "Juan", "Maria"};
		reader(h);
		h=add("Angel", h);
		reader(h);
	}
	public static String[] add(String cad,String v[]){
		System.out.println("==CREATE==");
		String[] nuevo = new String[v.length+1];
		for (int i=0;i<nuevo.length-1;i++ ) {
			nuevo[i]=v[i];
		}
		nuevo[nuevo.length-1]=cad;
		return nuevo;
	}

	public static void reader(String v[]){
		System.out.println("==READER==");
		for (int i=0;i<v.length ;i++ ) {
			System.out.println("v["+i+"]="+v[i]);
		}
	}
}