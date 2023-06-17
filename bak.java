/*
 * Decompiled with CFR 0.150.
 */
public enum bak {
    a("this"),
    b("killer"),
    c("killer_player");

    private final String d;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private bak() {
        void var3_1;
        this.d = var3_1;
    }

    public static bak a(String string) {
        for (bak bak2 : bak.values()) {
            if (!bak2.d.equals(string)) continue;
            return bak2;
        }
        throw new IllegalArgumentException("Invalid entity target " + string);
    }

    static /* synthetic */ String a(bak bak2) {
        return bak2.d;
    }
}

