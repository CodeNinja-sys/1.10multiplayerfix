/*
 * Decompiled with CFR 0.150.
 */
public enum ad {
    a("file"),
    b("event");

    private final String c;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ad() {
        void var3_1;
        this.c = var3_1;
    }

    public static ad a(String string) {
        for (ad ad2 : ad.values()) {
            if (!ad2.c.equals(string)) continue;
            return ad2;
        }
        return null;
    }
}

