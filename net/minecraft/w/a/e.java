/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.a;

public class e {
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e = true;
    private float f = 0.05f;
    private float g = 0.1f;

    public void a(net.minecraft.e.e e2) {
        net.minecraft.e.e e3 = new net.minecraft.e.e();
        e3.a("invulnerable", this.a);
        e3.a("flying", this.b);
        e3.a("mayfly", this.c);
        e3.a("instabuild", this.d);
        e3.a("mayBuild", this.e);
        e3.a("flySpeed", this.f);
        e3.a("walkSpeed", this.g);
        e2.a("abilities", e3);
    }

    public void b(net.minecraft.e.e e2) {
        if (e2.b("abilities", 10)) {
            net.minecraft.e.e e3 = e2.o("abilities");
            this.a = e3.p("invulnerable");
            this.b = e3.p("flying");
            this.c = e3.p("mayfly");
            this.d = e3.p("instabuild");
            if (e3.b("flySpeed", 99)) {
                this.f = e3.j("flySpeed");
                this.g = e3.j("walkSpeed");
            }
            if (e3.b("mayBuild", 1)) {
                this.e = e3.p("mayBuild");
            }
        }
    }

    public float a() {
        return this.f;
    }

    public void a(float f2) {
        this.f = f2;
    }

    public float b() {
        return this.g;
    }

    public void b(float f2) {
        this.g = f2;
    }
}

