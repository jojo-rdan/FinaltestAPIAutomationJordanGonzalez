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
