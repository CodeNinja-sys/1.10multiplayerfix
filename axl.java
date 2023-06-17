/*
 * Decompiled with CFR 0.150.
 */
public class axl
extends kd {
    private static final cxt[] c = new cxt[]{new cxt(0.0, 0.0, 0.0, 1.0, 0.125, 1.0), new cxt(0.0, 0.0, 0.0, 1.0, 0.1875, 1.0), new cxt(0.0, 0.0, 0.0, 1.0, 0.25, 1.0), new cxt(0.0, 0.0, 0.0, 1.0, 0.3125, 1.0), new cxt(0.0, 0.0, 0.0, 1.0, 0.375, 1.0), new cxt(0.0, 0.0, 0.0, 1.0, 0.4375, 1.0), new cxt(0.0, 0.0, 0.0, 1.0, 0.5, 1.0), new cxt(0.0, 0.0, 0.0, 1.0, 0.5625, 1.0)};

    @Override
    protected azg f() {
        return hp.cc;
    }

    @Override
    protected azg g() {
        return hp.cc;
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2, float f2, int n2) {
        super.a(iu2, cmz2, dbk2, f2, n2);
        if (iu2.C) {
            return;
        }
        if (this.o(dbk2) && iu2.p.nextInt(50) == 0) {
            axl.a(iu2, cmz2, new bhl(hp.ce));
        }
    }

    @Override
    public cxt a(dbk dbk2, bnj bnj2, cmz cmz2) {
        return c[(Integer)dbk2.b(this.d())];
    }
}

