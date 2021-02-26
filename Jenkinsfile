def gv
pipeline{
  agent any
    stages{
      stage('init'){
        steps{
          script{
            gv = load "script.groovy"
          }
        }
      }
      stage('build'){
        steps{
           echo "building the application"
        }
      }
      stage('test'){
        when{
          expression{
            params.execute
          }
        }
        
        steps{
          echo "testing the application"
        }
      }
      stage('deploy'){
        steps{
          echo "deploying the application"
        }
      }
    }
  }

