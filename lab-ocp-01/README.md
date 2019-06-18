This repository contains exercises for Lund & Bendsen training sessions
Questions are written with italics and answers may be written at the line below.

# Pre-setup of lab exercises

Login to Bitbucket by accessing this URL:  
https://bitbucket.org/ocplabadmin/master-labs/src/master/

The username and password are given by instructor.  
Navigate to your assigned Bitbucket project (e.g. USER01). You have received your own project in Bitbucket.

Create a new repository with your username (e.g "user01") by forking the "master-labs" repository found here:  
https://bitbucket.org/ocplabadmin/master-labs.git

You may write answers and comments into your forked repositories.  

The files used for the exercises 1.x are located in this folder.


Other information you may need during the exercises.  
The URL to OpenShift Console is:  
https://console.pro-us-east-1.openshift.com/console

The URL to master API is:  
https://api.pro-us-east-1.openshift.com


## Exercise 1.1
Login into OpenShift using the username and password given by the instructor.  
*Which project(s) do you see in OpenShift?*

### __________________

## Exercise 1.2
We are going to run everything from the browser, so we need a terminal and an oc command somewhere.  
Let's get an image which contains that.

Deploy tools-image to your project in OpenShift.  
Select "Import YAML/JSON" from the "Add to Project"  
Paste the content of tools-org.yaml found in the same folder as this README.md file.


After deployment verify if pod is alive.  
*What is the pod's running state?*

### __________________

## Exercise 1.3
As you may have noted the pod is terminating again and again.  
Let's find the reason.

Open a debug terminal into the pod to see the files in the container.  
*Is the command 'oc' available inside the container?*

### __________________

Copy the token from OpenShift Console UI.  
Enter debug terminal again.
Select your project, for example:  
```
oc project user01
```

*List the pods running in your current project. Which pods do you see?*

### __________________

Exit the pod.

*Why is the pod restarting all the time?*

### __________________


# Instructor will now continue the presentation.

Link to API documentation:

https://docs.openshift.com/container-platform/3.11/rest_api/apis-apps.openshift.io/v1.DeploymentConfig.html



## Exercise 1.4
The container is constantly restarted. Let's try another deployment configuration.  
Import the file tools.yaml from your repository into OpenShift.

Use the OpenShift Console for this task as before ("Add to project" -> "Import yaml")

or use the oc command to apply the file like below from the "debug terminal".
Remember to insert your repository name, e.g. user01
```
  cd /tmp
  git clone https://ocp-lab-user@bitbucket.org/ocplabusers/<repo>.git
  cd user*
  oc apply -f tools.yaml
```

*Watch the pod status. Does the pod stay alive?*

### __________________

Note, the sleep is only a work-a-round to keep the tools container alive.
Don't use this in real life solutions.


## Exercise 1.5
Open a terminal windows for the pod running "tools".
Login using oc and list pods for your project.

*Which security implication do you see when running this image and using oc command like this?*

### __________________

*What could be done to minimize the risk?*

### __________________














