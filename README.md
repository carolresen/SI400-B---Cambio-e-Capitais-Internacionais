# SI400-B---Cambio-e-Capitais-Internacionais

######Título do projeto 
Câmbio e Capitais Internacionais: informações sobre boletins de cotações de moedas.

######Repositório  
https://github.com/carolresen/SI400-B---Cambio-e-Capitais-Internacionais

######Grupo
Caroline Resende Silveira - RA: 165921- Email: caroline.resen@gmail.com - GitHub: https://github.com/carolresen
Guilherme Barreiro Machado - RA: 168915 - Email: machado.guilherme95@gmail.com - GitHub: https://github.com/Gui-Machado
Maria Victória da Silva - RA: 156604 -  Email: m156604@g.unicamp.br - GitHub: https://github.com/victoriads4
Michael Ramos de Almeida - RA: 138904 -  Email: michaelralmeida@gmail.com - GitHub: https://github.com/Michaelalmeida

######Motivação
O projeto visa o desenvolvimento de um sistema capaz de apresentar informações sobre cotações de moedas de maneira completa, simples e objetiva, reunindo dados relevantes sobre os boletins de cotação, bem como produzindo refinamento sobre esses dados através de estatísticas. O sistema "Cambio e Capitais Internacionais" poderia ser uma ferramenta muito útil para Casas de Câmbio, viajantes e outros interessados em informações sobre cotações de moedas e estimativas médias do preço de venda e compra, por exemplo, do dólar em um dado período.

######Fontes de dados
http://www4.bcb.gov.br/pec/taxas/port/ptaxnpesq.asp?id=txcotacao
Sites que serão usados para consulta

######Descrição dos dados</br>
Os dados possuem: </br>
 • Data: referente ao dia que foi feita a cotação;</br>
 • Tipo: no caso do dólar é o tipo A. Siginifica que tem como taxa de câmbio quantidades de moeda por uma unidade de Dólar dos Estados Unidos (USD);</br>
 • Compra: o valor de compra do dólar referente a data;</br>
 • Venda: o valor de venda do dólar referente a data.

######Volume de dados
Cada tabela num intervalo de 30 dias possui o tamanho de 2 KB. No intervalo de 30 dias é contato somente os dias úteis, por volta de 22 dias, ou seja, 22 valores.

######Formato de disponibilização dos dados
Os dados estão no formato CSV

######Um exemplo de consulta que pode ser realizada e como seria a apresentação gráfica do resultado
Consulta 1 -> Valor do dólar na data xx/xx/xxxx para compra e venda.
Exibição 1 -> Apresentação da data consultada, do valor de compra do dólar nesse dia e o valor de venda do dólar nesse dia. Além disso, apresentará a fonte dos dados (Banco Central do Brasil). Todos esses dados serão apresentados em uma janela personalizada, de modo que a interface com o usuário seja simples e coerente, sem excesso de informação, com um visual objetivo e claro.

Consulta 2 -> Média do valor do dólar na semana mais recente, ou seja, últimos 7 dias.
Exibição 2 -> Apresentação dos dias da semana requisitada, do valor médio de compra do dólar nessa semana e o valor médio de venda do dólar nessa semana. Além disso, apresentará a fonte dos dados (Banco Central do Brasil). Todos esses dados serão apresentados em uma janela personalizada, de modo que a interface com o usuário seja simples e coerente, sem excesso de informação, com um visual objetivo e claro.
