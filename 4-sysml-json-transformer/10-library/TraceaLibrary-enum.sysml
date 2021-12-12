package 'TracingAnnotations' {
	 
	import Base::*;
	import ScalarValues::*;
	import Time::TimeInstantValue;
	import IntegerFunctions::*;
	
    
    
	attribute def ConfidenceTracing {
		attribute confidence : Real;
		assert constraint confBtz0n1  { confidence >= 0.0 && confidence <= 1.0 } 
		attribute description : String;
		attribute impact : Anything[*];
	}
	 
	attribute def ExplainableTracing {
		attribute description : String;
		attribute confidence : Real;
        assert constraint confBtz0n1  { confidence >= 0.0 && confidence <= 1.0 } 
		attribute evidence : Evidence;
		attribute agent : Agent;
		attribute impact : Anything[*];
	}  
	
	attribute def Agent {
		attribute description : String;
	}
	
	attribute def HumanAgent :> Agent {
		attribute role : String;
	}
	
	attribute def MachineAgent :> Agent {
		attribute type : String;
	}
	
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
    
   
    attribute def TraceType {
        attribute tracetype : TraceTypes;
        //assert constraint { level >= 0.0 && level <= 1.0
    }
    
    enum def TraceTypes :> String {
        typeA = "ApplicationType"; 
        typeE = "EngineeringType"; 
    }
 }