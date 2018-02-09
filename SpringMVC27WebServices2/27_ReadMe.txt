01. This project is based on Gontu Series video 34. 
02. To alter property name (key) in the response output, use @JsonProperty annotation on top of the property name as shown in Student.java class.
03. When we changed the property name, Spring MVC has used its own ordering to display response. To have control over the order of displaying properties in the response, use JsonPropertyOrder annotation on top of Student Class.  
04. In order to exclude any property (not display any student property in response), use @JsonIgnoreProperties on top of Student class.
05. If we want Spring MVC to not include properties whose value is null, use @JsonInclude annotation on top of Student class.