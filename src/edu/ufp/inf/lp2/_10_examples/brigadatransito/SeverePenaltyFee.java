package edu.ufp.inf.lp2._10_examples.brigadatransito;

import java.util.Date;

public class SeverePenaltyFee extends PenaltyFee {
    
    public static String PARKING_VIOLATION = "PARKING_VIOLATION";
    public static String PROHIBITION_ON_OVERTAKING = "PROHIBITION_ON_OVERTAKING";

    public SeverePenaltyFee(Date data, String razao, String local) throws InvalidPenaltyFeeReasonException {
        super(data, razao, local);
        if(!(razao.equals(PARKING_VIOLATION) || razao.equals(PROHIBITION_ON_OVERTAKING))){
            throw new InvalidPenaltyFeeReasonException("Razão inválida");
        }
    }
    
    public SeverePenaltyFee(Date data, String razao, String local, Driver condutor, Vehicle veiculo) throws InvalidPenaltyFeeReasonException {
        super(data, razao, local, condutor, veiculo);
        if(!(razao.equals(PARKING_VIOLATION) || razao.equals(PROHIBITION_ON_OVERTAKING))){
            throw new InvalidPenaltyFeeReasonException("Razão inválida");
        }
    }


    @Override
    public float value() {
        return PenaltyFee.MIN_VALUE;
    }

    @Override
    public int punishment() {
        return PenaltyFee.MIN_PUNISHMENT;
    }
}