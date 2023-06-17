/*
 * Decompiled with CFR 0.150.
 */
public class cyq {
    public String a;
    public String b;
    public String c;
    public String d;
    public long e;
    public int f = 210;
    public String g = "1.10";
    public boolean h;
    public String i;
    private rj j = rj.c;
    private String k;
    private boolean l;

    public cyq(String string, String string2, boolean bl2) {
        this.a = string;
        this.b = string2;
        this.l = bl2;
    }

    public bvp a() {
        bvp bvp2 = new bvp();
        bvp2.a("name", this.a);
        bvp2.a("ip", this.b);
        if (this.k != null) {
            bvp2.a("icon", this.k);
        }
        if (this.j == rj.a) {
            bvp2.a("acceptTextures", true);
        } else if (this.j == rj.b) {
            bvp2.a("acceptTextures", false);
        }
        return bvp2;
    }

    public rj b() {
        return this.j;
    }

    public void a(rj rj2) {
        this.j = rj2;
    }

    public static cyq a(bvp bvp2) {
        cyq cyq2 = new cyq(bvp2.l("name"), bvp2.l("ip"), false);
        if (bvp2.b("icon", 8)) {
            cyq2.a(bvp2.l("icon"));
        }
        if (bvp2.b("acceptTextures", 1)) {
            if (bvp2.p("acceptTextures")) {
                cyq2.a(rj.a);
            } else {
                cyq2.a(rj.b);
            }
        } else {
            cyq2.a(rj.c);
        }
        return cyq2;
    }

    public String c() {
        return this.k;
    }

    public void a(String string) {
        this.k = string;
    }

    public boolean d() {
        return this.l;
    }

    public void a(cyq cyq2) {
        this.b = cyq2.b;
        this.a = cyq2.a;
        this.a(cyq2.b());
        this.k = cyq2.k;
        this.l = cyq2.l;
    }
}

