<h3>API testing project</h3>
This new project contains:<br>
<ul>
  <li>An endpoint for Bank transactions (all information embedded in same API, i.e., only 1 endpoint required.</li>
  <li>Every request include at least an assertion for the Status Code (Use POJOs to manage response data not just the body).</li>
  <li>JavaDoc is used.</li>
  <li>Tests cases to:<br>
■ Verify the Endpoint is empty<br>
■ Initialize the POJO with 10 random data. Also a verification for avoiding duplicate email accounts.<br>
■ Make the GET request, asserting that there are not duplicate email accounts.<br>
■ Update an existing AccountNumber.<br>
</ul>
<h3>To run the project</h3>
<ul>
  <li>Clone the repository</li>
  <li>Go to the Suite file, this is the path: "src/test/resources.properties/suite.xml"</li>
  <li>Open the suite.xml file and right click on it</li>
  <li>Click on "Run" option to initialize the test cases</li>
</ul>
