/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.bc;
import com.ibm.icu.a.ew;
import com.ibm.icu.b.b;
import com.ibm.icu.c.a;
import com.ibm.icu.d.gq;
import com.ibm.icu.util.dn;
import com.ibm.icu.util.dv;
import java.io.ObjectInputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.util.Arrays;
import java.util.MissingResourceException;

public final class ad
extends gq {
    private static final long a = -6315692826916346953L;
    private char[] b;
    private char c;
    private char d;
    private boolean e = false;
    private transient char[] f = new char[20];
    private static ew g = new ew();
    private int h;
    private int i;
    private static final long j = 0xCCCCCCCCCCCCCCBL;

    public ad(dn dn2, String string, String string2) {
        this.a(dn2, string, string2);
    }

    public ad(dn dn2, char c2, String string) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i2 = 0; i2 < 10; ++i2) {
            stringBuffer.append((char)(c2 + i2));
        }
        this.a(dn2, stringBuffer.toString(), string);
    }

    private void a(dn dn2, String string, String string2) {
        char[] arrc = (char[])g.a(dn2);
        if (arrc == null) {
            String string3;
            bc bc2 = (bc)dv.a("com/ibm/icu/impl/data/icudt51b", dn2);
            try {
                string3 = bc2.f("NumberElements/" + string2 + "/symbols/minusSign");
            }
            catch (MissingResourceException missingResourceException) {
                if (!string2.equals("latn")) {
                    try {
                        string3 = bc2.f("NumberElements/latn/symbols/minusSign");
                    }
                    catch (MissingResourceException missingResourceException2) {
                        string3 = "-";
                    }
                }
                string3 = "-";
            }
            arrc = new char[11];
            for (int i2 = 0; i2 < 10; ++i2) {
                arrc[i2] = string.charAt(i2);
            }
            arrc[10] = string3.charAt(0);
            g.a(dn2, arrc);
        }
        this.b = new char[10];
        System.arraycopy(arrc, 0, this.b, 0, 10);
        this.c = this.b[0];
        this.d = arrc[10];
    }

    public void a(int n2) {
        this.h = n2;
    }

    public int a() {
        return this.h;
    }

    public void b(int n2) {
        this.i = n2;
    }

    public int b() {
        return this.i;
    }

    public void a(boolean bl2) {
        this.e = bl2;
    }

    public char c() {
        return this.c;
    }

    public void a(char c2) {
        this.c = c2;
        if (this.b == null) {
            this.b = new char[10];
        }
        this.b[0] = c2;
        for (int i2 = 1; i2 < 10; ++i2) {
            this.b[i2] = (char)(c2 + i2);
        }
    }

    public char[] d() {
        return this.b;
    }

    public StringBuffer a(double d2, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        throw new UnsupportedOperationException("StringBuffer format(double, StringBuffer, FieldPostion) is not implemented");
    }

    public StringBuffer a(long l2, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        if (l2 < 0L) {
            stringBuffer.append(this.d);
            l2 = -l2;
        }
        int n2 = (int)l2;
        int n3 = this.f.length < this.h ? this.f.length : this.h;
        int n4 = n3 - 1;
        while (true) {
            this.f[n4] = this.b[n2 % 10];
            if (n4 == 0 || (n2 /= 10) == 0) break;
            --n4;
        }
        for (int i2 = this.i - (n3 - n4); i2 > 0; --i2) {
            this.f[--n4] = this.b[0];
        }
        int n5 = n3 - n4;
        stringBuffer.append(this.f, n4, n5);
        fieldPosition.setBeginIndex(0);
        if (fieldPosition.getField() == 0) {
            fieldPosition.setEndIndex(n5);
        } else {
            fieldPosition.setEndIndex(0);
        }
        return stringBuffer;
    }

    public StringBuffer a(BigInteger bigInteger, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        throw new UnsupportedOperationException("StringBuffer format(BigInteger, StringBuffer, FieldPostion) is not implemented");
    }

    public StringBuffer a(BigDecimal bigDecimal, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        throw new UnsupportedOperationException("StringBuffer format(BigDecimal, StringBuffer, FieldPostion) is not implemented");
    }

    public StringBuffer a(a a2, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        throw new UnsupportedOperationException("StringBuffer format(BigDecimal, StringBuffer, FieldPostion) is not implemented");
    }

    public Number a(String string, ParsePosition parsePosition) {
        long l2 = 0L;
        boolean bl2 = false;
        boolean bl3 = false;
        int n2 = parsePosition.getIndex();
        int n3 = 0;
        while (n2 + n3 < string.length()) {
            char c2 = string.charAt(n2 + n3);
            if (n3 == 0 && c2 == this.d) {
                if (this.e) break;
                bl3 = true;
            } else {
                int n4 = c2 - this.b[0];
                if (n4 < 0 || 9 < n4) {
                    n4 = com.ibm.icu.b.b.a((int)c2);
                }
                if (n4 < 0 || 9 < n4) {
                    for (n4 = 0; n4 < 10 && c2 != this.b[n4]; ++n4) {
                    }
                }
                if (0 > n4 || n4 > 9 || l2 >= 0xCCCCCCCCCCCCCCBL) break;
                bl2 = true;
                l2 = l2 * 10L + (long)n4;
            }
            ++n3;
        }
        Long l3 = null;
        if (bl2) {
            l2 = bl3 ? l2 * -1L : l2;
            l3 = l2;
            parsePosition.setIndex(n2 + n3);
        }
        return l3;
    }

    public boolean equals(Object object) {
        if (object == null || !super.equals(object) || !(object instanceof ad)) {
            return false;
        }
        ad ad2 = (ad)object;
        return this.h == ad2.h && this.i == ad2.i && this.d == ad2.d && this.e == ad2.e && Arrays.equals(this.b, ad2.b);
    }

    public int hashCode() {
        return super.hashCode();
    }

    private void a(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        if (this.b == null) {
            this.a(this.c);
        }
        this.f = new char[20];
    }
}

