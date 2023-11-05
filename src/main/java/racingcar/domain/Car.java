package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;
import static racingcar.service.NumberRange.*;

public class Car {
    private String name;

    private int RemainingOpportunity;

    private int movementScore;

    public Car(String name, int movementOpportunity) {
        this.name = name;
        this.RemainingOpportunity = movementOpportunity;
        this.movementScore = 0;
    }

    public void tryToGetMovementScore(){
        if(!checkRemainingOpportunity()) {
            return;
        }
        if(pickRandomNumberToMove()>= POSSIBLE_TO_MOVE_NUMBER.getValue()) {
            this.movementScore++;
        }
        this.RemainingOpportunity--;
    }

    private boolean checkRemainingOpportunity(){
        if(this.getRemainingOpportunity()>0) {
            return true;
        }
        return false;
    }


    protected int pickRandomNumberToMove(){
        return Randoms.pickNumberInRange(START_NUMBER.getValue(),END_NUMBER.getValue());
    }

    public String getName(){
        return name;
    }

    public int getMovementScore(){ return movementScore; }

    public int getRemainingOpportunity(){
        return RemainingOpportunity;
    }
}
