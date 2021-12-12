
# SysML ID allocation unexpected behavior

## Conundrum

Here is a simple model that links the body of an "eDrone" to its engine and battery.

```sysml
package 'FeatureID' {
    import Base::*;
    part eDrone {    
        part body;
        part battery ;
        part engine ;
    }
    connection bod2bat   connect eDrone.body to eDrone.battery;
    connection bod2eng   connect eDrone.body to eDrone.engine;
}
```

<img src="https://github.com/modelia/tracea/blob/master/4-sysml-json-transformer/sysml_id_allocation_bug/eDrone-viz.jpg" alt="eDrone model"/>

Everything works fine in the JupyterLab environment.

## Unexpected ID allocation

In the exported JSon file (generated with the magic feature `export`) the same feature (`eDrone.body`) used in two different connections get a different ID. This means that the `Feature` referenced by the `ConnectionUsage` is distinct in both connection (they have distinct IDs).

<img src="https://github.com/modelia/tracea/blob/master/4-sysml-json-transformer/sysml_id_allocation_bug/feature-ids-bug.jpg" alt="Unexpected ID allocation"/>

## Temporal solution

The "connectByName" branch of JSonTransformer overpass this issue by referencing target (and source) elements of ConnectionUsage with their name instead of their identifier.

__*Very risky / unexpected behavior to be expected*__

The "bug" or the strangeity of the implementation decisions on the matter have been submitted to the SysML Release Team (SST).
