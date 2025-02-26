public class isomorphic {
    public static void main(String[] args) {
        String s = 'mood';
        String t = 'race';
        System.out.print(isomorphic()+" ");
    }

    public boolean isomorphic1(String s, String t) {
        // 128 all characters
        char[] a = new char[128];

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            char dh = t.charAt(i);
            int idx = (int) ch;
            if (a[idx] == '\0') {
                a[idx] = dh;
            } else {
                if (a[idx] != dh)
                    return false;
            }
        }
        return true;
    }
}
