/*
 * Decompiled with CFR 0.150.
 */
public class bvu {
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e = true;
    private float f = 0.05f;
    private float g = 0.1f;

    public void a(bvp bvp2) {
        bvp bvp3 = new bvp();
        bvp3.a("invulnerable", this.a);
        bvp3.a("flying", this.b);
        bvp3.a("mayfly", this.c);
        bvp3.a("instabuild", this.d);
        bvp3.a("mayBuild", this.e);
        bvp3.a("flySpeed", this.f);
        bvp3.a("walkSpeed", this.g);
        bvp2.a("abilities", bvp3);
    }

    public void b(bvp bvp2) {
        if (bvp2.b("abilities", 10)) {
            bvp bvp3 = bvp2.o("abilities");
            this.a = bvp3.p("invulnerable");
            this.b = bvp3.p("flying");
            this.c = bvp3.p("mayfly");
            this.d = bvp3.p("instabuild");
            if (bvp3.b("flySpeed", 99)) {
                this.f = bvp3.j("flySpeed");
                this.g = bvp3.j("walkSpeed");
            }
            if (bvp3.b("mayBuild", 1)) {
                this.e = bvp3.p("mayBuild");
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

