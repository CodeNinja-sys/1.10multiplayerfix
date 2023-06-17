/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c;

import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;
import org.apache.commons.c.ab;
import org.apache.commons.c.ao;
import org.apache.commons.c.c;
import org.apache.commons.c.d.a;
import org.apache.commons.c.f.f;
import org.apache.commons.c.h.e;

public class aa {
    public static final ab a = new ab();

    public static Object a(Object object, Object object2) {
        return object != null ? object : object2;
    }

    public static Object a(Object ... arrobject) {
        if (arrobject != null) {
            for (Object object : arrobject) {
                if (object == null) continue;
                return object;
            }
        }
        return null;
    }

    public static boolean b(Object object, Object object2) {
        if (object == object2) {
            return true;
        }
        if (object == null || object2 == null) {
            return false;
        }
        return object.equals(object2);
    }

    public static boolean c(Object object, Object object2) {
        return !aa.b(object, object2);
    }

    public static int a(Object object) {
        return object == null ? 0 : object.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public static int b(Object ... arrobject) {
        int n2 = 1;
        if (arrobject != null) {
            for (Object object : arrobject) {
                int n3 = aa.a(object);
                n2 = n2 * 31 + n3;
            }
        }
        return n2;
    }

    public static String b(Object object) {
        if (object == null) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        aa.a(stringBuilder, object);
        return stringBuilder.toString();
    }

    public static void a(Appendable appendable, Object object) {
        if (object == null) {
            throw new NullPointerException("Cannot get the toString of a null identity");
        }
        appendable.append(object.getClass().getName()).append('@').append(Integer.toHexString(System.identityHashCode(object)));
    }

    public static void a(e e2, Object object) {
        if (object == null) {
            throw new NullPointerException("Cannot get the toString of a null identity");
        }
        e2.c(object.getClass().getName()).a('@').c(Integer.toHexString(System.identityHashCode(object)));
    }

    public static void a(StringBuffer stringBuffer, Object object) {
        if (object == null) {
            throw new NullPointerException("Cannot get the toString of a null identity");
        }
        stringBuffer.append(object.getClass().getName()).append('@').append(Integer.toHexString(System.identityHashCode(object)));
    }

    public static void a(StringBuilder stringBuilder, Object object) {
        if (object == null) {
            throw new NullPointerException("Cannot get the toString of a null identity");
        }
        stringBuilder.append(object.getClass().getName()).append('@').append(Integer.toHexString(System.identityHashCode(object)));
    }

    public static String c(Object object) {
        return object == null ? "" : object.toString();
    }

    public static String a(Object object, String string) {
        return object == null ? string : object.toString();
    }

    public static Comparable a(Comparable ... arrcomparable) {
        Comparable comparable = null;
        if (arrcomparable != null) {
            for (Comparable comparable2 : arrcomparable) {
                if (aa.a(comparable2, comparable, true) >= 0) continue;
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static Comparable b(Comparable ... arrcomparable) {
        Comparable comparable = null;
        if (arrcomparable != null) {
            for (Comparable comparable2 : arrcomparable) {
                if (aa.a(comparable2, comparable, false) <= 0) continue;
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static int a(Comparable comparable, Comparable comparable2) {
        return aa.a(comparable, comparable2, false);
    }

    public static int a(Comparable comparable, Comparable comparable2, boolean bl2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return bl2 ? 1 : -1;
        }
        if (comparable2 == null) {
            return bl2 ? -1 : 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static Comparable c(Comparable ... arrcomparable) {
        ao.a(arrcomparable);
        ao.b(arrcomparable);
        TreeSet treeSet = new TreeSet();
        Collections.addAll(treeSet, arrcomparable);
        Comparable comparable = (Comparable)treeSet.toArray()[(treeSet.size() - 1) / 2];
        return comparable;
    }

    public static Object a(Comparator comparator, Object ... arrobject) {
        ao.a(arrobject, "null/empty items", new Object[0]);
        ao.b(arrobject);
        ao.a((Object)comparator, "null comparator", new Object[0]);
        TreeSet treeSet = new TreeSet(comparator);
        Collections.addAll(treeSet, arrobject);
        Object object = treeSet.toArray()[(treeSet.size() - 1) / 2];
        return object;
    }

    /*
     * WARNING - void declaration
     */
    public static Object c(Object ... arrobject) {
        if (c.g(arrobject)) {
            void var2_4;
            HashMap<Object, f> hashMap = new HashMap<Object, f>(arrobject.length);
            for (Object object : arrobject) {
                f f2 = (f)hashMap.get(object);
                if (f2 == null) {
                    hashMap.put(object, new f(1));
                    continue;
                }
                f2.c();
            }
            Object var2_3 = null;
            int n2 = 0;
            for (Map.Entry entry : hashMap.entrySet()) {
                int n3 = ((f)entry.getValue()).intValue();
                if (n3 == n2) {
                    Object var2_5 = null;
                    continue;
                }
                if (n3 <= n2) continue;
                n2 = n3;
                Object k2 = entry.getKey();
            }
            return var2_4;
        }
        return null;
    }

    public static Object d(Object object) {
        if (object instanceof Cloneable) {
            Object object2;
            Class<?> class_;
            if (object.getClass().isArray()) {
                class_ = object.getClass().getComponentType();
                if (!class_.isPrimitive()) {
                    object2 = ((Object[])object).clone();
                } else {
                    int n2 = Array.getLength(object);
                    object2 = Array.newInstance(class_, n2);
                    while (n2-- > 0) {
                        Array.set(object2, n2, Array.get(object, n2));
                    }
                }
            } else {
                try {
                    class_ = object.getClass().getMethod("clone", new Class[0]);
                    object2 = ((Method)((Object)class_)).invoke(object, new Object[0]);
                }
                catch (NoSuchMethodException noSuchMethodException) {
                    throw new a("Cloneable type " + object.getClass().getName() + " has no clone method", noSuchMethodException);
                }
                catch (IllegalAccessException illegalAccessException) {
                    throw new a("Cannot clone Cloneable type " + object.getClass().getName(), illegalAccessException);
                }
                catch (InvocationTargetException invocationTargetException) {
                    throw new a("Exception cloning Cloneable type " + object.getClass().getName(), invocationTargetException.getCause());
                }
            }
            class_ = object2;
            return class_;
        }
        return null;
    }

    public static Object e(Object object) {
        Object object2 = aa.d(object);
        return object2 == null ? object : object2;
    }

    public static boolean a(boolean bl2) {
        return bl2;
    }

    public static byte a(byte by2) {
        return by2;
    }

    public static byte a(int n2) {
        if (n2 < -128 || n2 > 127) {
            throw new IllegalArgumentException("Supplied value must be a valid byte literal between -128 and 127: [" + n2 + "]");
        }
        return (byte)n2;
    }

    public static char a(char c2) {
        return c2;
    }

    public static short a(short s2) {
        return s2;
    }

    public static short b(int n2) {
        if (n2 < -32768 || n2 > 32767) {
            throw new IllegalArgumentException("Supplied value must be a valid byte literal between -32768 and 32767: [" + n2 + "]");
        }
        return (short)n2;
    }

    public static int c(int n2) {
        return n2;
    }

    public static long a(long l2) {
        return l2;
    }

    public static float a(float f2) {
        return f2;
    }

    public static double a(double d2) {
        return d2;
    }

    public static Object f(Object object) {
        return object;
    }
}

