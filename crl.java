/*
 * Decompiled with CFR 0.150.
 */
import com.c.a.e;
import java.util.List;

public class crl
extends azg {
    private static final String[] a = new String[]{"skeleton", "wither", "zombie", "char", "creeper", "dragon"};

    public crl() {
        this.a(zm.c);
        this.e(0);
        this.a(true);
    }

    @Override
    public cey a(bhl bhl2, bdl bdl2, iu iu2, cmz cmz2, bqp bqp2, bqk bqk2, float f2, float f3, float f4) {
        bql bql2;
        if (bqk2 == bqk.a) {
            return cey.c;
        }
        dbk dbk2 = iu2.n(cmz2);
        bfa bfa2 = dbk2.t();
        boolean bl2 = bfa2.a_((bnj)iu2, cmz2);
        if (!bl2) {
            if (!iu2.n(cmz2).a().a()) {
                return cey.c;
            }
            cmz2 = cmz2.c(bqk2);
        }
        if (!bdl2.a(cmz2, bqk2, bhl2) || !blg.ce.a(iu2, cmz2)) {
            return cey.c;
        }
        if (iu2.C) {
            return cey.a;
        }
        iu2.a(cmz2, blg.ce.s().a(cvc.a, (Comparable)((Object)bqk2)), 11);
        int n2 = 0;
        if (bqk2 == bqk.b) {
            n2 = cmk.c((double)(bdl2.ba * 16.0f / 360.0f) + 0.5) & 0xF;
        }
        if ((bql2 = iu2.q(cmz2)) instanceof tr) {
            tr tr2 = (tr)bql2;
            if (bhl2.h() == 3) {
                e e2 = null;
                if (bhl2.n()) {
                    bvp bvp2 = bhl2.o();
                    if (bvp2.b("SkullOwner", 10)) {
                        e2 = ayj.a(bvp2.o("SkullOwner"));
                    } else if (bvp2.b("SkullOwner", 8) && !bvp2.l("SkullOwner").isEmpty()) {
                        e2 = new e(null, bvp2.l("SkullOwner"));
                    }
                }
                tr2.a(e2);
            } else {
                tr2.a(bhl2.h());
            }
            tr2.b(n2);
            blg.ce.a(iu2, cmz2, tr2);
        }
        --bhl2.b;
        return cey.a;
    }

    @Override
    public void a(azg azg2, zm zm2, List list) {
        for (int i2 = 0; i2 < a.length; ++i2) {
            list.add(new bhl(azg2, 1, i2));
        }
    }

    @Override
    public int a(int n2) {
        return n2;
    }

    @Override
    public String b(bhl bhl2) {
        int n2 = bhl2.h();
        if (n2 < 0 || n2 >= a.length) {
            n2 = 0;
        }
        return super.a() + "." + a[n2];
    }

    @Override
    public String c(bhl bhl2) {
        if (bhl2.h() == 3 && bhl2.n()) {
            bvp bvp2;
            if (bhl2.o().b("SkullOwner", 8)) {
                return caf.a("item.skull.player.name", bhl2.o().l("SkullOwner"));
            }
            if (bhl2.o().b("SkullOwner", 10) && (bvp2 = bhl2.o().o("SkullOwner")).b("Name", 8)) {
                return caf.a("item.skull.player.name", bvp2.l("Name"));
            }
        }
        return super.c(bhl2);
    }

    @Override
    public boolean a(bvp bvp2) {
        super.a(bvp2);
        if (bvp2.b("SkullOwner", 8) && !bvp2.l("SkullOwner").isEmpty()) {
            e e2 = new e(null, bvp2.l("SkullOwner"));
            e2 = tr.b(e2);
            bvp2.a("SkullOwner", ayj.a(new bvp(), e2));
            return true;
        }
        return false;
    }
}

