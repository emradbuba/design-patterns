package io.github.guit4rfre4k.designpatterns.adapter.main;

import io.github.guit4rfre4k.designpatterns.adapter.system_b.PersonalRecordB;
import io.github.guit4rfre4k.designpatterns.adapter.system_b.PersonalRecordBImpl;
import io.github.guit4rfre4k.designpatterns.adapter.system_b.PersonalRecordsRaportGenerator;

import java.util.HashSet;
import java.util.Set;

public class MainClass {

    public static void main(String[] args) {

        Set<PersonalRecordB> recordsB =  new HashSet<>();
        recordsB.add(new PersonalRecordBImpl("Radek Michal", "Mzdk", 1988));
        recordsB.add(new PersonalRecordBImpl("Angelo Micheal", "Schwarz", 1993));
        recordsB.add(new PersonalRecordBImpl("Martha Isabell", "Bright", 1998));
        // complication error:
        //recordsB.add(new PersonRecordA("Arthur", "Jack", "Lemon", 54));
        //recordsB.add(new PersonRecordA("Gregor", "Matt", "Sitlinksy", 29));


        PersonalRecordsRaportGenerator generator = new PersonalRecordsRaportGenerator();
        generator.printRaport(recordsB);

    }

}
