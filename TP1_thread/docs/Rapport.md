Gouabi Assia <br>
INF3

<div align="center">
<img height="95" width="400" src="../img/iut_velizy.png" title="logo vélizy"/>

# Rapport programmation avancée

<br><br>
Ce document permet de mettre en avant ce qui a été vu lors des séances de TP de programmation avancée

</div>

<br><br><br><br><br><br><br>

## Plan
- ### [I - Introduction](#p1)
- ### [II - TP](#p2)
- ### [Première séance de TP ](#p3)
- ### [Deuxième séance de TP ](#p4)

<br><br><br>

----------

<br><br><br>

### <a name="p1"></a> I - Introduction

Le document suivant à pour but d'effectuer un compte rendu des séances de TP. On incluera à celui-ci des explications , les diagrammes effectués et les conclusions apportées. 


### <a name="p2"></a> II - TP 

#### <a name="p3"></a> Première séance de TP 

En TP, nous avons commencé par effectuer le diagramme des classes du projet en se basant sur le code des classes que l'on possède. 
<br><br>
<img height="400" width="700" src="../img/TP1DiagrammeClasse.PNG" title="diagramme"/>
<br>
*figure 1 : Diagramme de classes*
<br><br>
Nous avons identifier 3 classes : UneFenetre, UnMobile et TpMobile. Nous avons également l'interface Runnable ainsi que les classes JFrame et JPanel.
<br>
TpMobile dépend de la classe une fenêtre puisque dans cette même classe on appelle une nouvelle fenêtre.
<br>
UneFenetre hérite de la classe mère JFrame. De plus, on s'aperçoit qu'on a un mobile en tant qu'attribut de la classe UneFenetre. Il y a donc une association entre les classes UneFenetre et UnMobile.
<br>
Enfin, la classe UnMobile hérite de la classe mère JPanel et utilise l'interface Runnable.
En appliquant tout ce qui vient d'être énumérer, on obtient le diagramme ci-dessus.
<br>


<br>Par la suite, nous avons commencé à rédiger le constructeur de la classe UneFenetre

<img height="366" width="524" src="../img/Contructeur_UneFenetre.jpg" title="diagramme"/>

*figure 2 : Constructeur de la classe UneFenetre*
<br><br>
Nous avons créer un composant graphique, un mobile appelé <i>sonMobile</i> et l'avons ajouter au conteneur principal de la fenêtre. Le mobile sera donc affiché dans ce conteneur. Une fois cette étape effectuée, on créé un Thread *laTache* en lui passant le mobile précédemment créé. Puis, on lance le Thread.

#### <a name="p4"></a> Deuxième séance de TP

Nous avons commencé par ajouter la classe Thread dans le diagramme de classes, ce qui nous donne l'image suivante : 
<br><br>
<img height="500" width="700" src="../img/TP1DiagrammeClasseThread.PNG" title="diagrammeThread"/>

*figure 3 : Diagramme de classes avec la classe Thread et l'interface Runnable*
<br><br>
La classe Thread possède un contructeur qui utilise un objet parRunnable de l'interface Runnable, c'est pour cela que la classe Thread dépend de l'interface Runnable. Elle possède également une méthode start qui permet de démarrer le Thread. 
La classe UneFenetre dépend de cette classe car dans son contructeur on appelle la méthode start de la classe Thread. 

<br> Dans une seconde partie de la séance, nous avons essayé de faire en sorte que le mobile aille de gauche à droite (ce qui était déjà fait) puis de droite à gauche. Dans un premier temps, nous avons identifié la partie du code qui effectué cette action. Elle se trouve dans la méthode run de la classe UnMobile. Ainsi, nous avons ajouter la partie du code suivante :
<br><br>
<img height="443" width="789" src="../img/methodeRun.PNG" title="code"/>

*figure 4 : Méthode run de la classe UnMobile*

En fin de séance il s'agissait dans le constructeur de la classe UneFenetre d'ajouter un bouton permettant d'arrêter ou continuer la course du mobile avec les méthodes suspend() et resume().  