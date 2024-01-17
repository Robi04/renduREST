# Rendu Rest Spring Boot

## Initialisation du projet

Plusieurs étapes sont nécessaires pour l'initialisation du projet.

1. Création du projet en allant sur <a href="https://start.spring.io/">Spring Initializr</a> pour télécharger toutes les dépendances nécessaires au projet.
2. Utilisation des starter kit : **Web**, **Test**, **Data-Jpa** et une base de données **H2**

3. Création d'un repository **Git** pour le projet.
4. C'est partie, on peut commencer

## Hiérarichie des fichiers

<img src="./asset/Tree.png"></img>
Nous pouvons voir que notre application est composé de plusieurs package pour une meilleur organisation.

- **Model** : Contient les différentes entité de l'application
  - Player ➡️ id, prenom, nom, age
  - Team ➡️ id, name, city
- **Controller** : Contient les controlleurs de l'application qui vont nous permettre de pouvoir récupérer les requêtes http faites par le client, et appeler les interfaces présentes dans le package **Repositories**. Les controllers permettent la gestion de chaque actions prises en charge par une API REST : (POST, PUT, GET, DELETE...)
  <img src="./asset/Controller.png"></img>

- **Repository** : Contient les repositories de l'application qui vont permettre d'utiliser les procédures extraitent de JpaRepository pour ramener les informations par rapport à l'ID de nos entités.
- **Bootstrap** : Contient le **Bean** de démarrage qui va appeler la fonction **Run** qui est un service qui va s'éxecuter au démarrage de notre application, celle-ci va envoyer des données directement dans la base de données que l'on pourra retrouver avec notre application
  <img src="./asset/bootstrap.png"></img>

  ## Analyse des requêtes sur PostMan

  ici nous allons voir les différentes requêtes que nous pouvons faire sur notre application REST

## GET

#### GET Appel Api : /teams :

<img src="./asset/postmangetallteams.png"></img>

#### GET Appel Api : /players :

<img src="./asset/postmangetallplayers.png"></img>

#### GET Appel API : /team/{id} :

<img src="./asset/postmangetoneteam.png"></img>

#### GET Appel API : /player/{id} :

<img src="./asset/postmangetoneplayer.png"></img>

## POST

#### POST Appel API : /teams :

<img src="./asset/postmanpostteams.png"> </img>
Maintenant faisons un appel à la base de données pour voir si nos données ont bien été enregistrées
<img src="./asset/postmanpostteams2.png"> </img>

#### POST Appel API : /players :

<img src="./asset/postmanpostteams.png"> </img>
Maintenant faisons un appel à la base de données pour voir si nos données ont bien été enregistrées
<img src="./asset/postmanpostteams2.png"> </img>

## Script Node.js:

```bash
npm install axios
```

```javascript
const axios = require("axios");

const getDataFromAPI = async () => {
  try {
    const teamsResponse = await axios.get("http://localhost:8080/teams");
    console.log("Équipes:", teamsResponse.data);

    const playersResponse = await axios.get("http://localhost:8080/players");
    console.log("Joueurs:", playersResponse.data);
  } catch (error) {
    console.error("Erreur lors de la récupération des données:", error);
  }
};

getDataFromAPI();
```
