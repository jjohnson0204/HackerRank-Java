package Java.ObjectOrientedProgramming.Easy;

import java.util.*;
import java.io.*;


class BiCycle{
    String define_me(){
        return "a vehicle with pedals.";
    }
}

class MotorCycle extends BiCycle{
    String define_me(){
        return "a cycle with an engine.";
    }

    MotorCycle(){
        System.out.println("Hello I am a motorcycle, I am "+ define_me());
        //Fix this line
        //String temp="a vehicle with pedals.";
        String temp="a vehicle with pedals.";

        System.out.println("My ancestor is a cycle who is "+ temp );
    }

}
public class JavaMethodOverriding2 {
}
