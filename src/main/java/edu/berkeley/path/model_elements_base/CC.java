/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */
package edu.berkeley.path.model_elements_base;

@SuppressWarnings("all")
/** * Description of the config and state of our networks and related data.
 *
 * Note: all units in SI (meters, seconds, etc.) except where specified. */
public interface CC {
  public static final org.apache.avro.Protocol PROTOCOL = org.apache.avro.Protocol.parse("{\"protocol\":\"CC\",\"namespace\":\"edu.berkeley.path.model_elements_base\",\"doc\":\"* Description of the config and state of our networks and related data.\\n *\\n * Note: all units in SI (meters, seconds, etc.) except where specified.\",\"types\":[{\"type\":\"record\",\"name\":\"DateTime\",\"doc\":\"milliseconds, absolute, since epoch, utc\",\"fields\":[{\"name\":\"milliseconds\",\"type\":\"long\"}]},{\"type\":\"record\",\"name\":\"Duration\",\"doc\":\"milliseconds\",\"fields\":[{\"name\":\"milliseconds\",\"type\":\"long\"}]},{\"type\":\"record\",\"name\":\"Node\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"type\",\"type\":\"string\"}]},{\"type\":\"record\",\"name\":\"Link\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"type\",\"type\":\"string\"},{\"name\":\"laneCount\",\"type\":[\"null\",\"double\"]},{\"name\":\"length\",\"type\":[\"null\",\"double\"]},{\"name\":\"laneOffset\",\"type\":[\"null\",\"int\"]},{\"name\":\"speedLimit\",\"type\":[\"null\",\"int\"]},{\"name\":\"detailLevel\",\"type\":[\"null\",\"int\"]},{\"name\":\"beginId\",\"type\":\"string\"},{\"name\":\"endId\",\"type\":\"string\"}]},{\"type\":\"record\",\"name\":\"Network\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"description\",\"type\":[\"null\",\"string\"]},{\"name\":\"nodes\",\"type\":{\"type\":\"array\",\"items\":\"Node\"},\"default\":[]},{\"name\":\"links\",\"type\":{\"type\":\"array\",\"items\":\"Link\"},\"default\":[]}]},{\"type\":\"record\",\"name\":\"DensityMap\",\"doc\":\"* Density on each link at a point in time\",\"fields\":[{\"name\":\"vehiclesPerMeter\",\"type\":{\"type\":\"map\",\"values\":\"double\"},\"doc\":\"map key is linkId\",\"default\":{}}]},{\"type\":\"record\",\"name\":\"DensitySet\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"description\",\"type\":[\"null\",\"string\"]},{\"name\":\"density\",\"type\":\"DensityMap\"}]},{\"type\":\"record\",\"name\":\"VelocityMap\",\"doc\":\"* Velocity on each link at a point in time\",\"fields\":[{\"name\":\"metersPerSecond\",\"type\":{\"type\":\"map\",\"values\":\"double\"},\"doc\":\"map key is linkId\",\"default\":{}}]},{\"type\":\"record\",\"name\":\"VelocitySet\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"description\",\"type\":[\"null\",\"string\"]},{\"name\":\"velocity\",\"type\":\"VelocityMap\"}]},{\"type\":\"record\",\"name\":\"FDType\",\"doc\":\"* Referenced by FDSet to indicate the way the contained FDs should\\n   * be interpreted.\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"name\",\"type\":[\"null\",\"string\"]},{\"name\":\"description\",\"type\":[\"null\",\"string\"]}]},{\"type\":\"record\",\"name\":\"FD\",\"doc\":\"* Fundamental diagram parameters on one link at one time.\",\"fields\":[{\"name\":\"freeFlowSpeed\",\"type\":\"double\"},{\"name\":\"criticalSpeed\",\"type\":\"double\"},{\"name\":\"congestionWaveSpeed\",\"type\":\"double\"},{\"name\":\"capacity\",\"type\":\"double\"},{\"name\":\"jamDensity\",\"type\":\"double\"},{\"name\":\"capacityDrop\",\"type\":\"double\"},{\"name\":\"freeFlowSpeedStd\",\"type\":\"double\"},{\"name\":\"congestionWaveSpeedStd\",\"type\":\"double\"},{\"name\":\"capacityStd\",\"type\":\"double\"}]},{\"type\":\"record\",\"name\":\"FDProfile\",\"doc\":\"* FD time series at a link. The link ID is not stored\\n   * in this record, but as the map key in the FDSet.profile.\",\"fields\":[{\"name\":\"startTime\",\"type\":[\"null\",\"double\"],\"doc\":\"* in seconds; default is 0\",\"default\":0.0},{\"name\":\"sampleRate\",\"type\":[\"null\",\"double\"],\"doc\":\"* in seconds; default is 300 seconds\",\"default\":300.0},{\"name\":\"fd\",\"type\":{\"type\":\"array\",\"items\":\"FD\"},\"doc\":\"* time series of FDs;\\n     * array index is index in time series (\\\"DIAG_ORDER\\\" in db)\"}]},{\"type\":\"record\",\"name\":\"FDSet\",\"doc\":\"* Specification of Fundamental diagram time series across one or more\\n   * networks, for use in a scenario.\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"name\",\"type\":[\"null\",\"string\"]},{\"name\":\"description\",\"type\":[\"null\",\"string\"]},{\"name\":\"type\",\"type\":\"FDType\"},{\"name\":\"profile\",\"type\":{\"type\":\"map\",\"values\":\"FDProfile\"},\"doc\":\"* map key is linkId\"}]},{\"type\":\"record\",\"name\":\"FDMap\",\"doc\":\"* Used to feed a per-timestep \\\"drip\\\" input to freeway model.\\n   * This is sliced off of FDSet at a given time.\\n   *\\n   * Not part of Scenario; can be used interchangeably for\\n   * real-time input or for sliced up profiles from a scenario.\",\"fields\":[{\"name\":\"fd\",\"type\":{\"type\":\"map\",\"values\":\"FD\"},\"doc\":\"* map of FDs at a given time;\\n     * map key is linkId\"}]},{\"type\":\"record\",\"name\":\"DemandProfile\",\"doc\":\"* Demand time series at a link. The origin link ID is not stored\\n   * in this record, but as the map key in the DemandSet.profile.\",\"fields\":[{\"name\":\"destinationNetworkId\",\"type\":[\"null\",\"string\"],\"doc\":\"* if null, this profile governs background flow, not OD flow.\"},{\"name\":\"startTime\",\"type\":[\"null\",\"double\"],\"doc\":\"* in seconds; default is 0\",\"default\":0.0},{\"name\":\"sampleRate\",\"type\":[\"null\",\"double\"],\"doc\":\"* in seconds; default is 300 seconds\",\"default\":300.0},{\"name\":\"knob\",\"type\":[\"null\",\"double\"],\"doc\":\"* demand scale factor\",\"default\":1.0},{\"name\":\"stdDevAdd\",\"type\":[\"null\",\"double\"],\"default\":0.0},{\"name\":\"stdDevMult\",\"type\":[\"null\",\"double\"],\"default\":1.0},{\"name\":\"flow\",\"type\":{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":\"double\"}},\"doc\":\"* time series of flows;\\n     * map keys is vehTypeId;\\n     * array index is index in time series (\\\"DEMAND_ORDER\\\" in db)\"}]},{\"type\":\"record\",\"name\":\"DemandSet\",\"doc\":\"* Specification of demand time series across one or more networks,\\n   * for use in a scenario.\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"name\",\"type\":[\"null\",\"string\"]},{\"name\":\"description\",\"type\":[\"null\",\"string\"]},{\"name\":\"profile\",\"type\":{\"type\":\"map\",\"values\":\"DemandProfile\"},\"doc\":\"* map key is originLinkId\"}]},{\"type\":\"record\",\"name\":\"DemandMap\",\"doc\":\"* Used to feed a per-timestep \\\"drip\\\" input to freeway model.\\n   * This is sliced off of DemandSet at a given time.\\n   *\\n   * Not part of Scenario; can be used interchangeably for \\n   * real-time input or for sliced up profiles from a scenario.\",\"fields\":[{\"name\":\"flow\",\"type\":{\"type\":\"map\",\"values\":{\"type\":\"map\",\"values\":\"double\"}},\"doc\":\"* map of flows at a given time;\\n     * map keys are: originLinkId, vehTypeId;\"}]},{\"type\":\"record\",\"name\":\"SplitRatioProfile\",\"doc\":\"* Split ratio time series at a node. The node ID is not stored\\n   * in this record, but as the map key in the SplitRatioSet.profile.\",\"fields\":[{\"name\":\"destinationNetworkId\",\"type\":[\"null\",\"string\"],\"doc\":\"* if null, this profile governs background flow, not OD flow.\"},{\"name\":\"startTime\",\"type\":[\"null\",\"double\"],\"doc\":\"* in seconds; default is 0\",\"default\":0.0},{\"name\":\"sampleRate\",\"type\":[\"null\",\"double\"],\"doc\":\"* in seconds; default is 300 seconds\",\"default\":300.0},{\"name\":\"ratio\",\"type\":{\"type\":\"map\",\"values\":{\"type\":\"map\",\"values\":{\"type\":\"map\",\"values\":{\"type\":\"array\",\"items\":\"double\"}}}},\"doc\":\"* time series of ratios;\\n     * map keys are: inLinkId, outLinkId, vehTypeId;\\n     * array index is index in time series (\\\"RATIO_ORDER\\\" in db)\"}]},{\"type\":\"record\",\"name\":\"SplitRatioSet\",\"doc\":\"* Specification of split ratio time series across one or more networks,\\n   * for use in a scenario.\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"name\",\"type\":[\"null\",\"string\"]},{\"name\":\"description\",\"type\":[\"null\",\"string\"]},{\"name\":\"profile\",\"type\":{\"type\":\"map\",\"values\":\"SplitRatioProfile\"},\"doc\":\"* map key is nodeId\"}]},{\"type\":\"record\",\"name\":\"SplitRatioMap\",\"doc\":\"* Used to feed a per-timestep \\\"drip\\\" input to freeway model.\\n   * This is sliced off of SplitRatioSet at a given time.\\n   *\\n   * Not part of Scenario; can be used interchangeably for \\n   * real-time input or for sliced up profiles from a scenario.\",\"fields\":[{\"name\":\"ratio\",\"type\":{\"type\":\"map\",\"values\":{\"type\":\"map\",\"values\":{\"type\":\"map\",\"values\":{\"type\":\"map\",\"values\":\"double\"}}}},\"doc\":\"* map of ratios at a given time;\\n     * map keys are: nodeId, inLinkId, outLinkId, vehTypeId;\"}]},{\"type\":\"record\",\"name\":\"Scenario\",\"doc\":\"* A scenario represents the state of the world now and projected\\n   * into the future, to the extent that can be known in advance.\\n   *\\n   * The configuration that belongs in a scenario and the objects that it\\n   * contains are just those parameters that make an assertion about the \\n   * world, an assertion which is observable, and verifiable. So, for example,\\n   * choice of CTM algorithm does not belong here, but FD parameters do,\\n   * and signal control algorithms do. (The CTM choice should be in the\\n   * Context.)\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"description\",\"type\":[\"null\",\"string\"]},{\"name\":\"networks\",\"type\":{\"type\":\"array\",\"items\":\"Network\"},\"default\":[]},{\"name\":\"initialDensity\",\"type\":\"DensitySet\",\"default\":null},{\"name\":\"initialVelocity\",\"type\":\"VelocitySet\",\"default\":null},{\"name\":\"fdSet\",\"type\":\"FDSet\",\"default\":null},{\"name\":\"demandSet\",\"type\":\"DemandSet\",\"default\":null},{\"name\":\"splitratioSet\",\"type\":\"SplitRatioSet\",\"default\":null}]},{\"type\":\"record\",\"name\":\"EnKFParams\",\"doc\":\"* Context and Run Config section\\n   *\\n   * Configuration that applies to one run or a group of runs.\\n   *\\n   * These objects correspond to the TBD Run tables.\",\"fields\":[{\"name\":\"n_ensembles\",\"type\":\"int\"}]},{\"type\":\"record\",\"name\":\"FreewayContextConfig\",\"doc\":\"* Static configuration of a set of freeway runs.\\n   *\\n   * The parameters encapsulated here are separate from Scenario inputs\\n   * in that they express *how* the run is modeled and executed,\\n   * rather than *what* is modeled.\\n   *\\n   * These parameters are used by the Context subclasses.\\n   *\\n   * Note that a context does not include a scenario. Scenarios are read\\n   * dynamically using a ScenarioSource.\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"runMode\",\"type\":\"string\",\"doc\":\"* historical, live\\n     *\"},{\"name\":\"enkfParams\",\"type\":\"EnKFParams\"},{\"name\":\"ctmType\",\"type\":\"string\"},{\"name\":\"fdType\",\"type\":\"string\"},{\"name\":\"dtOutput\",\"type\":\"Duration\"},{\"name\":\"dt\",\"type\":\"Duration\"},{\"name\":\"timeBegin\",\"type\":\"DateTime\"},{\"name\":\"timeEnd\",\"type\":\"DateTime\"}]},{\"type\":\"record\",\"name\":\"ProcessConfig\",\"doc\":\"* Encapsulates a single run of a process.\",\"fields\":[{\"name\":\"host\",\"type\":\"string\"},{\"name\":\"pid\",\"type\":\"long\"},{\"name\":\"timeBegin\",\"type\":\"DateTime\",\"doc\":\"Note: wall clock time on host, not world time or sim time\"},{\"name\":\"timeEnd\",\"type\":\"DateTime\"}]},{\"type\":\"record\",\"name\":\"FreewayEstimationRunConfig\",\"doc\":\"* Represents a single execution of the freeway model.\\n   *\\n   * Parameters here supplement the Context config with additional per-run\\n   * config.\\n   *\\n   * The FreewayRun id should be in one-to-one correspondence with actual\\n   * process executions on a host. If you run again with the same parameters\\n   * then the id should be different. Output data references this id.\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"contextId\",\"type\":\"string\",\"doc\":\"Refers to the FreewayContext for this run (among others)\"},{\"name\":\"seeds\",\"type\":{\"type\":\"array\",\"items\":\"long\"}},{\"name\":\"process\",\"type\":\"ProcessConfig\"}]},{\"type\":\"record\",\"name\":\"FreewayForecastRunConfig\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"contextId\",\"type\":\"string\",\"doc\":\"Refers to the FreewayContext for this run (among others)\"},{\"name\":\"seeds\",\"type\":{\"type\":\"array\",\"items\":\"long\"}},{\"name\":\"process\",\"type\":\"ProcessConfig\"}]},{\"type\":\"record\",\"name\":\"SimulationRunConfig\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"name\",\"type\":\"string\"}]},{\"type\":\"record\",\"name\":\"CalibrationRunConfig\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"name\",\"type\":\"string\"}]},{\"type\":\"record\",\"name\":\"ImputationRunConfig\",\"fields\":[{\"name\":\"id\",\"type\":\"string\"},{\"name\":\"name\",\"type\":\"string\"}]},{\"type\":\"record\",\"name\":\"FreewayLinkState\",\"doc\":\"* State of one link at one time.\\n   *\\n   * May contain density, velocity, or both.\",\"fields\":[{\"name\":\"density\",\"type\":[\"double\",\"null\"]},{\"name\":\"velocity\",\"type\":[\"double\",\"null\"]}]},{\"type\":\"record\",\"name\":\"FreewayCTMState\",\"doc\":\"* State of entire CTM\",\"fields\":[{\"name\":\"linkState\",\"type\":{\"type\":\"map\",\"values\":\"FreewayLinkState\"},\"doc\":\"map key is link id\"},{\"name\":\"queueLength\",\"type\":{\"type\":\"map\",\"values\":\"double\"},\"doc\":\"map key is origin link id\"}]},{\"type\":\"record\",\"name\":\"FreewayCTMEnsembleState\",\"doc\":\"* State of ensemble CTMs in an ordered list.\",\"fields\":[{\"name\":\"ensembleState\",\"type\":{\"type\":\"array\",\"items\":\"FreewayCTMState\"},\"doc\":\"one entry per CTM\"},{\"name\":\"t\",\"type\":\"DateTime\"},{\"name\":\"quality\",\"type\":{\"type\":\"map\",\"values\":\"double\"},\"doc\":\"map key is link id\\n     *\\n     * used by FreewayReporterBlock?\"}]},{\"type\":\"record\",\"name\":\"FreewayCTMReport\",\"fields\":[{\"name\":\"runID\",\"type\":\"long\"},{\"name\":\"time\",\"type\":\"DateTime\",\"doc\":\"Model time, of course\"},{\"name\":\"mean\",\"type\":\"FreewayCTMState\"},{\"name\":\"stdDev\",\"type\":\"FreewayCTMState\"},{\"name\":\"fd\",\"type\":\"FDMap\"},{\"name\":\"inFlowMean\",\"type\":{\"type\":\"map\",\"values\":\"double\"},\"doc\":\"* map of mean flow into each link\\n     * map may be empty for certain reporting cycles\\n     * map key is linkId\"},{\"name\":\"inFlowStdDev\",\"type\":{\"type\":\"map\",\"values\":\"double\"}},{\"name\":\"outFlowMean\",\"type\":{\"type\":\"map\",\"values\":\"double\"},\"doc\":\"* map of mean flow out of each link\\n     * map may be empty for certain reporting cycles\\n     * map key is linkId\"},{\"name\":\"outFlowStdDev\",\"type\":{\"type\":\"map\",\"values\":\"double\"}}]},{\"type\":\"record\",\"name\":\"FreewayCTMEnsembleReport\",\"fields\":[{\"name\":\"runID\",\"type\":\"long\"},{\"name\":\"ensembleState\",\"type\":\"FreewayCTMEnsembleState\"}]},{\"type\":\"record\",\"name\":\"PeMS\",\"doc\":\"* PeMS sensor datum as output by PeMS filter, for a specific\\n   * station and time.\",\"fields\":[{\"name\":\"vdsId\",\"type\":\"long\"},{\"name\":\"timeMeasured\",\"type\":\"DateTime\"},{\"name\":\"flow\",\"type\":[\"double\",\"null\"]},{\"name\":\"density\",\"type\":[\"double\",\"null\"]},{\"name\":\"densityError\",\"type\":[\"double\",\"null\"]},{\"name\":\"speed\",\"type\":[\"double\",\"null\"]},{\"name\":\"speedError\",\"type\":[\"double\",\"null\"]},{\"name\":\"freeFlowSpeed\",\"type\":[\"double\",\"null\"]},{\"name\":\"funcLoopFact\",\"type\":[\"double\",\"null\"]},{\"name\":\"gFactorLane\",\"type\":{\"type\":\"array\",\"items\":[\"double\",\"null\"]}}]},{\"type\":\"record\",\"name\":\"PeMSMap\",\"doc\":\"* PeMS sensor data map, organized by VDS.\",\"fields\":[{\"name\":\"pems\",\"type\":{\"type\":\"map\",\"values\":\"PeMS\"},\"doc\":\"* Key is VDS id. Represents the state of the sensors at\\n     * one point in time.\"}]},{\"type\":\"record\",\"name\":\"PeMSProfile\",\"doc\":\"* PeMS sensor data profile. Represents the time history of\\n   * one sensor.\",\"fields\":[{\"name\":\"pems\",\"type\":{\"type\":\"array\",\"items\":\"PeMS\"}}]},{\"type\":\"record\",\"name\":\"PeMSSet\",\"doc\":\"* PeMS sensor data set, organized as a time-series\\n   * of maps. This makes sense because filtered pems data\\n   * is generated at multiples of 30 seconds: 00:00, 00:30, ...\",\"fields\":[{\"name\":\"pemsMap\",\"type\":{\"type\":\"array\",\"items\":\"PeMSMap\"}}]},{\"type\":\"record\",\"name\":\"PeMSStation\",\"doc\":\"* PeMS sensor (the VDS station info, rather than the sensor data).\",\"fields\":[{\"name\":\"Id\",\"type\":\"long\"},{\"name\":\"fwyNum\",\"type\":\"int\"},{\"name\":\"direction\",\"type\":\"string\"},{\"name\":\"district\",\"type\":\"int\"},{\"name\":\"county\",\"type\":\"string\"},{\"name\":\"city\",\"type\":\"string\"},{\"name\":\"statePostmile\",\"type\":\"double\"},{\"name\":\"absPostmile\",\"type\":\"double\"},{\"name\":\"latitude\",\"type\":\"double\"},{\"name\":\"longitude\",\"type\":\"double\"},{\"name\":\"detectorLength\",\"type\":\"double\"},{\"name\":\"detectorType\",\"type\":\"string\"},{\"name\":\"detectorName\",\"type\":\"string\"},{\"name\":\"laneCount\",\"type\":\"int\"},{\"name\":\"userId\",\"type\":{\"type\":\"array\",\"items\":\"string\"}}]},{\"type\":\"record\",\"name\":\"PeMSAggregate\",\"doc\":\"* Used in both the 5 minute and 1 hour case for per-lane\\n   * and per-station aggregated data, and in the 1 day case\\n   * for per-station aggregated data.\\n   *\",\"fields\":[{\"name\":\"samples\",\"type\":[\"long\",\"null\"]},{\"name\":\"flow\",\"type\":[\"double\",\"null\"]},{\"name\":\"avgOccupancy\",\"type\":[\"double\",\"null\"]},{\"name\":\"avgSpeed\",\"type\":[\"double\",\"null\"]},{\"name\":\"observed\",\"type\":[\"double\",\"null\"]}]},{\"type\":\"record\",\"name\":\"PeMSStationAggregate\",\"doc\":\"* Represents both the 5 minute and 1 hour aggregated data. If delay map\\n   * is present, then it represents a daily aggregate.\\n   *\",\"fields\":[{\"name\":\"vdsId\",\"type\":\"long\"},{\"name\":\"timeMeasured\",\"type\":\"DateTime\"},{\"name\":\"total\",\"type\":\"PeMSAggregate\",\"doc\":\"* Aggregated at this station, across lanes.\\n     *\"},{\"name\":\"byLane\",\"type\":[{\"type\":\"array\",\"items\":\"PeMSAggregate\"},\"null\"],\"doc\":\"* Aggregated by lane at this station.\\n     * Field is null for 1 day aggregates.\\n     *\"},{\"name\":\"delay\",\"type\":[{\"type\":\"map\",\"values\":\"double\"},\"null\"],\"doc\":\"* Average delay over the station length, for a threshold speed.\\n     * Keys are speeds in mph: \\\"35\\\", \\\"40\\\", ... \\\"60\\\".\\n     * Field is null for 5 minute aggregates.\\n     *\"}]}],\"messages\":{}}");

  @SuppressWarnings("all")
  /** * Description of the config and state of our networks and related data.
 *
 * Note: all units in SI (meters, seconds, etc.) except where specified. */
  public interface Callback extends CC {
    public static final org.apache.avro.Protocol PROTOCOL = edu.berkeley.path.model_elements_base.CC.PROTOCOL;
  }
}