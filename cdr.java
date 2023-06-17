/*
 * Decompiled with CFR 0.150.
 */
public class cdr
extends ayi {
    private final String f;
    private final String g;
    private final String h;
    private boolean i = true;

    public cdr(awn awn2, String string, int n2, boolean bl2) {
        super(awn2, bf.a(bl2 ? "chat.link.confirmTrusted" : "chat.link.confirm", new Object[0]), string, n2);
        this.c = bf.a(bl2 ? "chat.link.open" : "gui.yes", new Object[0]);
        this.d = bf.a(bl2 ? "gui.cancel" : "gui.no", new Object[0]);
        this.g = bf.a("chat.copy", new Object[0]);
        this.f = bf.a("chat.link.warning", new Object[0]);
        this.h = string;
    }

    @Override
    public void cH_() {
        super.cH_();
        this.y.clear();
        this.y.add(new cwv(0, this.w / 2 - 50 - 105, this.x / 6 + 96, 100, 20, this.c));
        this.y.add(new cwv(2, this.w / 2 - 50, this.x / 6 + 96, 100, 20, this.g));
        this.y.add(new cwv(1, this.w / 2 - 50 + 105, this.x / 6 + 96, 100, 20, this.d));
    }

    @Override
    protected void a(cwv cwv2) {
        if (cwv2.j == 2) {
            this.f();
        }
        this.a.a(cwv2.j == 0, this.e);
    }

    public void f() {
        cdr.d(this.h);
    }

    @Override
    public void a(int n2, int n3, float f2) {
        super.a(n2, n3, f2);
        if (this.i) {
            this.a(this.B, this.f, this.w / 2, 110, 0xFFCCCC);
        }
    }

    public void h() {
        this.i = false;
    }
}

