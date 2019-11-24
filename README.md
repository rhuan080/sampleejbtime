# sampleejbtime
It is a sample of how to use the EJB Timer.

## How to compile

    mvn clean package
    
## Steps to test

1. Deploy the Package to Server Application
2. Submit a POST request to http://{host}:{port}//sampleejbtime-1.0-SNAPSHOT/scheduler. A new timer will be scheduled using the programmatic way.

NOTE: The Automatic EJB Timer will be scheduled without any actions of user.
