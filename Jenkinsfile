pipeline {

    options {
        buildDiscarder(logRotator(numToKeepStr: '5', artifactNumToKeepStr: '5'))
    }

    agent any

    tools {
        maven 'maven-3.8.8'
    }
    stages {
        stage('Jave Code Compilation') {
            steps {
                echo 'code compilation is starting'
                sh 'mvn clean compile'
				echo 'code compilation is completed'
            }
        }
        stage('Jave Code test') {
                    steps {
                        echo 'code compilation is starting'
                        sh 'mvn test compile'
        				echo 'code compilation is completed'
             }
        }
        stage('Java Code Package') {
            steps {
                echo 'code packing is starting'
                sh 'mvn clean package'
				echo 'code packing is completed'
            }
        }

    }
}