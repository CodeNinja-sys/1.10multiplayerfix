/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class chk
extends kd {
    public static final qf c = qf.a("age", 0, 3);
    private static final cxt[] d = new cxt[]{new cxt(0.0, 0.0, 0.0, 1.0, 0.125, 1.0), new cxt(0.0, 0.0, 0.0, 1.0, 0.25, 1.0), new cxt(0.0, 0.0, 0.0, 1.0, 0.375, 1.0), new cxt(0.0, 0.0, 0.0, 1.0, 0.5, 1.0)};

    @Override
    protected qf d() {
        return c;
    }

    @Override
    public int e() {
        return 3;
    }

    @Override
    protected azg f() {
        return hp.cU;
    }

    @Override
    protected azg g() {
        return hp.cV;
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2, Random random) {
        if (random.nextInt(3) == 0) {
            this.f(iu2, cmz2, dbk2);
        } else {
            super.a(iu2, cmz2, dbk2, random);
        }
    }

    @Override
    protected int b(iu iu2) {
        return super.b(iu2) / 3;
    }

    @Override
    protected bkp a() {
        return new bkp(this, c);
    }

    @Override
    public cxt a(dbk dbk2, bnj bnj2, cmz cmz2) {
        return d[(Integer)dbk2.b(this.d())];
    }
}

