node('master') {
    stage('Checkout') {
        checkout scm
    }
    stage('Run tests') {
         dir('MBTEST/pom.xml') {
            sh 'mvn clean install -Dwebdriver.type=chrome -Dwebdriver.chrome.driver=C:Users/kiran.kumar/Selenium/Drivers/chromedriver.exe'
          }
      }
    }
