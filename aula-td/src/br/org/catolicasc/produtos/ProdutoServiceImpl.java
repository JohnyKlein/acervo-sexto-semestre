package br.org.catolicasc.produtos;

import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

@WebService(name = "ProdutoService", targetNamespace = "http://www.catolicasc.org.br/produtos/")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
@Stateless
public class ProdutoServiceImpl implements ProdutoService {

	@WebMethod
	@WebResult(name="produtos", targetNamespace="http://service.estoque.catolicasc.org.br/", partName="parameters")
	@Override
	public Produtos listarProdutos(ProdutoRequest parameters) {
		Produtos produtos = new Produtos();
		Produto produto = new Produto();
		
		produto.setDescricao("Taco de baseball");
		produto.setId(1L);
		produto.setPrecoVenda(199.0);
		produto.setQuantidade(10.0);
		produtos.getProduto().add(produto);
		
		return produtos;
	}
}
