/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.i;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import org.apache.logging.log4j.core.config.d;
import org.apache.logging.log4j.core.g.g;
import org.apache.logging.log4j.core.h;
import org.apache.logging.log4j.core.i.ac;
import org.apache.logging.log4j.core.i.ar;
import org.apache.logging.log4j.core.i.as;
import org.apache.logging.log4j.core.i.k;

public abstract class b
extends ac {
    private final List b;
    private final String c;

    protected b(String string, List list, String string2) {
        super(string, "style");
        this.b = list;
        this.c = string2;
    }

    protected static b a(Class class_, String string, d d2, String[] arrstring) {
        List list = org.apache.logging.log4j.core.i.b.a(d2, arrstring);
        if (list == null) {
            return null;
        }
        try {
            Constructor constructor = class_.getConstructor(List.class, String.class);
            return (b)constructor.newInstance(list, k.a(new String[]{string}));
        }
        catch (SecurityException securityException) {
            a.b(securityException.toString(), (Throwable)securityException);
        }
        catch (NoSuchMethodException noSuchMethodException) {
            a.b(noSuchMethodException.toString(), (Throwable)noSuchMethodException);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            a.b(illegalArgumentException.toString(), (Throwable)illegalArgumentException);
        }
        catch (InstantiationException instantiationException) {
            a.b(instantiationException.toString(), (Throwable)instantiationException);
        }
        catch (IllegalAccessException illegalAccessException) {
            a.b(illegalAccessException.toString(), (Throwable)illegalAccessException);
        }
        catch (InvocationTargetException invocationTargetException) {
            a.b(invocationTargetException.toString(), (Throwable)invocationTargetException);
        }
        return null;
    }

    private static List a(d d2, String[] arrstring) {
        if (arrstring.length == 0 || arrstring[0] == null) {
            a.b("No pattern supplied on style for config=" + d2);
            return null;
        }
        as as2 = g.a(d2);
        if (as2 == null) {
            a.b("No PatternParser created for config=" + d2 + ", options=" + Arrays.toString(arrstring));
            return null;
        }
        return as2.a(arrstring[0]);
    }

    @Override
    public void a(h h2, StringBuilder stringBuilder) {
        StringBuilder stringBuilder2 = new StringBuilder();
        for (ar ar2 : this.b) {
            ar2.a(h2, stringBuilder2);
        }
        if (stringBuilder2.length() > 0) {
            stringBuilder.append(this.c).append(stringBuilder2.toString()).append(k.a());
        }
    }
}

