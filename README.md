**Overview**
This project demonstrates a basic implementation of event-driven architecture using Apache Pulsar with Spring Boot. It focuses on producing and consuming messages in a scalable and cloud-native way.

**Features**
•	Message Producer
•	Message Consumer 
•	Apache Pulsar integration
•	Simple and clean project structure

**Tech Stack**
•	Java
•	Spring Boot
•	Apache Pulsar
•	Maven

**Project Structure**
src/main/java/... (controller, producer, consumer, config)
src/main/resources/application.properties.

**Setup Instructions**
1. Clone the repository.
2. Start Apache Pulsar (bin/pulsar standalone).
3. Run the Spring Boot application (mvn spring-boot:run).

**Usage**
**Send message using:**
curl "http://localhost:8080/api/send?msg=HelloPulsar"

The consumer will receive and log the message.

**Concepts Covered**
•	Tenants, Namespaces, Topics
•	Producers & Consumers
•	Event Streaming
•	Message-driven architecture

**Purpose**
This project is created for learning real-time data streaming, Apache Pulsar fundamentals, and building scalable backend systems.




