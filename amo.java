/*
 * Decompiled with CFR 0.150.
 */
public class amo
extends ajy {
    private final String[] a;

    public amo(String string, String ... arrstring) {
        super("id", string);
        this.a = arrstring;
    }

    @Override
    bvp b(bzs bzs2, bvp bvp2, int n2) {
        for (String string : this.a) {
            bvp2 = ccz.a(bzs2, bvp2, n2, string);
        }
        return bvp2;
    }
}

