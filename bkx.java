/*
 * Decompiled with CFR 0.150.
 */
import com.c.a.e;

public class bkx {
    public static bkx a = new bkx();
    private final bdm b = new bdm(asr.a);
    private final bdm c = new bdm(asr.b);
    private final abn d = new abn();
    private final cwd e = new cwd();
    private final tr f = new tr();
    private final fm g = new fm();

    public void a(bhl bhl2) {
        if (bhl2.a() == hp.cO) {
            this.e.a(bhl2);
            ccg.a.a(this.e, 0.0, 0.0, 0.0, 0.0f);
        } else if (bhl2.a() == hp.cQ) {
            if (bhl2.a("BlockEntityTag", false) != null) {
                this.e.a(bhl2);
                bxy.B().P().a(amb.b.a(this.e.n(), this.e.g(), this.e.k()));
            } else {
                bxy.B().P().a(amb.c);
            }
            cja.D();
            cja.b(1.0f, -1.0f, -1.0f);
            this.g.a();
            cja.E();
        } else if (bhl2.a() == hp.ch) {
            e e2 = null;
            if (bhl2.n()) {
                bvp bvp2 = bhl2.o();
                if (bvp2.b("SkullOwner", 10)) {
                    e2 = ayj.a(bvp2.o("SkullOwner"));
                } else if (bvp2.b("SkullOwner", 8) && !bvp2.l("SkullOwner").isEmpty()) {
                    e2 = new e(null, bvp2.l("SkullOwner"));
                    e2 = tr.b(e2);
                    bvp2.q("SkullOwner");
                    bvp2.a("SkullOwner", ayj.a(new bvp(), e2));
                }
            }
            if (fu.a != null) {
                cja.D();
                cja.q();
                fu.a.a(0.0f, 0.0f, 0.0f, bqk.b, 0.0f, bhl2.h(), e2, -1, 0.0f);
                cja.p();
                cja.E();
            }
        } else {
            bfa bfa2 = bfa.a(bhl2.a());
            if (bfa2 == blg.bQ) {
                ccg.a.a(this.d, 0.0, 0.0, 0.0, 0.0f);
            } else if (bfa2 == blg.cg) {
                ccg.a.a(this.c, 0.0, 0.0, 0.0, 0.0f);
            } else {
                ccg.a.a(this.b, 0.0, 0.0, 0.0, 0.0f);
            }
        }
    }
}

