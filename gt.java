/*
 * Decompiled with CFR 0.150.
 */
public class gt {
    private final cpv a = new cpv(32);

    public static gt a() {
        gt gt2 = new gt();
        gt2.a(new axh(), blg.cF);
        gt2.a(new bhd(gt2), blg.ca);
        gt2.a(new btp(), blg.c);
        gt2.a(new bhc(), blg.t);
        gt2.a(new cwx(), blg.u);
        gt2.a(new bdf(), blg.j, blg.i);
        gt2.a(new brs(), blg.af);
        gt2.a(new cty(), blg.aM);
        gt2.a(new awd(), blg.bm, blg.bl);
        gt2.a(new bqm(), blg.H);
        gt2.a(new vs(), blg.bn);
        gt2.a(new bog(), blg.bx);
        return gt2;
    }

    public int a(dbk dbk2) {
        ue ue2 = (ue)this.a.a(bfa.c(dbk2.t()));
        if (ue2 != null) {
            return ue2.a(dbk2, null, null, 0);
        }
        bif bif2 = dbk2.g();
        return bif2 != null ? bif2.L : -1;
    }

    public int a(dbk dbk2, bnj bnj2, cmz cmz2, int n2) {
        ue ue2 = (ue)this.a.a(bfa.c(dbk2.t()));
        return ue2 == null ? -1 : ue2.a(dbk2, bnj2, cmz2, n2);
    }

    public void a(ue ue2, bfa ... arrbfa) {
        for (bfa bfa2 : arrbfa) {
            this.a.a(ue2, bfa.c(bfa2));
        }
    }
}

