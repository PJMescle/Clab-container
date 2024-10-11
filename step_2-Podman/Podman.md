# Podman

## Introduction
Podman est un outil de création de container similaire à Docker en ce qu'il implémente également la spécification OCI.
Trois aspects le différencie de Docker :
- Il est daemonless 
- Les containers sont rootless par défaut
- Podman n'est qu'un élément d'une suite d'outils.

Comme c'est une alternative, toutes le commandes docker vues précédemment sont utilisabels avec les mêmes options,
Il suffit de remplacer `docker` par `podman`

Par exemple `docker build` deviendra `podman build`


## Daemonless & rootless

Comme dit précédemment podman est rootless par défaut. 
TODO :
 - Testez une commande podman sans sudo
 - Exécutez la commande `lsns` que remarquez-vous ?


## TODO Recréer les images précédentes avec podman

Tenter de recréer les images créées précédemment avec podman.