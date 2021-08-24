package Tracing_FilterExample {
	import TracingAnnotations::*;	/* Elements of the system. */
	part end1 {}
	part end2 {}
	part end3 {}
	part end4 {}
	part end5 {}
	part end6 {}
	part end7 {}
	part end8 {}
	
	/* Trace links */
	connection testLink95 connect end1 to end2 {@ConfidenceTracing { confidence = 0.95; }}
	connection testLink85 connect end1 to end3 {@ConfidenceTracing { confidence = 0.85; }}
	connection testLink75 connect end1 to end4 {@ConfidenceTracing { confidence = 0.75; }}
	connection testLink65 connect end5 to end6 {@ConfidenceTracing { confidence = 0.65; }}
	connection testLink55 connect end6 to end7 {@ConfidenceTracing { confidence = 0.55; }}
	connection testLink45 connect end7 to end8 {@ConfidenceTracing { confidence = 0.45; }}
	connection testLink35 connect end8 to end7 {@ConfidenceTracing { confidence = 0.35; }}
	connection testLink25 connect end8 to end6 {@ConfidenceTracing { confidence = 0.25; }}
}
	
	
	
import TracingAnnotations::*;
/* Filter example - compact notation */
package 'Confidence level' {
	/* Connections that satisfy a threshold confidence level (0.5). */
	import Tracing_FilterExample::**[@ConfidenceTracing and ConfidenceTracing::confidence >= 0.5];
}

/* Filter example - full notation */
package 'Confidence level (lengthy)' {
	/* Connections that satisfy a threshold confidence level (0.5). */
    import Tracing_FilterExample::**;
    filter @ConfidenceTracing && ConfidenceTracing::confidence >= 0.5;
}
	