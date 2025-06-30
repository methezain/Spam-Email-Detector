def gv

pipeline {
    agent any
    parameters {
        string(name: 'APP_ENV', defaultValue: '1.1.0', description: 'Version to display on prod (e.g., 1.1.0, 1.2.0, 1.3.0)')
        choice(name: 'VERSION', choices: ['1.1.0', '1.2.0', '1.3.0'], description: 'Select the deployment Version')
        booleanParam(name: 'EXEC_TESTS', defaultValue: true, description: 'Do you want to run tests?')
    } 
    stages {
        stage('init'){
            steps {
                script {
                    gv = load "script.groovy"
                }
            }
        } 
        stage('build') {
            steps {
                script {
                    gv.buildApp()
                }
            }
        }
        stage('test') {
            when {
                expression {
                    params.EXEC_TESTS
                }
            }
            steps {
                script {
                    gv.testApp()
                }
            }
        }
        stage('deploy') {
            steps {
                script {
                    gv.deployApp()
                }
            }
        }       
    }
}


