/*
 * Decompiled with CFR 0.150.
 */
public class bfc {
    public anr[] a = new anr[256];
    public int b;
    public int c;
    public long d;
    final /* synthetic */ aja e;

    public bfc(aja aja2, int n2, int n3) {
        this.e = aja2;
        this.b = n2;
        this.c = n3;
        aja.a(aja2).a(this.a, n2 << 4, n3 << 4, 16, 16, false);
    }

    public anr a(int n2, int n3) {
        return this.a[n2 & 0xF | (n3 & 0xF) << 4];
    }
}

