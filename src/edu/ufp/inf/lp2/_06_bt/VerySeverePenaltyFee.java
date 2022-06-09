package edu.ufp.inf.lp2._06_bt;

import edu.ufp.inf.lp2._10_examples.brigadatransito.Driver;
import edu.ufp.inf.lp2._10_examples.brigadatransito.InvalidPenaltyFeeReasonException;
import edu.ufp.inf.lp2._10_examples.brigadatransito.PenaltyFee;
import edu.ufp.inf.lp2._10_examples.brigadatransito.Vehicle;

import java.util.Date;

public class VerySeverePenaltyFee extends PenaltyFee {
    
    public static String EXCESSO_ALCOOL = "EXCESSO_ALCOOL";
    public static String EXCESSO_VELOCIDADE = "EXCESSO_VELOCIDADE";

    public VerySeverePenaltyFee(Date data, String razao, String local) throws InvalidPenaltyFeeReasonException {
        super(data, razao, local);
        if(!(razao.equals(EXCESSO_ALCOOL) || razao.equals(EXCESSO_VELOCIDADE))){
            throw new InvalidPenaltyFeeReasonException("Razão inválida");
        }

    }
    
    public VerySeverePenaltyFee(Date data, String razao, String local, Driver condutor, Vehicle veiculo) throws InvalidPenaltyFeeReasonException {
        super(data, razao, local, condutor, veiculo);
        if(!(razao.equals(EXCESSO_ALCOOL) || razao.equals(EXCESSO_VELOCIDADE))){
            throw new InvalidPenaltyFeeReasonException("Razão inválida");
        }
    }

    @Override
    public float value() {
        return (2 * PenaltyFee.MIN_VALUE + 2 * super.getDriver().getnPenaltyFees());
    }

    @Override
    public int punishment() {
        return (3 * PenaltyFee.MIN_PUNISHMENT + 2 * super.getDriver().getnPenaltyFees());
    }
}