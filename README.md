# DD2480 Lab 1
[![Build Status](https://travis-ci.org/Cpptz/dd22480_lab_1.svg?branch=master)](https://travis-ci.org/Cpptz/dd22480_lab_1)
[![codecov](https://codecov.io/gh/Cpptz/dd22480_lab_1/branch/master/graph/badge.svg)](https://codecov.io/gh/Cpptz/dd22480_lab_1)

This tool decides whether or not to fire an anti-ballistic missile in a simulated environment.


## Description
The program takes input in the form of hypothetical radar data and generates a boolean signal that determines if a simulated anti-ballistic missle is to be fired. This is decided by the function DECIDE(), which takes all the radar data and determines which combinations of several possible "Launch Interceptor Conditions" (LIC) are relevant to the recieved radar data. 

There are 15 LICs, and DECIDE() evaluates them all and assignes the 15 corresponding boolean values to a "Conditions Met Vector" (CMV). The "Locigal Connector Matrix" (LCM) defines which LICs must be evaluated jointly. What conditions have been met (CMV) and how the conditions relate to each other (LCM), is combined and stored in the "Preliminary Unlocking Matrix" (PUM). 

The last step is to consider which LIC's acctually matter, which is done in the "Preliminary Unlocking Vector"(PUV). The elements in the PUV indicate how to combine elements in the PUM to form the "Final Unlocking Vector"(FUV). If all values of the FUV are true, it is allowed to fire an anti-ballistic missle.

## Documentation
### Platform and dependencies
This project uses Java 8 and our dependencies are handled with Maven, see pom.xml. Junit 5 is used for testing.

TODO: speak about maven, junit and java and installation (tools needed to run it)

### How to run it ?

IDE 
terminal command


### Test
We test every method in Calculator, LIC and Line with unittest. An E2E test has also been made for the DECIDE function.


## Contributions

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
	* Code clean-up
	
* Viktor Widin
	* LIC 4
	* calcQuadrant
	* Readme
	* Documentation for Calculator method

* Robin Gunning
    * LIC 3
    * LIC 5
    * LIC 7
    * LIC 11
    * calculateArea