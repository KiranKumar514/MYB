node('master') {
    stage('Checkout') {
        checkout scm
    }
    stage('Build') {
         dir('MBTEST') {
            sh 'mvn clean install'
          }
      }
    }