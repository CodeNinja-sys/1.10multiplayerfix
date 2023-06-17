/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna;

import com.sun.jna.Native;
import com.sun.jna.ac;
import com.sun.jna.av;
import com.sun.jna.ax;
import com.sun.jna.ay;
import com.sun.jna.bd;
import com.sun.jna.bl;
import com.sun.jna.bm;
import com.sun.jna.bp;
import com.sun.jna.bs;
import com.sun.jna.bu;
import com.sun.jna.bv;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

class bk
extends bd {
    private static Map G = new WeakHashMap();
    private static final int H = 13;
    public bm a;
    public short b;
    public short c = (short)13;
    public ay F;

    private bk(bd bd2) {
        ay[] array;
        bd.a(bd2, true);
        if (bd2 instanceof bv) {
            bp bp2 = ((bv)bd2).a;
            array = new ay[]{bk.b(bd2.a(bp2), bp2.b), null};
        } else {
            array = new ay[bd2.a().size() + 1];
            int n2 = 0;
            Iterator iterator = bd2.a().values().iterator();
            while (iterator.hasNext()) {
                bp bp3 = (bp)iterator.next();
                array[n2++] = bd2.d(bp3);
            }
        }
        this.a(array);
    }

    private bk(Object object, Class class_) {
        int n2 = Array.getLength(object);
        ay[] array = new ay[n2 + 1];
        ay ay2 = bk.b(null, class_.getComponentType());
        for (int i2 = 0; i2 < n2; ++i2) {
            array[i2] = ay2;
        }
        this.a(array);
    }

    private void a(ay[] array) {
        this.F = new ac(ay.H * array.length);
        this.F.b(0L, array, 0, array.length);
        this.k();
    }

    static ay b(Object object) {
        if (object == null) {
            return bl.j();
        }
        if (object instanceof Class) {
            return bk.b(null, (Class)object);
        }
        return bk.b(object, object.getClass());
    }

    private static ay b(Object object, Class class_) {
        Object object2;
        bu bu2 = Native.d(class_);
        if (bu2 != null && (object2 = bu2.b(class_)) != null) {
            class_ = object2.a();
        }
        object2 = G;
        synchronized (object2) {
            Object v2 = G.get(class_);
            if (v2 instanceof ay) {
                return (ay)v2;
            }
            if (v2 instanceof bk) {
                return ((bk)v2).g();
            }
            if (ax.j && (bd.q == null ? (bd.q = bd.d("java.nio.Buffer")) : bd.q).isAssignableFrom(class_) || (bd.p == null ? (bd.p = bd.d("com.sun.jna.Callback")) : bd.p).isAssignableFrom(class_)) {
                G.put(class_, bl.j());
                return bl.j();
            }
            if ((bd.o == null ? (bd.o = bd.d("com.sun.jna.bd")) : bd.o).isAssignableFrom(class_)) {
                if (object == null) {
                    object = bk.a(class_);
                }
                if ((bd.v == null ? (bd.v = bd.d("com.sun.jna.bi")) : bd.v).isAssignableFrom(class_)) {
                    G.put(class_, bl.j());
                    return bl.j();
                }
                bk bk2 = new bk((bd)object);
                G.put(class_, bk2);
                return bk2.g();
            }
            if ((bd.s == null ? (bd.s = bd.d("com.sun.jna.au")) : bd.s).isAssignableFrom(class_)) {
                av av2 = av.a(class_);
                return bk.b(av2.a(object, new bs()), av2.a());
            }
            if (class_.isArray()) {
                bk bk3 = new bk(object, class_);
                G.put(object, bk3);
                return bk3.g();
            }
            throw new IllegalArgumentException("Unsupported Structure field type " + class_);
        }
    }

    static ay a(Object object, Class class_) {
        return bk.b(object, class_);
    }

    static {
        if (Native.a == 0) {
            throw new Error("Native library not initialized");
        }
        if (bl.a() == null) {
            throw new Error("FFI types not initialized");
        }
        G.put(Void.TYPE, bl.a());
        G.put(bd.E == null ? (bd.E = bd.d("java.lang.Void")) : bd.E, bl.a());
        G.put(Float.TYPE, bl.b());
        G.put(bd.C == null ? (bd.C = bd.d("java.lang.Float")) : bd.C, bl.b());
        G.put(Double.TYPE, bl.c());
        G.put(bd.D == null ? (bd.D = bd.d("java.lang.Double")) : bd.D, bl.c());
        G.put(Long.TYPE, bl.d());
        G.put(bd.w == null ? (bd.w = bd.d("java.lang.Long")) : bd.w, bl.d());
        G.put(Integer.TYPE, bl.e());
        G.put(bd.x == null ? (bd.x = bd.d("java.lang.Integer")) : bd.x, bl.e());
        G.put(Short.TYPE, bl.f());
        G.put(bd.y == null ? (bd.y = bd.d("java.lang.Short")) : bd.y, bl.f());
        ay ay2 = Native.c == 2 ? bl.g() : bl.h();
        G.put(Character.TYPE, ay2);
        G.put(bd.z == null ? (bd.z = bd.d("java.lang.Character")) : bd.z, ay2);
        G.put(Byte.TYPE, bl.i());
        G.put(bd.A == null ? (bd.A = bd.d("java.lang.Byte")) : bd.A, bl.i());
        G.put(bd.r == null ? (bd.r = bd.d("com.sun.jna.ay")) : bd.r, bl.j());
        G.put(bd.t == null ? (bd.t = bd.d("java.lang.String")) : bd.t, bl.j());
        G.put(bd.u == null ? (bd.u = bd.d("com.sun.jna.bw")) : bd.u, bl.j());
        G.put(Boolean.TYPE, bl.h());
        G.put(bd.B == null ? (bd.B = bd.d("java.lang.Boolean")) : bd.B, bl.h());
    }
}

