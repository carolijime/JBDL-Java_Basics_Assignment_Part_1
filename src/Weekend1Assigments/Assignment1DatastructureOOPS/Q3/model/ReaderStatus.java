package Weekend1Assigments.Assignment1DatastructureOOPS.Q3.model;

public enum ReaderStatus {
    OK,
    BARRED;

    public boolean isAllowedToBorrow() {
        return this == OK;
    }
}
