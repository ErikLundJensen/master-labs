This repository contains exercises for Lund & Bendsen training sessions  
Questions are written with italics and answers may be written at the line below.

# Pre-setup of lab exercises

Login to Bitbucket by accessing this URL if your are not already logged in:  
https://bitbucket.org/ocplabadmin/master-labs/src/master/

The username and password are given by instructor.  

The files used for the exercises 2.x are located in this folder.

## Exercise 2.1
Login into OpenShift using the username and password given by the instructor.

Navigate to your project (e.g. USER01)  
Select the "tools" pod from the "Overview page"  
Select "Events" from the menu.  

You should see events like:

Started  
Created  
Pulled  
Pulling  
Scheduled

Navigate to Applications/Deployment and modify the image version to a non-existing version.  
For example update the element image to use version 4.11b.  
Either do it by using the Console (Edit deployment) or use oc to apply the new tools.yaml file found in the folder for this exercise.  
```
 image: 'docker-registry.default.svc:5000/prepare/openshift-cli:4.11b'
```
For example by using the pod's terminal:
```
  cd /tmp
  git clone https://ocp-lab-user@bitbucket.org/ocplabusers/<repo>.git
  cd user*
  oc apply -f tools.yaml
```

 
Open a new browser tab and navigate to "Overview page"

*What is the status of "tools"?*

______________
 
Expand the bar and see the pod status.  
The new pod does not start, right?  
Navigate to "Events"

The events should indicate why the deployment is waiting.

*Can you tell when will the deployment fail?*

_yes/no_

## Exercise 2.2
Navigate to the list of "pods"

Be aware of the pod in state "image pull back-off"  
Select the pod with the post-fix deploy.  
Select "logs".

Sometime you will find messages that can help you solving a failed deployment.  
Note the link "View Archived". This will bring you to Kibana.


## Exercise 2.3
Restore the version number. Either use the Console or use oc command in the tools pod's terminal:
```
  oc rollout undo dc tools
```

You should end up using this image:
```
  image: 'docker-registry.default.svc:5000/prepare/openshift-cli:3.11b'
```
Watch the status of the deployment.

OpenShift cancelled the halted deployment pod and started a new deployment.

Verify the event and see that the deployment went fine.

You can also see that the deploy pod is now terminated.













  
 
