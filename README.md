## Activité pratique : Hibernate

## Objectif:
L'objectif principal est d'implémenter les concepts fondamentaux de la persistance des données dans une application Java utilisant Hibernate. Le projet comprend :

Configuration d'Hibernate pour la connectivité à la base de données

Définition d'entités représentant des catégories et des produits

Créer des services pour manipuler les données

Exécution

Configuration des tests unitaires


## Pile technique

Java

Hibernate 5.6.14.Final

MySQL 8.0.33

JUnit pour les tests

Maven pour la gestion des dépendances


## Structure du projet
Le projet suit une architecture structurée avec les composants suivants

## 1.Configuration

-Configuration de Maven pom.xml

-Fichier de configuration d'Hibernate (hibernate.cfg.xml)

## 2.Composants de base

-Interface DAO

-Classes d'entités (machine et salle)

-Classe utilitaire Hibernate

-Classes de la couche de service

## 3.Entités

-Entité machine avec attributs:

    .ID (généré automatiquement)
    
    . Référence
    
    . Date d'achat
    
    . Association de salles (ManyToOne)


-Entité de salle avec attributs :

    .IDENTIFIANT
    
    .Code
    
    .Collection de machines (OneToMany)





## 4.Mise en œuvre
## 1. Interface DAO

-Interface générique définissant les opérations CRUD

-Méthodes : create(), delete(), update(), findById(), findAll()

## 2. Couche de service

-MachineService : implémente les opérations CRUD pour l'entité Machine

-SalleService : implémente les opérations CRUD pour l'entité Room


## 3. Configuration de la base de données

-Base de données MySQL nommée « salles »

-Génération automatique de tableaux via Hibernate

-Configuré à l'aide de hibernate.cfg.xml


## 4.Mise en place des tests unitaires avec JUnit 

-Suite de tests complète utilisant JUnit

-Tests pour MachineService et SalleService

-Couverture de toutes les opérations CRUD

-Test de requête  findBetweenDate 
