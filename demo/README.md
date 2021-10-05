# Hello world spring boot applicaiton

## Key take aways

1. hello world docker
1. hello world docker-compose
1. hello world k8s (kubernetes)
1. hello world helm

## pre requisites

1. [docker](https://docs.docker.com/get-docker/)
1. [docker-compose](https://docs.docker.com/compose/install/)
1. [kubernetes](https://kubernetes.io/docs/tasks/tools/)
1. [helm](https://helm.sh/docs/intro/install/)

## basic terms to understand

1. docker - in simple words docker is a tool to containerise your application to isolate it from other system processes to run in a dedicated environment.
1. docker-compose - tool that enables to run multiple docker containers corresponding to one set/group of configuration like different microservices of one large application.
1. kubernetes - a simple tool that helps to manage containers, container orchestration etc.
1. helm - simple package manager for kubernetes and makes it easy to install applications and resources into Kubernetes clusters.

```
Note: If you already have docker installed try to enable Kubernetes from docker desktop and skip installing kubernetes once kubernetes cluster is enabled by docker desktop.
```

## quick commands

1.  list running docker containers `docker ps`, adding `-a` to this lists all containers
1.  build docker image from Dockerfile `docker build .`, where `.` is the context of the Dockerfile
1.  `docker-compose up` in the path of `docker-compose.yaml` files will start running all the containers configured. (if files are not build docker-compose takes care of building images for us, explicit build command is `docker-compose up --build`)
1.  `kubectl create -f <yaml filename>` creates resources(pods|services|deployments etc) in the mentioned file
1.  `kubectl get pods|services|deployments` used to list resources accordingly additionally `-n namespace` can be added to get resources from specific namespace
1.  `helm create <chart name>` used to create a default helm chart with templates provided by helm cli
1.  `helm install [name] [chart] [flags]` used to install chart
1.  `helm uninstall [name] [flags]` used to uninstall chart
