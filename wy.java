/*
 * Decompiled with CFR 0.150.
 */
public class wy
extends bmz {
    @Override
    public void cH_() {
        super.cH_();
        this.y.add(new cwv(1, this.w / 2 - 100, this.x - 40, bf.a("multiplayer.stopSleeping", new Object[0])));
    }

    @Override
    protected void a(char c2, int n2) {
        if (n2 == 1) {
            this.f();
        } else if (n2 == 28 || n2 == 156) {
            String string = this.a.b().trim();
            if (!string.isEmpty()) {
                this.u.h.a(string);
            }
            this.a.a("");
            this.u.r.c().d();
        } else {
            super.a(c2, n2);
        }
    }

    @Override
    protected void a(cwv cwv2) {
        if (cwv2.j == 1) {
            this.f();
        } else {
            super.a(cwv2);
        }
    }

    private void f() {
        ut ut2 = this.u.h.a;
        ut2.a(new cqg(this.u.h, awo.c));
    }
}

