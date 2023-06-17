/*
 * Decompiled with CFR 0.150.
 */
import org.lwjgl.a.g;

public class cyu
extends cjn {
    private final cjn a;
    private final cyq b;
    private cld c;

    public cyu(cjn cjn2, cyq cyq2) {
        this.a = cjn2;
        this.b = cyq2;
    }

    @Override
    public void d() {
        this.c.a();
    }

    @Override
    public void cH_() {
        g.a(true);
        this.y.clear();
        this.y.add(new cwv(0, this.w / 2 - 100, this.x / 4 + 96 + 12, bf.a("selectServer.select", new Object[0])));
        this.y.add(new cwv(1, this.w / 2 - 100, this.x / 4 + 120 + 12, bf.a("gui.cancel", new Object[0])));
        this.c = new cld(2, this.B, this.w / 2 - 100, 116, 200, 20);
        this.c.f(128);
        this.c.b(true);
        this.c.a(this.u.u.aw);
        ((cwv)this.y.get((int)0)).k = !this.c.b().isEmpty() && this.c.b().split(":").length > 0;
    }

    @Override
    public void aG_() {
        g.a(false);
        this.u.u.aw = this.c.b();
        this.u.u.b();
    }

    @Override
    protected void a(cwv cwv2) {
        if (!cwv2.k) {
            return;
        }
        if (cwv2.j == 1) {
            this.a.a(false, 0);
        } else if (cwv2.j == 0) {
            this.b.b = this.c.b();
            this.a.a(true, 0);
        }
    }

    @Override
    protected void a(char c2, int n2) {
        if (this.c.a(c2, n2)) {
            ((cwv)this.y.get((int)0)).k = !this.c.b().isEmpty() && this.c.b().split(":").length > 0;
        } else if (n2 == 28 || n2 == 156) {
            this.a((cwv)this.y.get(0));
        }
    }

    @Override
    protected void a(int n2, int n3, int n4) {
        super.a(n2, n3, n4);
        this.c.a(n2, n3, n4);
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.aH_();
        this.a(this.B, bf.a("selectServer.direct", new Object[0]), this.w / 2, 20, 0xFFFFFF);
        this.b(this.B, bf.a("addServer.enterIp", new Object[0]), this.w / 2 - 100, 100, 0xA0A0A0);
        this.c.g();
        super.a(n2, n3, f2);
    }
}

