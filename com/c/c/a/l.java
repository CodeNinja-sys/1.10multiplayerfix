/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.a;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class l {
    private Map a = new HashMap();

    public static l a(String string, String string2) {
        l l2 = new l();
        l2.a.put(string, string2);
        return l2;
    }

    public static l a() {
        return new l();
    }

    public l b(String string, String string2) {
        this.a.put(string, string2);
        return this;
    }

    public l a(Object object, Object object2) {
        this.a.put(String.valueOf(object), String.valueOf(object2));
        return this;
    }

    public String b() {
        StringBuilder stringBuilder = new StringBuilder();
        Iterator iterator = this.a.keySet().iterator();
        if (!iterator.hasNext()) {
            return null;
        }
        String string = (String)iterator.next();
        stringBuilder.append(string).append("=").append(this.a((String)this.a.get(string)));
        while (iterator.hasNext()) {
            String string2 = (String)iterator.next();
            stringBuilder.append("&").append(string2).append("=").append(this.a((String)this.a.get(string2)));
        }
        return stringBuilder.toString();
    }

    private String a(String string) {
        try {
            return URLEncoder.encode(string, "UTF-8");
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            return string;
        }
    }
}

