
package br.org.catolicasc.produtos;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.org.catolicasc.produtos package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ListarProduto_QNAME = new QName("http://www.catolicasc.org.br/produtos/", "listarProduto");
    private final static QName _Produtos_QNAME = new QName("http://www.catolicasc.org.br/produtos/", "produtos");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.org.catolicasc.produtos
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Produtos }
     * 
     */
    public Produtos createProdutos() {
        return new Produtos();
    }

    /**
     * Create an instance of {@link ProdutoRequest }
     * 
     */
    public ProdutoRequest createProdutoRequest() {
        return new ProdutoRequest();
    }

    /**
     * Create an instance of {@link Produto }
     * 
     */
    public Produto createProduto() {
        return new Produto();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProdutoRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.catolicasc.org.br/produtos/", name = "listarProduto")
    public JAXBElement<ProdutoRequest> createListarProduto(ProdutoRequest value) {
        return new JAXBElement<ProdutoRequest>(_ListarProduto_QNAME, ProdutoRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Produtos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.catolicasc.org.br/produtos/", name = "produtos")
    public JAXBElement<Produtos> createProdutos(Produtos value) {
        return new JAXBElement<Produtos>(_Produtos_QNAME, Produtos.class, null, value);
    }

}
