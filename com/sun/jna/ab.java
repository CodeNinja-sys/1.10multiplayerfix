/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna;

import com.sun.jna.aq;
import com.sun.jna.r;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

class ab
implements r {
    private final Map a;

    public ab(Map map) {
        this.a = new HashMap(map);
    }

    public String a(aq aq2, Method method) {
        String string = method.getName();
        if (this.a.containsKey(string)) {
            return (String)this.a.get(string);
        }
        return string;
    }
}

