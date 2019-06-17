This repository contains exercises for Lund & Bendsen training sessions
Questions are written with italics and answers may be written at the line below.

## Pre-setup of lab exercises



## Exercise 5

This exercise is located in the repository listed below. Follow the instruction in the README.md file in that repository.

https://bitbucket.org/erik-lund/exercise-5a
  

## Exercise 5.x
OpenShift Online does not allow building from Dockerfile. This exercise is therefore skipped.

```
docker login -u demo@erikjensen.it -p <token> https://registry.pro-us-east-1.openshift.com 

export VERS=3.11b
export USER=user01

docker  build -t ${USER}/openshift-cli .
docker tag ${USER}/openshift-cli:latest registry.pro-us-east-1.openshift.com/${USER}/openshift-cli:${VERS}
docker push registry.pro-us-east-1.openshift.com/prepare/openshift-cli:${VERS}
```











  
 
