/*
 * Decompiled with CFR 0.150.
 */
public enum mo {
    a,
    b,
    c,
    d,
    e,
    f,
    g,
    h,
    i,
    j,
    k;


    public boolean a(azg azg2) {
        if (this == a) {
            return true;
        }
        if (this == j && azg2.l()) {
            return true;
        }
        if (azg2 instanceof uh) {
            if (this == b) {
                return true;
            }
            uh uh2 = (uh)azg2;
            if (uh2.c == dfm.f) {
                return this == f;
            }
            if (uh2.c == dfm.d) {
                return this == d;
            }
            if (uh2.c == dfm.e) {
                return this == e;
            }
            if (uh2.c == dfm.c) {
                return this == c;
            }
            return false;
        }
        if (azg2 instanceof bof) {
            return this == g;
        }
        if (azg2 instanceof xi) {
            return this == h;
        }
        if (azg2 instanceof azd) {
            return this == k;
        }
        if (azg2 instanceof bic) {
            return this == i;
        }
        return false;
    }
}

