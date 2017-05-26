mvn clean package
docker build -t demo .
docker run -d -p 9990:8080 --name consumer demo