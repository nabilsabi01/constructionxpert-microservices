# ConstructionXpert Services - Microservices

ConstructionXpert Services est une application de gestion de projets de construction développée en utilisant une architecture microservices. Ce projet est conçu pour améliorer l'évolutivité, la maintenabilité et la résilience de l'application. Chaque microservice gère une partie distincte des fonctionnalités, et ils communiquent entre eux via des API RESTful sécurisées.

## Structure du Projet

Le dépôt contient les services suivants :

- **project-service** : Gère la création, la mise à jour, la suppression et l'affichage des projets de construction. Il stocke les informations relatives aux projets, telles que le nom, la description, les dates de début et de fin, et le budget.

- **task-service** : Gère les tâches associées aux projets. Il permet la création, la mise à jour, la suppression et l'affichage des tâches, en spécifiant des détails tels que la description, les dates, le statut, et les ressources nécessaires.

- **resource-service** : Gère les ressources utilisées dans les projets de construction. Il permet d'ajouter, de mettre à jour, de supprimer et d'afficher les ressources, y compris leurs détails tels que le nom, le type, la quantité, et les informations du fournisseur.

- **eureka-service** : Fournit le service de découverte (Service Registry) pour les microservices. Il permet aux services de s'enregistrer et de se découvrir mutuellement, facilitant ainsi la communication dynamique entre eux.

## Configuration et Déploiement

2. **Migrations de Base de Données** : Chaque microservice dispose de sa propre base de données, et Flyway est utilisé pour gérer les migrations de schéma de manière versionnée.
