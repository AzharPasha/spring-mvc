01. These notes are based on Gontu Series Video 16
02. As discussed earlier, spring provides various customer property editor.
03. What if - our project demands us to create our property editor ? 
	Spring gives us the ability to create as such...
04. So, let's say, in our project, it is necessary to provide Prefix before 
	name like Mr. ABC or Ms. XYZ....We can achieve this with our own custom property editor class.
05. For this, we create a new class: StudentNameEditor.java which checks if the studentName 
	has "Mr" or "Ms". This class extends from PropertyEditorSupport and override setAsText method.
06. We then register this StudentNameEditor under @InitBinder method.
07. Every custom editor class should extend PropertyEditorSupport class and should override one of its methods (in this example, we are overriding setAsText method)
08. When the user would submit the form, Spring MVC would make a call to the custom editor class (StudentNameEditor.java) before it performs the data binding task for form element "studentName".