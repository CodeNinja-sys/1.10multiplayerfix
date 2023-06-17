/*
 * Decompiled with CFR 0.150.
 */
import io.netty.b.bi;
import java.util.List;
import org.lwjgl.a.g;

public class aqu
extends ab
implements cpx {
    private static final bpx i = new bpx("textures/gui/container/anvil.png");
    private final li j;
    private cld k;
    private final cps l;

    public aqu(cps cps2, iu iu2) {
        super(new li(cps2, iu2, bxy.B().h));
        this.l = cps2;
        this.j = (li)this.d;
    }

    @Override
    public void cH_() {
        super.cH_();
        org.lwjgl.a.g.a(true);
        int n2 = (this.w - this.b) / 2;
        int n3 = (this.x - this.c) / 2;
        this.k = new cld(0, this.B, n2 + 62, n3 + 24, 103, 12);
        this.k.g(-1);
        this.k.h(-1);
        this.k.a(false);
        this.k.f(30);
        this.d.c(this);
        this.d.b(this);
    }

    @Override
    public void aG_() {
        super.aG_();
        org.lwjgl.a.g.a(false);
        this.d.c(this);
    }

    @Override
    protected void a(int n2, int n3) {
        cja.f();
        cja.k();
        this.B.a(bf.a("container.repair", new Object[0]), 60, 6, 0x404040);
        if (this.j.a > 0) {
            int n4 = 8453920;
            boolean bl2 = true;
            String string = bf.a("container.repair.cost", this.j.a);
            if (this.j.a >= 40 && !this.u.h.G.d) {
                string = bf.a("container.repair.expensive", new Object[0]);
                n4 = 0xFF6060;
            } else if (!this.j.a(2).b()) {
                bl2 = false;
            } else if (!this.j.a(2).a(this.l.e)) {
                n4 = 0xFF6060;
            }
            if (bl2) {
                int n5 = 0xFF000000 | (n4 & 0xFCFCFC) >> 2 | n4 & 0xFF000000;
                int n6 = this.b - 8 - this.B.a(string);
                int n7 = 67;
                if (this.B.a()) {
                    aqu.a(n6 - 3, 65, this.b - 7, 77, -16777216);
                    aqu.a(n6 - 2, 66, this.b - 8, 76, -12895429);
                } else {
                    this.B.a(string, n6, 68, n5);
                    this.B.a(string, n6 + 1, 67, n5);
                    this.B.a(string, n6 + 1, 68, n5);
                }
                this.B.a(string, n6, 67, n4);
            }
        }
        cja.e();
    }

    @Override
    protected void a(char c2, int n2) {
        if (this.k.a(c2, n2)) {
            this.f();
        } else {
            super.a(c2, n2);
        }
    }

    private void f() {
        String string = this.k.b();
        ux ux2 = this.j.a(0);
        if (ux2 != null && ux2.b() && !ux2.a().s() && string.equals(ux2.a().q())) {
            string = "";
        }
        this.j.a(string);
        this.u.h.a.a(new pm("MC|ItemName", new si(bi.a()).a(string)));
    }

    @Override
    protected void a(int n2, int n3, int n4) {
        super.a(n2, n3, n4);
        this.k.a(n2, n3, n4);
    }

    @Override
    public void a(int n2, int n3, float f2) {
        super.a(n2, n3, f2);
        cja.f();
        cja.k();
        this.k.g();
    }

    @Override
    protected void a(float f2, int n2, int n3) {
        cja.c(1.0f, 1.0f, 1.0f, 1.0f);
        this.u.P().a(i);
        int n4 = (this.w - this.b) / 2;
        int n5 = (this.x - this.c) / 2;
        this.c(n4, n5, 0, 0, this.b, this.c);
        this.c(n4 + 59, n5 + 20, 0, this.c + (this.j.a(0).b() ? 0 : 16), 110, 16);
        if ((this.j.a(0).b() || this.j.a(1).b()) && !this.j.a(2).b()) {
            this.c(n4 + 99, n5 + 45, this.b, 0, 28, 21);
        }
    }

    @Override
    public void a(apq apq2, List list) {
        this.a(apq2, 0, apq2.a(0).a());
    }

    @Override
    public void a(apq apq2, int n2, bhl bhl2) {
        if (n2 == 0) {
            this.k.a(bhl2 == null ? "" : bhl2.q());
            this.k.c(bhl2 != null);
            if (bhl2 != null) {
                this.f();
            }
        }
    }

    @Override
    public void a(apq apq2, int n2, int n3) {
    }

    @Override
    public void a(apq apq2, tb tb2) {
    }
}

