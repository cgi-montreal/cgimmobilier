# Agence Immobilere

## Plan de travail


## Architecture 

### technologies 

* DB - MySQL
* Java - Spring Boot - Spring Eco-System
* GraphQL - Java / JS 
* ReactJs  
* React Native  

### Architecture logiciel 
#### Micro-services proposé 
* Acheteur (Buyer) - Mehdi 
...* Port: 8181
* Vendeur  (Seller) -  Florent
...* Port: 8182
* Retail agent ( Agent Immobilier) - Tamara
...* Port: 8183
* Property (Propriété) - Maxime
...* Port: 8184
* Appointment (Rendez-vous) - Dimtar
...* Port: 8185 
* Usager (User / Login) - Jean-René
...* Port: 8186
* Option (Option) - Kevin
...* Port: 8187

#### Service GraphQL
GraphQl servers:
* maitre - Serveur GraphQL Principale
...* Port: 8280
* Acheteur (Buyer) - Mehdi 
...* Port: 8281
* Vendeur  (Seller) -  Florent
...* Port: 8282
* Retail agent ( Agent Immobilier) - Tamara
...* Port: 8283
* Property (Propriété) - Maxime
...* Port: 8284
* Appointment (Rendez-vous) - Dimtar
...* Port: 8285 
* Usager (User / Login) - Jean-René
...* Port: 8286
* Option (Option) - Kevin
...* Port: 8287

#### Chaque Microservice est une app CRUD
* Un compsant list
* Un compsant Details (Ajout Suppression Consultation, Modification)
* Un compsant Recherche 

En gros ce qui est proposé est que l’on s’occupe chacun d’une partie de l’application full stack. De la DB au Front end React Native en passant par GraphQL .

# Problèmes

## Dépôt de code source :
Je suis en contact avec Simon Pour un dépôt pour notre code source 

## Problème d'émulateur Android
l'emulateur fait cracher nos machines