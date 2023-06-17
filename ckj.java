/*
 * Decompiled with CFR 0.150.
 */
public class ckj
implements ds {
    private int a;
    private String b;
    private cbg c;
    private int d;
    private int e;

    public ckj() {
    }

    public ckj(int n2, String string, cbg cbg2) {
        this(n2, string, cbg2, 0);
    }

    public ckj(int n2, String string, cbg cbg2, int n3) {
        this.a = n2;
        this.b = string;
        this.c = cbg2;
        this.d = n3;
    }

    public ckj(int n2, String string, cbg cbg2, int n3, int n4) {
        this(n2, string, cbg2, n3);
        this.e = n4;
    }

    public void a(bfz bfz2) {
        bfz2.a(this);
    }

    @Override
    public void a(si si2) {
        this.a = si2.F();
        this.b = si2.e(32);
        this.c = si2.d();
        this.d = si2.F();
        if (this.b.equals("EntityHorse")) {
            this.e = si2.K();
        }
    }

    @Override
    public void b(si si2) {
        si2.B(this.a);
        si2.a(this.b);
        si2.a(this.c);
        si2.B(this.d);
        if (this.b.equals("EntityHorse")) {
            si2.E(this.e);
        }
    }

    public int a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public cbg c() {
        return this.c;
    }

    public int d() {
        return this.d;
    }

    public int e() {
        return this.e;
    }

    public boolean f() {
        return this.d > 0;
    }
}

