# myRetail - a case study

This is a web application written with Grails 3.1.3.

Installation Steps

1. It is assumed you have already installed, as a minimum, a Java Development Kit (JDK) version 1.7 or above.  If you do not, download the appropriate JDK for your operating system, run the installer, and then set up an environment variable called JAVA_HOME pointing to the location of this installation.

2. If you do not already have Grails 3.1.3 installed, please use SDKMan (http://sdkman.io/install.html) to install it by typing sdk install grails 3.1.3 in the terminal.  If you prefer to manually install:       
    a. Download (https://grails.org/download.html) a binary distribution of Grails and extract the resulting zip file to a location of your choice
    b. Set the GRAILS_HOME environment variable to the location where you extracted the zip
      i. On Unix/Linux based systems this is typically a matter of adding something like the following export GRAILS_HOME=/path/to/grails to your profile
      ii. On Windows this is typically a matter of setting an environment variable under My Computer/Advanced/Environment Variables
    c. Then add the bin directory to your PATH variable
      i. On Unix/Linux based systems this can be done by adding export PATH="$PATH:$GRAILS_HOME/bin" to your profile
      ii. On Windows this is done by modifying the Path environment variable under My Computer/Advanced/Environment Variables

3. If Grails is working correctly you should now be able to type grails -version in the terminal window and see output similar to this: | Grails Version: 3.1.3 | Groovy Version: 2.4.6 | JVM Version: 1.8.0_25

4. Clone code from this GitHub repo to your machine and navigate to the root myRetail directory.

Running tests

1. To run the tests, simply type grails test-app and hit enter to run them all.
2. to view the results of the tests in detail, navigate to build/reports/tests/index.html

Running the application

1. to start the application on a server, simply type grails run-app and hit enter
2. once the server has completed starting up you should see: Grails application running at http://localhost:8080 in environment: development
3. navigate your browser to http://localhost:8080/product/index to see a list of products in the DB
4. to view a list of active products via a REST API use a GET request on the following URI: http://localhost:8080/products
5. to view a single product via the REST API use a GET request on http://localhost:8080/products/show/2 - where 2 is the ID of the product you wish to view
6. to change the format of the response from the REST API from JSON to XML, simply end your URI with .xml
