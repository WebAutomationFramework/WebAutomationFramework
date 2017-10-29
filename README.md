# WebAutomationFramework



- Install and launch

    1. Create new Maven project on your machine
    2. Perform git init in that project
    3. Perform git clone https://git_url_of_web_automation_framework.git
    4. Run tests via Idea 'run' button or in the command line using command:
    mvn clean test -DsuiteXmlFile="sign-in.xml" -Dbrowser="chrome", where
    key -DsuiteXmlFile sets the name of file with tests to be executed, and -Dbrowser sets the browser type property on which tests should be executed
    
    

 
- To run tests on Docker or local selenium grid

    1. Run 'docker-compose up' command from a folder where docker file exists
    2. Run search.xml from terminal or from IDE (search.xml by default configured to run tests on firefox and chrome nodes)
