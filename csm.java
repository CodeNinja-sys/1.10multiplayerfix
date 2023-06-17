/*
 * Decompiled with CFR 0.150.
 */
public class csm
extends cay {
    public static final qf a = qf.a("power", 0, 15);
    private final int e;

    protected csm(ahk ahk2, int n2) {
        this(ahk2, n2, ahk2.p());
    }

    protected csm(ahk ahk2, int n2, bif bif2) {
        super(ahk2, bif2);
        this.D(this.O.b().a(a, Integer.valueOf(0)));
        this.e = n2;
    }

    @Override
    protected int e(iu iu2, cmz cmz2) {
        int n2 = Math.min(iu2.a(cpk.class, d.a(cmz2)).size(), this.e);
        if (n2 > 0) {
            float f2 = (float)Math.min(this.e, n2) / (float)this.e;
            return cmk.f(f2 * 15.0f);
        }
        return 0;
    }

    @Override
    protected void c(iu iu2, cmz cmz2) {
        iu2.a(null, cmz2, dah.dy, csg.e, 0.3f, 0.90000004f);
    }

    @Override
    protected void d(iu iu2, cmz cmz2) {
        iu2.a(null, cmz2, dah.dx, csg.e, 0.3f, 0.75f);
    }

    @Override
    protected int m(dbk dbk2) {
        return (Integer)dbk2.b(a);
    }

    @Override
    protected dbk a(dbk dbk2, int n2) {
        return dbk2.a(a, Integer.valueOf(n2));
    }

    @Override
    public int a(iu iu2) {
        return 10;
    }

    @Override
    public dbk a(int n2) {
        return this.s().a(a, Integer.valueOf(n2));
    }

    @Override
    public int e(dbk dbk2) {
        return (Integer)dbk2.b(a);
    }

    @Override
    protected bkp a() {
        return new bkp(this, a);
    }
}

