/*
 * Decompiled with CFR 0.150.
 */
import org.apache.commons.b.o;
import org.lwjgl.a.g;

public class adl
extends cjn {
    private final cjn a;
    private cld b;
    private final String c;

    public adl(cjn cjn2, String string) {
        this.a = cjn2;
        this.c = string;
    }

    @Override
    public void d() {
        this.b.a();
    }

    @Override
    public void cH_() {
        g.a(true);
        this.y.clear();
        cwv cwv2 = this.b(new cwv(3, this.w / 2 - 100, this.x / 4 + 24 + 12, bf.a("selectWorld.edit.resetIcon", new Object[0])));
        this.y.add(new cwv(4, this.w / 2 - 100, this.x / 4 + 48 + 12, bf.a("selectWorld.edit.openFolder", new Object[0])));
        this.y.add(new cwv(0, this.w / 2 - 100, this.x / 4 + 96 + 12, bf.a("selectWorld.edit.save", new Object[0])));
        this.y.add(new cwv(1, this.w / 2 - 100, this.x / 4 + 120 + 12, bf.a("gui.cancel", new Object[0])));
        cwv2.k = this.u.i().b(this.c, "icon.png").isFile();
        bxj bxj2 = this.u.i();
        cvn cvn2 = bxj2.a(this.c);
        String string = cvn2.i();
        this.b = new cld(2, this.B, this.w / 2 - 100, 60, 200, 20);
        this.b.b(true);
        this.b.a(string);
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
        if (cwv2.j == 1) {
            this.u.a(this.a);
        } else if (cwv2.j == 0) {
            bxj bxj2 = this.u.i();
            bxj2.a(this.c, this.b.b().trim());
            this.u.a(this.a);
        } else if (cwv2.j == 3) {
            bxj bxj3 = this.u.i();
            org.apache.commons.b.o.e(bxj3.b(this.c, "icon.png"));
            cwv2.k = false;
        } else if (cwv2.j == 4) {
            bxj bxj4 = this.u.i();
            cjg.a(bxj4.b(this.c, "icon.png").getParentFile());
        }
    }

    @Override
    protected void a(char c2, int n2) {
        this.b.a(c2, n2);
        boolean bl2 = ((cwv)this.y.get((int)2)).k = !this.b.b().trim().isEmpty();
        if (n2 == 28 || n2 == 156) {
            this.a((cwv)this.y.get(2));
        }
    }

    @Override
    protected void a(int n2, int n3, int n4) {
        super.a(n2, n3, n4);
        this.b.a(n2, n3, n4);
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.aH_();
        this.a(this.B, bf.a("selectWorld.edit.title", new Object[0]), this.w / 2, 20, 0xFFFFFF);
        this.b(this.B, bf.a("selectWorld.enterName", new Object[0]), this.w / 2 - 100, 47, 0xA0A0A0);
        this.b.g();
        super.a(n2, n3, f2);
    }
}

