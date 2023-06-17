/*
 * Decompiled with CFR 0.150.
 */
public enum aoy {
    a("Skeleton", bvm.al),
    b("WitherSkeleton", bvm.am),
    c("Stray", bvm.an);

    private final du d;
    private final bpx e;

    /*
     * WARNING - void declaration
     */
    private aoy() {
        void var4_2;
        void var3_1;
        this.d = new du("entity." + (String)var3_1 + ".name", new Object[0]);
        this.e = var4_2;
    }

    public int a() {
        return this.ordinal();
    }

    public static aoy a(int n2) {
        return aoy.values()[n2];
    }

    public bpx b() {
        return this.e;
    }

    public bi c() {
        switch (this) {
            default: {
                return dah.ft;
            }
            case b: {
                return dah.ha;
            }
            case c: 
        }
        return dah.gu;
    }

    public bi d() {
        switch (this) {
            default: {
                return dah.fy;
            }
            case b: {
                return dah.hc;
            }
            case c: 
        }
        return dah.gw;
    }

    public bi e() {
        switch (this) {
            default: {
                return dah.fu;
            }
            case b: {
                return dah.hb;
            }
            case c: 
        }
        return dah.gv;
    }

    public bi f() {
        switch (this) {
            default: {
                return dah.fA;
            }
            case b: {
                return dah.hd;
            }
            case c: 
        }
        return dah.gx;
    }
}

