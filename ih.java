/*
 * Decompiled with CFR 0.150.
 */
public enum ih {
    a("rotate_0"),
    b("rotate_90"),
    c("rotate_180"),
    d("rotate_270");

    private final String e;
    private static final String[] f;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ih() {
        void var3_1;
        this.e = var3_1;
    }

    public ih a(ih ih2) {
        switch (ih2) {
            case c: {
                switch (this) {
                    case a: {
                        return c;
                    }
                    case b: {
                        return d;
                    }
                    case c: {
                        return a;
                    }
                    case d: {
                        return b;
                    }
                }
            }
            case d: {
                switch (this) {
                    case a: {
                        return d;
                    }
                    case b: {
                        return a;
                    }
                    case c: {
                        return b;
                    }
                    case d: {
                        return c;
                    }
                }
            }
            case b: {
                switch (this) {
                    case a: {
                        return b;
                    }
                    case b: {
                        return c;
                    }
                    case c: {
                        return d;
                    }
                    case d: {
                        return a;
                    }
                }
            }
        }
        return this;
    }

    public bqk a(bqk bqk2) {
        if (bqk2.l() == ctv.b) {
            return bqk2;
        }
        switch (this) {
            case c: {
                return bqk2.e();
            }
            case d: {
                return bqk2.g();
            }
            case b: {
                return bqk2.f();
            }
        }
        return bqk2;
    }

    public int a(int n2, int n3) {
        switch (this) {
            case c: {
                return (n2 + n3 / 2) % n3;
            }
            case d: {
                return (n2 + n3 * 3 / 4) % n3;
            }
            case b: {
                return (n2 + n3 / 4) % n3;
            }
        }
        return n2;
    }

    static {
        f = new String[ih.values().length];
        int n2 = 0;
        for (ih ih2 : ih.values()) {
            ih.f[n2++] = ih2.e;
        }
    }
}

