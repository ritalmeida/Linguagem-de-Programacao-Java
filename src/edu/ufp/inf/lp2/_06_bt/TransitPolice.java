package edu.ufp.inf.lp2._06_bt;

import edu.ufp.inf.lp2._01_intro.pl.Date;

import java.util.ArrayList;

public class TransitPolice {

    /**
   * 
   * @element-type PenaltyFee
   */
  //public RedBlackBST<Date, PenaltyFee> penaltyFees = new RedBlackBST<>();

  public TransitPolice() {

  }

  /*public void addPenaltyFee(PenaltyFee penaltyFee) throws AlreadyRegisteredMultaException {
  /* {exceptions=AlreadyRegisteredMultaException}*/
  /* for(Date d : this.penaltyFees.keys()){
        PenaltyFee pfi = this.penaltyFees.get(d);
        if(pfi.compareTo(penaltyFee) == 0){
          throw new AlreadyRegisteredMultaException("Pelanty already registered!");
        }
      }

      penaltyFee.getDriver().setNumPenalties(penaltyFee.getDriver().getNumPenalties() + 1);
      penaltyFee.getDriver().addPoints(penaltyFee.punishment());
      this.penaltyFees.put(penaltyFee.getDate(), penaltyFee);
      //verificar se é necessario apreender a carta de conduçao do condutor
    seizeLicense(penaltyFee.getDriver());
  }*/

  public PenaltyFee removePenaltyFee(Date d, String local) {

    return null;
  }

  public ArrayList<PenaltyFee> lookupPenaltyFees(String motive) {

    return null;
  }

  public ArrayList<PenaltyFee> lookupPenaltyFees(Date startDate, Date endDate) {

    return null;
  }

  public int countPenaltyFees(Driver driver) {

    return 0;
  }

  public ArrayList<String> allPenaltyFeesMotiveByDriver(Driver driver) {

    return null;
  }

  public void seizeLicense(Driver driver) {
    //se há 3 ou mais infracoes nos ultimos x anos, apreender carta. ver enunciado
  }

  public ArrayList<PenaltyFee> lookupPenaltyFeesDriver(Driver d, Date startDate, Date endDate) {

    return null;
  }

  /*public RedBlackBST<Date, PenaltyFee> getPenaltyFees() {

    return penaltyFees;
  }*/
}