node('master') {
    stage('Checkout') {
        checkout scm
    }
    stage('Build') {
         dir('MBTEST\pom.xml') {
            sh 'mvn clean install'
          }
      }
    }