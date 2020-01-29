node('master') {
    stage('Checkout') {
        checkout scm
    }
	stages{
       stage('Build') {
         dir('MBTEST') {
		 steps{
            sh 'mvn clean install'
          }
       }
     }
   }
 }