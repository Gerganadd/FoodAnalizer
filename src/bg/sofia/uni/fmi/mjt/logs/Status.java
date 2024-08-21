package bg.sofia.uni.fmi.mjt.logs;

public enum Status {
    SUCCESSFUL_READ_FROM_FILE,
    SUCCESSFUL_WRITE_IN_FILE,
    OPEN_SERVER,
    CLOSE_SERVER,

    NOT_FOUND_ELEMENT,
    UNSUCCESSFUL_CONNECTION,
    UNABLE_TO_READ,
    UNABLE_TO_WRITE,
    UNABLE_TO_SERVICE_CHANNEL,
    UNABLE_TO_START_SERVER,
    UNKNOWN_COMMAND
}
