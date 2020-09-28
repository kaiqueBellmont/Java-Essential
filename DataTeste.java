package Classe;

public class DataTeste {
	public static void main(String[] args) {
		Data d1 = new Data();
		d1.dia = 17;
		d1.mes = 05;
		d1.ano = 1996;

		var d2 = new Data();
		d2.dia = 22;
		d2.mes = 04;
		d2.ano = 2000;

		System.out.println(d2.ano + "/" + d2.mes + "/" + d2.dia);
		System.out.println(d1.ano + "/" + d1.mes + "/" + d1.dia);
	}
}
