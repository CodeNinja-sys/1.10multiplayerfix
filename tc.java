/*
 * Decompiled with CFR 0.150.
 */
public class tc
extends cjn {
    private final String a;
    private final String b;

    public tc(String string, String string2) {
        this.a = string;
        this.b = string2;
    }

    @Override
    public void cH_() {
        super.cH_();
        this.y.add(new cwv(0, this.w / 2 - 100, 140, bf.a("gui.cancel", new Object[0])));
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.b(0, 0, this.w, this.x, -12574688, -11530224);
        this.a(this.B, this.a, this.w / 2, 90, 0xFFFFFF);
        this.a(this.B, this.b, this.w / 2, 110, 0xFFFFFF);
        super.a(n2, n3, f2);
    }

    @Override
    protected void a(char c2, int n2) {
    }

    @Override
    protected void a(cwv cwv2) {
        this.u.a((cjn)null);
    }
}

