/*
 * Decompiled with CFR 0.150.
 */
enum avp implements hn
{
    a("up"),
    b("side"),
    c("none");

    private final String d;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private avp() {
        void var3_1;
        this.d = var3_1;
    }

    public String toString() {
        return this.a();
    }

    @Override
    public String a() {
        return this.d;
    }
}

