public class CharacterReprogramming {
    public int getMaxDeletions(String s) {
        int u = 0, d = 0, l = 0, r = 0;
        for (char c : s.toCharArray()) {
            switch (Character.toUpperCase(c)) {
                case 'U': u++; break;
                case 'D': d++; break;
                case 'L': l++; break;
                case 'R': r++; break;
            }
        }
        return 2 * (Math.min(u, d) + Math.min(l, r));
    }

    public static void main(String[] args) {
        CharacterReprogramming cr = new CharacterReprogramming();
        System.out.println(cr.getMaxDeletions("RRR")); // Expected: 0
        System.out.println(cr.getMaxDeletions("UUDDRRLL")); // Expected: 8
        System.out.println(cr.getMaxDeletions("UURRDD")); // Expected: 4
        System.out.println(cr.getMaxDeletions("")); // Expected: 0
        System.out.println(cr.getMaxDeletions("UDud")); // Expected: 4
        System.out.println(cr.getMaxDeletions("Llrruudd")); // Expected: 8
        System.out.println(cr.getMaxDeletions("UUUU")); // Expected: 0
        System.out.println(cr.getMaxDeletions("UDLR")); // Expected: 4
        System.out.println(cr.getMaxDeletions("UUDDLLRRAA")); // Expected: 8
    }
}
