/*
 * Decompiled with CFR 0.150.
 */
import org.lwjgl.a.g;

public class adp
extends cjn {
    private final bxr a;
    private int b;
    private int c;
    private cwv d;

    public adp(bxr bxr2) {
        this.a = bxr2;
    }

    @Override
    public void cH_() {
        this.y.clear();
        g.a(true);
        this.d = this.b(new cwv(0, this.w / 2 - 100, this.x / 4 + 120, bf.a("gui.done", new Object[0])));
        this.a.a(false);
    }

    @Override
    public void aG_() {
        g.a(false);
        ut ut2 = this.u.x();
        if (ut2 != null) {
            ut2.a(new btv(this.a.y(), this.a.a));
        }
        this.a.a(true);
    }

    @Override
    public void d() {
        ++this.b;
    }

    @Override
    protected void a(cwv cwv2) {
        if (!cwv2.k) {
            return;
        }
        if (cwv2.j == 0) {
            this.a.c_();
            this.u.a((cjn)null);
        }
    }

    @Override
    protected void a(char c2, int n2) {
        if (n2 == 200) {
            this.c = this.c - 1 & 3;
        }
        if (n2 == 208 || n2 == 28 || n2 == 156) {
            this.c = this.c + 1 & 3;
        }
        String string = this.a.a[this.c].i();
        if (n2 == 14 && !string.isEmpty()) {
            string = string.substring(0, string.length() - 1);
        }
        if (ate.a(c2) && this.B.a(string + c2) <= 90) {
            string = string + c2;
        }
        this.a.a[this.c] = new aym(string);
        if (n2 == 1) {
            this.a(this.d);
        }
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.aH_();
        this.a(this.B, bf.a("sign.edit", new Object[0]), this.w / 2, 40, 0xFFFFFF);
        cja.c(1.0f, 1.0f, 1.0f, 1.0f);
        cja.D();
        cja.c((float)(this.w / 2), 0.0f, 50.0f);
        float f3 = 93.75f;
        cja.b(-93.75f, -93.75f, -93.75f);
        cja.b(180.0f, 0.0f, 1.0f, 0.0f);
        bfa bfa2 = this.a.z();
        if (bfa2 == blg.an) {
            float f4 = (float)(this.a.x() * 360) / 16.0f;
            cja.b(f4, 0.0f, 1.0f, 0.0f);
            cja.c(0.0f, -1.0625f, 0.0f);
        } else {
            int n4 = this.a.x();
            float f5 = 0.0f;
            if (n4 == 2) {
                f5 = 180.0f;
            }
            if (n4 == 4) {
                f5 = 90.0f;
            }
            if (n4 == 5) {
                f5 = -90.0f;
            }
            cja.b(f5, 0.0f, 1.0f, 0.0f);
            cja.c(0.0f, -1.0625f, 0.0f);
        }
        if (this.b / 6 % 2 == 0) {
            this.a.b = this.c;
        }
        ccg.a.a(this.a, -0.5, -0.75, -0.5, 0.0f);
        this.a.b = -1;
        cja.E();
        super.a(n2, n3, f2);
    }
}

