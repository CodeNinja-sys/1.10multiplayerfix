/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.c.a;
import com.ibm.icu.d.cc;
import com.ibm.icu.d.ce;
import com.ibm.icu.d.cf;
import com.ibm.icu.d.ck;
import com.ibm.icu.d.cl;
import com.ibm.icu.d.dm;
import com.ibm.icu.d.do;
import com.ibm.icu.d.dp;
import com.ibm.icu.d.gq;
import com.ibm.icu.d.hf;
import com.ibm.icu.util.aj;
import com.ibm.icu.util.dn;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.AttributedCharacterIterator;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class ci
extends dm {
    private static final long L = 4716293295276629682L;
    private static final int M = 0;
    private static final int N = 1;
    private static final int O = 2;
    private static final cc P = new cc();
    private final Map Q;
    private final long[] R;
    private final String[] S;
    private final hf T;

    public static ci a(dn dn2, cl cl2) {
        return new ci(dn2, cl2);
    }

    public static ci a(Locale locale, cl cl2) {
        return new ci(dn.a(locale), cl2);
    }

    ci(dn dn2, cl cl2) {
        dm dm2 = (dm)gq.a(dn2);
        ce ce2 = this.b(dn2, cl2);
        this.Q = ce2.b;
        this.R = ce2.a;
        this.e(dm2.w());
        this.a(dm2.c());
        this.j(3);
        this.d(true);
        if (cl2 == cl.a) {
            this.h(false);
        }
        this.T = hf.a(dn2);
        dm dm3 = (dm)gq.d(dn2);
        this.S = new String[2];
        this.S[0] = dm3.d();
        this.S[1] = dm3.f();
        this.a((aj)null);
    }

    public ci(String string, dp dp2, String[] arrstring, String[] arrstring2, long[] arrl, Collection collection, cl cl2, String[] arrstring3) {
        if (arrstring.length < 15) {
            this.a(collection, "Must have at least 15 prefix items.");
        }
        if (arrstring.length != arrstring2.length || arrstring.length != arrl.length) {
            this.a(collection, "Prefix, suffix, and divisor arrays must have the same length.");
        }
        long l2 = 0L;
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        for (int i2 = 0; i2 < arrstring.length; ++i2) {
            String string2;
            Integer n2;
            long l3;
            int n3;
            if (arrstring[i2] == null || arrstring2[i2] == null) {
                this.a(collection, "Prefix or suffix is null for " + i2);
            }
            if ((n3 = (int)Math.log10(arrl[i2])) > i2) {
                this.a(collection, "Divisor[" + i2 + "] must be less than or equal to 10^" + i2 + ", but is: " + arrl[i2]);
            }
            if ((l3 = (long)Math.pow(10.0, n3)) != arrl[i2]) {
                this.a(collection, "Divisor[" + i2 + "] must be a power of 10, but is: " + arrl[i2]);
            }
            if ((n2 = (Integer)hashMap.get(string2 = arrstring[i2] + "\uffff" + arrstring2[i2] + "\uffff" + (i2 - n3))) != null) {
                this.a(collection, "Collision between values for " + i2 + " and " + n2 + " for [prefix/suffix/index-log(divisor)" + string2.replace('\uffff', ';'));
            } else {
                hashMap.put(string2, i2);
            }
            if (arrl[i2] < l2) {
                this.a(collection, "Bad divisor, the divisor for 10E" + i2 + "(" + arrl[i2] + ") is less than the divisor for the divisor for 10E" + (i2 - 1) + "(" + l2 + ")");
            }
            l2 = arrl[i2];
        }
        this.Q = this.a(arrstring, arrstring2);
        this.R = (long[])arrl.clone();
        this.e(string);
        this.a(dp2);
        this.j(2);
        this.d(true);
        this.h(false);
        this.S = (String[])arrstring3.clone();
        this.T = null;
        this.a((aj)null);
    }

    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (!super.equals(object)) {
            return false;
        }
        ci ci2 = (ci)object;
        return this.a(this.Q, ci2.Q) && Arrays.equals(this.R, ci2.R) && Arrays.equals(this.S, ci2.S) && this.T.a(ci2.T);
    }

    private boolean a(Map map, Map map2) {
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry entry : map.entrySet()) {
            Object[] arrobject = (do[])map2.get(entry.getKey());
            if (arrobject != null && Arrays.equals((Object[])entry.getValue(), arrobject)) continue;
            return false;
        }
        return true;
    }

    public StringBuffer a(double d2, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        ck ck2 = this.e(d2);
        do do_ = ck2.b();
        do_.b(stringBuffer);
        super.a(ck2.a(), stringBuffer, fieldPosition);
        do_.a(stringBuffer);
        return stringBuffer;
    }

    public AttributedCharacterIterator formatToCharacterIterator(Object object) {
        if (!(object instanceof Number)) {
            throw new IllegalArgumentException();
        }
        Number number = (Number)object;
        ck ck2 = this.e(number.doubleValue());
        return super.a(ck2.a(), ck2.b());
    }

    public StringBuffer a(long l2, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        return this.a((double)l2, stringBuffer, fieldPosition);
    }

    public StringBuffer a(BigInteger bigInteger, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        return this.a(bigInteger.doubleValue(), stringBuffer, fieldPosition);
    }

    public StringBuffer a(BigDecimal bigDecimal, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        return this.a(bigDecimal.doubleValue(), stringBuffer, fieldPosition);
    }

    public StringBuffer a(a a2, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        return this.a(a2.doubleValue(), stringBuffer, fieldPosition);
    }

    public Number a(String string, ParsePosition parsePosition) {
        throw new UnsupportedOperationException();
    }

    private void a(ObjectOutputStream objectOutputStream) {
        throw new NotSerializableException();
    }

    private void a(ObjectInputStream objectInputStream) {
        throw new NotSerializableException();
    }

    private ck e(double d2) {
        int n2;
        boolean bl2 = this.b(d2);
        int n3 = n2 = (d2 = this.a(d2)) <= 1.0 ? 0 : (int)Math.log10(d2);
        if (n2 >= 15) {
            n2 = 14;
        }
        String string = this.f(d2 /= (double)this.R[n2]);
        if (bl2) {
            d2 = -d2;
        }
        return new ck(d2, cc.a(this.Q, string, n2));
    }

    private void a(Collection collection, String string) {
        if (collection == null) {
            throw new IllegalArgumentException(string);
        }
        collection.add(string);
    }

    private Map a(String[] arrstring, String[] arrstring2) {
        HashMap<String, do[]> hashMap = new HashMap<String, do[]>();
        do[] arrdo = new do[arrstring.length];
        for (int i2 = 0; i2 < arrdo.length; ++i2) {
            arrdo[i2] = new do(arrstring[i2], arrstring2[i2]);
        }
        hashMap.put("other", arrdo);
        return hashMap;
    }

    private String f(double d2) {
        if (this.T == null) {
            return "other";
        }
        return this.T.a(d2);
    }

    private ce b(dn dn2, cl cl2) {
        cf cf2 = P.a(dn2);
        switch (cl2) {
            case a: {
                return cf2.a;
            }
            case b: {
                return cf2.b;
            }
        }
        return cf2.a;
    }
}

