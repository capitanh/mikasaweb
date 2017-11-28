mikasaweb 4.0.0-SNAPSHOT
========================

A sandbox for testing different technologies and play with *the next big thing*. There is a Vagrantfile to start up the needed background, just do:

```bash
  vagrant up
```

It will provision an Ubuntu Trusty 64bits with a pre-loaded mysql database, ready to use from the application. Of course, you need to have vagrant and ansible installed on your host machine. Once you have the ddbb vm up and running, cd to the project root folder and type:

```bash
  gradle testReport
```
to perform unit and integration tests.
