This repository contains exercises for Lund & Bendsen training sessions

# Pre-setup of lab exercises

Fork and/or clone the following repository:
https://github.com/ErikLundJensen/master-labs.git

The files used for the exercises 1.x are located in this folder.

OpenShifdt username and password given by the instructor.

Add the following to you local /etc/hosts file (Linux). If you already have entries for crc then please comment those out.
You will get the IP-ADDRESS from the instructor.

```
IP-ADDRESS  git.testing api.crc.testing canary-openshift-ingress-canary.apps-crc.testing console-openshift-console.apps-crc.testing default-route-openshift-image-registry.apps-crc.testing downloads-openshift-console.apps-crc.testing oauth-openshift.apps-crc.testing
```

The OpenShift Console URL is:  
https://console-openshift-console.apps-crc.testing

Use the 'oc' command line interface, replace <X> with your user-number:
```
eval $(crc oc-env)
oc login -u user<X> https://api.crc.testing:6443
```

## Exercise 1
Use the oc command to apply the file like below from the "debug terminal".
Remember to insert your repository name, e.g. user01
```
  cd /tmp
  git clone https://github.com/ErikLundJensen/master-labs.git
  cd master-labs/lab-ocp-01/
  oc apply -f podinfo.yaml

  oc get pod --watch
```
Use CTRL-C to break the watch of pods.







