01. This project is based on Gontu Series video 27. In this tutorial, we'll learn how to display the admission form in red and green theme.
02.Do below
	02a. Include below three beans in the spring's configuration file
	<bean id="themeSource"	class="org.springframework.ui.context.support.ResourceBundleThemeSource">
		<property name="basenamePrefix" value="theme-" />
	</bean>
	
	<bean id="themeResolver"	class="org.springframework.web.servlet.theme.CookieThemeResolver">
		<property name="defaultThemeName" value="green" />
	</bean>
	
	<bean	class="org.springframework.web.servlet.theme.ThemeChangeInterceptor">
		<property name="paramName" value="siteTheme" />
	</bean>
	02b. Include two links Red and Green in the AdmissionForm.jsp file along with below statement:
	<link rel=stylesheet" href="<spring:theme code='styleSheet'/>" type="text/css"/>
	02c. Include two properties file and their related stylesheets for two themes which I wish to support for the application:
	For Red Theme: include theme-red.properties file and its corresponding stylesheet stylered.css file
	For Green Theme: include theme-green.properties file and its corresponding stylesheet stylegreen.css file 
	
Note: This code is not working for some reason. It is supposed to display the text: "STUDENT ADMISSION FORM FOR ENGINEERING COURSES" in green color if I click on "Green" hyperlink and in red color if I click on "Red" hyperlink.