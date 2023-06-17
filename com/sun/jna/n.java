/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna;

import com.sun.jna.Callback;
import com.sun.jna.FromNativeConverter;
import com.sun.jna.Native;
import com.sun.jna.ae;
import com.sun.jna.af;
import com.sun.jna.aq;
import com.sun.jna.au;
import com.sun.jna.av;
import com.sun.jna.aw;
import com.sun.jna.ay;
import com.sun.jna.bc;
import com.sun.jna.bd;
import com.sun.jna.bj;
import com.sun.jna.bs;
import com.sun.jna.bu;
import com.sun.jna.bw;
import com.sun.jna.e;
import com.sun.jna.o;
import com.sun.jna.p;
import com.sun.jna.q;
import com.sun.jna.s;
import com.sun.jna.t;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Map;

public class n
extends ay {
    public static final int a = 256;
    public static final int b = 0;
    public static final int c = 1;
    private static final int aa = 3;
    public static final int d = 4;
    static final Integer e = new Integer(-1);
    static final Integer f = new Integer(0);
    private aq ab;
    private final String ac;
    int g;
    final Map h;
    static final String i = "invoking-method";
    static Class j;
    static Class k;
    static Class l;
    static Class m;
    static Class n;
    static Class o;
    static Class p;
    static Class q;
    static Class r;
    static Class s;
    static Class t;
    static Class u;
    static Class v;
    static Class w;
    static Class x;
    static Class y;
    static Class z;
    static Class A;
    static Class B;
    static Class C;
    static Class D;
    static Class E;
    static Class F;
    static Class G;

    public static n a(String string, String string2) {
        return aq.a(string).b(string2);
    }

    public static n a(String string, String string2, int n2) {
        return aq.a(string).a(string2, n2);
    }

    public static n a(ay ay2) {
        return com.sun.jna.n.a(ay2, 0);
    }

    public static n a(ay ay2, int n2) {
        return new n(ay2, n2);
    }

    n(aq aq2, String string, int n2) {
        this.a(n2 & 3);
        if (string == null) {
            throw new NullPointerException("Function name must not be null");
        }
        this.ab = aq2;
        this.ac = string;
        this.g = n2;
        this.h = aq2.b;
        try {
            this.J = aq2.d(string);
        }
        catch (UnsatisfiedLinkError unsatisfiedLinkError) {
            throw new UnsatisfiedLinkError("Error looking up function '" + string + "': " + unsatisfiedLinkError.getMessage());
        }
    }

    n(ay ay2, int n2) {
        this.a(n2 & 3);
        if (ay2 == null || ay2.J == 0L) {
            throw new NullPointerException("Function address may not be null");
        }
        this.ac = ay2.toString();
        this.g = n2;
        this.J = ay2.J;
        this.h = Collections.EMPTY_MAP;
    }

    private void a(int n2) {
        switch (n2) {
            case 0: 
            case 1: {
                break;
            }
            default: {
                throw new IllegalArgumentException("Unrecognized calling convention: " + n2);
            }
        }
    }

    public String a() {
        return this.ac;
    }

    public int b() {
        return this.g & 3;
    }

    public Object a(Class class_, Object[] arrobject) {
        return this.a(class_, arrobject, this.h);
    }

    public Object a(Class class_, Object[] arrobject, Map map) {
        Object object;
        Object[] arrobject2 = new Object[]{};
        if (arrobject != null) {
            if (arrobject.length > 256) {
                throw new UnsupportedOperationException("Maximum argument count is 256");
            }
            arrobject2 = new Object[arrobject.length];
            System.arraycopy(arrobject, 0, arrobject2, 0, arrobject2.length);
        }
        bu bu2 = (bu)map.get("type-mapper");
        Method method = (Method)map.get(i);
        boolean bl2 = Boolean.TRUE.equals(map.get("allow-objects"));
        for (int i2 = 0; i2 < arrobject2.length; ++i2) {
            arrobject2[i2] = this.a(arrobject2, i2, method, bu2, bl2);
        }
        Class class_2 = class_;
        FromNativeConverter fromNativeConverter = null;
        if ((j == null ? (j = com.sun.jna.n.a("com.sun.jna.au")) : j).isAssignableFrom(class_)) {
            object = av.a(class_);
            fromNativeConverter = object;
            class_2 = ((av)object).a();
        } else if (bu2 != null && (fromNativeConverter = bu2.a(class_)) != null) {
            class_2 = fromNativeConverter.a();
        }
        object = this.a(arrobject2, class_2, bl2);
        if (fromNativeConverter != null) {
            t t2 = method != null ? new af(class_, this, arrobject, method) : new t(class_, this, arrobject);
            object = fromNativeConverter.a(object, t2);
        }
        if (arrobject != null) {
            for (int i3 = 0; i3 < arrobject.length; ++i3) {
                Object object2 = arrobject[i3];
                if (object2 == null) continue;
                if (object2 instanceof bd) {
                    if (object2 instanceof bj) continue;
                    ((bd)object2).q();
                    continue;
                }
                if (arrobject2[i3] instanceof q) {
                    ((q)arrobject2[i3]).a();
                    if (!(arrobject2[i3] instanceof p)) continue;
                    p p2 = (p)arrobject2[i3];
                    if (!(k == null ? com.sun.jna.n.a("[Lcom.sun.jna.bi;") : k).isAssignableFrom(object2.getClass())) continue;
                    Class<?> class_3 = object2.getClass().getComponentType();
                    bd[] arrbd = (bd[])object2;
                    for (int i4 = 0; i4 < arrbd.length; ++i4) {
                        ay ay2 = p2.i(ay.H * i4);
                        arrbd[i4] = bd.a(class_3, arrbd[i4], ay2);
                    }
                    continue;
                }
                if (!(l == null ? com.sun.jna.n.a("[Lcom.sun.jna.bd;") : l).isAssignableFrom(object2.getClass())) continue;
                bd.b((bd[])object2);
            }
        }
        return object;
    }

    Object a(Object[] arrobject, Class class_, boolean bl2) {
        Object object = null;
        if (class_ == null || class_ == Void.TYPE || class_ == (m == null ? (m = com.sun.jna.n.a("java.lang.Void")) : m)) {
            Native.invokeVoid(this.J, this.g, arrobject);
            object = null;
        } else if (class_ == Boolean.TYPE || class_ == (n == null ? (n = com.sun.jna.n.a("java.lang.Boolean")) : n)) {
            object = com.sun.jna.n.a(Native.invokeInt(this.J, this.g, arrobject) != 0);
        } else if (class_ == Byte.TYPE || class_ == (o == null ? (o = com.sun.jna.n.a("java.lang.Byte")) : o)) {
            object = new Byte((byte)Native.invokeInt(this.J, this.g, arrobject));
        } else if (class_ == Short.TYPE || class_ == (p == null ? (p = com.sun.jna.n.a("java.lang.Short")) : p)) {
            object = new Short((short)Native.invokeInt(this.J, this.g, arrobject));
        } else if (class_ == Character.TYPE || class_ == (q == null ? (q = com.sun.jna.n.a("java.lang.Character")) : q)) {
            object = new Character((char)Native.invokeInt(this.J, this.g, arrobject));
        } else if (class_ == Integer.TYPE || class_ == (r == null ? (r = com.sun.jna.n.a("java.lang.Integer")) : r)) {
            object = new Integer(Native.invokeInt(this.J, this.g, arrobject));
        } else if (class_ == Long.TYPE || class_ == (s == null ? (s = com.sun.jna.n.a("java.lang.Long")) : s)) {
            object = new Long(Native.invokeLong(this.J, this.g, arrobject));
        } else if (class_ == Float.TYPE || class_ == (t == null ? (t = com.sun.jna.n.a("java.lang.Float")) : t)) {
            object = new Float(Native.invokeFloat(this.J, this.g, arrobject));
        } else if (class_ == Double.TYPE || class_ == (u == null ? (u = com.sun.jna.n.a("java.lang.Double")) : u)) {
            object = new Double(Native.invokeDouble(this.J, this.g, arrobject));
        } else if (class_ == (v == null ? (v = com.sun.jna.n.a("java.lang.String")) : v)) {
            object = this.a(this.g, arrobject, false);
        } else if (class_ == (w == null ? (w = com.sun.jna.n.a("com.sun.jna.bw")) : w)) {
            String string = this.a(this.g, arrobject, true);
            if (string != null) {
                object = new bw(string);
            }
        } else {
            if ((x == null ? (x = com.sun.jna.n.a("com.sun.jna.ay")) : x).isAssignableFrom(class_)) {
                return this.a(this.g, arrobject);
            }
            if ((y == null ? (y = com.sun.jna.n.a("com.sun.jna.bd")) : y).isAssignableFrom(class_)) {
                if ((z == null ? (z = com.sun.jna.n.a("com.sun.jna.bj")) : z).isAssignableFrom(class_)) {
                    bd bd2 = Native.a(this.J, this.g, arrobject, bd.a(class_));
                    bd2.q();
                    object = bd2;
                } else {
                    object = this.a(this.g, arrobject);
                    if (object != null) {
                        bd bd3 = bd.a(class_);
                        bd3.a((ay)object);
                        bd3.q();
                        object = bd3;
                    }
                }
            } else if ((A == null ? (A = com.sun.jna.n.a("com.sun.jna.Callback")) : A).isAssignableFrom(class_)) {
                object = this.a(this.g, arrobject);
                if (object != null) {
                    object = com.sun.jna.e.a(class_, (ay)object);
                }
            } else if (class_ == (B == null ? (B = com.sun.jna.n.a("[Ljava.lang.String;")) : B)) {
                ay ay2 = this.a(this.g, arrobject);
                if (ay2 != null) {
                    object = ay2.q(0L);
                }
            } else if (class_ == (C == null ? (C = com.sun.jna.n.a("[Lcom.sun.jna.bw;")) : C)) {
                ay ay3 = this.a(this.g, arrobject);
                if (ay3 != null) {
                    String[] arrstring = ay3.b(0L, true);
                    bw[] arrbw = new bw[arrstring.length];
                    for (int i2 = 0; i2 < arrstring.length; ++i2) {
                        arrbw[i2] = new bw(arrstring[i2]);
                    }
                    object = arrbw;
                }
            } else if (class_ == (D == null ? (D = com.sun.jna.n.a("[Lcom.sun.jna.ay;")) : D)) {
                ay ay4 = this.a(this.g, arrobject);
                if (ay4 != null) {
                    object = ay4.p(0L);
                }
            } else if (bl2) {
                object = Native.invokeObject(this.J, this.g, arrobject);
                if (object != null && !class_.isAssignableFrom(object.getClass())) {
                    throw new ClassCastException("Return type " + class_ + " does not match result " + object.getClass());
                }
            } else {
                throw new IllegalArgumentException("Unsupported return type " + class_ + " in function " + this.a());
            }
        }
        return object;
    }

    private ay a(int n2, Object[] arrobject) {
        long l2 = Native.invokePointer(this.J, n2, arrobject);
        return l2 == 0L ? null : new ay(l2);
    }

    private Object a(Object[] arrobject, int n2, Method method, bu bu2, boolean bl2) {
        Object object;
        bd[] arrbd;
        Class<?> class_;
        Object object2 = arrobject[n2];
        if (object2 != null) {
            class_ = object2.getClass();
            arrbd = null;
            if ((j == null ? (j = com.sun.jna.n.a("com.sun.jna.au")) : j).isAssignableFrom(class_)) {
                arrbd = av.a(class_);
            } else if (bu2 != null) {
                arrbd = bu2.b(class_);
            }
            if (arrbd != null) {
                object = method != null ? new ae(this, arrobject, n2, method) : new s(this, arrobject, n2);
                object2 = arrbd.a(object2, (bs)object);
            }
        }
        if (object2 == null || this.a(object2.getClass())) {
            return object2;
        }
        class_ = object2.getClass();
        if (object2 instanceof bd) {
            arrbd = (bd)object2;
            arrbd.r();
            if (arrbd instanceof bj) {
                object = arrbd.getClass();
                if (method != null) {
                    Class<?>[] arrclass = method.getParameterTypes();
                    if (com.sun.jna.n.a(method)) {
                        if (n2 < arrclass.length - 1) {
                            object = arrclass[n2];
                        } else {
                            Class<?> class_2 = arrclass[arrclass.length - 1].getComponentType();
                            if (class_2 != (E == null ? (E = com.sun.jna.n.a("java.lang.Object")) : E)) {
                                object = class_2;
                            }
                        }
                    } else {
                        object = arrclass[n2];
                    }
                }
                if ((z == null ? (z = com.sun.jna.n.a("com.sun.jna.bj")) : z).isAssignableFrom((Class<?>)object)) {
                    return arrbd;
                }
            }
            return arrbd.g();
        }
        if (object2 instanceof Callback) {
            return com.sun.jna.e.a((Callback)object2);
        }
        if (object2 instanceof String) {
            return new aw((String)object2, false).a();
        }
        if (object2 instanceof bw) {
            return new aw(object2.toString(), true).a();
        }
        if (object2 instanceof Boolean) {
            return Boolean.TRUE.equals(object2) ? e : f;
        }
        if ((B == null ? (B = com.sun.jna.n.a("[Ljava.lang.String;")) : B) == class_) {
            return new bc((String[])object2);
        }
        if ((C == null ? (C = com.sun.jna.n.a("[Lcom.sun.jna.bw;")) : C) == class_) {
            return new bc((bw[])object2);
        }
        if ((D == null ? (D = com.sun.jna.n.a("[Lcom.sun.jna.ay;")) : D) == class_) {
            return new p((ay[])object2);
        }
        if ((F == null ? (F = com.sun.jna.n.a("[Lcom.sun.jna.au;")) : F).isAssignableFrom(class_)) {
            return new o((au[])object2);
        }
        if ((l == null ? (l = com.sun.jna.n.a("[Lcom.sun.jna.bd;")) : l).isAssignableFrom(class_)) {
            arrbd = (bd[])object2;
            boolean bl3 = (G == null ? (G = com.sun.jna.n.a("com.sun.jna.bi")) : G).isAssignableFrom((Class<?>)(object = class_.getComponentType()));
            if (bl3) {
                ay[] array = new ay[arrbd.length + 1];
                for (int i2 = 0; i2 < arrbd.length; ++i2) {
                    array[i2] = arrbd[i2] != null ? arrbd[i2].g() : null;
                }
                return new p(array);
            }
            if (arrbd.length == 0) {
                throw new IllegalArgumentException("Structure array must have non-zero length");
            }
            if (arrbd[0] == null) {
                bd.a(object).a(arrbd);
                return arrbd[0].g();
            }
            bd.c(arrbd);
            return arrbd[0].g();
        }
        if (class_.isArray()) {
            throw new IllegalArgumentException("Unsupported array argument type: " + class_.getComponentType());
        }
        if (bl2) {
            return object2;
        }
        if (!Native.g(object2.getClass())) {
            throw new IllegalArgumentException("Unsupported argument type " + object2.getClass().getName() + " at parameter " + n2 + " of function " + this.a());
        }
        return object2;
    }

    private boolean a(Class class_) {
        return class_.isArray() && class_.getComponentType().isPrimitive();
    }

    public void a(Object[] arrobject) {
        this.a(m == null ? (m = com.sun.jna.n.a("java.lang.Void")) : m, arrobject);
    }

    private String a(int n2, Object[] arrobject, boolean bl2) {
        ay ay2 = this.a(n2, arrobject);
        String string = null;
        if (ay2 != null) {
            string = bl2 ? ay2.a(0L, bl2) : ay2.o(0L);
        }
        return string;
    }

    public String toString() {
        if (this.ab != null) {
            return "native function " + this.ac + "(" + this.ab.c() + ")@0x" + Long.toHexString(this.J);
        }
        return "native function@0x" + Long.toHexString(this.J);
    }

    public Object b(Object[] arrobject) {
        return this.a(E == null ? (E = com.sun.jna.n.a("java.lang.Object")) : E, arrobject);
    }

    public ay c(Object[] arrobject) {
        return (ay)this.a(x == null ? (x = com.sun.jna.n.a("com.sun.jna.ay")) : x, arrobject);
    }

    public String a(Object[] arrobject, boolean bl2) {
        Class class_ = bl2 ? (w == null ? (w = com.sun.jna.n.a("com.sun.jna.bw")) : w) : (v == null ? (v = com.sun.jna.n.a("java.lang.String")) : v);
        Object object = this.a(class_, arrobject);
        return object != null ? object.toString() : null;
    }

    public int d(Object[] arrobject) {
        return (Integer)this.a(r == null ? (r = com.sun.jna.n.a("java.lang.Integer")) : r, arrobject);
    }

    public long e(Object[] arrobject) {
        return (Long)this.a(s == null ? (s = com.sun.jna.n.a("java.lang.Long")) : s, arrobject);
    }

    public float f(Object[] arrobject) {
        return ((Float)this.a(t == null ? (t = com.sun.jna.n.a("java.lang.Float")) : t, arrobject)).floatValue();
    }

    public double g(Object[] arrobject) {
        return (Double)this.a(u == null ? (u = com.sun.jna.n.a("java.lang.Double")) : u, arrobject);
    }

    public void h(Object[] arrobject) {
        this.a(m == null ? (m = com.sun.jna.n.a("java.lang.Void")) : m, arrobject);
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (object.getClass() == this.getClass()) {
            n n2 = (n)object;
            return n2.g == this.g && ((Object)n2.h).equals(this.h) && n2.J == this.J;
        }
        return false;
    }

    public int hashCode() {
        return this.g + ((Object)this.h).hashCode() + super.hashCode();
    }

    static Object[] i(Object[] arrobject) {
        if (arrobject != null && arrobject.length > 0) {
            Class<?> class_;
            Object object = arrobject[arrobject.length - 1];
            Class<?> class_2 = class_ = object != null ? object.getClass() : null;
            if (class_ != null && class_.isArray()) {
                Object[] arrobject2 = (Object[])object;
                Object[] arrobject3 = new Object[arrobject.length + arrobject2.length];
                System.arraycopy(arrobject, 0, arrobject3, 0, arrobject.length - 1);
                System.arraycopy(arrobject2, 0, arrobject3, arrobject.length - 1, arrobject2.length);
                arrobject3[arrobject3.length - 1] = null;
                arrobject = arrobject3;
            }
        }
        return arrobject;
    }

    static boolean a(Method method) {
        try {
            Method method2 = method.getClass().getMethod("isVarArgs", new Class[0]);
            return Boolean.TRUE.equals(method2.invoke(method, new Object[0]));
        }
        catch (SecurityException securityException) {
        }
        catch (NoSuchMethodException noSuchMethodException) {
        }
        catch (IllegalArgumentException illegalArgumentException) {
        }
        catch (IllegalAccessException illegalAccessException) {
        }
        catch (InvocationTargetException invocationTargetException) {
            // empty catch block
        }
        return false;
    }

    static Boolean a(boolean bl2) {
        return bl2 ? Boolean.TRUE : Boolean.FALSE;
    }

    static Class a(String string) {
        try {
            return Class.forName(string);
        }
        catch (ClassNotFoundException classNotFoundException) {
            throw new NoClassDefFoundError().initCause(classNotFoundException);
        }
    }
}

