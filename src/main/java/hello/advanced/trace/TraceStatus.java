package hello.advanced.trace;

public class TraceStatus {
    private TraceId traceId;
    private Long startTimeMs;
    private String msg;

    public TraceStatus(TraceId traceId, Long startTimeMs, String msg) {
        this.traceId = traceId;
        this.startTimeMs = startTimeMs;
        this.msg = msg;
    }

    public TraceId getTraceId() {
        return traceId;
    }

    public Long getStartTimeMs() {
        return startTimeMs;
    }

    public String getMsg() {
        return msg;
    }
}
