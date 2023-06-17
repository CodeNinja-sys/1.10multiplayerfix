/*
 * Decompiled with CFR 0.150.
 */
import java.util.Map;
import java.util.Random;

public abstract class mw
extends pc {
    private static final cwl d = new cwl();
    protected ed a;
    protected cwl b = d.a(true).a(blg.a);
    protected cmz c;

    public mw() {
    }

    public mw(int n2) {
        super(n2);
    }

    protected void a(ed ed2, cmz cmz2, cwl cwl2) {
        this.a = ed2;
        this.a(bqk.c);
        this.c = cmz2;
        this.b = cwl2;
        this.f();
    }

    @Override
    protected void a(bvp bvp2) {
        bvp2.a("TPX", this.c.a());
        bvp2.a("TPY", this.c.b());
        bvp2.a("TPZ", this.c.c());
    }

    @Override
    protected void b(bvp bvp2) {
        this.c = new cmz(bvp2.h("TPX"), bvp2.h("TPY"), bvp2.h("TPZ"));
    }

    @Override
    public boolean a(iu iu2, Random random, awx awx2) {
        this.b.a(awx2);
        this.a.b(iu2, this.c, this.b);
        Map map = this.a.a(this.c, this.b);
        for (cmz cmz2 : map.keySet()) {
            String string = (String)map.get(cmz2);
            this.a(string, cmz2, iu2, random, awx2);
        }
        return true;
    }

    protected abstract void a(String var1, cmz var2, iu var3, Random var4, awx var5);

    private void f() {
        ih ih2 = this.b.c();
        cmz cmz2 = this.a.a(ih2);
        this.l = new awx(0, 0, 0, cmz2.a(), cmz2.b() - 1, cmz2.c());
        switch (ih2) {
            case a: {
                break;
            }
            case b: {
                this.l.a(-cmz2.a(), 0, 0);
                break;
            }
            case d: {
                this.l.a(0, 0, -cmz2.c());
                break;
            }
            case c: {
                this.l.a(-cmz2.a(), 0, -cmz2.c());
            }
        }
        this.l.a(this.c.a(), this.c.b(), this.c.c());
    }

    @Override
    public void a_(int n2, int n3, int n4) {
        super.a_(n2, n3, n4);
        this.c = this.c.e(n2, n3, n4);
    }
}

