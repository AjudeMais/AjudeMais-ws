# Ajude Mais - API RESTful
API diponível em: [ajudemais.github.io/ajudeMais-web](ajudemais.github.io/ajudeMais-web)
 
# ESTRUTURA

Projeto subdividido em módulos usando o maven https://maven.apache.org/guides/mini/guide-multiple-modules.html 
```
├── ajudeMais-ws/
│   |
│   ├── RESTful-api
│   │   |
│   │   ├── src/main
│   │   │     ├── java
│   │   │          ├──br.edu.ifpb.ajudeMais.api
│   │   |── src/test
│   │   │     ├── java
│   │   │          ├──br.edu.ifpb.ajudeMais.api
|   |	├──── pom.xml
│   ├── data
│   │   |
│   │   ├── src/main
│   │   │     ├── java
│   │   │          ├──br.edu.ifpb.ajudeMais.data
│   │   |── src/test
│   │   │     ├── java
│   │   │          ├──br.edu.ifpb.ajudeMais.data
|   |	├──── pom.xml
│   ├── domain
│   │   |
│   │   ├── src/main
│   │   │     ├── java
│   │   │          ├──br.edu.ifpb.ajudeMais.domain
|   |	├──── pom.xml
│   ├── service
│   │   |
│   │   ├── src/main
│   │   │     ├── java
│   │   │          ├──br.edu.ifpb.ajudeMais.service
│   │   |── src/test
│   │   │     ├── java
│   │   │          ├──br.edu.ifpb.ajudeMais.service
|   |	├──── pom.xml
├── pom.xml
```

# REQUISITOS
* JDK 8;
* Apache Maven;
* Heroku Plugin (publicar api no heroku);

# USO
#### Comandos básicos para uso da aplicação
* git clone https://github.com/AjudeMais/ajudeMais-ws.git;
* sh run dev (executar aplicação localmente);
* sh run prod (publicar aplicação em produção);


 
