package problemasU4;
import java.util.Scanner;
public class PruebaCuentaDigitos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int q,num;
		double doub;
		Scanner entrada=new Scanner(System.in);
	/*	num=entrada.nextInt();
		
		CuentaDigitos cd= new CuentaDigitos(num);
		//System.out.println(cd.a);
		cd.contador();
		CuentaDigitos cd2=new CuentaDigitos();
		q=entrada.nextInt();
		cd2.setNum(q);
		cd2.contador();*/
		doub=entrada.nextDouble();
		CuentaDigitos cdb=new CuentaDigitos(doub);
		//cdb.setDoub(grande);
		System.out.println(cdb.getDoub());
		//cdb.contadouble();
		cdb.contadouble();
	}

}
