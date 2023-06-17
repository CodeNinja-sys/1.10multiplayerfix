/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.c.f;

import java.lang.ref.SoftReference;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.TimeZone;
import org.apache.a.c.f.d;

final class c {
    private static final ThreadLocal a = new d();

    c() {
    }

    public static SimpleDateFormat a(String string) {
        SimpleDateFormat simpleDateFormat;
        SoftReference softReference = (SoftReference)a.get();
        HashMap<String, SimpleDateFormat> hashMap = (HashMap<String, SimpleDateFormat>)softReference.get();
        if (hashMap == null) {
            hashMap = new HashMap<String, SimpleDateFormat>();
            a.set(new SoftReference(hashMap));
        }
        if ((simpleDateFormat = (SimpleDateFormat)hashMap.get(string)) == null) {
            simpleDateFormat = new SimpleDateFormat(string, Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            hashMap.put(string, simpleDateFormat);
        }
        return simpleDateFormat;
    }

    public static void a() {
        a.remove();
    }
}

