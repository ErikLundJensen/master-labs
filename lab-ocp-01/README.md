This repository contains exercises for Lund & Bendsen training sessions

# Pre-setup of lab exercises

Fork and/or clone the following repository:
https://github.com/ErikLundJensen/master-labs.git

The files used for the exercises 1.x are located in this folder.

OpenShift username and password given by the instructor.

Add the following to you local `/etc/hosts` file at MacOS/Linux or `C:\Windows\System32\Drivers\etc\hosts` for MS Windows. If you already have entries for crc then please comment those out.

```
10.4.37.21 argocd-server-argocd.apps-crc.testing api.crc.testing canary-openshift-ingress-canary.apps-crc.testing console-openshift-console.apps-crc.testing default-route-openshift-image-registry.apps-crc.testing downloads-openshift-console.apps-crc.testing oauth-openshift.apps-crc.testing
```

The OpenShift Console URL is:  
https://console-openshift-console.apps-crc.testing

Use the 'oc' command line interface, replace <n> with your user-number.
Copy the oc login command from the OpenShift UI.
```
oc login -u user-<n> https://api.crc.testing:6443
```

## Exercise 1
Use the oc command to apply the file like below from 

```
  cd /tmp
  git clone https://github.com/ErikLundJensen/master-labs.git
  cd master-labs/lab-ocp-01/
  oc apply -f podinfo.yaml

  oc get pod --watch
```
Use CTRL-C to break the watch of pods.







