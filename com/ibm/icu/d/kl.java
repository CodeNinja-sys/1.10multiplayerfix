/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.a.ak;
import com.ibm.icu.a.ft;
import com.ibm.icu.d.kn;
import com.ibm.icu.d.kp;
import com.ibm.icu.d.kq;
import com.ibm.icu.d.ks;
import com.ibm.icu.util.dn;
import java.io.Serializable;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Set;

public abstract class kl
implements Serializable {
    private static final long a = -9180227029248969153L;
    private static kn b = new kn(null);
    private static final kq c;
    private static final String d = "com.ibm.icu.text.TimeZoneNames.Factory.impl";
    private static final String e = "com.ibm.icu.impl.TimeZoneNamesFactoryImpl";

    public static kl a(dn dn2) {
        String string = dn2.k();
        return (kl)b.a((Object)string, (Object)dn2);
    }

    public abstract Set a();

    public abstract Set a(String var1);

    public abstract String a(String var1, long var2);

    public abstract String a(String var1, String var2);

    public abstract String a(String var1, ks var2);

    public final String a(String string, ks ks2, long l2) {
        String string2 = this.b(string, ks2);
        if (string2 == null) {
            String string3 = this.a(string, l2);
            string2 = this.a(string3, ks2);
        }
        return string2;
    }

    public abstract String b(String var1, ks var2);

    public String b(String string) {
        return ft.c(string);
    }

    public Collection a(CharSequence charSequence, int n2, EnumSet enumSet) {
        throw new UnsupportedOperationException("The method is not implemented in TimeZoneNames base class.");
    }

    protected kl() {
    }

    static /* synthetic */ kq b() {
        return c;
    }

    static {
        kq kq2 = null;
        String string = ak.a("com.ibm.icu.text.TimeZoneNames.Factory.impl", "com.ibm.icu.impl.TimeZoneNamesFactoryImpl");
        while (true) {
            try {
                kq2 = (kq)Class.forName(string).newInstance();
                break;
            }
            catch (ClassNotFoundException classNotFoundException) {
            }
            catch (IllegalAccessException illegalAccessException) {
            }
            catch (InstantiationException instantiationException) {
                // empty catch block
            }
            if (string.equals("com.ibm.icu.impl.TimeZoneNamesFactoryImpl")) break;
            string = "com.ibm.icu.impl.TimeZoneNamesFactoryImpl";
        }
        if (kq2 == null) {
            kq2 = new kp();
        }
        c = kq2;
    }
}

