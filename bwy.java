/*
 * Decompiled with CFR 0.150.
 */
public class bwy
extends cjn {
    private final cjn a;
    private cwv b;
    private cwv c;
    private String d = "survival";
    private boolean e;

    public bwy(cjn cjn2) {
        this.a = cjn2;
    }

    @Override
    public void cH_() {
        this.y.clear();
        this.y.add(new cwv(101, this.w / 2 - 155, this.x - 28, 150, 20, bf.a("lanServer.start", new Object[0])));
        this.y.add(new cwv(102, this.w / 2 + 5, this.x - 28, 150, 20, bf.a("gui.cancel", new Object[0])));
        this.c = this.b(new cwv(104, this.w / 2 - 155, 100, 150, 20, bf.a("selectWorld.gameMode", new Object[0])));
        this.b = this.b(new cwv(103, this.w / 2 + 5, 100, 150, 20, bf.a("selectWorld.allowCommands", new Object[0])));
        this.f();
    }

    private void f() {
        this.c.i = bf.a("selectWorld.gameMode", new Object[0]) + ": " + bf.a("selectWorld.gameMode." + this.d, new Object[0]);
        this.b.i = bf.a("selectWorld.allowCommands", new Object[0]) + " ";
        this.b.i = this.e ? this.b.i + bf.a("options.on", new Object[0]) : this.b.i + bf.a("options.off", new Object[0]);
    }

    @Override
    protected void a(cwv cwv2) {
        if (cwv2.j == 102) {
            this.u.a(this.a);
        } else if (cwv2.j == 104) {
            this.d = "spectator".equals(this.d) ? "creative" : ("creative".equals(this.d) ? "adventure" : ("adventure".equals(this.d) ? "survival" : "spectator"));
            this.f();
        } else if (cwv2.j == 103) {
            this.e = !this.e;
            this.f();
        } else if (cwv2.j == 101) {
            this.u.a((cjn)null);
            String string = this.u.H().a(bvh.a(this.d), this.e);
            bwr bwr2 = string != null ? new du("commands.publish.started", string) : new aym("commands.publish.failed");
            this.u.r.c().a(bwr2);
        }
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.aH_();
        this.a(this.B, bf.a("lanServer.title", new Object[0]), this.w / 2, 50, 0xFFFFFF);
        this.a(this.B, bf.a("lanServer.otherPlayers", new Object[0]), this.w / 2, 82, 0xFFFFFF);
        super.a(n2, n3, f2);
    }
}

