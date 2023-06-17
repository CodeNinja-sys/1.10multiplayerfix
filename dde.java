/*
 * Decompiled with CFR 0.150.
 */
public class dde
extends cdf {
    public dde(bfa bfa2) {
        super(bfa2, bfa2, new String[]{"intact", "slightlyDamaged", "veryDamaged"});
    }

    @Override
    public int a(int n2) {
        return n2 << 2;
    }
}

