/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class ba
extends cmy {
    public static final yc a = cli.j;
    public static final qf b = qf.a("damage", 0, 2);
    protected static final cxt c = new cxt(0.0, 0.0, 0.125, 1.0, 1.0, 0.875);
    protected static final cxt d = new cxt(0.125, 0.0, 0.0, 0.875, 1.0, 1.0);
    protected static final d e = org.apache.logging.log4j.c.c();

    protected ba() {
        super(ahk.g);
        this.D(this.O.b().a(a, (Comparable)((Object)bqk.c)).a(b, Integer.valueOf(0)));
        this.h(0);
        this.a(zm.c);
    }

    @Override
    public boolean c(dbk dbk2) {
        return false;
    }

    @Override
    public boolean b(dbk dbk2) {
        return false;
    }

    @Override
    public dbk a(iu iu2, cmz cmz2, bqk bqk2, float f2, float f3, float f4, int n2, bga bga2) {
        bqk bqk3 = bga2.B_().f();
        try {
            return super.a(iu2, cmz2, bqk2, f2, f3, f4, n2, bga2).a(a, (Comparable)((Object)bqk3)).a(b, Integer.valueOf(n2 >> 2));
        }
        catch (IllegalArgumentException illegalArgumentException) {
            if (!iu2.C) {
                e.f(String.format("Invalid damage property for anvil at %s. Found %d, must be in [0, 1, 2]", cmz2, n2 >> 2));
                if (bga2 instanceof bdl) {
                    ((bdl)bga2).a(new du("Invalid damage property. Please pick in [0, 1, 2]", new Object[0]));
                }
            }
            return super.a(iu2, cmz2, bqk2, f2, f3, f4, 0, bga2).a(a, (Comparable)((Object)bqk3)).a(b, Integer.valueOf(0));
        }
    }

    @Override
    public boolean a(iu iu2, cmz cmz2, dbk dbk2, bdl bdl2, bqp bqp2, bhl bhl2, bqk bqk2, float f2, float f3, float f4) {
        if (!iu2.C) {
            bdl2.a(new bwj(iu2, cmz2));
        }
        return true;
    }

    @Override
    public int d(dbk dbk2) {
        return (Integer)dbk2.b(b);
    }

    @Override
    public cxt a(dbk dbk2, bnj bnj2, cmz cmz2) {
        bqk bqk2 = (bqk)((Object)dbk2.b(a));
        if (bqk2.l() == ctv.a) {
            return c;
        }
        return d;
    }

    @Override
    public void a(azg azg2, zm zm2, List list) {
        list.add(new bhl(azg2));
        list.add(new bhl(azg2, 1, 1));
        list.add(new bhl(azg2, 1, 2));
    }

    @Override
    protected void a(azb azb2) {
        azb2.a(true);
    }

    @Override
    public void b(iu iu2, cmz cmz2) {
        iu2.b(1031, cmz2, 0);
    }

    @Override
    public boolean a(dbk dbk2, bnj bnj2, cmz cmz2, bqk bqk2) {
        return true;
    }

    @Override
    public dbk a(int n2) {
        return this.s().a(a, (Comparable)((Object)bqk.b(n2 & 3))).a(b, Integer.valueOf((n2 & 0xF) >> 2));
    }

    @Override
    public int e(dbk dbk2) {
        int n2 = 0;
        n2 |= ((bqk)((Object)dbk2.b(a))).c();
        return n2 |= (Integer)dbk2.b(b) << 2;
    }

    @Override
    public dbk a(dbk dbk2, ih ih2) {
        if (dbk2.t() != this) {
            return dbk2;
        }
        return dbk2.a(a, (Comparable)((Object)ih2.a((bqk)((Object)dbk2.b(a)))));
    }

    @Override
    protected bkp a() {
        return new bkp(this, a, b);
    }
}

