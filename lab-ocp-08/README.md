This repository contains exercises for Lund & Bendsen training sessions

These exercise will walk you through a simple setup of GitOps to get a feeling of the concept.  


## Pre-setup of lab exercises


## Exercise 8

This exercise will walk you through a simple setup of GitOps to get a feeling of the concept.  


## Exercise 8.1

Create a repository that will mimic your OpenShift project.
For example create a public repository named "user01".  
Make it public until you have credentials configured.


## Exercise 8.2

You need to create a deploy engine in this exercise. It will be a pretty simple one.  
Create a new deployment using the same image as the "tools" deployment.  
Change the command to:


- command: ["/bin/sh", "-ec", "while :;do true; sleep 10; done"]
while :;do true; 
  lastCommitId=`git log -1 --pretty=oneline | head -1`;
  sleep 10;
; done"]

This exercise is located in this repository. Follow the instruction in the README.md file in that repository.

https://bitbucket.org/erik-lund/exercise-8a









  
 
