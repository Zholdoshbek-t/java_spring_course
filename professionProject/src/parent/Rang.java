package parent;

public enum Rang {
    JUNIOR("I'm a junior developer"),
    MIDDLE("I'm a middle developer"),
    SENIOR("I'm a senior developer"),
    TEAMLEAD("I am a teamlead developer");

    String phrase;

    Rang(String phrase){
        this.phrase = phrase;
    }

    public void printPhrase() {
        System.out.println(phrase);
    }

}
