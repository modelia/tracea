package TracingAnnotations {
	 
	import Base::*;
	import ScalarValues::*;
	import Time::TimeInstantValue;
	import IntegerFunctions::*;
	
	/** Simple datatype for confidence tracing. */
	attribute def ConfidenceTracing {
		attribute confidence : Real;
		assert constraint confBtz0n1 { confidence >= 0.0 && confidence <= 1.0 } 
		attribute description : String;
		attribute impact : Anything[*];
	}
	 
	/** Complex datatype for explainable tracing. */
	attribute def ExplainableTracing {
		attribute description : String;
		attribute confidence : Real;
		attribute evidence : Evidence;
		attribute agent : Agent;
		attribute impact : Anything[*];
	}  
	
	/** Agent responsible for the identification of a link (optional) */
	attribute def Agent {
		attribute description : String;
	}
	
	attribute def HumanAgent :> Agent {
		attribute role : String;
	}
	
	attribute def MachineAgent :> Agent {
		attribute type : String;
	}
	
	/** Evidence of the existence of a link (optional) */
	attribute def Evidence {
		attribute description : String; 
		attribute confidence : Real; 
	} 
	
	attribute def AnnotationEvidence :> Evidence {
		attribute explanation : String;
	}
	
	attribute def RuleEvidence :> Evidence {
		attribute rule : String;
		attribute parameters : String[*];
		attribute executionDate : TimeInstantValue;
	}
	
	attribute def AIEvidence :> Evidence {
		attribute algorithm : String;
		attribute parameters : String[*];
		attribute executionDate : TimeInstantValue;
		attribute precision : Real;
		assert constraint { precision >= 0.0 && precision <= 1.0 } 
		attribute recall : Real;
		assert constraint { recall >= 0.0 && recall <= 1.0 } 
	}	
}
	




