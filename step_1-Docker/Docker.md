# DOCKER

## Commandes de base

Pour lister les images présentes sur le système : 

`docker images`

L'option `-a` permet de lister également les images intermédiaires (images de travail)

Pour supprimer des images il faut utiliser la commande suivante  : 

`docker rmi <nom image | hash image>`

Pour consulter l'état des différents containers sur le système la commande est : 

`docker ps`

Pour afficher la totalité des conteneurs (même ceux en erreurs ou stoppés) l'option `-a` permet de tout afficher.

La suppression des containers se fait via la commande 

`docker rm`

# Construction des images

Une image de conteneur est décrite dans un fichier nommé `Dockerfile`
La référence se trouve ici : https://docs.docker.com/reference/dockerfile/

## TODO Créer un Dockerfile pour l'application java café 

Créer un Dockerfile permettant d'exécuter l'application java café, vous aurez besoin au préalable de builder l'application 
ou d'inclure le build dans votre Dockerfile

Elements utilisables  : FROM, COPY, RUN, WORKDIR, CMD, EXPOSE


Une fois votre dockerfile créé vous devez utiliser la commande `docker build` pour créer l'image à partir du Dockerfile.
Essayez toujours de builder votre image avec l'option `-t` afin d'ajouter un tag à votre image cela ssera plus pratique pour la retrouver
Docker attribuant un Hash si le tag n'est pas précisé.

Une fois votre image créé, instanciez un container à partir de celle-ci.
Cela se fait via la commande `docker run`

Verifiez que votre application fonctionne en essaynt de contacter un des endpoints exposés
