/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.s.d;

public class bxh
extends cjn {
    private int a;
    private int b;

    @Override
    public void cH_() {
        this.a = 0;
        this.y.clear();
        int n2 = -16;
        int n3 = 98;
        this.y.add(new cwv(1, this.w / 2 - 100, this.x / 4 + 120 + -16, bf.a("menu.returnToMenu", new Object[0])));
        if (!this.u.F()) {
            ((cwv)this.y.get((int)0)).i = bf.a("menu.disconnect", new Object[0]);
        }
        this.y.add(new cwv(4, this.w / 2 - 100, this.x / 4 + 24 + -16, bf.a("menu.returnToGame", new Object[0])));
        this.y.add(new cwv(0, this.w / 2 - 100, this.x / 4 + 96 + -16, 98, 20, bf.a("menu.options", new Object[0])));
        cwv cwv2 = this.b(new cwv(7, this.w / 2 + 2, this.x / 4 + 96 + -16, 98, 20, bf.a("menu.shareToLan", new Object[0])));
        cwv2.k = this.u.G() && !this.u.H().p();
        this.y.add(new cwv(5, this.w / 2 - 100, this.x / 4 + 48 + -16, 98, 20, bf.a("gui.achievements", new Object[0])));
        this.y.add(new cwv(6, this.w / 2 + 2, this.x / 4 + 48 + -16, 98, 20, bf.a("gui.stats", new Object[0])));
    }

    @Override
    protected void a(cwv cwv2) {
        switch (cwv2.j) {
            case 0: {
                this.u.a(new ako(this, this.u.u));
                break;
            }
            case 1: {
                boolean bl2 = this.u.F();
                boolean bl3 = this.u.ai();
                cwv2.k = false;
                this.u.f.w();
                this.u.a((ym)null);
                if (bl2) {
                    this.u.a(new agj());
                    break;
                }
                if (bl3) {
                    d d2 = new d();
                    d2.switchToRealms((bft)((Object)new agj()));
                    break;
                }
                this.u.a(new cuz(new agj()));
                break;
            }
            case 4: {
                this.u.a((cjn)null);
                this.u.q();
                break;
            }
            case 5: {
                this.u.a(new aeg(this, this.u.h.E()));
                break;
            }
            case 6: {
                this.u.a(new bjs(this, this.u.h.E()));
                break;
            }
            case 7: {
                this.u.a(new bwy(this));
            }
        }
    }

    @Override
    public void d() {
        super.d();
        ++this.b;
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.aH_();
        this.a(this.B, bf.a("menu.game", new Object[0]), this.w / 2, 40, 0xFFFFFF);
        super.a(n2, n3, f2);
    }
}

