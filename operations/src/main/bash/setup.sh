#!/bin/bash

sudo apt install swi-prolog-java
sudo apt install swi-prolog-nox
mvn install:install-file -Dfile=/usr/lib/swi-prolog/lib/jpl.jar -DgroupId=jpl -DartifactId=jpl -Dversion=7.6.1 -Dpackaging=jar -DgeneratePom=true
