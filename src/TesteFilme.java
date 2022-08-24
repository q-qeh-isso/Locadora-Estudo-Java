public class TesteFilme {

	public static void main(String[] args) {

		Filme filme1 = new Filme("Holocausto", "Drama", "Um filme baseado em fatos reais, triste.");

		System.out.println(filme1); //utiliza metodo reescrito toString() na Midia class
		
		try {
			filme1.devolver();
		} catch (MidiaAlocadaException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			System.out.println("Sempre passa por aqui! * finally * ");
		}

	}

}
