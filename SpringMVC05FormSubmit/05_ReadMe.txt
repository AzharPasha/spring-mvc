00. This tutorial explains how to send form, capture it in the Application and send back the form data back to user.
01. In this tutorial we will be presenting user with a form when user enters following url
	http://localhost:8080/SpringMVC05FormSubmit/admissionForm.html
02. By default the above url request is received as default GET method.


How it works:
Part 1:
When the user requests the URL (http://localhost:8080/SpringMVC05FormSubmit/admissionForm.html), the request reaches StudentAdmissionController.java class. Now, how the Front Controller will decide which method to use by analyzing 2 things: 1) The pattern of URL (value=”/admissionForm.html”). And 2) “method = RequestMethod.GET” means it is a GET request. 
The Front Controller would then forward the request to “AdmissionForm.jsp” file. (How does it do that ? And: With the help of viewResolver class - by using suffix and prefix)
Now when the Controller reaches AdmissionForm.jsp file, it would prepare and send back the response to Front Controller which in-turn would send this response back to the Client’s browser.
Part 2:
Now when the Client enters name and hobby and clicks on button “Submit”, the request will again reach to StudentAdmissionController.java class and this request is of http POST type (we defined it as post method in admissionForm.jsp file). This time it will invoke “submitAdmissionForm” method (How ? Ans: This is because of the post method and the URL as shown above in “AdmissionForm.jsp” file)
When the Client enters the form on the browser, we’ll send values of two request parameters (studentName and studentHobby) to the application along with the request. This is done using @RequestParam.
The submitAdmissionForm method prepares and sends back the response to Front Controller which would forward the request to the AdmissionSuccess.jsp file (with the help of viewResolver class). This jsp file would send this message back to the Front Controller which in-turn sends back to the Client’s browser.