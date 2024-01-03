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
        stage('compile')
        {
            steps
            {
                //Git repository
                git 'https://github.com/kutty27/Build-Maven-Project.git'

                //Run maven comnd
                bat "mvn -Dmaven.test.failure.ignore=true clean compile"
                
            }
        }
        
    }
    
    post
    {
        always
        {
            emailext body: 'summary', subject: 'Pipeline status', to: 'kuttyspartan999@gmail.com'
        }
    }

}
