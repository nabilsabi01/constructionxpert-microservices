# ConstructionXpert Services 🏗️

Bienvenue dans le projet ConstructionXpert Services ! Cette application de gestion de projets de construction est basée sur une architecture microservices pour assurer une meilleure évolutivité, maintenabilité et résilience.

## 📚 Table des matières

- [Vue d'ensemble](#vue-densemble)
- [Microservices](#microservices)
- [Technologies utilisées](#technologies-utilisées)
- [Prérequis](#prérequis)
- [Installation](#installation)
- [Configuration](#configuration)
- [Utilisation](#utilisation)
- [Tests](#tests)
- [Déploiement](#déploiement)
- [Contribution](#contribution)
- [Licence](#licence)

## 🌐 Vue d'ensemble

ConstructionXpert Services est une application de gestion de projets de construction composée de plusieurs microservices interconnectés. Chaque service gère une partie spécifique des fonctionnalités de l'application, communiquant via des API RESTful sécurisées.

## 🧩 Microservices

1. **Service de Gestion des Projets** 📊
   - Création, affichage, mise à jour et suppression de projets

2. **Service de Gestion des Tâches** ✅
   - Gestion des tâches associées aux projets

3. **Service de Gestion des Ressources** 🛠️
   - Gestion des ressources nécessaires aux projets

4. **Service Registry/Discovery (Eureka)** 🔍
   - Enregistrement et découverte dynamique des services

## 🛠️ Technologies utilisées

- Java 21
- Spring Boot 3.3.3
- Spring Cloud
- Maven
- MySQL
- Flyway
- Eureka
- Postman (pour les tests API)

## 📋 Prérequis

- JDK 21
- Maven 3.8+
- MySQL 8+
