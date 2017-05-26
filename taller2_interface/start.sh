mvn clean package
docker build -t interface .
docker run -d -p 8880:8080 --name interface interface