/*
 * Decompiled with CFR 0.150.
 */
final class bwc
implements brr {
    bwc() {
    }

    @Override
    public String a(int n2) {
        double d2 = (double)n2 / 20.0;
        double d3 = d2 / 60.0;
        double d4 = d3 / 60.0;
        double d5 = d4 / 24.0;
        double d6 = d5 / 365.0;
        if (d6 > 0.5) {
            return cyd.n().format(d6) + " y";
        }
        if (d5 > 0.5) {
            return cyd.n().format(d5) + " d";
        }
        if (d4 > 0.5) {
            return cyd.n().format(d4) + " h";
        }
        if (d3 > 0.5) {
            return cyd.n().format(d3) + " m";
        }
        return d2 + " s";
    }
}

