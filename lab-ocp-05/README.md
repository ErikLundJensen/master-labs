This repository contains exercises for Lund & Bendsen training sessions
Questions are written with italics and answers may be written at the line below.

# Pre-setup of lab exercises

Login to Bitbucket by accessing this URL if your are not already logged in:
https://bitbucket.org/ocplabadmin/lab-ocp-005/src/master/

The username and password are given by instructor.  

Create a new repository with name "lab-ocp-005" by forking the "lab-ocp-005" repository.
You have received your own project in Bitbucket. Use that Bitbucket project (e.g. USER01) as target project.
https://bitbucket.org/ocplabadmin/lab-ocp-005.git

You may write answers and comments into your forked repositories.


OpenShift Online does not allow building from Dockerfile. Therefore I have prepared the image locally:
```
sudo docker login -u erik@lund.ai -p <token> https://registry.pro-us-east-1.openshift.com 

export VERS=3.11b

sudo docker  build -t prepare/openshift-cli .
sudo docker tag prepare/openshift-cli:latest registry.pro-us-east-1.openshift.com/prepare/openshift-cli:${VERS}
sudo docker push registry.pro-us-east-1.openshift.com/prepare/openshift-cli:${VERS}
```











  
 
