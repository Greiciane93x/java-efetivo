<h1>Cogite o uso de um builder quando se deparar com muitos parâmetros no construtor. </h1> 

Padrão telescoping constructor não é escalável
O padrão <br>telescoping constructor</br> fornece um construtor somente com parâmetros necessários, 
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
Por fim, o cliente chama um método build sem parâmetros para gerar

objeto, normalmente imutável.<br> 

