/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class cbu
extends mw {
    private String d;
    private ih e;
    private boolean f;

    public cbu() {
    }

    public cbu(String string, cmz cmz2, ih ih2, boolean bl2) {
        super(0);
        this.d = string;
        this.e = ih2;
        this.f = bl2;
        this.a(cmz2);
    }

    private void a(cmz cmz2) {
        ed ed2 = bze.a.a(null, new bpx("endcity/" + this.d));
        cwl cwl2 = this.f ? bze.b().a().a(this.e) : bze.c().a().a(this.e);
        this.a(ed2, cmz2, cwl2);
    }

    @Override
    protected void a(bvp bvp2) {
        super.a(bvp2);
        bvp2.a("Template", this.d);
        bvp2.a("Rot", this.e.name());
        bvp2.a("OW", this.f);
    }

    @Override
    protected void b(bvp bvp2) {
        super.b(bvp2);
        this.d = bvp2.l("Template");
        this.e = ih.valueOf(bvp2.l("Rot"));
        this.f = bvp2.p("OW");
        this.a(this.c);
    }

    @Override
    protected void a(String string, cmz cmz2, iu iu2, Random random, awx awx2) {
        if (string.startsWith("Chest")) {
            bql bql2;
            cmz cmz3 = cmz2.h();
            if (awx2.a(cmz3) && (bql2 = iu2.q(cmz3)) instanceof bdm) {
                ((bdm)bql2).a(bvm.c, random.nextLong());
            }
        } else if (string.startsWith("Sentry")) {
            aoa aoa2 = new aoa(iu2);
            aoa2.d((double)cmz2.a() + 0.5, (double)cmz2.b() + 0.5, (double)cmz2.c() + 0.5);
            aoa2.b(cmz2);
            iu2.b(aoa2);
        } else if (string.startsWith("Elytra")) {
            cvr cvr2 = new cvr(iu2, cmz2, this.e.a(bqk.d));
            cvr2.a(new bhl(hp.cR));
            iu2.b(cvr2);
        }
    }
}

