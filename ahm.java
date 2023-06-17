/*
 * Decompiled with CFR 0.150.
 */
public class ahm
implements ds {
    private cmz a;
    private int b;
    private int c;
    private bfa d;

    public ahm() {
    }

    public ahm(cmz cmz2, bfa bfa2, int n2, int n3) {
        this.a = cmz2;
        this.b = n2;
        this.c = n3;
        this.d = bfa2;
    }

    @Override
    public void a(si si2) {
        this.a = si2.c();
        this.b = si2.F();
        this.c = si2.F();
        this.d = bfa.f(si2.e() & 0xFFF);
    }

    @Override
    public void b(si si2) {
        si2.a(this.a);
        si2.B(this.b);
        si2.B(this.c);
        si2.d(bfa.c(this.d) & 0xFFF);
    }

    public void a(bfz bfz2) {
        bfz2.a(this);
    }

    public cmz a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public int c() {
        return this.c;
    }

    public bfa d() {
        return this.d;
    }
}

