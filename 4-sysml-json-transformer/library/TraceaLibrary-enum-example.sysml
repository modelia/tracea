package Tracing_SimplestExample {
	import TracingAnnotations::*;	
    /* Elements of the system. */
	part end1 {}
	part end2 {}
	part end3 {}
	part end4 {}
	part end5 {}
	part end6 {}
	part end7 {}
	part end8 {}
	
	/* Trace links */
	connection testLink95 connect end1 to end2 {
        @ConfidenceTracing { confidence = 0.95; } 
        @TraceType {tracetype = TraceTypes::typeA;}
    }
    
	connection testLink85 connect end1 to end3 
      {@ConfidenceTracing { confidence = 0.85; }}
	connection testLink75 connect end1 to end4 
      {@ConfidenceTracing { confidence = 0.75; } @TraceType {tracetype = TraceTypes::typeA;}}
	connection testLink65 connect end5 to end6 
      {@ConfidenceTracing { confidence = 0.65; }}
	connection testLink55 connect end6 to end7 
      {@ConfidenceTracing { confidence = 0.55; }}
	connection testLink45 connect end7 to end8 
      {@ConfidenceTracing { confidence = 0.45; } @TraceType {tracetype = TraceTypes::typeE;}}
	connection testLink35 connect end8 to end7 
      {@ConfidenceTracing { confidence = 0.35; }}
	connection testLink25 connect end8 to end6 
      {@ConfidenceTracing { confidence = 0.25; } @TraceType {tracetype = TraceTypes::typeE;}}
}