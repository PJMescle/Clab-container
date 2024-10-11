# C-LAB Conteneurisation


Ce projet java sert de support pour le C-Lab sur la conteneurisation. Il se compose d'unne application Java nommée café 
et du contenu du Lab

## Application Java Café

Cette application basique expose 3 endpoints :

`GET /cafe` retourne juste une String et permet de valider que l'application fonctionne

`GET /db/cafes` permet de compter le nombre de cafés commandés.

`POST /db/cafes` permet de faire une commande de café en ajoutant une ligne dans la base

Un exemple de post serait : 

`curl -X POST http://localhost:8080/db/cafes -H "Content-Type: application/json" -d '{"type":"iced cofee"}'
`

