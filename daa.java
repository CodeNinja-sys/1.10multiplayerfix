/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;

public class daa
extends azg {
    public daa() {
        this.d(1);
    }

    public static boolean b(bvp bvp2) {
        if (!bsp.b(bvp2)) {
            return false;
        }
        if (!bvp2.b("title", 8)) {
            return false;
        }
        String string = bvp2.l("title");
        if (string == null || string.length() > 32) {
            return false;
        }
        return bvp2.b("author", 8);
    }

    public static int h(bhl bhl2) {
        return bhl2.o().h("generation");
    }

    @Override
    public String c(bhl bhl2) {
        bvp bvp2;
        String string;
        if (bhl2.n() && !aco.b(string = (bvp2 = bhl2.o()).l("title"))) {
            return string;
        }
        return super.c(bhl2);
    }

    @Override
    public void a(bhl bhl2, bdl bdl2, List list, boolean bl2) {
        if (bhl2.n()) {
            bvp bvp2 = bhl2.o();
            String string = bvp2.l("author");
            if (!aco.b(string)) {
                list.add((Object)((Object)aug.h) + caf.a("book.byAuthor", string));
            }
            list.add((Object)((Object)aug.h) + caf.a("book.generation." + bvp2.h("generation")));
        }
    }

    @Override
    public wx a(bhl bhl2, iu iu2, bdl bdl2, bqp bqp2) {
        if (!iu2.C) {
            this.a(bhl2, bdl2);
        }
        bdl2.a(bhl2, bqp2);
        bdl2.a(bpv.b(this));
        return new wx(cey.a, bhl2);
    }

    private void a(bhl bhl2, bdl bdl2) {
        if (bhl2 == null || bhl2.o() == null) {
            return;
        }
        bvp bvp2 = bhl2.o();
        if (bvp2.p("resolved")) {
            return;
        }
        bvp2.a("resolved", true);
        if (!daa.b(bvp2)) {
            return;
        }
        bmh bmh2 = bvp2.c("pages", 8);
        for (int i2 = 0; i2 < bmh2.b(); ++i2) {
            cbg cbg2;
            String string = bmh2.g(i2);
            try {
                cbg2 = zf.b(string);
                cbg2 = apa.a(bdl2, cbg2, bdl2);
            }
            catch (Exception exception) {
                cbg2 = new aym(string);
            }
            bmh2.a(i2, new byh(zf.a(cbg2)));
        }
        bvp2.a("pages", bmh2);
        if (bdl2 instanceof czt && bdl2.bt() == bhl2) {
            ux ux2 = bdl2.p.a(bdl2.n, bdl2.n.d);
            ((czt)bdl2).a.a(new bxu(0, ux2.d, bhl2));
        }
    }

    @Override
    public boolean a(bhl bhl2) {
        return true;
    }
}

