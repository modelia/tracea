package 'TracingAnnotations' {
	 
	import Base::*;
	import ScalarValues::*;
	import IntegerFunctions::*;
	
	attribute def ConfidenceTracing {
		attribute confidence : Real;
 		assert constraint confBtz0n1  { confidence >= 0.0 && confidence <= 1.0 } 
        attribute cost : Real;
        attribute agent : Agent;
		attribute impact : Anything[*];
        attribute description : String;
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
    
    attribute def TraceType {
        attribute tracetype : String;
    }

    enum def TraceTypes :> String {
        typeA = "ApplicationType"; 
        typeE = "EngineeringType"; 
    }
 }