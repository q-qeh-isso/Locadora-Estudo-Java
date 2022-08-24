public class TesteMusica {

	public static void main(String[] args) {
		Musica musica1 = new Musica("Sambas Enredo de SP", "Samba", "BMG");
		/*musica1.setTitulo("Sambas Enredo de SP");
		musica1.setGenero("Samba");
		musica1.setPrecoAluguel(15.0);
		musica1.setGravadora("BMG");*/
		
		//musica1.mostraDados();
		System.out.println(musica1); //utiliza metodo reescrito toString() na Midia class
		//System.out.println("Gravadora: " + musica1.getGravadora());

	}

}
