Tomxis2
=======

Tomxis2 is the Tomcat application server and the Axis2 soap engine bundled in one package. 
It can be seen as a rapid and lightweight service development framework. 

It allows beginners to become productive from the first minute on while studying how things
work and how Axis2 and Tomcat modules are integrated with each other. There's no need to
setup the Tomcat or Axis2 environment as Tomxis2 already brings both as Maven dependencies.

Tomxis2 also has a heroku connection so that web services can be easily deployed in the 
amazon cloud, for free.

Installation
------------

Install Maven ([get it here](http://maven.apache.org/)) and Execute 
<code>git clone git://github.com/slopjong/Tomxis2.git</code> 

There's no more effort required. Really. 

Run it
------

```
cd Tomxis2
mvn package
chmod 755 target/bin/webapp
target/bin/webapp
```

It launches on port 8080 and uses the <code>src/main/webapp</code> 
as the web application directory by default. Both can be customized
by setting environment variables before launching as shown below:

```
PORT=8888 WEBAPPDIR=/var/lib/tomcat/webapp target/bin/webapp
```