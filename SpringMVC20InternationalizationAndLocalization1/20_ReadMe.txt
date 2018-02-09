01. This project is based on Gontu Series video 25.
02. The process of creating or developing a web application in a generic manner that it can handle a support more than one language is known as Internationalization process.
03. When you add a new language support, you say you are localizing your web application for that language.
04. To support another language, do below
	04a. The change required in spring-dispather-servlet.xml is already done in previous tutorials (messageSource code snippet).
	04b. Remove all hard coded labels from AdmissionForm.jsp and replace it with the corresponding place holders (which are in studentmessages.properties file) 
	04c. Add below tag lib in AdmissionForm.jsp to support placeholders:
		<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
	04d. Add another properties file for French (studentmessages_fr.properties)
05. To test it out, set language preference = French and drag it to the top (in browser setting) and hit http://localhost:8080/SpringMVC20InternationalizationAndLocalization1/admissionForm.html