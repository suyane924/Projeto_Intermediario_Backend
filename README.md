# Projeto_Intermediario_Backend

**PROJETO PARA CONSULTAR INFORMAÇÕES SOBRE AS "PERKS" (VANTAGENS) DE JOGADOR QUE EXISTEM NO JOGO DEAD BY DAYLIGHT.**

Este projeto é uma aplicação Spring Boot que permite aos usuários consultar informações sobre diferentes perks disponíveis no jogo. Os usuários podem buscar informações sobre uma vantagem específica fornecendo seu nome. Ao fornecer o nome da vantagem desejada, a API retorna sua descrição, explicando seu funcionamento, entre outras informações.

**FUNCIONAMENTO**

consultaPerkAPI.java : Tem um endpoint /consultarPerk/{name} que aceita uma solicitação GET com o parâmetro name. Quando essa rota é acessada, o método consultaPerk é chamado, onde é feita uma solicitação na API que fornece as informações sobre as perks do jogo. A resposta é mapeada para o objeto perkDescricaoDTO e retornada a solicitação.

consultaPerkPost.java : Diferente do anterior, este define o endpoint /consultarPerk que aceita solicitações POST. Quando e rota é acessada, o método consultarPerkPorNome é chamado, onde é feita a solicitação http POST para a API externa que fornece informações.

perkDescricaoDTO.java : Utilizado para representar a descrição das vantagens do jogo.Os métodos getter e setter são fornecidos para acessar e modificar esses atributos. É usado para mapear os dados recebidos das solicitações.

**EXEMPLO DE SOLICITAÇÃO DE UMA PERK COM GET**

  
localhost:8080/consultarPerk/Adrenaline

  
**EXEMPLO DE SOLICITAÇÃO DE UMA PERK COM POST**

  
{  

"name": "Adrenaline" 

}


**RETORNO DAS SOLICITAÇÕES DOS EXEMPLOS**

```json
{
  "name": "Adrenaline",
  "description": "You are fueled by unexpected energy when on the verge of escape. Instantly heal one health state and sprint at {0}% of your normal running speed for {1} seconds when the exit gates are powered. Adrenaline is on hold if you are disabled at the moment it should take effect and will activate when freed. Adrenaline will wake you up if you are asleep when it triggers. Adrenaline ignores the Exhausted status effect. Causes the Exhausted status effect for {2} seconds. Exhausted prevents Survivors from activating exhausting perks.",
  "role": "survivor",
  "character": 1,
  "tunables": [
    [ "150" ],
    [ "5" ],
    [ "60", "50", "40" ]
  ],
  "teachable": 40,
  "image": "UI/Icons/Perks/iconPerks_adrenaline.png"
}
``` 




