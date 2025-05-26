# Simply JavaFX project #  
The app is simply desktop client for [ares.gov.cz](https://ares.gov.cz/) API.  
It is proof of concept for javafx:jlink.  
### To create the runtime image ###
`mvn clean javafx:jlink`  

### Run: ###  
This will create a custom runtime image in the target/application directory.
To run your application, use the generated launcher script:  
On Windows:
`Copytarget\application\bin\launcher.bat`  
On Linux/Mac:
`Copytarget/application/bin/launcher`  

One of the main advantages of using jlink is, it creates a standalone application that doesn't require users to have Java or JavaFX pre-installed on their system. It's a true "double-click to run" solution that works across platforms.
The final distribution size is also optimized since it only includes the specific Java and JavaFX modules your application actually uses, rather than the entire JRE and JavaFX framework.