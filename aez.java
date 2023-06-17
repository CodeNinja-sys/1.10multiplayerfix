/*
 * Decompiled with CFR 0.150.
 */
import io.netty.b.bi;
import java.util.ArrayList;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class aez
extends ab {
    private static final d i = org.apache.logging.log4j.c.c();
    private static final bpx j = new bpx("textures/gui/container/villager.png");
    private final fc k;
    private jw l;
    private jw m;
    private int r;
    private final cbg s;

    public aez(cps cps2, fc fc2, iu iu2) {
        super(new dbx(cps2, fc2, iu2));
        this.k = fc2;
        this.s = fc2.v();
    }

    @Override
    public void cH_() {
        super.cH_();
        int n2 = (this.w - this.b) / 2;
        int n3 = (this.x - this.c) / 2;
        this.l = (jw)this.b(new jw(1, n2 + 120 + 27, n3 + 24 - 1, true));
        this.m = (jw)this.b(new jw(2, n2 + 36 - 19, n3 + 24 - 1, false));
        this.l.k = false;
        this.m.k = false;
    }

    @Override
    protected void a(int n2, int n3) {
        String string = this.s.i();
        this.B.a(string, this.b / 2 - this.B.a(string) / 2, 6, 0x404040);
        this.B.a(bf.a("container.inventory", new Object[0]), 8, this.c - 96 + 2, 0x404040);
    }

    @Override
    public void d() {
        super.d();
        beo beo2 = this.k.b(this.u.h);
        if (beo2 != null) {
            this.l.k = this.r < beo2.size() - 1;
            this.m.k = this.r > 0;
        }
    }

    @Override
    protected void a(cwv cwv2) {
        Object object;
        boolean bl2 = false;
        if (cwv2 == this.l) {
            ++this.r;
            object = this.k.b(this.u.h);
            if (object != null && this.r >= ((ArrayList)object).size()) {
                this.r = ((ArrayList)object).size() - 1;
            }
            bl2 = true;
        } else if (cwv2 == this.m) {
            --this.r;
            if (this.r < 0) {
                this.r = 0;
            }
            bl2 = true;
        }
        if (bl2) {
            ((dbx)this.d).d(this.r);
            object = new si(bi.a());
            ((si)object).E(this.r);
            this.u.x().a(new pm("MC|TrSel", (si)object));
        }
    }

    @Override
    protected void a(float f2, int n2, int n3) {
        cja.c(1.0f, 1.0f, 1.0f, 1.0f);
        this.u.P().a(j);
        int n4 = (this.w - this.b) / 2;
        int n5 = (this.x - this.c) / 2;
        this.c(n4, n5, 0, 0, this.b, this.c);
        beo beo2 = this.k.b(this.u.h);
        if (beo2 != null && !beo2.isEmpty()) {
            int n6 = this.r;
            if (n6 < 0 || n6 >= beo2.size()) {
                return;
            }
            jc jc2 = (jc)beo2.get(n6);
            if (jc2.h()) {
                this.u.P().a(j);
                cja.c(1.0f, 1.0f, 1.0f, 1.0f);
                cja.f();
                this.c(this.e + 83, this.f + 21, 212, 0, 28, 21);
                this.c(this.e + 83, this.f + 51, 212, 0, 28, 21);
            }
        }
    }

    @Override
    public void a(int n2, int n3, float f2) {
        super.a(n2, n3, f2);
        beo beo2 = this.k.b(this.u.h);
        if (beo2 != null && !beo2.isEmpty()) {
            int n4 = (this.w - this.b) / 2;
            int n5 = (this.x - this.c) / 2;
            int n6 = this.r;
            jc jc2 = (jc)beo2.get(n6);
            bhl bhl2 = jc2.a();
            bhl bhl3 = jc2.b();
            bhl bhl4 = jc2.d();
            cja.D();
            bjr.c();
            cja.f();
            cja.A();
            cja.g();
            cja.e();
            this.v.a = 100.0f;
            this.v.b(bhl2, n4 + 36, n5 + 24);
            this.v.a(this.B, bhl2, n4 + 36, n5 + 24);
            if (bhl3 != null) {
                this.v.b(bhl3, n4 + 62, n5 + 24);
                this.v.a(this.B, bhl3, n4 + 62, n5 + 24);
            }
            this.v.b(bhl4, n4 + 120, n5 + 24);
            this.v.a(this.B, bhl4, n4 + 120, n5 + 24);
            this.v.a = 0.0f;
            cja.f();
            if (this.a(36, 24, 16, 16, n2, n3) && bhl2 != null) {
                this.a(bhl2, n2, n3);
            } else if (bhl3 != null && this.a(62, 24, 16, 16, n2, n3) && bhl3 != null) {
                this.a(bhl3, n2, n3);
            } else if (bhl4 != null && this.a(120, 24, 16, 16, n2, n3) && bhl4 != null) {
                this.a(bhl4, n2, n3);
            } else if (jc2.h() && (this.a(83, 21, 28, 21, n2, n3) || this.a(83, 51, 28, 21, n2, n3))) {
                this.a(bf.a("merchant.deprecated", new Object[0]), n2, n3);
            }
            cja.E();
            cja.e();
            cja.j();
            bjr.b();
        }
    }

    public fc f() {
        return this.k;
    }

    static /* synthetic */ bpx g() {
        return j;
    }
}

