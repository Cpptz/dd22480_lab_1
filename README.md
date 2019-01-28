# DD2480 Lab 1
[![Build Status](https://travis-ci.org/Cpptz/dd22480_lab_1.svg?branch=master)](https://travis-ci.org/Cpptz/dd22480_lab_1)
[![codecov](https://codecov.io/gh/Cpptz/dd22480_lab_1/branch/master/graph/badge.svg)](https://codecov.io/gh/Cpptz/dd22480_lab_1)

This tool decides whether or not to fire an anti-ballistic missile in a simulated environment.


## Description
The program takes input in the form of hypothetical radar data and generates a boolean signal that determines if a simulated anti-ballistic missile is to be fired. This is decided by the function DECIDE(), which takes all the radar data and determines which combinations of several possible "Launch Interceptor Conditions" (LIC) are relevant to the recieved radar data. 

There are 15 LICs, and DECIDE() evaluates them all and assignes the 15 corresponding boolean values to a "Conditions Met Vector" (CMV). The "Locigal Connector Matrix" (LCM) defines which LICs must be evaluated jointly. What conditions have been met (CMV) and how the conditions relate to each other (LCM), is combined and stored in the "Preliminary Unlocking Matrix" (PUM). 

The last step is to consider which LICs actually matter, which is done in the "Preliminary Unlocking Vector"(PUV). The elements in the PUV indicate how to combine elements in the PUM to form the "Final Unlocking Vector"(FUV). If all values of the FUV are true, it is allowed to fire an anti-ballistic missile.

## Documentation
### Platform and Dependencies
This project uses *Java 8*.
On Debian-based systems, you could use the following two command lines to install the *JRE* and the *JDK*.
```bash
sudo apt install openjdk-8-jdk
sudo apt install openjdk-8-jdk
```
Our dependencies are handled with *Maven*, see [pom.xml](pom.xml). 


We have one main dependency: [Junit 5](https://junit.org/junit5/) 

### Specification
All LIC functions are described in decide.pdf in section 2.1. For example is LIC_4() described under point 4.

### Test
We have written unit tests for methods of:
* [Calculator.java](src/main/java/main/Calculator.java) in [CalculatorTest.java](src/test/java/main/CalculatorTest.java)
* [LIC.java](src/main/java/main/LIC.java) in [LICTest.java](src/test/java/main/LICTest.java)

and also end to end tests for the ``decide()`` of [Main.java](src/main/java/main/Main.java) 
in [MainTest.java](src/test/java/main/MainTest.java) 

### How to Run It
#### Terminal
On Debian-based systems, you could use the following  command line to install *Maven*.
```bash
sudo apt install maven
```
Then at the root folder, you can launch all tests by running
```bash
mvn test -B
```

#### IDE
Most of use *Intellij*.  

You just have to import the project and select the file you want to run by right clicking 
on it on the folder view on the left of the window.

You can also use the built-in maven tool on the right of the window to run all tests.

## Contributions

All of us agreed on a [guide](CONTRIBUTING.md) for contribution

This is what we have achieved 
* Cyril Pottiez
    * Set up of CI
    * LIC 0
    * LIC 1
    * LIC 14
    * computeAngle()
    * computeRadiusTriInCircleFromPoints()
    * PR merger

* Sara Ersson
	* LIC 6
	* LIC 8
	* LIC 9
	* LIC 13
	* Line class
	* areIdentical()
	* distToLine()
	* Code clean-up
	
* Viktor Widin
	* LIC 4
	* calcQuadrant()
	* README
	* Documentation for Calculator method

* Robin Gunning
    * LIC 3
    * LIC 5
    * LIC 7
    * LIC 11
    * calculateArea()
