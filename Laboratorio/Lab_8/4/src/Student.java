public class Student {

    private String name;
    private int writtenVote;
    private int oralVote;

    public Student(String name, int writtenVote, int oralVote) {
        this.name = name;
        this.writtenVote = writtenVote;
        this.oralVote = oralVote;
    }

    public String getName() {
        return name;
    }

    public int getWrittenVote() {
        return writtenVote;
    }

    public int getOralVote() {
        return oralVote;
    }

}
