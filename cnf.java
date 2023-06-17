/*
 * Decompiled with CFR 0.150.
 */
public enum cnf {
    a("Zombie", false),
    b("Zombie", true),
    c("Zombie", true),
    d("Zombie", true),
    e("Zombie", true),
    f("Zombie", true),
    g("Husk", false);

    private boolean h;
    private final du i;

    /*
     * WARNING - void declaration
     */
    private cnf() {
        void var3_1;
        void var4_2;
        this.h = var4_2;
        this.i = new du("entity." + (String)var3_1 + ".name", new Object[0]);
    }

    public int a() {
        return this.ordinal();
    }

    public boolean b() {
        return this.h;
    }

    public int c() {
        if (this.h) {
            return this.a() - 1;
        }
        return 0;
    }

    public static cnf a(int n2) {
        return cnf.values()[n2];
    }

    public static cnf b(int n2) {
        if (n2 >= 0 && n2 < 5) {
            return cnf.a(n2 + 1);
        }
        return b;
    }

    public du d() {
        return this.i;
    }

    public boolean e() {
        return this != g;
    }

    public bi f() {
        switch (this) {
            default: {
                return dah.hA;
            }
            case g: {
                return dah.cI;
            }
            case b: 
            case c: 
            case d: 
            case e: 
            case f: 
        }
        return dah.hP;
    }

    public bi g() {
        switch (this) {
            default: {
                return dah.hI;
            }
            case g: {
                return dah.cK;
            }
            case b: 
            case c: 
            case d: 
            case e: 
            case f: 
        }
        return dah.hT;
    }

    public bi h() {
        switch (this) {
            default: {
                return dah.hE;
            }
            case g: {
                return dah.cJ;
            }
            case b: 
            case c: 
            case d: 
            case e: 
            case f: 
        }
        return dah.hS;
    }

    public bi i() {
        switch (this) {
            default: {
                return dah.hO;
            }
            case g: {
                return dah.cL;
            }
            case b: 
            case c: 
            case d: 
            case e: 
            case f: 
        }
        return dah.hU;
    }
}

