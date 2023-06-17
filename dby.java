/*
 * Decompiled with CFR 0.150.
 */
public class dby {
    private final bix[] a = new bix[kj.values().length];

    public dby() {
        this.a[kj.a.ordinal()] = new bix(0x200000);
        this.a[kj.c.ordinal()] = new bix(131072);
        this.a[kj.b.ordinal()] = new bix(131072);
        this.a[kj.d.ordinal()] = new bix(262144);
    }

    public bix a(kj kj2) {
        return this.a[kj2.ordinal()];
    }

    public bix a(int n2) {
        return this.a[n2];
    }
}

