/*
 * Decompiled with CFR 0.150.
 */
public class blm
extends kd {
    private static final cxt[] c = new cxt[]{new cxt(0.0, 0.0, 0.0, 1.0, 0.125, 1.0), new cxt(0.0, 0.0, 0.0, 1.0, 0.1875, 1.0), new cxt(0.0, 0.0, 0.0, 1.0, 0.25, 1.0), new cxt(0.0, 0.0, 0.0, 1.0, 0.3125, 1.0), new cxt(0.0, 0.0, 0.0, 1.0, 0.375, 1.0), new cxt(0.0, 0.0, 0.0, 1.0, 0.4375, 1.0), new cxt(0.0, 0.0, 0.0, 1.0, 0.5, 1.0), new cxt(0.0, 0.0, 0.0, 1.0, 0.5625, 1.0)};

    @Override
    protected azg f() {
        return hp.cb;
    }

    @Override
    protected azg g() {
        return hp.cb;
    }

    @Override
    public cxt a(dbk dbk2, bnj bnj2, cmz cmz2) {
        return c[(Integer)dbk2.b(this.d())];
    }
}

