/*
 * Decompiled with CFR 0.150.
 */
public class cil
extends cjn
implements wd {
    private String a = "";
    private String b = "";
    private int c;
    private boolean d;

    @Override
    public void a(String string) {
        this.b(string);
    }

    @Override
    public void b(String string) {
        this.a = string;
        this.c("Working...");
    }

    @Override
    public void c(String string) {
        this.b = string;
        this.a(0);
    }

    @Override
    public void a(int n2) {
        this.c = n2;
    }

    @Override
    public void a() {
        this.d = true;
    }

    @Override
    public void a(int n2, int n3, float f2) {
        if (this.d) {
            if (!this.u.ai()) {
                this.u.a((cjn)null);
            }
            return;
        }
        this.aH_();
        this.a(this.B, this.a, this.w / 2, 70, 0xFFFFFF);
        this.a(this.B, this.b + " " + this.c + "%", this.w / 2, 90, 0xFFFFFF);
        super.a(n2, n3, f2);
    }
}

