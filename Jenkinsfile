node('master') {
    stage('Checkout') {
        checkout scm
    }
    
    stage('Run tests') {
      withMaven(maven: 'Maven 3') {
          dir('MBTEST') {
            sh 'mvn clean test -Dwebdriver.type=chrome -Dwebdriver.chrome.driver=C:Users/kiran.kumar/Selenium/Drivers/chromedriver.exe'
          }
      }
    }
}
