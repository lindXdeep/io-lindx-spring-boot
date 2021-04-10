setup:
	mvn -N io.takari:maven:wrapper -Dmaven=3.6.3

clean:
	./mvnw clean
	
compile:
	./mvnw compiler:compile

build:
	./mvnw package

run:
	./mvnw spring-boot:run

open:
	google-chrome --incognito --new-window http://localhost:8080