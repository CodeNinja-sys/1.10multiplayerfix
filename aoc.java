/*
 * Decompiled with CFR 0.150.
 */
public class aoc
implements ds {
    private String a;
    private int b;
    private bgi c;
    private boolean d;
    private int e;
    private s f;

    public aoc() {
    }

    public aoc(String string, int n2, bgi bgi2, boolean bl2, int n3, s s2) {
        this.a = string;
        this.b = n2;
        this.c = bgi2;
        this.d = bl2;
        this.e = n3;
        this.f = s2;
    }

    @Override
    public void a(si si2) {
        this.a = si2.e(7);
        this.b = si2.E();
        this.c = (bgi)si2.a(bgi.class);
        this.d = si2.D();
        this.e = si2.F();
        this.f = (s)si2.a(s.class);
    }

    @Override
    public void b(si si2) {
        si2.a(this.a);
        si2.B(this.b);
        si2.a(this.c);
        si2.a(this.d);
        si2.B(this.e);
        si2.a(this.f);
    }

    public void a(bws bws2) {
        bws2.a(this);
    }

    public String a() {
        return this.a;
    }

    public bgi b() {
        return this.c;
    }

    public boolean c() {
        return this.d;
    }

    public int d() {
        return this.e;
    }

    public s e() {
        return this.f;
    }
}

