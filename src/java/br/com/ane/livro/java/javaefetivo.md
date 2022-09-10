<h1>Item 1 - Considere os métodos static factory</h1>
Tradicionalmente, para que uma classe permita que um cliente obtenha uma instância, fornecemos 
um construtor público. Portanto, ao utilizar o static factory, uma classe pode fornecer um método 
static factory público, que é simplesmente um método estático que retorna uma instância da classe.
Um método static factory não é o mesmo que o padrão Método Factory do Design Patterns. 
<b>Uma das vantagens dos métodos static factory é que, ao contrário dos contrutores, eles têm nomes.</b>
Se os parâmetros de um construtor não descrevem o objeto que está sendo retornado, é mais fácil usar um 
método static factory  com um nome bem escolhido. Facilita na legibilidade. 


Uma outra facilidade dos métodos static factory é que, ao contrário dos construtores, 
não precisam criar um novo objeto sempre que invocados. Isso permite que as classes 
imutáveis utilizem as instâncias pré-construídas ou armazenem em caches as instâncias, 
conforme são construídas, e as utilizem repetidas vezes a fim de evitar a criação de objetos 
duplicados desnecessários. Essa técnica melhora significantemente o desempenho caso os objetos 
equivalentes sejam requisitados com frequência, principalmente se a criação deles for custosa. 

A capacidade dos métodos static factory de retornar o mesmo objeto a partir de chamadas repetidas 
possibilita às classes assegurarem o controle rigoroso sobre as instâncias existentes a todo momento. 
As classes que se comportam desse modo são denominadas de classes controladoras de instância 

<h1>Item 2 - Cogite o uso de um builder quando se deparar com muitos parâmetros no construtor. </h1> 

Padrão telescoping constructor não é escalável
O padrão <b>telescoping constructor</b> fornece um construtor somente com parâmetros necessários, 
outro com um único parâmetro opcional, um terceiro com parâmetros opcionais, e assim por diante, resultando 
em um construtor com todos os parâmetros opcionais. (Exemplo na página 11 do java efetivo)

Uma outra alternativa é padrão <i>JavaBeans</i>. Com ele, é chamado um 
construtor sem parâmetros para criar o objeto e, em seguida chama os métodos setters 
para definir cada parâmetro obrigatório e cada parâmetro opcional de interesse; 

O padrão <i>JavaBeans</i> apresenta graves desvantagens. Como a construção é dividida 
e várias chamadas, pode apresentar inconsistência na validade dos parâmetros do construtor. 
As tentativas da utilização podem causar falhas, e consequentemente a geração de bugs. 
<i> O padrão JavaBean exclui a possibilidade da classe ser imutável </i>, e exige 
por parte do programador um esforço para garantir a segurança da thread; 

Felizmente, há uma terceira alternativa, que combina a segurança do padrão telescoping contructor 
com a legibilidade do padrão JavaBeans, que é o padrão Builder. 

O padrão Builder, em vez de construir diretamente o objeto pretendido, 
o cliente chama um construtor( ou uma static factory ) com todos os parâmetros 
necessários e obtém um objeto builder. O cliente chama o método 
do tipo setter no objeto builder para definir cada parâmetro opcional de interesse. 
Por fim, o cliente chama um método build sem parâmetros para gerar objeto, normalmente imutável.<br> 

