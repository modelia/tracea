package TracingAnnotations {
	import Base::*;
	import ScalarValues::*;
	import SequenceFunctions::size;
	import IntegerFunctions::*;
	import Time::TimeInstantValue;
	
	/** Simple datatype for confidence tracing. */
	datatype ConfidenceTracing {
		feature confidence : Real;
		//assert constraint { confidence >= 0.0 && confidence <= 1.0 } 
		feature description : String;
		feature impact : Anything[*];
	}
	 
	/** Complex datatype for explainable tracing. */
	datatype ExplainableTracing {
		feature description : String;
		feature confidence : Real;
		feature evidence : Evidence;
		feature agent : Agent;
		feature impact : Anything[*];
	}  
	
	/** Agent responsible for the identification of a link (optional) */
	datatype Agent {
		feature description : String;
	}
	
	datatype HumanAgent :> Agent {
		feature role : String;
	}
	
	datatype MachineAgent :> Agent {
		//feature type : String;
	}
	
	/** Evidence of the existence of a link (optional) */
	datatype Evidence {
		feature description : String; 
		feature confidence : Real; 
	} 
	
	datatype AnnotationEvidence :> Evidence {
		feature explanation : String;
	}
	
	datatype RuleEvidence :> Evidence {
		feature rule : String;
		feature parameters : String[*];
		feature executionDate : TimeInstantValue;
	}
	
	datatype AIEvidence :> Evidence {
		feature algorithm : String;
		feature parameters : String[*];
		feature executionDate : TimeInstantValue;
		feature precision : Real;
		//assert constraint { precision >= 0.0 && precision <= 1.0 } 
		feature recall : Real;
		//assert constraint { recall >= 0.0 && recall <= 1.0 } 
	}	
}
