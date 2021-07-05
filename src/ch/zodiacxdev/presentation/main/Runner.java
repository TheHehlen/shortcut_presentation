package ch.zodiacxdev.presentation.main;

public class Runner {

                                                                                                                                            private static String msgToGiveOut = "Welcome to my shortcut presentation";

    public static           void main(String[]    args) {
        changeHere();
        System.out.println(msgToGiveOut);
    }


              private      static   void change() {
        msgToGiveOut += " test";
}

    private      static void changeHere() { change();
        msgToGiveOut = msgToGiveOut.concat(" which is")                            .concat(" pretty simple")
                .replace("shortcut", "small")
        .replace("presentation", "demo");
        }
}
