/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.d.jb;
import com.a.a.d.jt;
import com.a.a.d.kb;
import com.a.a.d.yc;
import com.a.a.d.zf;
import java.util.Map;

public class ju {
    kb[] a;
    int b;

    public ju() {
        this(4);
    }

    ju(int n2) {
        this.a = new kb[n2];
        this.b = 0;
    }

    private void a(int n2) {
        if (n2 > this.a.length) {
            this.a = (kb[])yc.b(this.a, jb.a(this.a.length, n2));
        }
    }

    public ju b(Object object, Object object2) {
        this.a(this.b + 1);
        kb kb2 = jt.d(object, object2);
        this.a[this.b++] = kb2;
        return this;
    }

    public ju a(Map.Entry entry) {
        return this.b(entry.getKey(), entry.getValue());
    }

    public ju b(Map map) {
        this.a(this.b + map.size());
        for (Map.Entry entry : map.entrySet()) {
            this.a(entry);
        }
        return this;
    }

    public jt b() {
        switch (this.b) {
            case 0: {
                return jt.m();
            }
            case 1: {
                return jt.c(this.a[0].getKey(), this.a[0].getValue());
            }
        }
        return new zf(this.b, this.a);
    }
}

