/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.util;

import com.ibm.icu.a.bc;
import com.ibm.icu.d.lf;
import com.ibm.icu.util.VersionInfo;
import com.ibm.icu.util.bq;
import com.ibm.icu.util.br;
import com.ibm.icu.util.dn;
import com.ibm.icu.util.dr;
import com.ibm.icu.util.dv;
import java.util.MissingResourceException;

public final class bo {
    private static final String l = "MeasurementSystem";
    private static final String m = "PaperSize";
    private static final String n = "localeDisplayPattern";
    private static final String o = "pattern";
    private static final String p = "separator";
    private boolean q;
    private bc r;
    private bc s;
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 4;
    public static final int f = 5;
    public static final int g = 0;
    public static final int h = 1;
    public static final int i = 2;
    public static final int j = 3;
    public static final int k = 4;
    private static final String[] t = new String[]{"quotationStart", "quotationEnd", "alternateQuotationStart", "alternateQuotationEnd"};
    private static VersionInfo u = null;

    private bo() {
    }

    public static lf a(dn dn2, int n2) {
        return bo.a(dn2).a(n2, 0);
    }

    public static lf a(dn dn2, int n2, int n3) {
        return bo.a(dn2).a(n2, n3);
    }

    public lf a(int n2, int n3) {
        String[] arrstring = new String[]{"ExemplarCharacters", "AuxExemplarCharacters", "ExemplarCharactersIndex", "ExemplarCharactersCurrency", "ExemplarCharactersPunctuation"};
        if (n3 == 3) {
            return new lf();
        }
        try {
            bc bc2 = (bc)this.r.l(arrstring[n3]);
            if (this.q && bc2.a() == 2) {
                return null;
            }
            String string = bc2.A();
            if (n3 == 4) {
                try {
                    return new lf(string, 1 | n2);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw new IllegalArgumentException("Can't create exemplars for " + arrstring[n3] + " in " + this.r.getLocale(), illegalArgumentException);
                }
            }
            return new lf(string, 1 | n2);
        }
        catch (MissingResourceException missingResourceException) {
            if (n3 == 1) {
                return new lf();
            }
            if (n3 == 2) {
                return null;
            }
            throw missingResourceException;
        }
    }

    public static final bo a(dn dn2) {
        bo bo2 = new bo();
        bo2.r = (bc)dv.a("com/ibm/icu/impl/data/icudt51b", dn2);
        bo2.s = (bc)dv.a("com/ibm/icu/impl/data/icudt51b/lang", dn2);
        bo2.q = false;
        return bo2;
    }

    public static final bo a() {
        return bo.a(dn.a(dr.b));
    }

    public void a(boolean bl2) {
        this.q = bl2;
    }

    public boolean b() {
        return this.q;
    }

    public String a(int n2) {
        bc bc2 = (bc)this.r.l("delimiters");
        bc bc3 = bc2.b(t[n2]);
        if (this.q && bc3.a() == 2) {
            return null;
        }
        return bc3.A();
    }

    public static final bq b(dn dn2) {
        bc bc2 = (bc)dv.a("com/ibm/icu/impl/data/icudt51b", dn2);
        dv dv2 = bc2.l(l);
        int n2 = dv2.x();
        if (bq.a(bq.b, n2)) {
            return bq.b;
        }
        if (bq.a(bq.a, n2)) {
            return bq.a;
        }
        return null;
    }

    public static final br c(dn dn2) {
        bc bc2 = (bc)dv.a("com/ibm/icu/impl/data/icudt51b", dn2);
        dv dv2 = bc2.l(m);
        int[] arrn = dv2.z();
        return new br(arrn[0], arrn[1], null);
    }

    public String c() {
        bc bc2 = (bc)this.s.l(n);
        String string = bc2.f(o);
        return string;
    }

    public String d() {
        bc bc2 = (bc)this.s.l(n);
        String string = bc2.f(p);
        return string;
    }

    public static VersionInfo e() {
        if (u == null) {
            dv dv2 = dv.b("com/ibm/icu/impl/data/icudt51b", "supplementalData", bc.n);
            dv dv3 = dv2.l("cldrVersion");
            u = VersionInfo.a(dv3.A());
        }
        return u;
    }
}

