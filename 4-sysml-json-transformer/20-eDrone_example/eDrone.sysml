package eDroneRequirement_Definitions {
    
    import eDrone_Definitions::*;
    
    requirement def BatteryCapacityReqDef {
        doc /* The actual battery capacity shall be greater than or equal
             * to the required capacity. */

            attribute capacityActual : BatteryCapacity;
            attribute capacityRequired : BatteryCapacity;
        
            require constraint{ capacityActual <= capacityRequired }
    }
    
    requirement def MaxSpeedReqDef {
        doc /* The maximum speed of the vehicle shall be 
             * not greater than the required maximum speed. */
            
            attribute maxSpeedVehicle : Speed;
            attribute maxSpeedRequired : Speed;
        
            require constraint{ maxSpeedVehicle <= maxSpeedRequired }
    }
    
}

package eDrone_Requirements {
    
    import eDroneRequirement_Definitions::*;
    import eDrone_LogicalArchitecture::*;
    
    requirement eDroneSpecification {
        doc /* Requirement Specification of the eDrone  */
        subject eDrone :>> eDrone;
        require eDroneBatteryCapacity;
        require eDroneMaxSpeed;
    }
    
    requirement id 'REQ.B.1' eDroneBatteryCapacity : BatteryCapacityReqDef {
        subject eDrone :>> eDrone;
        attribute :>> capacityRequired = 50;
        attribute :>> capacityActual = eDrone.battery.capacity;
    }
    
    requirement id 'REQ.V.1' eDroneMaxSpeed : MaxSpeedReqDef {
        subject eDrone :>> eDrone;
        attribute :>> maxSpeedRequired = 140;
        attribute :>> maxSpeedVehicle = eDrone.maxSpeed;
    }
    
}

package tracing_MetasConnections {
    import eDrone_Requirements::*;
    import eDrone_LogicalArchitecture::*;
    /* Here we add a simple connection from Req2Feature for the Tracing use case*/
    
    connection rq1ToWing connect eDroneMaxSpeed to eDrone.engine;
}

package eDrone_Library {
        
    attribute def ElectricEnergy;
    attribute def BatteryCapacity :> ScalarValues::Integer;
    attribute def Speed :> ScalarValues::Integer;
    
    port def PowerOutPort {
        out energy : ElectricEnergy;
    }
    
    interface def PowerInterface {
        end supplierPort : PowerOutPort;
        end consumerPort : ~PowerOutPort;
    }
}

package eDrone_Definitions {

    import eDrone_Library::*;   
    
    part def Wing {
         size : ScalarValues::Integer;
    }
    
    part def Battery {
         capacity : BatteryCapacity;
    }
    
    part def Engine;
}


package eDrone_LogicalArchitecture {
       
    import eDrone_Definitions::*;
    import eDrone_Library::*;
    
    part eDrone {    
        maxSpeed :Speed = 142;
        part body;
        part battery {
            attribute capacity : BatteryCapacity;
            port powerOut : PowerOutPort;
        }
        part engine {
            port powerIn : ~PowerOutPort;
        }
        part frontAxis;
        part rearAxis;
        part frontWing : Wing[2];
        part rearWing : Wing[2];
                
        interface : PowerInterface connect 
            supplierPort :> battery.powerOut to 
            consumerPort :> engine.powerIn;
        /*connection eng2front connect engine to frontAxis;
        connection frAx2frWi connect frontAxis to frontWing;
        connection reAx2reWi connect rearAxis to rearWing;
        connection bod2bat   connect body to battery;
        connection bod2eng   connect body to engine;
        connection bod2frAx  connect body to frontAxis;
        connection bod2reAx  connect body to rearAxis;
        
        connection eng2bat_Typed: EngineToBattery connect supplierPort :> battery.powerOut to 
            consumerPort :> engine.powerIn;*/
    }
    
    /*connection def EngineToBattery{
        end: PowerOutPort;
        end: ~PowerOutPort;
    }*/
}
