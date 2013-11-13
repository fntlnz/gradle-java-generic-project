## Gradle Java Generic Project
This is my Gradle Java generic project.
It can compile all dependencies and classes into a single jar file ([uberjar](http://stackoverflow.com/questions/11947037/what-is-an-uber-jar))

The only dependencies it has by default are common-collections 3.2 and  jUnit 4.+

**Clone**
```
git clone https://github.com/fontanalorenzo/gradle-java-generic-project.git
```

**Build**
```
gradle build
```

**Compile into a single .jar**
```
gradle uberjar
```