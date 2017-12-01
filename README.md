mikasaweb 4.1.0
========================

A sandbox for testing different technologies and play with *the next big thing*. It's built using gradle and spring boot, to perform unit tests using an embedded H2 data base run:
```bash
gradle test
```
Integration and functional (UI) tests using the same H2 ddbb and embedded tomcat can be performed running:
```bash
gradle integrationTest
```
To run the application against a full MySQL data base, there is a Vagrantfile to start up the needed background, just do:

```bash
vagrant up   #wait for ansible provisioning to finish
gradle bootRun
```
It will provision an Ubuntu Trusty 64bits with a pre-loaded mysql database, ready to use from the application. Of course, you need to have vagrant and ansible installed on your host machine. Once everything is up and running, point your browser to:

http://localhot:8888 (user admin, password admin)
