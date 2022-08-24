public class CatalogoDeVenda {
	
	public void gerar(Negociavel...produtos){
		for(Negociavel produto : produtos){
			System.out.println(produto);
			System.out.println("..... R$ " + produto.calcularPrecoVenda());
		}
	}

}
