# Build docker image and run

```
docker build -t mywebapp .
docker run -d --name mywebapp -p 80:80 mywebapp
```

# List all docker images
```
docker images
```

# List all containers that are running
```
docker ps
```

# Stop a container
```
docker stop container_name
```

# Details of docker
```
docker info
```

# Docker Storage info
```
docker info | grep Storage
```