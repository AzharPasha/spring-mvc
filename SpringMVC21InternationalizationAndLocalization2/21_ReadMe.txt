01. This project is based on Gontu Series video 26.
02. When user gets the web page in English and he wants to now see in French (without changing language preference
	in Browser Settings). This can be achieved if we can provide a link for displaying in French on English response page and vice versa. This can be done in 3 steps:
	02a. Include two links - English and French on top of the AdmissionForm.jsp page.
	02b. Register an interceptor with the name localeChangeInterceptor in the spring's configuration file (spring-dispatcher-servlet.xml).
	02c. Include an entry of cookieLocaleResolver bean in the spring's configuration file.
03. Hit http://localhost:8080/SpringMVC21InternationalizationAndLocalization2/admissionForm.html and it should show hyperlinks for English and French (clicking on each should display the appropriate page).