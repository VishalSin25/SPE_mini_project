pipeline {
    agent any
    environment {
        registry="vishalsin25/miniproject"
        registryCredential = 'dockerhub'
        dockerImage = ''
         LANG = 'en_US.UTF-8'
    }

    stages {
        stage('Git pull') {
            steps {
                git url: 'https://github.com/VishalSin25/cal_demo' ,branch:'master',credentialsId:'github'
            }
        }
        stage('Build maven') {
                    steps {
                        sh 'mvn clean install'
                    }
                }
        stage('Build Docker Image') {
                    steps {
                       script{
                       dockerImage=docker.build("vishalsin25/miniproject:latest")
                       }
                    }
                }
        stage('Push Docker Image') {
                    steps {
                        script{
                               docker.withRegistry('','dockerhub'){
                               dockerImage.push()
                               }
                              }
                           }
                        }
        stage('Delete docker image from local') {
                        steps {
                              script{
                               sh 'docker image rm -f vishalsin25/miniproject'
                               }
                            }
                        }

         stage('Ansible pull image') {
            steps {
                ansiblePlaybook(
                installation: 'Ansible',
                colorized:true,
                disableHostKeyChecking:true,
                inventory: 'Inventory',
                playbook:'playbook.yml',
                )
            }
        }
    }
}
