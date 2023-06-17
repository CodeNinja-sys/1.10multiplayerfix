/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.d.cq;
import com.ibm.icu.d.cr;
import com.ibm.icu.util.bf;
import com.ibm.icu.util.dj;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class cp {
    private static final cp b;
    private static final boolean c;
    protected static final cq a;

    public static cp a() {
        return b;
    }

    public static cp a(boolean bl2) {
        return c ? b : null;
    }

    public static boolean b() {
        return c;
    }

    protected cp() {
    }

    public List a(cr cr2) {
        return Collections.emptyList();
    }

    public List b(cr cr2) {
        return Collections.emptyList();
    }

    public List c(cr cr2) {
        return Collections.emptyList();
    }

    public cq a(String string) {
        return a;
    }

    private static String a(long l2) {
        if (l2 == Long.MAX_VALUE || l2 == Long.MIN_VALUE) {
            return null;
        }
        bf bf2 = new bf();
        bf2.b(dj.b("GMT"));
        bf2.a(l2);
        return "" + bf2.b(1) + '-' + (bf2.b(2) + 1) + '-' + bf2.b(5);
    }

    private static String b(Object object) {
        StringBuilder stringBuilder = new StringBuilder();
        try {
            for (Field field : object.getClass().getFields()) {
                String string;
                Object object2 = field.get(object);
                if (object2 == null || (string = object2 instanceof Date ? cp.a(((Date)object2).getTime()) : (object2 instanceof Long ? cp.a((Long)object2) : String.valueOf(object2))) == null) continue;
                if (stringBuilder.length() > 0) {
                    stringBuilder.append(",");
                }
                stringBuilder.append(field.getName()).append("='").append(string).append("'");
            }
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        stringBuilder.insert(0, object.getClass().getSimpleName() + "(");
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    static /* synthetic */ String a(Object object) {
        return cp.b(object);
    }

    static {
        a = new cq(2, 0);
        cp cp2 = null;
        boolean bl2 = false;
        try {
            Class<?> class_ = Class.forName("com.ibm.icu.impl.ICUCurrencyMetaInfo");
            cp2 = (cp)class_.newInstance();
            bl2 = true;
        }
        catch (Throwable throwable) {
            cp2 = new cp();
        }
        b = cp2;
        c = bl2;
    }
}

