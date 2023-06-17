/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;

public class chp
extends cjn {
    private final String a;
    private final cbg b;
    private List c;
    private final cjn d;
    private int e;

    public chp(cjn cjn2, String string, cbg cbg2) {
        this.d = cjn2;
        this.a = bf.a(string, new Object[0]);
        this.b = cbg2;
    }

    @Override
    protected void a(char c2, int n2) {
    }

    @Override
    public void cH_() {
        this.y.clear();
        this.c = this.B.c(this.b.j(), this.w - 50);
        this.e = this.c.size() * this.B.a;
        this.y.add(new cwv(0, this.w / 2 - 100, this.x / 2 + this.e / 2 + this.B.a, bf.a("gui.toMenu", new Object[0])));
    }

    @Override
    protected void a(cwv cwv2) {
        if (cwv2.j == 0) {
            this.u.a(this.d);
        }
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.aH_();
        this.a(this.B, this.a, this.w / 2, this.x / 2 - this.e / 2 - this.B.a * 2, 0xAAAAAA);
        int n4 = this.x / 2 - this.e / 2;
        if (this.c != null) {
            for (String string : this.c) {
                this.a(this.B, string, this.w / 2, n4, 0xFFFFFF);
                n4 += this.B.a;
            }
        }
        super.a(n2, n3, f2);
    }
}

