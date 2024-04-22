# Projeto_Intermediario_Backend

Este projeto é uma aplicação Spring Boot que permite aos usuários consultar informações sobre diferentes perks (vantagens) disponíveis no jogo Dead by Daylight.
Permite aos usuários buscar informações sobre uma vantagem específica fornecendo seu nome. Ao fornecer o nome da vantagem desejada, a API retorna sua descrição, explicando seu funcionamento.

 GET: 
 localhost:8080/consultarPerk/{nome-do-perk}
 
 Exemplo de pesquisa com o GET:
 localhost:8080/consultarPerk/Adrenaline


Exemplo de pesquisa com POST:
```json
{
"name": "Adrenaline"
}
```



