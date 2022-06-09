package edu.ufp.inf.lp2._06_bt;

import edu.ufp.inf.lp2._01_intro.pl.Date;
import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {

        /*TransitPolice bt = new TransitPolice();

        Driver c1 = new Driver("Pedro", "P-1234");
        Vehicle v1 = new Vehicle("12-34-AB", "BMW", "S1", 1900);
        PenaltyFee m1 = new SeverePenaltyFee(SeverePenaltyFee.PARKING_VIOLATION, "Porto", new Date(), v1, c1);

        PenaltyFee m2 = new VerySeverePenaltyFee(VerySeverePenaltyFee.SPEEDING, "Lisboa", new Date(01, 01, 2018), v1, c1);
        PenaltyFee m3 = new SeverePenaltyFee(SeverePenaltyFee.PARKING_VIOLATION, "Porto", new Date(1, 1, 2020), v1, c1);

        System.out.println("c1.getNumPenalties() = " + c1.getNumPenalties());

        try {
            bt.addPenaltyFee(m1);
            System.out.println("New Penalty added");
            System.out.println("Is licence aprehended? " + c1.isLicenceAprehended());
            bt.addPenaltyFee(m2);
            System.out.println("New Penalty added");
            System.out.println("Is licence aprehended? " + c1.isLicenceAprehended());
            bt.addPenaltyFee(m3);
            System.out.println("New Penalty added");
            System.out.println("Is licence aprehended? " + c1.isLicenceAprehended());
        } catch (AlreadyRegisteredMultaException ex) {
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("Finally block always gets executed");
        }

        System.out.println("Points\t\tPenalty Fee");
        /*for (Date d : bt.getPenaltyFees().keys()) {
            PenaltyFee pf = bt.getPenaltyFees().get(d);
            System.out.println(pf.punishment() + "\t\t" + pf.value());
        }*/
       /* System.out.println("c1.getNumPenalties() = " + c1.getNumPenalties());

        try {
            System.out.println("New Penalty added");
            bt.addPenaltyFee(m2);
        } catch (AlreadyRegisteredMultaException ex) {
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("Finally block always gets executed");
        }

        System.out.println("c1.getNumPenalties() = " + c1.getNumPenalties());

        try {
            System.out.println("Penalty Fees on " + SeverePenaltyFee.PARKING_VIOLATION);
            for (PenaltyFee pfi : bt.lookupPenaltyFees(SeverePenaltyFee.PARKING_VIOLATION)) {
                System.out.println(pfi);
            }
        } catch (NullPointerException e) {
            System.out.println("Erro: NUllPointerException");
        }*/

        //OUTPUT
        /*
        c1.getNumPenalties() = 0
        New Penalty added
        Is licence aprehended? false
        New Penalty added
        Is licence aprehended? false
        New Penalty added
        Is licence aprehended? true
        Finally block always gets executed
        Points		Penalty Fee
        90		100.0
        15		20.0
        15		20.0
        c1.getNumPenalties() = 3
        New Penalty added
        Penalty already registered!
        Finally block always gets executed
        c1.getNumPenalties() = 3
        Penalty Fees on PARKING_VIOLATION
        PenaltyFee{motive='PARKING_VIOLATION', local='Porto', date=1/1/2020, vehicle=edu.ufp.inf.lp2._5_bt.Vehicle@355da254, driver=Driver{name='Pedro', numPenalties=3, licenceNumber='P-1234'}}
        PenaltyFee{motive='PARKING_VIOLATION', local='Porto', date=24/3/2020, vehicle=edu.ufp.inf.lp2._5_bt.Vehicle@355da254, driver=Driver{name='Pedro', numPenalties=3, licenceNumber='P-1234'}}

        */
    }

}