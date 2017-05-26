cd taller2
mvn clean install
cd ../taller2_interface
mvn clean install
cd ..
docker-compose up -d --build
