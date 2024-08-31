# Introduzione
GeoCulutra è un progetto realizzato per l'esame di Ingegneria del Software presso Unicam A.A. 2023/2024, realizzato da: 
- Kevin Concettoni
- Matteo Bolognini

Il software prevede la gestione di informazioni relative ad un territorio, consentendo la digitalizzazione di informazioni quali eventi, punti di interesse, itinerari e altro.
# Struttura generale
Il progetto si basa su delle API per poter inserire e gestire i dati tramite chiamate HTTP. Queste API vengono esposte tramite il servizio di Swagger che offre un interfaccia grafica semplice e versatile per poter
effettuare le chiamate HTTP in maniera rapida ed efficace. 
Queste chiamate consentono di creare e gestire tutte le informazioni presenti nel territorio: eventi, itinerari, punti di interesse... e di controllare tutti i contenuti a loro associati. 
All'interno del progetto è anche presente un file Visual Paradigm che mostra tutte le iterrazioni che hanno contributio alla realizzazione del progetto, evidenziando tutti i casi d'uso e diagrammi 
poi implementati nel codice. 
# Come avviare il progetto
Per poter avviare ed eseguire il progetto sarà necessario, come prima cosa, avere installato Maven sul priprio dispositivo. 

Una volta installato Mavan, scaricare il progetto o clonare la cartella. 

Fatto ciò, sarà sufficiente compilare il progetto tramite il comando: 

`mvn clean install` 

e successivamente lanciare il file jar generato da Maven, il quale dovrebbe essere generato con il seguente nome: 

`java -jar .\target\GeoCultura-1.0-SNAPSHOT.jar`

Infine, visitare la seguente pagina per testare le API: 

`http://localhost:8080/swagger-ui/index.html`
