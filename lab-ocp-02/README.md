This repository contains exercises for Lund & Bendsen training sessions  
Questions are written with italics and answers may be written at the line below.

# Pre-setup of lab exercises

Continue from the setup from exercise 1.1

## Exercise 2.1

Get logs from pod

```
  oc logs deployment/podinfo --follow
```
User CTRL-C to break the follow of logs.


## Exercise 2.2

Delete the pod and follow the Kubernetes events

```
  oc delete pod --selector=app.kubernetes.io/name=podinfo
  oc get events --watch
```


## Exercise 2.3

We would like to see how errors may look like.

Apply the podinfo-unknow-image.yaml and watch the events
```
  oc apply -f podinfo-unknow-image.yaml
  oc get events --watch
```

Be aware of the pod in state "image pull back-off"  
Often you will find events that can help you solving a failed deployment.


## Exercise 2.4
Restore the image reference.
```
  oc apply -f podinfo.yaml
```

Watch the status of the deployment using the get event command watch pods.













  
 
