package home8;

public class Animals {

    private String specialVoice;

    public Animals(String specialVoice) {
        this.specialVoice = specialVoice;
    }

    public void voice(String newVoice) {
        this.specialVoice = newVoice;

    }


    @Override
    public String toString() {
        return "Animals{" +
                "specialVoice='" + specialVoice + '\'' +
                '}';
    }
}
