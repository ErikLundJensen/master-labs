This repository contains exercises for Lund & Bendsen training sessions

These exercise will walk you through a simple setup of GitOps to get a feeling of the concept.  


## Pre-setup of lab exercises


## Exercise 8

This exercise will walk you through a simple setup of GitOps to get a feeling of the concept.  


## Exercise 8.1

We need a repository that will control your OpenShift project.  
Fork the following repository into a new repository named "user01":
https://bitbucket.org/erik-lund/exercise-8a/src/master/

Make it public until you have credentials configured.


## Exercise 8.2

You need to create a deploy engine in this exercise. It will be a pretty simple one.    

Edit the git-uri in the buildconfig.yaml to match you newly created git repository in BitBucket.

Apply the buildconfig.yaml file located in this folder.
It will create a BuildConfig named "gitops-deployer"

We are doing a short-cut and setting up a token in the BuildConfig. Copy your login credentials from Console.  
Cut out the token value from the string and insert it into the BuildConfig as an environment variable:  
OC_TOKEN: <token>

The token is used when deploying to your namespace. (A better solution would be to use a ServiceAccount)

Next copy the generic webhook trigger secret in the buildconfig.yaml
We need that to setup the webhook in Bitbucket in the next exercise.


## Exercise 8.3

Next we will setup the webhook in Bitbucket.  
Navigate to your new repository in Bitbucket. Select "Settings"->"webhook"->"add webhook"  

Give the webhook a title so you know what it is for. For example "Deployment to User01".  
Construct an URL using this template:  
http://<openshift_api_host:port>/oapi/v1/namespaces/<namespace>/buildconfigs/<name>/webhooks/<secret>/generic

For example
https://api.pro-us-east-1.openshift.com/oapi/v1/namespaces/user01/buildconfigs/gitops-deployer/webhooks/suydfiasfasifaenifsf/generic

Expand the option "Choose from a full list of triggers" to find the merge-request-trigger.

(Remember to press Save when done)  


## Exercise 8.4

Now we will simulate a release.

Edit one of the yaml files in the ocp folder to simulate a change. The change could just be a new label to keep it simple.
You may use Bitbucket for editing, committing and even creating a pull-request.  
In real world you would have naming standard for branches and here you could choose the branch name:
release/1-0-0

When you have created the merge-request then you may merge it.
You could also have added other reviews or the project responsible could have chosen that for your team.

Watch the Build in OpenShift Console when merging the pull-request in BitBucket. 


## Exercise 8.5

Take a look at the file assembly in .s2i/bin folder.  
There is room for improvement...

