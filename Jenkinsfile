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
           gv.build()
        }
      }
      stage('test'){
     
        steps{
         gv.test()
        }
      }
      stage('deploy'){
        steps{
          gv.deploy()
        }
      }
    }
  }

