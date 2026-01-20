pipeline {
    agent any
 
    triggers {
        githubPush()
    }
 
    environment {
        GIT_REPO = 'https://github.com/ghofran-eee/ProjectDevops.git/'
        BRANCH = 'main'
    }
 
    stages {
 
        stage('Checkout - Récupération depuis GitHub') {
            steps {
                echo 'Récupération du projet depuis GitHub...'
                git branch: "${BRANCH}", url: "${GIT_REPO}"
            }
        }
 
        stage('Vérification du contenu') {
            steps {
                echo 'Affichage des fichiers du projet'
                sh 'ls -la'
            }
        }
 
        stage('Build') {
            steps {
                echo 'Build du projet'
                // Si projet Java Maven :
                // sh 'mvn clean package'
 
                // Si projet NodeJS :
                // sh 'npm install'
 
                // Sinon (générique)
                echo 'Aucune commande de build spécifique définie'
            }
        }
 
        stage('Tests') {
            steps {
                echo 'Exécution des tests'
                // Java :
                // sh 'mvn test'
 
                // Node :
                // sh 'npm test'
 
                echo 'Tests non définis'
            }
        }
 
        stage('Archivage') {
            steps {
                echo 'Archivage des fichiers'
                archiveArtifacts artifacts: '**/*', fingerprint: true
            }
        }
    }
 
    post {
        success {
            echo 'Pipeline exécutée avec succès'
        }
        failure {
            echo 'Echec de la pipeline'
        }
    }
}
