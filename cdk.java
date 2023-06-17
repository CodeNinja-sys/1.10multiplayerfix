/*
 * Decompiled with CFR 0.150.
 */
public enum cdk {
    a("no_mirror"),
    b("mirror_left_right"),
    c("mirror_front_back");

    private final String d;
    private static final String[] e;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private cdk() {
        void var3_1;
        this.d = var3_1;
    }

    public int a(int n2, int n3) {
        int n4 = n3 / 2;
        int n5 = n2 > n4 ? n2 - n3 : n2;
        switch (this) {
            case c: {
                return (n3 - n5) % n3;
            }
            case b: {
                return (n4 - n5 + n3) % n3;
            }
        }
        return n2;
    }

    public ih a(bqk bqk2) {
        ctv ctv2 = bqk2.l();
        return this == b && ctv2 == ctv.c || this == c && ctv2 == ctv.a ? ih.c : ih.a;
    }

    public bqk b(bqk bqk2) {
        switch (this) {
            case c: {
                if (bqk2 == bqk.e) {
                    return bqk.f;
                }
                if (bqk2 == bqk.f) {
                    return bqk.e;
                }
                return bqk2;
            }
            case b: {
                if (bqk2 == bqk.c) {
                    return bqk.d;
                }
                if (bqk2 == bqk.d) {
                    return bqk.c;
                }
                return bqk2;
            }
        }
        return bqk2;
    }

    static {
        e = new String[cdk.values().length];
        int n2 = 0;
        for (cdk cdk2 : cdk.values()) {
            cdk.e[n2++] = cdk2.d;
        }
    }
}

