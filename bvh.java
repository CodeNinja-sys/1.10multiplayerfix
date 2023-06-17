/*
 * Decompiled with CFR 0.150.
 */
public enum bvh {
    a(-1, "", ""),
    b(0, "survival", "s"),
    c(1, "creative", "c"),
    d(2, "adventure", "a"),
    e(3, "spectator", "sp");

    int f;
    String g;
    String h;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private bvh(String string) {
        void var5_3;
        void var4_2;
        this.f = (int)string;
        this.g = var4_2;
        this.h = var5_3;
    }

    public int a() {
        return this.f;
    }

    public String b() {
        return this.g;
    }

    public void a(bvu bvu2) {
        if (this == c) {
            bvu2.c = true;
            bvu2.d = true;
            bvu2.a = true;
        } else if (this == e) {
            bvu2.c = true;
            bvu2.d = false;
            bvu2.a = true;
            bvu2.b = true;
        } else {
            bvu2.c = false;
            bvu2.d = false;
            bvu2.a = false;
            bvu2.b = false;
        }
        bvu2.e = !this.c();
    }

    public boolean c() {
        return this == d || this == e;
    }

    public boolean d() {
        return this == c;
    }

    public boolean e() {
        return this == b || this == d;
    }

    public static bvh a(int n2) {
        return bvh.a(n2, b);
    }

    public static bvh a(int n2, bvh bvh2) {
        for (bvh bvh3 : bvh.values()) {
            if (bvh3.f != n2) continue;
            return bvh3;
        }
        return bvh2;
    }

    public static bvh a(String string) {
        return bvh.a(string, b);
    }

    public static bvh a(String string, bvh bvh2) {
        for (bvh bvh3 : bvh.values()) {
            if (!bvh3.g.equals(string) && !bvh3.h.equals(string)) continue;
            return bvh3;
        }
        return bvh2;
    }
}

