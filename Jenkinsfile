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
          script{
             gv.build()
          }
          
        }
      }
      stage('test'){
     
        steps{
          script{
            gv.test()
          }
         
        }
      }
      stage('deploy'){
        steps{
           script{
            gv.deploy()
           }
        }
      }
    }
  }

