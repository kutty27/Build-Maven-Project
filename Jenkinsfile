pipeline
{
    agent any

    tools
    {
        //Maven installation
        maven "Maven_Home"
    }
    
    stages
    {
        stage('build')
        {
            steps
            {
                //Git repository
                git branch: "main", credentialsId: 'none', url: "https://github.com/kutty27/Build-Maven-Project.git"

                //Run maven comnd
                bat "mvn -Dmaven.test.failure.ignore=true clean package"
                
            }
        }
        
    }
    
    post {
        success {
            archiveArtifacts 'target/*.jar'
        }
    }

}
