node('master') {
    stage('Checkout') {
        checkout scm
    }
    stage('Build') {
         dir('MBTEST') {
		 steps{
            sh 'mvn clean install'
          }
      }
    }
 }