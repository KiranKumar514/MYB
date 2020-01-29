node('master') {
    stage('Checkout') {
        checkout scm
    }
    
    stage ('Build'){
    	dir("MBTEST") {
	   sh "mvn clean install"
       }
       	dir("MBTEST/target") {
	   sh "java -jar com.test-1.0-SNAPSHOT.jar"
       }
	}
}
