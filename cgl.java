/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.cc;
import com.a.a.d.ov;
import com.c.a.d.a;
import com.c.a.e;
import java.util.List;

public class cgl
implements ds {
    private bfp a;
    private final List b = ov.a();

    public cgl() {
    }

    public cgl(bfp bfp2, czt ... arrczt) {
        this.a = bfp2;
        for (czt czt2 : arrczt) {
            this.b.add(new aup(this, czt2.aq(), czt2.g, czt2.c.b(), czt2.cP()));
        }
    }

    public cgl(bfp bfp2, Iterable iterable) {
        this.a = bfp2;
        for (czt czt2 : iterable) {
            this.b.add(new aup(this, czt2.aq(), czt2.g, czt2.c.b(), czt2.cP()));
        }
    }

    @Override
    public void a(si si2) {
        this.a = (bfp)si2.a(bfp.class);
        int n2 = si2.e();
        for (int i2 = 0; i2 < n2; ++i2) {
            e e2 = null;
            int n3 = 0;
            bvh bvh2 = null;
            cbg cbg2 = null;
            switch (this.a) {
                case a: {
                    e2 = new e(si2.g(), si2.e(16));
                    int n4 = si2.e();
                    for (int i3 = 0; i3 < n4; ++i3) {
                        String string = si2.e(32767);
                        String string2 = si2.e(32767);
                        if (si2.D()) {
                            e2.c().a(string, new a(string, string2, si2.e(32767)));
                            continue;
                        }
                        e2.c().a(string, new a(string, string2));
                    }
                    bvh2 = bvh.a(si2.e());
                    n3 = si2.e();
                    if (!si2.D()) break;
                    cbg2 = si2.d();
                    break;
                }
                case b: {
                    e2 = new e(si2.g(), null);
                    bvh2 = bvh.a(si2.e());
                    break;
                }
                case c: {
                    e2 = new e(si2.g(), null);
                    n3 = si2.e();
                    break;
                }
                case d: {
                    e2 = new e(si2.g(), null);
                    if (!si2.D()) break;
                    cbg2 = si2.d();
                    break;
                }
                case e: {
                    e2 = new e(si2.g(), null);
                }
            }
            this.b.add(new aup(this, e2, n3, bvh2, cbg2));
        }
    }

    @Override
    public void b(si si2) {
        si2.a(this.a);
        si2.d(this.b.size());
        for (aup aup2 : this.b) {
            switch (this.a) {
                case a: {
                    si2.a(aup2.a().a());
                    si2.a(aup2.a().b());
                    si2.d(aup2.a().c().g());
                    for (a a2 : aup2.a().c().j()) {
                        si2.a(a2.a());
                        si2.a(a2.b());
                        if (a2.d()) {
                            si2.a(true);
                            si2.a(a2.c());
                            continue;
                        }
                        si2.a(false);
                    }
                    si2.d(aup2.c().a());
                    si2.d(aup2.b());
                    if (aup2.d() == null) {
                        si2.a(false);
                        break;
                    }
                    si2.a(true);
                    si2.a(aup2.d());
                    break;
                }
                case b: {
                    si2.a(aup2.a().a());
                    si2.d(aup2.c().a());
                    break;
                }
                case c: {
                    si2.a(aup2.a().a());
                    si2.d(aup2.b());
                    break;
                }
                case d: {
                    si2.a(aup2.a().a());
                    if (aup2.d() == null) {
                        si2.a(false);
                        break;
                    }
                    si2.a(true);
                    si2.a(aup2.d());
                    break;
                }
                case e: {
                    si2.a(aup2.a().a());
                }
            }
        }
    }

    public void a(bfz bfz2) {
        bfz2.a(this);
    }

    public List a() {
        return this.b;
    }

    public bfp b() {
        return this.a;
    }

    public String toString() {
        return cc.a((Object)this).a("action", (Object)this.a).a("entries", this.b).toString();
    }
}

