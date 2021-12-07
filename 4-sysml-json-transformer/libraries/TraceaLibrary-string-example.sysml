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
connection testLink75 connect end1 to end4;
connection testLink25 connect end8 to end6;
connection testLink45 connect end7 to end8;
connection testLink95 connect end1 to end2;
connection testLink55 connect end6 to end7;
connection testLink85 connect end1 to end3;
connection testLink65 connect end5 to end6;
connection testLink35 connect end8 to end7;

metadata m0: ConfidenceTracing about testLink75 { confidence = 0.75;}
metadata m1: TraceType about testLink75 { tracetype = "typeA";}
metadata m2: ConfidenceTracing about testLink25 { confidence = 0.25;}
metadata m3: TraceType about testLink25 { tracetype = "typeE";}
metadata m4: ConfidenceTracing about testLink45 { confidence = 0.45;}
metadata m5: TraceType about testLink45 { tracetype = "typeE";}
metadata m6: ConfidenceTracing about testLink95 { confidence = 0.95;}
metadata m7: TraceType about testLink95 { tracetype = "typeA";}metadata m8: TraceType about testLink95 { tracetype = "typeC";}
metadata m9: ConfidenceTracing about testLink55 { confidence = 0.55;}
metadata m10: ConfidenceTracing about testLink85 { confidence = 0.85;}
metadata m11: TraceType about testLink85 { tracetype = "typeA";}metadata m12: TraceType about testLink85 { tracetype = "typeC";}
metadata m13: ConfidenceTracing about testLink65 { confidence = 0.65;}
metadata m14: ConfidenceTracing about testLink35 { confidence = 0.35;}


}