/*
 * Decompiled with CFR 0.150.
 */
public class cha
implements ds {
    private hg a;
    private cbg b;
    private int c;
    private int d;
    private int e;

    public cha() {
    }

    public cha(hg hg2, cbg cbg2) {
        this(hg2, cbg2, -1, -1, -1);
    }

    public cha(int n2, int n3, int n4) {
        this(hg.c, null, n2, n3, n4);
    }

    public cha(hg hg2, cbg cbg2, int n2, int n3, int n4) {
        this.a = hg2;
        this.b = cbg2;
        this.c = n2;
        this.d = n3;
        this.e = n4;
    }

    @Override
    public void a(si si2) {
        this.a = (hg)si2.a(hg.class);
        if (this.a == hg.a || this.a == hg.b) {
            this.b = si2.d();
        }
        if (this.a == hg.c) {
            this.c = si2.K();
            this.d = si2.K();
            this.e = si2.K();
        }
    }

    @Override
    public void b(si si2) {
        si2.a(this.a);
        if (this.a == hg.a || this.a == hg.b) {
            si2.a(this.b);
        }
        if (this.a == hg.c) {
            si2.E(this.c);
            si2.E(this.d);
            si2.E(this.e);
        }
    }

    public void a(bfz bfz2) {
        bfz2.a(this);
    }

    public hg a() {
        return this.a;
    }

    public cbg b() {
        return this.b;
    }

    public int c() {
        return this.c;
    }

    public int d() {
        return this.d;
    }

    public int e() {
        return this.e;
    }
}

