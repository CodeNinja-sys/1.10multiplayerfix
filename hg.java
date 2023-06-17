/*
 * Decompiled with CFR 0.150.
 */
public enum hg {
    a,
    b,
    c,
    d,
    e;


    public static hg a(String string) {
        for (hg hg2 : hg.values()) {
            if (!hg2.name().equalsIgnoreCase(string)) continue;
            return hg2;
        }
        return a;
    }

    public static String[] a() {
        String[] arrstring = new String[hg.values().length];
        int n2 = 0;
        for (hg hg2 : hg.values()) {
            arrstring[n2++] = hg2.name().toLowerCase();
        }
        return arrstring;
    }
}

