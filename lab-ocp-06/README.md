This repository contains exercises for Lund & Bendsen training sessions
Questions are written with italics and answers may be written at the line below.

# Pre-setup of lab exercises

Login to Bitbucket by accessing this URL if your are not already logged in:
https://bitbucket.org/ocplabadmin/master-labs/src/master/

The files used for the exercises 6.x are located in this folder.

You may write answers and comments into your forked repositories.

## Exercise 6.1

Navigate to "tools" pod's terminal and delete all objects labled "app=helloworld"
Remember to login using the token from Console.

```
 oc delete pod -l app=helloworld
```

Apply all the yaml files in the folder lab-ocp-06/ocp
You may clone this respository to get the files into the pod:
```
cd /tmp
git clone https://erik-lund@bitbucket.org/ocplabadmin/master-labs.git
```

Start the build of Helloworld using the oc start-build command.

Verify that Helloworld is running.


## Exercise 6.2

Let's change the debug level of Spring Boot.

I could be done by add a new environment variable to the DeloymentConfig:
```
            - name: debug
              value: 'true'
```

However, in this exercise will we try to use ConfigMap.
Continue in the terminal in the "tools" pod.

Let's create a ConfigMap from a properties file.
The application.properties is located in lap-ocp-06/properties
 
```
oc create configmap helloworld --from-file application.properties
```

Have a look at the create config map:
```
oc get configmap helloworld -o yaml
```

oc get configmap helloworld -o yaml


What about adding multiple files to a config map?
You may specify a folder as argument. (Remember to change directory to the right location)
```
oc delete configmap helloworld
oc create configmap helloworld --from-file properties
```

Have a look at the recreated configuration file.

## Exercise 6.3

Let's use the ConfigMap in the pod.

Add the helloworld ConfigMap to the DeploymentConfig.  
Look at the "ConfigurationManagement" slide if you need to see the syntax.
Note: You need to add the ConfigMap to volumes and mount the volume in the pod.

Mount the ConfigMap into this location:
/etc/config

Watch the deployment and enter the pod's terminal to see the actual files in /etc/config

You may look into the folder "exercise-6.3" if you need help with the syntax.
It can be hard to get the indentation correct in yaml files.


## Exercise 6.4

This exercise is focused at mounting a persistent volume into the "tools" pod.  
Thereby it will be possible to keep cloned git repository in the pod even if the pod is restarted.

You will find the original tools.yaml in the folder "exercise-6.4"  
Create a persistent volume claim og 100mb and add mount it into the tools.yaml file.
Use the mount location /var/workspace 

Apply the tools.yaml using the oc command.

Watch the deployment.


## Exercise 6.5
Start a terminal for the "tools" pod.  
Change directory to /var/workspace

Clone one of the git repositories.

Restart the pod by deleting the active running tools pod.

Verify that the new pod still contains the /var/workspace still contains your cloned repository.



















  
 
