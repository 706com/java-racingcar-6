package racingcar.service;

public enum NumberRange {
    START_NUMBER(0) ,
    END_NUMBER(9) ,
    POSSIBLE_TO_MOVE_NUMBER(4);

    private int value;

    NumberRange(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
