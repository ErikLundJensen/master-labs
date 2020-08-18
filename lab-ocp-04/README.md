This repository contains exercises for Lund & Bendsen training sessions
Questions are written with italics and answers may be written at the line below.

# Pre-setup of lab exercises

Login to Bitbucket by accessing this URL if your are not already logged in:
https://bitbucket.org/ocplabadmin/master-labs/src/master/

The files used for the exercises 4.x are located in this folder.

You may write answers and comments into your forked repositories.

## Exercise 4.1

This exercise goes through configuration of readiness and lifeness probes.

Add the readiness and liveness probes to the "tools" deployment.
Use the tools.yaml file in this folder.

Either copy content to Console or use oc apply command.

Wait for the deployment to complete.

## Exercise 4.2

Open 3 tabs of OpenShift Console.  
- Navigate to "Monitoring and Events" in the 1st tab  
- Navigate to "Overview" in the second tab  
- Navigate to tools pod's terminal in the third tab  

The health is monitoring the /tmp/healthy file. If this file is removed then the container is considered un-healthy.  
Remove the file inside the tools pod.

```
rm /tmp/healthy
```

Watch the 1st and 2nd tabs.  
Note the color change of the pod from dark blue to light blue. The pod get unavailable.  
Next the pod is terminated and a new pod is started.


## Exercise 4.3

Let's see what happens if initialDelay is too long.  
Change the initial delay to 20 seconds for the readiness probe:
```
            initialDelaySeconds: 30
```

Watch the pod restarts and focus at the color change.  
Light blue means the pod is not ready. No requests will be send to that pod.


## Exercise 4.4

Restore proper readiness probe by applying the tools.yaml file again.  
Ensure the pod starts correctly.
