
1. start Docker Desktop
2. run docker-compose up from root folder
3. start kafka-producer application with "mvn spring-boot:run"
4. send a post request using postman to the following URL

http://localhost:9010/kafka/createUser?userId=1&firstName=Lokesh&lastName=Gupta

5. Start kafka-consumer application with "mvn spring-boot:run > consumer.log".
Open log file and search for "received ->"

