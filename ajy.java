/*
 * Decompiled with CFR 0.150.
 */
public abstract class ajy
implements cui {
    private final String a;
    private final String b;

    public ajy(String string, String string2) {
        this.a = string;
        this.b = string2;
    }

    @Override
    public bvp a(bzs bzs2, bvp bvp2, int n2) {
        if (bvp2.l(this.a).equals(this.b)) {
            bvp2 = this.b(bzs2, bvp2, n2);
        }
        return bvp2;
    }

    abstract bvp b(bzs var1, bvp var2, int var3);
}

