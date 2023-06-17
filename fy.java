/*
 * Decompiled with CFR 0.150.
 */
public enum fy implements hn
{
    a("x"),
    b("y"),
    c("z"),
    d("none");

    private final String e;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private fy() {
        void var3_1;
        this.e = var3_1;
    }

    public String toString() {
        return this.e;
    }

    public static fy a(ctv ctv2) {
        switch (ctv2) {
            case a: {
                return a;
            }
            case b: {
                return b;
            }
            case c: {
                return c;
            }
        }
        return d;
    }

    @Override
    public String a() {
        return this.e;
    }
}

