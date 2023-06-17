/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.cl;
import com.a.a.d.je;
import com.a.a.d.jf;
import com.a.a.d.jh;
import com.a.a.d.jt;
import com.a.a.d.lo;
import com.a.a.d.mq;
import java.util.EnumMap;
import java.util.Map;

final class jd
extends jt {
    private final transient EnumMap a;

    static jt a(EnumMap enumMap) {
        switch (enumMap.size()) {
            case 0: {
                return jt.m();
            }
            case 1: {
                Map.Entry entry = (Map.Entry)mq.d(enumMap.entrySet());
                return jt.c(entry.getKey(), entry.getValue());
            }
        }
        return new jd(enumMap);
    }

    private jd(EnumMap enumMap) {
        this.a = enumMap;
        cl.a(!enumMap.isEmpty());
    }

    @Override
    lo aV_() {
        return new je(this);
    }

    @Override
    public int size() {
        return this.a.size();
    }

    @Override
    public boolean containsKey(Object object) {
        return this.a.containsKey(object);
    }

    @Override
    public Object get(Object object) {
        return this.a.get(object);
    }

    @Override
    lo d() {
        return new jf(this);
    }

    @Override
    boolean b() {
        return false;
    }

    @Override
    Object l() {
        return new jh(this.a);
    }

    static /* synthetic */ EnumMap a(jd jd2) {
        return jd2.a;
    }

    /* synthetic */ jd(EnumMap enumMap, je je2) {
        this(enumMap);
    }
}

