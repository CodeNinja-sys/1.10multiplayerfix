/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.cm;
import java.util.List;
import java.util.Random;

public class bnb
extends bxs {
    public static final byc a = byc.a("shape", ctp.class, new cix());
    public static final ddi b = ddi.b("powered");

    public bnb() {
        super(true);
        this.D(this.O.b().a(b, Boolean.valueOf(false)).a(a, (Comparable)((Object)ctp.a)));
        this.b(true);
    }

    @Override
    public int a(iu iu2) {
        return 20;
    }

    @Override
    public boolean i(dbk dbk2) {
        return true;
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2, cpk cpk2) {
        if (iu2.C) {
            return;
        }
        if (((Boolean)dbk2.b(b)).booleanValue()) {
            return;
        }
        this.e(iu2, cmz2, dbk2);
    }

    @Override
    public void b(iu iu2, cmz cmz2, dbk dbk2, Random random) {
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2, Random random) {
        if (iu2.C || !((Boolean)dbk2.b(b)).booleanValue()) {
            return;
        }
        this.e(iu2, cmz2, dbk2);
    }

    @Override
    public int b(dbk dbk2, bnj bnj2, cmz cmz2, bqk bqk2) {
        return (Boolean)dbk2.b(b) != false ? 15 : 0;
    }

    @Override
    public int c(dbk dbk2, bnj bnj2, cmz cmz2, bqk bqk2) {
        if (!((Boolean)dbk2.b(b)).booleanValue()) {
            return 0;
        }
        return bqk2 == bqk.b ? 15 : 0;
    }

    private void e(iu iu2, cmz cmz2, dbk dbk2) {
        boolean bl2 = (Boolean)dbk2.b(b);
        boolean bl3 = false;
        List list = this.a(iu2, cmz2, cef.class, new cm[0]);
        if (!list.isEmpty()) {
            bl3 = true;
        }
        if (bl3 && !bl2) {
            iu2.a(cmz2, dbk2.a(b, Boolean.valueOf(true)), 3);
            this.a(iu2, cmz2, dbk2, true);
            iu2.b(cmz2, this);
            iu2.b(cmz2.h(), this);
            iu2.b(cmz2, cmz2);
        }
        if (!bl3 && bl2) {
            iu2.a(cmz2, dbk2.a(b, Boolean.valueOf(false)), 3);
            this.a(iu2, cmz2, dbk2, false);
            iu2.b(cmz2, this);
            iu2.b(cmz2.h(), this);
            iu2.b(cmz2, cmz2);
        }
        if (bl3) {
            iu2.a(new cmz(cmz2), (bfa)this, this.a(iu2));
        }
        iu2.f(cmz2, this);
    }

    protected void a(iu iu2, cmz cmz2, dbk dbk2, boolean bl2) {
        axn axn2 = new axn(this, iu2, cmz2, dbk2);
        List list = axn2.a();
        for (cmz cmz3 : list) {
            dbk dbk3 = iu2.n(cmz3);
            if (dbk3 == null) continue;
            dbk3.a(iu2, cmz3, dbk3.t());
        }
    }

    @Override
    public void a(iu iu2, cmz cmz2, dbk dbk2) {
        super.a(iu2, cmz2, dbk2);
        this.e(iu2, cmz2, dbk2);
    }

    @Override
    public bvs d() {
        return a;
    }

    @Override
    public boolean h(dbk dbk2) {
        return true;
    }

    @Override
    public int a(dbk dbk2, iu iu2, cmz cmz2) {
        if (((Boolean)dbk2.b(b)).booleanValue()) {
            List list = this.a(iu2, cmz2, dbu.class, new cm[0]);
            if (!list.isEmpty()) {
                return ((dbu)list.get(0)).p().j();
            }
            List list2 = this.a(iu2, cmz2, cef.class, auxx.c);
            if (!list2.isEmpty()) {
                return apq.b((tb)list2.get(0));
            }
        }
        return 0;
    }

    protected List a(iu iu2, cmz cmz2, Class class_, cm ... arrcm) {
        cxt cxt2 = this.a(cmz2);
        if (arrcm.length != 1) {
            return iu2.a(class_, cxt2);
        }
        return iu2.a(class_, cxt2, arrcm[0]);
    }

    private cxt a(cmz cmz2) {
        float f2 = 0.2f;
        return new cxt((float)cmz2.a() + 0.2f, cmz2.b(), (float)cmz2.c() + 0.2f, (float)(cmz2.a() + 1) - 0.2f, (float)(cmz2.b() + 1) - 0.2f, (float)(cmz2.c() + 1) - 0.2f);
    }

    @Override
    public dbk a(int n2) {
        return this.s().a(a, (Comparable)((Object)ctp.a(n2 & 7))).a(b, Boolean.valueOf((n2 & 8) > 0));
    }

    @Override
    public int e(dbk dbk2) {
        int n2 = 0;
        n2 |= ((ctp)((Object)dbk2.b(a))).b();
        if (((Boolean)dbk2.b(b)).booleanValue()) {
            n2 |= 8;
        }
        return n2;
    }

    @Override
    public dbk a(dbk dbk2, ih ih2) {
        switch (ih2) {
            case c: {
                switch ((ctp)((Object)dbk2.b(a))) {
                    case c: {
                        return dbk2.a(a, (Comparable)((Object)ctp.d));
                    }
                    case d: {
                        return dbk2.a(a, (Comparable)((Object)ctp.c));
                    }
                    case e: {
                        return dbk2.a(a, (Comparable)((Object)ctp.f));
                    }
                    case f: {
                        return dbk2.a(a, (Comparable)((Object)ctp.e));
                    }
                    case g: {
                        return dbk2.a(a, (Comparable)((Object)ctp.i));
                    }
                    case h: {
                        return dbk2.a(a, (Comparable)((Object)ctp.j));
                    }
                    case i: {
                        return dbk2.a(a, (Comparable)((Object)ctp.g));
                    }
                    case j: {
                        return dbk2.a(a, (Comparable)((Object)ctp.h));
                    }
                }
            }
            case d: {
                switch ((ctp)((Object)dbk2.b(a))) {
                    case a: {
                        return dbk2.a(a, (Comparable)((Object)ctp.b));
                    }
                    case b: {
                        return dbk2.a(a, (Comparable)((Object)ctp.a));
                    }
                    case c: {
                        return dbk2.a(a, (Comparable)((Object)ctp.e));
                    }
                    case d: {
                        return dbk2.a(a, (Comparable)((Object)ctp.f));
                    }
                    case e: {
                        return dbk2.a(a, (Comparable)((Object)ctp.d));
                    }
                    case f: {
                        return dbk2.a(a, (Comparable)((Object)ctp.c));
                    }
                    case g: {
                        return dbk2.a(a, (Comparable)((Object)ctp.j));
                    }
                    case h: {
                        return dbk2.a(a, (Comparable)((Object)ctp.g));
                    }
                    case i: {
                        return dbk2.a(a, (Comparable)((Object)ctp.h));
                    }
                    case j: {
                        return dbk2.a(a, (Comparable)((Object)ctp.i));
                    }
                }
            }
            case b: {
                switch ((ctp)((Object)dbk2.b(a))) {
                    case a: {
                        return dbk2.a(a, (Comparable)((Object)ctp.b));
                    }
                    case b: {
                        return dbk2.a(a, (Comparable)((Object)ctp.a));
                    }
                    case c: {
                        return dbk2.a(a, (Comparable)((Object)ctp.f));
                    }
                    case d: {
                        return dbk2.a(a, (Comparable)((Object)ctp.e));
                    }
                    case e: {
                        return dbk2.a(a, (Comparable)((Object)ctp.c));
                    }
                    case f: {
                        return dbk2.a(a, (Comparable)((Object)ctp.d));
                    }
                    case g: {
                        return dbk2.a(a, (Comparable)((Object)ctp.h));
                    }
                    case h: {
                        return dbk2.a(a, (Comparable)((Object)ctp.i));
                    }
                    case i: {
                        return dbk2.a(a, (Comparable)((Object)ctp.j));
                    }
                    case j: {
                        return dbk2.a(a, (Comparable)((Object)ctp.g));
                    }
                }
            }
        }
        return dbk2;
    }

    @Override
    public dbk a(dbk dbk2, cdk cdk2) {
        ctp ctp2 = (ctp)((Object)dbk2.b(a));
        switch (cdk2) {
            case b: {
                switch (ctp2) {
                    case e: {
                        return dbk2.a(a, (Comparable)((Object)ctp.f));
                    }
                    case f: {
                        return dbk2.a(a, (Comparable)((Object)ctp.e));
                    }
                    case g: {
                        return dbk2.a(a, (Comparable)((Object)ctp.j));
                    }
                    case h: {
                        return dbk2.a(a, (Comparable)((Object)ctp.i));
                    }
                    case i: {
                        return dbk2.a(a, (Comparable)((Object)ctp.h));
                    }
                    case j: {
                        return dbk2.a(a, (Comparable)((Object)ctp.g));
                    }
                }
                break;
            }
            case c: {
                switch (ctp2) {
                    case c: {
                        return dbk2.a(a, (Comparable)((Object)ctp.d));
                    }
                    case d: {
                        return dbk2.a(a, (Comparable)((Object)ctp.c));
                    }
                    case g: {
                        return dbk2.a(a, (Comparable)((Object)ctp.h));
                    }
                    case h: {
                        return dbk2.a(a, (Comparable)((Object)ctp.g));
                    }
                    case i: {
                        return dbk2.a(a, (Comparable)((Object)ctp.j));
                    }
                    case j: {
                        return dbk2.a(a, (Comparable)((Object)ctp.i));
                    }
                }
                break;
            }
        }
        return super.a(dbk2, cdk2);
    }

    @Override
    protected bkp a() {
        return new bkp(this, a, b);
    }
}

