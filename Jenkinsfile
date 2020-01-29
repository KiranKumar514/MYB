node('master') {
    stage('Checkout') {
        checkout scm
    }
    
    stage ('Run Test'){
    	dir("MBTEST/pom.xml") {
	   sh "mvn clean install"
       }
       	dir("MBTEST/target") {
	   sh "java -jar com.test-1.0-SNAPSHOT.jar"
       }
	}
}
