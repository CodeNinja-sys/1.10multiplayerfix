/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;

public class z
extends bfa {
    public static final byc a = byc.a("color", dck.class);
    protected static final cxt b = new cxt(0.0, 0.0, 0.0, 1.0, 0.0625, 1.0);

    protected z() {
        super(ahk.r);
        this.D(this.O.b().a(a, (Comparable)((Object)dck.a)));
        this.b(true);
        this.a(zm.c);
    }

    @Override
    public cxt a(dbk dbk2, bnj bnj2, cmz cmz2) {
        return b;
    }

    @Override
    public bif a(dbk dbk2) {
        return ((dck)((Object)dbk2.b(a))).e();
    }

    @Override
    public boolean b(dbk dbk2) {
        return false;
    }

    @Override
    public boolean c(dbk dbk2) {
        return false;
    }

    @Override
    public boolean a(iu iu2, cmz cmz2) {
        return super.a(iu2, cmz2) && this.c(iu2, cmz2);
    }

    @Override
    public void a(dbk dbk2, iu iu2, cmz cmz2, bfa bfa2) {
        this.e(iu2, cmz2, dbk2);
    }

    private boolean e(iu iu2, cmz cmz2, dbk dbk2) {
        if (!this.c(iu2, cmz2)) {
            this.b(iu2, cmz2, dbk2, 0);
            iu2.f(cmz2);
            return false;
        }
        return true;
    }

    private boolean c(iu iu2, cmz cmz2) {
        return !iu2.c(cmz2.h());
    }

    @Override
    public boolean a(dbk dbk2, bnj bnj2, cmz cmz2, bqk bqk2) {
        if (bqk2 == bqk.b) {
            return true;
        }
        if (bnj2.n(cmz2.c(bqk2)).t() == this) {
            return true;
        }
        return super.a(dbk2, bnj2, cmz2, bqk2);
    }

    @Override
    public int d(dbk dbk2) {
        return ((dck)((Object)dbk2.b(a))).b();
    }

    @Override
    public void a(azg azg2, zm zm2, List list) {
        for (int i2 = 0; i2 < 16; ++i2) {
            list.add(new bhl(azg2, 1, i2));
        }
    }

    @Override
    public dbk a(int n2) {
        return this.s().a(a, (Comparable)((Object)dck.b(n2)));
    }

    @Override
    public int e(dbk dbk2) {
        return ((dck)((Object)dbk2.b(a))).b();
    }

    @Override
    protected bkp a() {
        return new bkp(this, a);
    }
}

