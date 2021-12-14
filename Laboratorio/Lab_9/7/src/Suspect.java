public class Suspect {

    final private String name;
    final private int agat, aatg, tatc;

    public Suspect(String name, int agat, int aatg, int tatc) {
        this.name = name;
        this.agat = agat;
        this.aatg = aatg;
        this.tatc = tatc;
    }

    public boolean checkCompatibility(String sequence) {
        int _agat = 0, _aatg = 0, _tatc = 0;
        for (int i = 0; i < sequence.length(); i++) {
            try {
                switch (sequence.substring(i, i + 4)) {
                    case "AGAT":
                        _agat++;
                        break;
                    case "AATG":
                        _aatg++;
                        break;
                    case "TATC":
                        _tatc++;
                        break;
                    default:
                        break;
                }
            } catch (Exception e) {
                // ignore: empty catch block
            }
        }
        return _agat >= agat && _aatg >= aatg && _tatc >= tatc;
    }

    @Override
    public String toString() {
        return String.format("%s[name=%s,AGAT=%d,AATG=%d,TATC=%d]", getClass().getName(), name, agat, aatg, tatc);
    }

}
