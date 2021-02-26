def build(){
  echo 'building the application'
}
def test(){
  echo 'testing the application'
}
def deploy(){
  echo 'deploying the application'
  echo "deploying the application with vresion ${params.VERSION}"
}
return this
