/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import java.util.List;

public class ayi
extends cjn {
    protected awn a;
    protected String b;
    private final String f;
    private final List g = ov.a();
    protected String c;
    protected String d;
    protected int e;
    private int h;

    public ayi(awn awn2, String string, String string2, int n2) {
        this.a = awn2;
        this.b = string;
        this.f = string2;
        this.e = n2;
        this.c = bf.a("gui.yes", new Object[0]);
        this.d = bf.a("gui.no", new Object[0]);
    }

    public ayi(awn awn2, String string, String string2, String string3, String string4, int n2) {
        this.a = awn2;
        this.b = string;
        this.f = string2;
        this.c = string3;
        this.d = string4;
        this.e = n2;
    }

    @Override
    public void cH_() {
        this.y.add(new bcy(0, this.w / 2 - 155, this.x / 6 + 96, this.c));
        this.y.add(new bcy(1, this.w / 2 - 155 + 160, this.x / 6 + 96, this.d));
        this.g.clear();
        this.g.addAll(this.B.c(this.f, this.w - 50));
    }

    @Override
    protected void a(cwv cwv2) {
        this.a.a(cwv2.j == 0, this.e);
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.aH_();
        this.a(this.B, this.b, this.w / 2, 70, 0xFFFFFF);
        int n4 = 90;
        for (String string : this.g) {
            this.a(this.B, string, this.w / 2, n4, 0xFFFFFF);
            n4 += this.B.a;
        }
        super.a(n2, n3, f2);
    }

    public void a(int n2) {
        this.h = n2;
        for (cwv cwv2 : this.y) {
            cwv2.k = false;
        }
    }

    @Override
    public void d() {
        super.d();
        if (--this.h == 0) {
            for (cwv cwv2 : this.y) {
                cwv2.k = true;
            }
        }
    }
}

