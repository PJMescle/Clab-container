# LXC/LXD

## Introduction

LXC (pour Linux Containers) est un outil permettant de créer des containers. SOn focntionnement est différent de celui de Docker.
EN effet là où Docker permet de conteneuriser des aplications et d'avoir dans un conteneur seulement votre application, 
LXC propose plutôt des System containers c'est-à dire avec un OS complet dans le container.

LXD (pour linux daemon) est buildé par-dessus LXC il va venir sous forme de dameon il permet de créer des containers de la même manière qu'LXC 
mais propose également de créer des VMs. Initialement développé au sein de linuxcontainers (comme LXC) il a été repris par Canonical.
Un fork nommé Incus existe et fait partie de linuxcontainers

## LXD

### TODO : Lancer un container ubuntu avec LXD
(toutes les commandes sont a exécuter en sudo)

Lancer un container LXD avec la commande : `lxc launch ubuntu:24.04 <nom-du-conteneur>` et controllez son existence avec la commande 
`lxc list`

Exécuter Bash sur le container créé et regarder la liste des process disponibles