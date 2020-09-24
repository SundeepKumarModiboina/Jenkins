job('DSL_Job_to_Build_Maven_Project') {
	description (' DSL Script to build the maven project and archive the artefacts in jar format')
    scm {
        github('https://github.com/SundeepKumarModiboina/Jenkins.git', 'master')
    }
    triggers {
        scm('* * * * *')
    }
    steps {
        maven('clean package','maven-samples/single-module/pom.xml')
    }
    publishers {
        archiveArtifacts('**/*.jar')
    }
}