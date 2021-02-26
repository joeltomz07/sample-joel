def gv
pipeline{
  agent any
  parameters{
    choice(name:'VERSION',choices:['1.1.0','1.1.1','1.1.2'],description:'Version used')
    booleanParam(name:'execute',defaultValue:true,description:'please execute')
  }
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
        when{
          expression{
            params.execute
          }
        }
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

