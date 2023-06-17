/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.c.f;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.apache.a.c.f.f;

public class g
implements f {
    private final Method a;

    public g() {
        Class<?> class_ = Class.forName("java.net.IDN");
        try {
            this.a = class_.getMethod("toUnicode", String.class);
        }
        catch (SecurityException securityException) {
            throw new IllegalStateException(securityException.getMessage(), securityException);
        }
        catch (NoSuchMethodException noSuchMethodException) {
            throw new IllegalStateException(noSuchMethodException.getMessage(), noSuchMethodException);
        }
    }

    public String a(String string) {
        try {
            return (String)this.a.invoke(null, string);
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new IllegalStateException(illegalAccessException.getMessage(), illegalAccessException);
        }
        catch (InvocationTargetException invocationTargetException) {
            Throwable throwable = invocationTargetException.getCause();
            throw new RuntimeException(throwable.getMessage(), throwable);
        }
    }
}

