Gouabi Assia <br>
INF3

<div align="center">
<img height="95" width="400" src="../img/iut_velizy.png" title="logo vélizy"/>

# Notes prises durant les cours de programmation avancée

<br><br>
Ce document permet de mettre en évidence ce qui a été dit lors des séances de cours de programmation avancée

</div>

<br><br><br><br><br><br><br>

## Plan
- ### [I - Introduction](#p1)
- ### [II - Théorie](#p2)
- ### [III - Notes de cours](#p3)

<br><br><br>

----------

<br><br><br>

### <a name="p1"></a> I - Introduction

Le document suivant à pour but d'effectuer un compte rendu de ce qui a été dit oralement lors des séances de TD accompagnée d'epxlications simplifiées. 

### <a name="p2"></a> II - Théorie

Nous avons commencer par étudier l'architecture de la machine qui se trouve en face de nous.

#### Première séance de TD

SALLE G25 :

- Processeur : Intel(R) Core(TM) i7-4790 CPU @ 3.60GHz   3.60 GHz
- RAM installée : 8 GO
- 4ème génération
- 4 coeurs 8 threads (hyperthreading)
- Capacité mémoire 32 GB
- Cache 8 MG Intel Smart cache

#### Deuxième séance de TD

SALLE I21 :

L'architecture est semblable à celle de la salle G25, à l'exception de la taille de la RAM qui est de 16 Go. Cela signifie que les performances seront plus rapides, et qu'un code développé dans la salle G25 fonctionnera sans problème dans la salle I21. Cependant, l'inverse n'est pas forcément vrai.

#### Troisième séance de TD

SALLE G24

- Processeur : Intel(R) Core(TM) i7-9700 CPU @ 3.00GHz   3.00 GHz
- RAM installée : 32 GO
- 9ème génération
- 8 cœurs 8 threads (pas d'hyperthreading)
- Capacité mémoire 128 GB

D'autres de mes camarades n'ont pas la même infrastructure. Ils ont 12 cœurs et 20 threads. On peut en déduire que les cœurs n'ont pas la même fréquence.

### <a name="p3"></a> III - Notes de cours 

#### Définitions : 

- Thread : représente la nature d'une exécution au sein d'un processus. Il permet qu'un programme puisse effectuer plusieurs opérations en même temps

- Processus : un programme qui s'exécute sur notre machine 

- Coeur : unité de traitement dans un processus 

- hyperthreading : permet à un processeur de traiter plusieurs threads en même temps sur un même coeur. 

- Socket : un fichier contenant les informations (Adresse IP...) d'un PC. Ce socket va être envoyé et stocké dans la mémoire de l'autre PC et va être lu. 


En 2008 : on commence à acheter des dual coeurs (2 coeurs, le système d'exploitation peut choisir où mettre les process)
Avec 2 coeurs, on peut effectuer plusieurs tâches en même temps ce qui veut dire qu'on peut lancer une interface et analyser des données

Application séquentielle : 

Séquence d'actions (on doit généralement finir une tâche avant de commencer une autre)

Application parallèle : 

On peut faire une tâche en même temps qu'une autre

Mémoire partagée : 
- un PC avec sa propre mémoire 
- 2 personnes ne peuvent pas utiliser la mémoire en même temps (il va falloir définir des accès)

Mémoire distribuée : 
- 2 PC qui vont travailler ensemble mais qui ont chacun leur propre mémoire

<br>Petite paranthèse : 
<br>Pourquoi des fois on a une configuration avec beaucoup de coeurs ? <br>
Généralement c'est plus facile de mettre beaucoup de cœurs avec une fréquence plus petite pour éviter de trop chauffer. De plus, c'est moins couteux car on utilise moins la climatisation.

Principes Exclusion mutuelle (Mutex) :
* 0 ou 1 personne peut traverser le code
* si un processus est bloqué, il peut traverser le code que si il y aucun processus dans la section critique
* si il y a plusieurs processus bloquées, un d'entre eux peut rentrer au bout d'un temps fini
* La solution est la même pour tous

Wait() et signal()

semaphore : tour de contrôle qui envoie des signaux pour contôler les passages côtiers (il regarde si il peut si il peut pas on utilise wait())
wait() : attente de la ressource
signal() : envoie un signal de sortie 

Ainsi, avec le signal le sémaphore sait si la ressource est vide et peut ordonner à quelqu'un de passer (dans la zone "en cours d'exécution). Si il n'a pas de signal les autres attendent (wait)

