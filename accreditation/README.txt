
Developed using Eclipse and Java 14
Some of the dependencies in the pom are there because I was running on java > 11
Important!!!! For simplicity in the demo there is a single maven module that includes the web, Eureka and microservice. 
In a more realistic scenario each component will have its own module.
For a more complex system we would also consider introducing an API gateway if needed.

To compile and run the application do the following steps:
- Make sure you have defined the environment variables: JAVA_HOME, M2_HOME, M2 and have maven and java defined in your path
- To compile from the command line run from the pom deployment directory: mvn clean package
- For this demo the easiest is to run from the command line with three different windows:
	java -jar target/accreditation-0.0.1-SNAPSHOT.jar eureka -> Executes the Eureka server
	java -jar target\accreditation-0.0.1-SNAPSHOT.jar accreditation -> Executes the accreditation microservice
	java -jar target/accreditation-0.0.1-SNAPSHOT.jar web  -> Executes the Web Server
- To check the Eureka server is running, from your browser navigate to: http://localhost:1111/
- To check that the accreditation microservice is running, from your browser navigate to: http://localhost:2222
- To check that the web server is running, from your browser navigate to: http://localhost:3333
- To check for accreditations run from curl a POST command to: http://localhost:3333/user/accreditation with the body:
{
  "user_id": "g8NlYJnk7zK9BlB1J2Ebjs0AkhCTpE1V",
  "payload": {
    "accreditation_type": "BY_INCOME",
    "documents": [{
        "name": "2018.pdf",
        "mime_type": "application/pdf",
        "content": "ICAiQC8qIjogWyJzcmMvKiJdCiAgICB9CiAgfQp9Cg=="
      },{
        "name": "2019.jpg",
        "mime_type": "image/jpeg",
        "content": "91cy1wcm9taXNlICJeMi4wLjUiCiAgICB0b3Bvc29ydCAiXjIuMC4yIgo="
      }
    ]
  }
}