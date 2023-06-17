/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.aj;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ew
implements aj {
    private static final int d = 16;
    private Reference e = null;
    private int f = 0;
    private int g = 16;

    public ew() {
    }

    public ew(int n2) {
        this(n2, 16);
    }

    public ew(int n2, int n3) {
        if (n2 == 1) {
            this.f = n2;
        }
        if (n3 > 0) {
            this.g = n3;
        }
    }

    public Object a(Object object) {
        Map map;
        Reference reference = this.e;
        if (reference != null && (map = (Map)reference.get()) != null) {
            return map.get(object);
        }
        return null;
    }

    public void a(Object object, Object object2) {
        Reference reference = this.e;
        Map<Object, Object> map = null;
        if (reference != null) {
            map = (Map<Object, Object>)reference.get();
        }
        if (map == null) {
            map = Collections.synchronizedMap(new HashMap(this.g));
            reference = this.f == 1 ? new WeakReference(map) : new SoftReference(map);
            this.e = reference;
        }
        map.put(object, object2);
    }

    public void a() {
        this.e = null;
    }
}

