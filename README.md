# cal_demo

SPE mini project:
Tools Used :-
Below mentioned tools are tools used-
1.Maven
2.Jenkins
3.Docker
4.Ansible
5.Github
6.Webhook
7.ngrok

Steps Involved:
1.Goal is to develop the scientific calculator program with below mentioned operations:
  Square root, Factorial, Natural logarithm, and Power function
2.Use Source control management and Git to manage version control system, and create repository on github.
3.Create Calculator.java main file and write testing framework for yor program using Junit.
4.Use Maven tool to build your code and create a executable jar file.
5.Use conterization for your code by creating Docker image on your system and further pushing to the Dockerhub, so that image can be pulled further on any   system.
6. Integrate the process into Jenkins pipeline for continuous development.integration.
7. Configuration management tool used is Ansible to manage configuration and deploy docker image on any host.
8. Calculator program can be deployed on any machine such as your local machine or any other cloud.
9. After deployement, you will have image named "vishalsin25/miniproject:latest" in your images which can be start and run
   docker images //will give images 
   docker run -it vishalsin25/miniproject // to run the container
10. Now we can do continuous monitorinf through ELK stack, geneate the logfile for your program using log4j which can be passed on to ELK for further monitoring the logs.

     
