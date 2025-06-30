def buildApp(){
  echo "App ${parameters.APP_ENV}..."
  echo "Building the application..."
  echo "Version ${parameters.VERSION}"
}

def testApp(){
  echo "Testing the application..."
}

def deployApp(){
  echo "Deploying the application..."
}
return this

