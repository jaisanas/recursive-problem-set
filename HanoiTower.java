class HanoiTower {
    public String hanoi(int nDisks, int fromPeg, int toPeg) {
        if(nDisks == 1) {
            return fromPeg + "->" + toPeg + ";";
        } else {
            String sol1, sol2, sol3;
            int helpPeg = 6 - fromPeg - toPeg;
            sol1 = hanoi(nDisks - 1, fromPeg, helpPeg);
            sol2 = fromPeg + "->" + toPeg + ";";
            sol3 = hanoi(nDisks - 1, helpPeg, toPeg);

            return sol1 + sol2 + sol3;
        }
    }

    public static void main(String[] args) {
        int nDisks = 3;
        HanoiTower h = new HanoiTower();
        String res = h.hanoi(nDisks, 1, 3);
        for(String step: res.split(";")) {
            System.out.println(step);
        }
    }
}