This repository contains exercises for Lund & Bendsen training sessions
Questions are written with italics and answers may be written at the line below.

# Pre-setup of lab exercises

Login to Bitbucket by accessing this URL if your are not already logged in:
https://bitbucket.org/ocplabadmin/lab-ocp-003/src/master/

The username and password are given by instructor.  

Create a new repository with name "lab-ocp-003" by forking the "lab-ocp-003" repository.
You have received your own project in Bitbucket. Use that Bitbucket project (e.g. USER01) as target project.
https://bitbucket.org/ocplabadmin/lab-ocp-003.git

You may write answers and comments into your forked repositories.

## Exercise 3.1
From the "overview" page, expand the "tools" deployment to scale up the number of pods.
Scale the number of pods to 2.
Follow the deployment.

The number of pods should now be 2.
Navigate to the pods.

*Do you see a list of 2 pods?*

Each pod will get a unique name.


## Exercise 3.2
Navigate to your project (e.g. USER01)
Select "tools" pod from the "Overview page"
Select "Terminal" from the menu.

Apply the tools.yaml file from the lab-ocp-003 deployment.
This version of tools.yaml requests 200 mb of memory. We will thereby run out of memory in the cluster when all are trying to deploy the new configuration.
Let's how that looks.

```
 vi /tmp/tools.yaml
```
   press esc i  
   paste file content into editor  
   press esc : s  
   press esc : q
   
   To exit and ignore changes then press esc : q!  
```
 oc login ... (the copied command from OpenShift Console)   
 oc apply -f tools.yaml
```
 
Watch the "overview" page in the Console to see what happens.
Some of you may get a new running pod.
Others will be stuck in deployment phase.

If your pods did not fail then scale the number of pods to 5.
And wait for the result.

## Exercise 2.3
Navigate to the "monitor" -> "monitoring and events"

Look at the event. You should see something similar to:
```
Replication Controller
Failed Create 	
Error creating: pods "tools-4-" is forbidden: exceeded quota: 6572696b406c756e642e6169-compute, requested: limits.memory=200Mi, used: limits.memory=2000Mi, limited: limits.memory=2Gi
```

Look closer at the "overview" page. There is no error, but it says "scaling to 5..."

Hitting maximum quota is not an error. It is just a warning!
Let's clean up in the following exercises.


## Exercise 3.3
Change the requested memory to 20 mb in the configuration.
This time edit the yaml by using the OpenShift Console.

Watch the status of the deployment "tools"

*Does the deployment work?*

__________

Most likely you have got 2 deployments, for example:

Running, 0/5 replicas
Active, 4/5 replicas

The latest deployment is halted by the other deployment that did not finish.

Navigate to the "overview" page.

Note how the transitions is displayed.

## Exercise 3.4
Let's clean up by terminating the deployment.

There are two ways of doing this:

Either navigate to the "Deployments"->"tools" and select the latest deployment job.
Press "Cancel"
Next scale down the number of pods.


Or use the oc command to delete the pod.
```
 oc get pods
```   
Find the pod and delete it, or use this one-liner:
```
 oc delete pod `oc get pods -o name | cut -f2 -d'/' | grep deploy`
 oc scale dc tools --replicas=1
```

Watch the state in "overview"
or using oc command:

```
oc get pods
```

## Exercise 3.5
We need to restart the deployment.
Navigate to "Deployments"->"tools"

Select "Deploy" in the top right corner. This will start a new deployment.

Watch the deployment.

 
















  
 
