

## Notes
* UI and API test combined on the same project

## Tools 
* IntelliJ
* Windows OS

## API Tests
* Only the API tests run are configured to run on the pipeline.
* After tests have run the Artifact will be under the Job Artifact section.

## To run UI tests manually

* Unfortunately due to the deadline was not able to set up selenium on github run UI tests on the pipeline
* To run test manually 
* Open the project on a IDE of your choice 
* Navigate to `src\test\java\resources\*.feature`
* Right click and execute any feature required
* Or use test runner class under `src\test\java\stepdefinitions`
* Note on test runner remove tag property to be able to run all tests combined






