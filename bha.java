/*
 * Decompiled with CFR 0.150.
 */
public class bha {
    private final bix a;
    private final ari b = new ari();
    private static final bha c = new bha(0x200000);

    public static bha a() {
        return c;
    }

    public bha(int n2) {
        this.a = new bix(n2);
    }

    public void b() {
        this.a.e();
        this.b.a(this.a);
    }

    public bix c() {
        return this.a;
    }
}

