node('master') {
    stage('Checkout') {
        checkout scm
    }
    stage('Build') {
         sh 'mvn clean install'
        }
    }