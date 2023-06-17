/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.o;

public final class i {
    public static final int a = 17;
    public static final int b = 37;

    private i() {
    }

    public static int a(int n2, int n3) {
        return n2 * 37 + n3;
    }

    public static int a(int n2, boolean bl2) {
        return i.a(n2, bl2 ? 1 : 0);
    }

    public static int a(int n2, Object object) {
        return i.a(n2, object != null ? object.hashCode() : 0);
    }

    public static boolean a(Object object, Object object2) {
        return object == null ? object2 == null : object.equals(object2);
    }

    public static boolean a(Object[] arrobject, Object[] arrobject2) {
        if (arrobject == null) {
            return arrobject2 == null;
        }
        if (arrobject2 != null && arrobject.length == arrobject2.length) {
            for (int i2 = 0; i2 < arrobject.length; ++i2) {
                if (i.a(arrobject[i2], arrobject2[i2])) continue;
                return false;
            }
            return true;
        }
        return false;
    }
}

