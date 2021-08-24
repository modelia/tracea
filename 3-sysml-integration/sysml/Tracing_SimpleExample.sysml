package Tracing_SimpleExample {
	import TracingAnnotations::*;
	
	
	/* Elements of the system. */
	part vehiculetest {
		part wheel: Anything;
	}
	part vehiculetest2 :> vehiculetest {}
	
	
	/* Evidences of the identification of the links. */
	attribute ev_vehiculetest : AIEvidence {
		:>> algorithm = "ROUGE";
		:>> parameters = {};
		:>> executionDate { :>> num = 0123456;}		
		:>> precision = 0.9;
		:>> recall = 0.9;
	}
	
	/* Declaration of the agent responsible for the identification of the link. */
	attribute ag_vehiculetest : MachineAgent {
		:>> type = "NLP_AI_ROUGE";
		:>> description = "Something about the use of AI for NLP in Sw Eng.";
	}
	
	/* Actual links we want to trace. */
	/* Compact notation. */
	connection testLink2 connect vehiculetest.wheel to vehiculetest2.wheel {
		/* Tracing information. */
		@ConfidenceTracing {
			confidence = 0.95;
			description = "connection btw vehiculetest*.wheel";
		}
	}
	
	connection testLink connect vehiculetest.wheel to vehiculetest2.wheel {
		/* Tracing information. */
		@ExplainableTracing {
			description = "Something";
			confidence = 0.95;
			evidence = (ev_vehiculetest);
			agent = ag_vehiculetest;
		}
	}
	
	
	/* Full notation */
	connection testLink3 connect vehiculetest.wheel to vehiculetest2.wheel;
	metadata testLink3_md: ConfidenceTracing about testLink3 {
		confidence = 0.95;
		description = "connection btw vehiculetest*.wheel";
	}
}
	