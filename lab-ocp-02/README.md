This repository contains exercises for Lund & Bendsen training sessions
Questions are written with italics and answers may be written at the line below.

# Pre-setup of lab exercises

Login to Bitbucket by accessing this URL if your are not already logged in:
https://bitbucket.org/ocplabadmin/lab-ocp-002/src/master/

The username and password are given by instructor.  

Create a new repository with name "lab-ocp-002" by forking the "lab-ocp-002" repository.
You have received your own project in Bitbucket. Use that Bitbucket project (e.g. USER01) as target project.
https://bitbucket.org/ocplabadmin/lab-ocp-002.git

You may write answers and comments into your forked repositories.

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
For example update the element image to use version v4.11.0:
```
 image: 'widerin/openshift-cli:v4.11.0'
```
 
Return to the "Overview page"

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
Restore the version number:
```
 image: 'widerin/openshift-cli:v3.11.0'
```
Watch the status of the deployment.

OpenShift cancelled the halted deployment pod and started a new deployment.

Verify the event and see that the deployment went fine.

You can also see that the deploy pod is now terminated.













  
 
