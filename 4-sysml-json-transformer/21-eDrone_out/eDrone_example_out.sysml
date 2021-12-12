connection rq1ToWing connect eDroneMaxSpeed to eDrone.engine;
connection eng2front connect eDrone.engine to eDrone.frontAxis;
connection frAx2frWi connect eDrone.frontAxis to eDrone.frontWing;
connection reAx2reWi connect eDrone.rearAxis to eDrone.rearWing;
connection bod2bat connect eDrone.body to eDrone.battery;
connection bod2eng connect eDrone.body to eDrone.engine;
connection bod2frAx connect eDrone.body to eDrone.frontAxis;
connection bod2reAx connect eDrone.body to eDrone.rearAxis;
connection eng2bat_Typed connect eDrone.battery.powerOut to eDrone.engine.powerIn;

metadata m6854: TraceType about rq1ToWing { tracetype = "Untyped";}
metadata m9454: ConfidenceTracing about eng2front { confidence = 0.55;}
metadata m2339: TraceType about eng2front { tracetype = "typeC";}
metadata m9574: ConfidenceTracing about frAx2frWi { confidence = 0.65;}
metadata m4785: TraceType about frAx2frWi { tracetype = "typeE";}
metadata m3413: TraceType about reAx2reWi { tracetype = "Untyped";}
metadata m319: TraceType about bod2bat { tracetype = "Untyped";}
metadata m6174: TraceType about bod2eng { tracetype = "Untyped";}
metadata m4155: TraceType about bod2frAx { tracetype = "Untyped";}
metadata m5704: TraceType about bod2reAx { tracetype = "Untyped";}
metadata m9888: TraceType about eng2bat_Typed { tracetype = "typeE";}
metadata m6860: TraceType about eng2bat_Typed { tracetype = "typeC";}
