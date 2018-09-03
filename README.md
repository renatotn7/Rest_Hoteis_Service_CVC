# rest_Hoteis_Service
Se trata de um serviço que acessa um servidor simulado de hotéis atribuindo comissão e totalizando estadias dado numero de adultos crianças e intervalo de datas.
## install maven
maven install
## load service
mvn spring-boot:run

##Usando o endpoint
Exemplo chamada por hotel:
http://localhost:8080/v1/hotels/1?checkin=01/01/2018&checkout=02/01/2018&numAdultos=2&numCriancas=1

Chamada Endpoint
http://localhost:8080/v1/hotels/{hotelID}?checkin={dateCheckin}&checkout={dateCheckout}&numAdultos={numAdultos}&numCriancas={numCriancas}


Exemplo chamada dos hoteis em uma cidade:
http://localhost:8080/v1/hotels/avail/1032?checkin=01/01/2018&checkout=02/01/2018&numAdultos=2&numCriancas=2

Chamada Endpoint
http://localhost:8080/v1/hotels/avail/{cityID}?checkin={dateCheckin}&checkout={dateCheckout}&numAdultos={numAdultos}&numCriancas={numCriancas}
