docker build . -t dogotogo
docker stop dogotogo
docker rm dogotogo
docker run -d -p 8080:8080 --name=dogotogo dogotogo