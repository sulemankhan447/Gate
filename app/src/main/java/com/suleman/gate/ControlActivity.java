package com.suleman.gate;

/**
 * Created by Sulle on 06-Sep-17.
 */

public class ControlActivity {
    public String[] questions = {
            "Inventor of C Language",
            "Return type of Integer.toString()",
            "Which is Super Class of Exception in Java",
            "Which Inheritance is not supported in Java",
            "Which of these keyword must be used to inherit a class?",
            "A class member declared protected becomes member of subclass of which type?",
            " If a set of processes cannot be scheduled by rate monotonic scheduling algorithm, then :",
           "The ____________ scheduling algorithm schedules periodic tasks using a static priority policy with preemption.",
            "The number of processes completed per unit time is known as __________.",
            "The state of a process is defined by :",
            "In UNIX, each process is identified by its :",
            "The child process completes execution,but the parent keeps executing, then the child process is known as :"};
    public String choice[][] = {
            {"Dennis Ritchie", "James Gosling", "Bjarne Straustrup", "Andy Rubin"},
            {"int", "boolean", "String", "Object"},
            {"Exception","Object","AWT","Swing"},
            {"Multi-level","Multiple","Hierarchical","Single Level"},
            {"Super","This","extends","implements"},
            {"Public Member","Private Member","Protected Member","Static Member"},
            {"they can be scheduled by EDF algorithm","they cannot be scheduled by EDF algorithm","they cannot be scheduled by any other algorithm","None of these"},
            {"earliest deadline first","rate monotonic","first cum first served","priority"},
            {"Output","Throughput","Efficiency","Capacity"},
            {"the final activity of the process","the activity just executed by the process","the activity to next be executed by the process","the current activity of the process"},
            {"Process Control Block","Device Queue","Process Identifier","None of these"},
            {"Orphan","Zombie","Body","Dead"}};
    public String correctAnswers[] = {
                                    "Dennis Ritchie"
                                    , "String"
                                    ,"Exception"
                                    ,"Multiple"
                                    ,"extends"
                                    ,"Private Member"
                                    ,"they cannot be scheduled by any other algorithm"
                                    ,"rate monotonic"
                                    ,"Throughput"
                                    ,"the current activity of the process"
                                    ,"Process Identifier"
                                    ,"Zombie"};

    public String getQuestion(int a) {
        return questions[a];
    }

    /*public String getChoice(int a) {
        if (a == 0) {
            return choice[a][0];
        } else if (a == 1) {
            return choice[a][1];
        } else if (a == 2) {
            return choice[a][2];
        } else {
            return choice[a][3];
        }*/
    public String getChoice1(int a)
    {
        return choice [a][0];
    }
    public String getChoice2(int a)
    {
        return choice [a][1];
    }
    public String getChoice3(int a)
    {
        return choice [a][2];
    }
    public String getChoice4(int a)
    {
        return choice [a][3];
    }


    public String getAnswer(int a) {
        return correctAnswers[a];
    }
}
