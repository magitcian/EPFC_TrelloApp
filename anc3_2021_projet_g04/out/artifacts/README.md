How to make jar file with javaFX on intelliJ:

1) Make the first class main without "extends Application"

2) Add Artifact: 
    File/Project Structure/Artifacts/ 
    add (+) => Jar/From module to dependency
    Select Main class
    Select "extract to the target JAR"
    In Directory for Meta-Inf: take the source directory of the project (src)

3) Add files in Artifacts (+) :
    Take all the files in your SDK_Path/bin
    (The SDK path can be find in File/Project Structure/SDKs => see JDK home path)
		
4) Build Artifact: Build/Build Artifact
   => .jar file will be created automatically with manifest.mf and all the library .class file in folder out/artifacts.

5) Launch .jar file with command : java -jar filename.jar

6) Make a .jar for windows and another for linux

