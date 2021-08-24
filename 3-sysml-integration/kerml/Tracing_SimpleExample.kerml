package Tracing_SimpleExample {
	import TracingAnnotations::*;
	import Base::*;
		
	element test1{}
	element test2{} 
	relationship test from test1 to test2;
	
	metadata ExplainableTracing about test {
	  description = "";
	}
		
	
 	relationship rel_Test from test1 to test2 {
		@ExplainableTracing {
			description = "Something";
			evidence = (test2, test1);
		}
	}	
}
