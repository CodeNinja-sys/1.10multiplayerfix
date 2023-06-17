/*
 * Decompiled with CFR 0.150.
 */
public enum nx {
    a(cso.class, 70, ahk.a, false, false),
    b(cxn.class, 10, ahk.a, true, true),
    c(bmm.class, 15, ahk.a, true, false),
    d(ev.class, 5, ahk.h, true, false);

    private final Class e;
    private final int f;
    private final ahk g;
    private final boolean h;
    private final boolean i;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private nx(ahk ahk2, boolean bl2, boolean bl3) {
        void var7_5;
        void var6_4;
        this.e = ahk2;
        this.f = bl2 ? 1 : 0;
        this.g = (ahk)bl3;
        this.h = var6_4;
        this.i = var7_5;
    }

    public Class a() {
        return this.e;
    }

    public int b() {
        return this.f;
    }

    public boolean c() {
        return this.h;
    }

    public boolean d() {
        return this.i;
    }
}

