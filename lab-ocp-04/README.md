This repository contains exercises for Lund & Bendsen training sessions
Questions are written with italics and answers may be written at the line below.

# Pre-setup of lab exercises

Continue from previous setup.

The files used for the exercises 4.x are located in this folder.

## Exercise 4.1

This exercise goes through configuration of readiness and lifeness probes.

First we will use an invalid readiness and liveness probes to simulate an unhealty pod. 
Use the podinfo-unhealthy.yaml file in this folder.

```
  oc apply -f podinfo-unhealty.yaml
  oc get pod --watch
```
Watch that the pods gets terminated and restarts with an interval around 14 seconds.

Consider why does the pod restart after around 14 seconds?


## Exercise 4.2

Modify the liveness health command in the podinfo-unhealthy.yaml file:  
`- localhost:9898/healthz`

and apply the file again.
```
  oc apply -f podinfo-unhealty.yaml
  oc get pod --watch
```

Does the pod still restart?


## Exercise 4.3

Let's see what happens if initialDelay is high long.  
Change the initial delay to 10 seconds for the readiness probe and apply the file again:
```
  initialDelaySeconds: 10
```

Watch the pod restarts and notice that it takes much longer for the pod to get into ready state.   


## Exercise 4.4

Restore proper readiness probe by applying the podinfo.yaml file again.  
Ensure the pod starts correctly.


