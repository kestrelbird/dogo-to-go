docker build . -t dogotogo
docker stop dogotogo || true
docker rm dogotogo || true
docker run -d -p 8080:8080 --name=dogotogo dogotogo