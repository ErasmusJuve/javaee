package matriz;

public class Matriz {

	public static void main (String [] args) {
	
	String valor= "vale";
	
	int tam =3;
	String [][] matrizCara = new String [tam][tam];
	
	
	
	for(int i=0; i<tam; i++){
		//System.out.println(i+"vale");
        for(int j=0; j<tam; j++){
        	
        	matrizCara[i][j]="a";
        	System.out.print(matrizCara[i][j]+"-");
        }
        System.out.println();
    }
	
	}
}
