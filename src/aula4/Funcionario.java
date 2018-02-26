package aula4;

class Funcionario {
	double salario;
	String nome;
	String cpf;
	Data dataEntrada;

	// ex4
	static void compara(String nome1, String nome2) {
		if (nome1 == nome2) {
			System.out.println("Os nomes s�o iguais");
		} else {
			System.out.println("n�o s�o iguais");
		}
	}

	void recebeAumento(double aumento) {
		this.salario += aumento;
	}

	double calculaGanhoAnual() {
		return this.salario * 12;

	}

	// Exercicio 3
	void mostra() {
		System.out.println("O nome do Funcion�rio �: " + this.nome);

		System.out.println("O sal�rio mensal antes do aumento �: " + this.salario);

		System.out.println("O sal�rio anual � de: " + this.calculaGanhoAnual());

		this.recebeAumento(500.0);
		System.out.println("ap�s o aumento de 500,00 R$, o sal�rio passou a ser de: " + this.salario
				+ " e o sal�rio anual fica em torno de: " + this.calculaGanhoAnual());
		// System.out.println("A data de entrada na empresa �:
		// "+this.dataEntrada.dia+"/"+this.dataEntrada.mes+"/"+this.dataEntrada.ano);
		System.out.println("A data de entrada na empresa �: " + this.dataEntrada.getFormatada());
	}

	// ex6

}

// Exerc�cio 1 da aula4
class Empresa {
	String Nome;
	int cnpj;
	Funcionario[] funcionarios;
	int livre = 0;
	void adicionar(Funcionario f) {
		this.funcionarios[this.livre] = f; 
		this.livre++;
	}
	
	void mostraFuncionarios() {
		for (int i = 0; i < this.funcionarios.length; i++) {
			System.out.println("Funcion�rio na posi��o: "+(i+1));
			System.out.println("sal�rio do funcion�rio: "+this.funcionarios[i].salario);
		}
	}
}

class Data {
	int dia;
	int mes;
	int ano;

	void preencheData(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

	String getFormatada() {
		return this.dia + "/" + this.mes + "/" + this.ano;
	}
}

class testaEmpresa{
	public static void main(String[] args) {
		Empresa empresa = new Empresa();
		empresa.funcionarios = new Funcionario[10];
		
		for (int i = 0; i < empresa.funcionarios.length; i++) {
	        Funcionario f = new Funcionario();
	        f.salario = 1000 + i * 100;
	        empresa.adicionar(f);
		
		
		}
		
		empresa.mostraFuncionarios();
	}
}

/*class testaFuncionario {

	public static void main(String[] args) {

		Funcionario f1 = new Funcionario();
		f1.nome = "Lino Veloso";
		f1.cpf = "08960826952";
		f1.salario = 2550.50;
		f1.dataEntrada = new Data();
		f1.dataEntrada.preencheData(1, 6, 1993);
		//f1.mostra();
		
		Funcionario f2 = new Funcionario();
		f2.nome = "Renan Mastroto";
		f2.salario = 2000.0;

		// Cadastro.compara(f1.nome, f2.nome);

	}

}*/
