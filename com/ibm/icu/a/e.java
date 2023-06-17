/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.f;
import com.ibm.icu.a.g;
import com.ibm.icu.a.h;
import com.ibm.icu.a.i;
import com.ibm.icu.a.j;
import com.ibm.icu.a.k;
import com.ibm.icu.a.l;
import com.ibm.icu.a.m;
import com.ibm.icu.a.n;
import com.ibm.icu.a.o;
import com.ibm.icu.a.p;
import java.util.Date;
import java.util.TimeZone;

public class e {
    public static final double a = 23.93446960027;
    public static final double b = 24.065709816;
    public static final double c = 29.530588853;
    public static final double d = 27.32166;
    public static final double e = 365.242191;
    public static final double f = 365.25636;
    public static final int g = 1000;
    public static final int h = 60000;
    public static final int i = 3600000;
    public static final long j = 86400000L;
    public static final long k = -210866760000000L;
    static final long l = 946598400000L;
    private static final double G = Math.PI;
    private static final double H = Math.PI * 2;
    private static final double I = 3.819718634205488;
    private static final double J = Math.PI / 180;
    private static final double K = 57.29577951308232;
    static final double m = 2447891.5;
    static final double n = 4.87650757829735;
    static final double o = 4.935239984568769;
    static final double p = 0.016713;
    public static final p q = new p(0.0);
    public static final p r = new p(1.5707963267948966);
    public static final p s = new p(Math.PI);
    public static final p t = new p(4.71238898038469);
    static final double u = 5.556284436750021;
    static final double v = 0.6342598060246725;
    static final double w = 5.559050068029439;
    static final double x = 0.08980357792017056;
    static final double y = 0.0549;
    static final double z = 384401.0;
    static final double A = 0.009042550854582622;
    static final double B = 0.016592845198710092;
    public static final o C = new o(0.0);
    public static final o D = new o(1.5707963267948966);
    public static final o E = new o(Math.PI);
    public static final o F = new o(4.71238898038469);
    private long L;
    private double M = 0.0;
    private double N = 0.0;
    private long O = 0L;
    private static final double P = Double.MIN_VALUE;
    private transient double Q = Double.MIN_VALUE;
    private transient double R = Double.MIN_VALUE;
    private transient double S = Double.MIN_VALUE;
    private transient double T = Double.MIN_VALUE;
    private transient double U = Double.MIN_VALUE;
    private transient double V = Double.MIN_VALUE;
    private transient double W = Double.MIN_VALUE;
    private transient double X = Double.MIN_VALUE;
    private transient double Y = Double.MIN_VALUE;
    private transient m Z = null;

    public e() {
        this(System.currentTimeMillis());
    }

    public e(Date date) {
        this(date.getTime());
    }

    public e(long l2) {
        this.L = l2;
    }

    public e(double d2, double d3) {
        this();
        this.M = com.ibm.icu.a.e.i(d2 * (Math.PI / 180));
        this.N = com.ibm.icu.a.e.i(d3 * (Math.PI / 180));
        this.O = (long)(this.M * 24.0 * 3600000.0 / (Math.PI * 2));
    }

    public void a(long l2) {
        this.L = l2;
        this.n();
    }

    public void a(Date date) {
        this.a(date.getTime());
    }

    public void a(double d2) {
        this.L = (long)(d2 * 8.64E7) + -210866760000000L;
        this.n();
        this.Q = d2;
    }

    public long a() {
        return this.L;
    }

    public Date b() {
        return new Date(this.L);
    }

    public double c() {
        if (this.Q == Double.MIN_VALUE) {
            this.Q = (double)(this.L - -210866760000000L) / 8.64E7;
        }
        return this.Q;
    }

    public double d() {
        if (this.R == Double.MIN_VALUE) {
            this.R = (this.c() - 2415020.0) / 36525.0;
        }
        return this.R;
    }

    public double e() {
        if (this.Y == Double.MIN_VALUE) {
            double d2 = com.ibm.icu.a.e.b((double)this.L / 3600000.0, 24.0);
            this.Y = com.ibm.icu.a.e.b(this.l() + d2 * 1.002737909, 24.0);
        }
        return this.Y;
    }

    private double l() {
        if (this.X == Double.MIN_VALUE) {
            double d2 = Math.floor(this.c() - 0.5) + 0.5;
            double d3 = d2 - 2451545.0;
            double d4 = d3 / 36525.0;
            this.X = com.ibm.icu.a.e.b(6.697374558 + 2400.051336 * d4 + 2.5862E-5 * d4 * d4, 24.0);
        }
        return this.X;
    }

    public double f() {
        return com.ibm.icu.a.e.b(this.e() + (double)this.O / 3600000.0, 24.0);
    }

    private long g(double d2) {
        double d3 = com.ibm.icu.a.e.b((d2 - this.l()) * 0.9972695663, 24.0);
        long l2 = 86400000L * ((this.L + this.O) / 86400000L) - this.O;
        return l2 + (long)(d3 * 3600000.0);
    }

    public final m a(l l2) {
        return this.a(l2.b, l2.a);
    }

    public final m a(double d2, double d3) {
        double d4 = this.m();
        double d5 = Math.sin(d4);
        double d6 = Math.cos(d4);
        double d7 = Math.sin(d2);
        double d8 = Math.cos(d2);
        double d9 = Math.sin(d3);
        double d10 = Math.cos(d3);
        double d11 = Math.tan(d3);
        return new m(Math.atan2(d7 * d6 - d11 * d5, d8), Math.asin(d9 * d6 + d10 * d5 * d7));
    }

    public final m b(double d2) {
        return this.a(d2, 0.0);
    }

    public n c(double d2) {
        m m2 = this.b(d2);
        double d3 = this.f() * Math.PI / 12.0 - m2.a;
        double d4 = Math.sin(d3);
        double d5 = Math.cos(d3);
        double d6 = Math.sin(m2.b);
        double d7 = Math.cos(m2.b);
        double d8 = Math.sin(this.N);
        double d9 = Math.cos(this.N);
        double d10 = Math.asin(d6 * d8 + d7 * d9 * d5);
        double d11 = Math.atan2(-d7 * d9 * d4, d6 - d8 * Math.sin(d10));
        return new n(d11, d10);
    }

    public double g() {
        if (this.S == Double.MIN_VALUE) {
            double[] arrd = this.d(this.c());
            this.S = arrd[0];
            this.T = arrd[1];
        }
        return this.S;
    }

    double[] d(double d2) {
        double d3 = d2 - 2447891.5;
        double d4 = com.ibm.icu.a.e.h(0.017202791632524146 * d3);
        double d5 = com.ibm.icu.a.e.h(d4 + 4.87650757829735 - 4.935239984568769);
        return new double[]{com.ibm.icu.a.e.h(this.c(d5, 0.016713) + 4.935239984568769), d5};
    }

    public m h() {
        return this.a(this.g(), 0.0);
    }

    public long a(double d2, boolean bl2) {
        return this.a(new f(this), d2, 365.242191, 60000L, bl2);
    }

    public long a(p p2, boolean bl2) {
        return this.a(p2.a, bl2);
    }

    public long a(boolean bl2) {
        long l2 = this.L;
        long l3 = (this.L + this.O) / 86400000L * 86400000L - this.O + 43200000L;
        this.a(l3 + (bl2 ? -6L : 6L) * 3600000L);
        long l4 = this.a(new g(this), bl2, 0.009302604913129777, 0.009890199094634533, 5000L);
        this.a(l2);
        return l4;
    }

    public m i() {
        if (this.Z == null) {
            double d2 = this.g();
            double d3 = this.c() - 2447891.5;
            double d4 = com.ibm.icu.a.e.h(0.22997150421858628 * d3 + 5.556284436750021);
            double d5 = com.ibm.icu.a.e.h(d4 - 0.001944368345221015 * d3 - 0.6342598060246725);
            double d6 = 0.022233749341155764 * Math.sin(2.0 * (d4 - d2) - d5);
            double d7 = 0.003242821750205464 * Math.sin(this.T);
            double d8 = 0.00645771823237902 * Math.sin(this.T);
            double d9 = 0.10975677534091541 * Math.sin(d5 += d6 - d7 - d8);
            double d10 = 0.0037350045992678655 * Math.sin(2.0 * d5);
            this.U = d4 + d6 + d9 - d7 + d10;
            double d11 = 0.011489502465878671 * Math.sin(2.0 * (this.U - d2));
            this.U += d11;
            double d12 = com.ibm.icu.a.e.h(5.559050068029439 - 9.242199067718253E-4 * d3);
            double d13 = Math.sin(this.U - (d12 -= 0.0027925268031909274 * Math.sin(this.T)));
            double d14 = Math.cos(this.U - d12);
            this.V = Math.atan2(d13 * Math.cos(0.08980357792017056), d14) + d12;
            double d15 = Math.asin(d13 * Math.sin(0.08980357792017056));
            this.Z = this.a(this.V, d15);
        }
        return this.Z;
    }

    public double j() {
        this.i();
        return com.ibm.icu.a.e.h(this.V - this.S);
    }

    public double k() {
        return 0.5 * (1.0 - Math.cos(this.j()));
    }

    public long b(double d2, boolean bl2) {
        return this.a(new h(this), d2, 29.530588853, 60000L, bl2);
    }

    public long a(o o2, boolean bl2) {
        return this.b(o2.a, bl2);
    }

    public long b(boolean bl2) {
        return this.a(new i(this), bl2, 0.009302604913129777, 0.009890199094634533, 60000L);
    }

    private long a(j j2, double d2, double d3, long l2, boolean bl2) {
        double d4;
        double d5 = j2.a();
        double d6 = com.ibm.icu.a.e.h(d2 - d5);
        double d7 = d4 = (d6 + (bl2 ? 0.0 : Math.PI * -2)) * (d3 * 8.64E7) / (Math.PI * 2);
        long l3 = this.L;
        this.a(this.L + (long)d4);
        do {
            double d8 = j2.a();
            double d9 = Math.abs(d4 / com.ibm.icu.a.e.i(d8 - d5));
            d4 = com.ibm.icu.a.e.i(d2 - d8) * d9;
            if (Math.abs(d4) > Math.abs(d7)) {
                long l4 = (long)(d3 * 8.64E7 / 8.0);
                this.a(l3 + (bl2 ? l4 : -l4));
                return this.a(j2, d2, d3, l2, bl2);
            }
            d7 = d4;
            d5 = d8;
            this.a(this.L + (long)d4);
        } while (Math.abs(d4) > (double)l2);
        return this.L;
    }

    private long a(k k2, boolean bl2, double d2, double d3, long l2) {
        double d4;
        double d5;
        m m2 = null;
        double d6 = Math.tan(this.N);
        long l3 = Long.MAX_VALUE;
        int n2 = 0;
        do {
            m2 = k2.a();
            d5 = Math.acos(-d6 * Math.tan(m2.b));
            d4 = ((bl2 ? Math.PI * 2 - d5 : d5) + m2.a) * 24.0 / (Math.PI * 2);
            long l4 = this.g(d4);
            l3 = l4 - this.L;
            this.a(l4);
        } while (++n2 < 5 && Math.abs(l3) > l2);
        d5 = Math.cos(m2.b);
        d4 = Math.acos(Math.sin(this.N) / d5);
        double d7 = d2 / 2.0 + d3;
        double d8 = Math.asin(Math.sin(d7) / Math.sin(d4));
        long l5 = (long)(240.0 * d8 * 57.29577951308232 / d5 * 1000.0);
        return this.L + (bl2 ? -l5 : l5);
    }

    private static final double b(double d2, double d3) {
        return d2 - d3 * Math.floor(d2 / d3);
    }

    private static final double h(double d2) {
        return com.ibm.icu.a.e.b(d2, Math.PI * 2);
    }

    private static final double i(double d2) {
        return com.ibm.icu.a.e.b(d2 + Math.PI, Math.PI * 2) - Math.PI;
    }

    private double c(double d2, double d3) {
        double d4;
        double d5 = d2;
        do {
            d4 = d5 - d3 * Math.sin(d5) - d2;
            d5 -= d4 / (1.0 - d3 * Math.cos(d5));
        } while (Math.abs(d4) > 1.0E-5);
        return 2.0 * Math.atan(Math.tan(d5 / 2.0) * Math.sqrt((1.0 + d3) / (1.0 - d3)));
    }

    private double m() {
        if (this.W == Double.MIN_VALUE) {
            double d2 = 2451545.0;
            double d3 = (this.c() - 2451545.0) / 36525.0;
            this.W = 23.439292 - 0.013004166666666666 * d3 - 1.6666666666666665E-7 * d3 * d3 + 5.027777777777778E-7 * d3 * d3 * d3;
            this.W *= Math.PI / 180;
        }
        return this.W;
    }

    private void n() {
        this.Q = Double.MIN_VALUE;
        this.R = Double.MIN_VALUE;
        this.S = Double.MIN_VALUE;
        this.T = Double.MIN_VALUE;
        this.U = Double.MIN_VALUE;
        this.V = Double.MIN_VALUE;
        this.W = Double.MIN_VALUE;
        this.Y = Double.MIN_VALUE;
        this.X = Double.MIN_VALUE;
        this.Z = null;
    }

    public String b(long l2) {
        return new Date(l2 - (long)TimeZone.getDefault().getRawOffset()).toString();
    }

    private static String j(double d2) {
        int n2 = (int)(d2 * 3.819718634205488);
        int n3 = (int)((d2 * 3.819718634205488 - (double)n2) * 60.0);
        int n4 = (int)((d2 * 3.819718634205488 - (double)n2 - (double)n3 / 60.0) * 3600.0);
        return Integer.toString(n2) + "h" + n3 + "m" + n4 + "s";
    }

    private static String k(double d2) {
        int n2 = (int)(d2 * 57.29577951308232);
        int n3 = (int)((d2 * 57.29577951308232 - (double)n2) * 60.0);
        int n4 = (int)((d2 * 57.29577951308232 - (double)n2 - (double)n3 / 60.0) * 3600.0);
        return Integer.toString(n2) + "\u00b0" + n3 + "'" + n4 + "\"";
    }

    static /* synthetic */ String e(double d2) {
        return com.ibm.icu.a.e.j(d2);
    }

    static /* synthetic */ String f(double d2) {
        return com.ibm.icu.a.e.k(d2);
    }
}

