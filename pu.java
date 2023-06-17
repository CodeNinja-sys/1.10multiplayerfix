/*
 * Decompiled with CFR 0.150.
 */
class pu {
    final adr a;
    final bqk b;
    byte c;
    final int d;
    final /* synthetic */ fr e;

    private pu(fr fr2, adr adr2, bqk bqk2, int n2) {
        this.e = fr2;
        this.a = adr2;
        this.b = bqk2;
        this.d = n2;
    }

    public void a(byte by2, bqk bqk2) {
        this.c = (byte)(this.c | (by2 | 1 << bqk2.ordinal()));
    }

    public boolean a(bqk bqk2) {
        return (this.c & 1 << bqk2.ordinal()) > 0;
    }

    /* synthetic */ pu(fr fr2, adr adr2, bqk bqk2, int n2, ane ane2) {
        this(fr2, adr2, bqk2, n2);
    }
}

