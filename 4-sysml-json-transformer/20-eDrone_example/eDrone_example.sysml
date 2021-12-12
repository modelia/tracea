package eDrone_example {
	import TracingAnnotations::*;	
    
    import eDroneRequirement_Definitions::*;
    import eDrone_Requirements::*;
    import eDrone_LogicalArchitecture::*;
    import eDrone_Definitions::*;
    import eDrone_Library::*;

    connection eng2front connect eDrone.engine to eDrone.frontAxis;
    connection frAx2frWi connect eDrone.frontAxis to eDrone.frontWing;
    connection reAx2reWi connect eDrone.rearAxis to eDrone.rearWing;
    
    connection bod2bat   connect eDrone.body to eDrone.battery;
    connection bod2eng   connect eDrone.body to eDrone.engine;
    connection bod2frAx  connect eDrone.body to eDrone.frontAxis;
    connection bod2reAx  connect eDrone.body to eDrone.rearAxis;
    
    connection eng2bat_Typed: EngineToBattery connect supplierPort :> eDrone.battery.powerOut to 
        consumerPort :> eDrone.engine.powerIn;
    
    /* Added trace links */
    connection refine1 connect eDrone.battery to eDrone.battery.powerOut;
    connection refine2 connect eDrone.battery to eDrone.engine.powerIn;
    
    
    
    /* Trace link annotations */
       metadata m7160: ConfidenceTracing about eng2front { confidence = 0.85;}
       metadata m1014: TraceType         about eng2front { tracetype = "TypeE";}
       metadata m7180: ConfidenceTracing about frAx2frWi { confidence = 0.65;}
       metadata m1089: TraceType         about frAx2frWi { tracetype = "TypeE";}
       metadata m7150: ConfidenceTracing about reAx2reWi { confidence = 0.75;}
       metadata m1016: TraceType         about reAx2reWi { tracetype = "TypeE";}
    
       metadata m7198: ConfidenceTracing about eng2bat_Typed { confidence = 0.65;}
       metadata m6614: TraceType         about eng2bat_Typed { tracetype = "TypeA";}

       metadata m1001: TraceType         about bod2bat  { tracetype = "Internal";}
       metadata m1002: TraceType         about bod2eng  { tracetype = "Internal";}
       metadata m1003: TraceType         about bod2frAx { tracetype = "Internal";}
       metadata m1004: TraceType         about bod2reAx { tracetype = "Internal";}
       // For all internal links: Confidence == 1.00 - implict !

       metadata m7158: ConfidenceTracing about refine1 { confidence = 0.45;}
       metadata m1018: TraceType         about refine1 { tracetype = "Convenience";}
       metadata m7157: ConfidenceTracing about refine2 { confidence = 0.55;}
       metadata m1019: TraceType         about refine2 { tracetype = "Convenience";}

    connection def EngineToBattery{
        end: PowerOutPort;
        end: ~PowerOutPort;
    }    
}