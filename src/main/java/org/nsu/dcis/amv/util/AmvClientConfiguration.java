package org.nsu.dcis.amv.util;

public class AmvClientConfiguration {
    private String executionTracesMining;
    private String cloneDetectionMining;
    private String clusteringMining;

    public void setExecutionTracesMining(String executionTracesMining) {
        this.executionTracesMining = executionTracesMining;
    }

    public String getExecutionTracesMining() {
        return executionTracesMining;
    }

    public void setCloneDetectionMining(String cloneDetectionMining) {
        this.cloneDetectionMining = cloneDetectionMining;
    }

    public String getCloneDetectionMining() {
        return cloneDetectionMining;
    }

    public void setClusteringMining(String clusteringMining) {
        this.clusteringMining = clusteringMining;
    }

    public String getClusteringMining() {
        return clusteringMining;
    }

    @Override
    public String toString() {
        return "AmvClientConfiguration{" +
                "executionTracesMining='" + executionTracesMining + '\'' +
                ", cloneDetectionMining='" + cloneDetectionMining + '\'' +
                ", clusteringMining='" + clusteringMining + '\'' +
                '}';
    }
}
