/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.m;

import com.a.a.m.az;
import com.a.a.m.bc;
import com.a.a.m.bd;
import com.a.a.m.be;
import com.a.a.m.bf;
import java.lang.reflect.ParameterizedType;

abstract class bb
extends Enum {
    public static final /* enum */ bb a = new bc();
    public static final /* enum */ bb b = new be();
    static final bb c;
    private static final /* synthetic */ bb[] d;

    public static bb[] values() {
        return (bb[])d.clone();
    }

    public static bb valueOf(String string) {
        return Enum.valueOf(bb.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private bb() {
        void var2_-1;
        void var1_-1;
    }

    abstract Class a(Class var1);

    private static bb a() {
        Class<?> class_ = new bf().getClass();
        ParameterizedType parameterizedType = (ParameterizedType)class_.getGenericSuperclass();
        for (bb bb2 : bb.values()) {
            if (bb2.a(bd.class) != parameterizedType.getOwnerType()) continue;
            return bb2;
        }
        throw new AssertionError();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    /* synthetic */ bb(az az2) {
        this((String)var1_-1, (int)var2_1);
        void var2_1;
        void var1_-1;
    }

    static {
        d = new bb[]{a, b};
        c = bb.a();
    }
}

