/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.cn;
import java.util.List;
import java.util.Random;

public class crk
extends bfa {
    public static final yc a = cli.j;
    public static final ddi b = ddi.b("eye");
    protected static final cxt c = new cxt(0.0, 0.0, 0.0, 1.0, 0.8125, 1.0);
    protected static final cxt d = new cxt(0.3125, 0.8125, 0.3125, 0.6875, 1.0, 0.6875);
    private static ve e;

    public crk() {
        super(ahk.e, bif.C);
        this.D(this.O.b().a(a, (Comparable)((Object)bqk.c)).a(b, Boolean.valueOf(false)));
    }

    @Override
    public boolean b(dbk dbk2) {
        return false;
    }

    @Override
    public cxt a(dbk dbk2, bnj bnj2, cmz cmz2) {
        return c;
    }

    @Override
    public void a(dbk dbk2, iu iu2, cmz cmz2, cxt cxt2, List list, cpk cpk2) {
        crk.a(cmz2, cxt2, list, c);
        if (((Boolean)iu2.n(cmz2).b(b)).booleanValue()) {
            crk.a(cmz2, cxt2, list, d);
        }
    }

    @Override
    public azg a(dbk dbk2, Random random, int n2) {
        return null;
    }

    @Override
    public dbk a(iu iu2, cmz cmz2, bqk bqk2, float f2, float f3, float f4, int n2, bga bga2) {
        return this.s().a(a, (Comparable)((Object)bga2.B_().e())).a(b, Boolean.valueOf(false));
    }

    @Override
    public boolean h(dbk dbk2) {
        return true;
    }

    @Override
    public int a(dbk dbk2, iu iu2, cmz cmz2) {
        if (((Boolean)dbk2.b(b)).booleanValue()) {
            return 15;
        }
        return 0;
    }

    @Override
    public dbk a(int n2) {
        return this.s().a(b, Boolean.valueOf((n2 & 4) != 0)).a(a, (Comparable)((Object)bqk.b(n2 & 3)));
    }

    @Override
    public int e(dbk dbk2) {
        int n2 = 0;
        n2 |= ((bqk)((Object)dbk2.b(a))).c();
        if (((Boolean)dbk2.b(b)).booleanValue()) {
            n2 |= 4;
        }
        return n2;
    }

    @Override
    public dbk a(dbk dbk2, ih ih2) {
        return dbk2.a(a, (Comparable)((Object)ih2.a((bqk)((Object)dbk2.b(a)))));
    }

    @Override
    public dbk a(dbk dbk2, cdk cdk2) {
        return dbk2.a(cdk2.a((bqk)((Object)dbk2.b(a))));
    }

    @Override
    protected bkp a() {
        return new bkp(this, a, b);
    }

    @Override
    public boolean c(dbk dbk2) {
        return false;
    }

    public static ve h() {
        if (e == null) {
            e = chl.a().a("?vvv?", ">???<", ">???<", ">???<", "?^^^?").a('?', amr.a(ail.a)).a('^', amr.a(ail.a(blg.bG).a(b, cn.a((Object)true)).a(a, cn.a((Object)bqk.d)))).a('>', amr.a(ail.a(blg.bG).a(b, cn.a((Object)true)).a(a, cn.a((Object)bqk.e)))).a('v', amr.a(ail.a(blg.bG).a(b, cn.a((Object)true)).a(a, cn.a((Object)bqk.c)))).a('<', amr.a(ail.a(blg.bG).a(b, cn.a((Object)true)).a(a, cn.a((Object)bqk.f)))).b();
        }
        return e;
    }
}

