package ejercicio5;

public class sumador {
	
	
	public static void main(String[] args) {
		if(args.length<2) {
			System.out.println("Hay que introducir 2 sumandos");
			
		}else {
			int a=Integer.parseInt(args[0]);
			int b =Integer.parseInt(args[1]);
			System.out.println(suma(a,b));
		}
	}
	
	
	 public static int suma(int n1, int n2){
         int resultado=0;
         for (int i=n1;i<=n2;i++){
                 resultado=resultado+i;
         }
         System.out.println(resultado);
         return resultado;
 }

}
