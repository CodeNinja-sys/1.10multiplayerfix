/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.cm;
import org.lwjgl.a.g;

public class rd
extends cjn {
    private final cjn a;
    private final cyq b;
    private cld c;
    private cld d;
    private cwv e;
    private final cm f = new ack(this);

    public rd(cjn cjn2, cyq cyq2) {
        this.a = cjn2;
        this.b = cyq2;
    }

    @Override
    public void d() {
        this.d.a();
        this.c.a();
    }

    @Override
    public void cH_() {
        g.a(true);
        this.y.clear();
        this.y.add(new cwv(0, this.w / 2 - 100, this.x / 4 + 96 + 18, bf.a("addServer.add", new Object[0])));
        this.y.add(new cwv(1, this.w / 2 - 100, this.x / 4 + 120 + 18, bf.a("gui.cancel", new Object[0])));
        this.e = this.b(new cwv(2, this.w / 2 - 100, this.x / 4 + 72, bf.a("addServer.resourcePack", new Object[0]) + ": " + this.b.b().a().j()));
        this.d = new cld(0, this.B, this.w / 2 - 100, 66, 200, 20);
        this.d.b(true);
        this.d.a(this.b.a);
        this.c = new cld(1, this.B, this.w / 2 - 100, 106, 200, 20);
        this.c.f(128);
        this.c.a(this.b.b);
        this.c.a(this.f);
        ((cwv)this.y.get((int)0)).k = !this.c.b().isEmpty() && this.c.b().split(":").length > 0 && !this.d.b().isEmpty();
    }

    @Override
    public void aG_() {
        g.a(false);
    }

    @Override
    protected void a(cwv cwv2) {
        if (!cwv2.k) {
            return;
        }
        if (cwv2.j == 2) {
            this.b.a(rj.values()[(this.b.b().ordinal() + 1) % rj.values().length]);
            this.e.i = bf.a("addServer.resourcePack", new Object[0]) + ": " + this.b.b().a().j();
        } else if (cwv2.j == 1) {
            this.a.a(false, 0);
        } else if (cwv2.j == 0) {
            this.b.a = this.d.b();
            this.b.b = this.c.b();
            this.a.a(true, 0);
        }
    }

    @Override
    protected void a(char c2, int n2) {
        this.d.a(c2, n2);
        this.c.a(c2, n2);
        if (n2 == 15) {
            this.d.b(!this.d.k());
            this.c.b(!this.c.k());
        }
        if (n2 == 28 || n2 == 156) {
            this.a((cwv)this.y.get(0));
        }
        ((cwv)this.y.get((int)0)).k = !this.c.b().isEmpty() && this.c.b().split(":").length > 0 && !this.d.b().isEmpty();
    }

    @Override
    protected void a(int n2, int n3, int n4) {
        super.a(n2, n3, n4);
        this.c.a(n2, n3, n4);
        this.d.a(n2, n3, n4);
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.aH_();
        this.a(this.B, bf.a("addServer.title", new Object[0]), this.w / 2, 17, 0xFFFFFF);
        this.b(this.B, bf.a("addServer.enterName", new Object[0]), this.w / 2 - 100, 53, 0xA0A0A0);
        this.b(this.B, bf.a("addServer.enterIp", new Object[0]), this.w / 2 - 100, 94, 0xA0A0A0);
        this.d.g();
        this.c.g();
        super.a(n2, n3, f2);
    }
}

