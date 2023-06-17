/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.a;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.Comparator;
import org.apache.commons.c.a.a;
import org.apache.commons.c.a.ac;
import org.apache.commons.c.c;

public class b
implements a {
    private int a = 0;

    public static int a(Object object, Object object2) {
        return b.a(object, object2, false, null, new String[0]);
    }

    public static int a(Object object, Object object2, boolean bl2) {
        return b.a(object, object2, bl2, null, new String[0]);
    }

    public static int a(Object object, Object object2, Collection collection) {
        return b.a(object, object2, ac.a(collection));
    }

    public static int a(Object object, Object object2, String ... arrstring) {
        return b.a(object, object2, false, null, arrstring);
    }

    public static int a(Object object, Object object2, boolean bl2, Class class_, String ... arrstring) {
        if (object == object2) {
            return 0;
        }
        if (object == null || object2 == null) {
            throw new NullPointerException();
        }
        Class<?> class_2 = object.getClass();
        if (!class_2.isInstance(object2)) {
            throw new ClassCastException();
        }
        b b2 = new b();
        b.a(object, object2, class_2, b2, bl2, arrstring);
        while (class_2.getSuperclass() != null && class_2 != class_) {
            class_2 = class_2.getSuperclass();
            b.a(object, object2, class_2, b2, bl2, arrstring);
        }
        return b2.b();
    }

    private static void a(Object object, Object object2, Class class_, b b2, boolean bl2, String[] arrstring) {
        AccessibleObject[] arraccessibleObject = class_.getDeclaredFields();
        AccessibleObject.setAccessible(arraccessibleObject, true);
        for (int i2 = 0; i2 < arraccessibleObject.length && b2.a == 0; ++i2) {
            AccessibleObject accessibleObject = arraccessibleObject[i2];
            if (c.c((Object[])arrstring, (Object)((Field)accessibleObject).getName()) || ((Field)accessibleObject).getName().indexOf(36) != -1 || !bl2 && Modifier.isTransient(((Field)accessibleObject).getModifiers()) || Modifier.isStatic(((Field)accessibleObject).getModifiers())) continue;
            try {
                b2.b(((Field)accessibleObject).get(object), ((Field)accessibleObject).get(object2));
                continue;
            }
            catch (IllegalAccessException illegalAccessException) {
                throw new InternalError("Unexpected IllegalAccessException");
            }
        }
    }

    public b a(int n2) {
        if (this.a != 0) {
            return this;
        }
        this.a = n2;
        return this;
    }

    public b b(Object object, Object object2) {
        return this.a(object, object2, null);
    }

    public b a(Object object, Object object2, Comparator comparator) {
        if (this.a != 0) {
            return this;
        }
        if (object == object2) {
            return this;
        }
        if (object == null) {
            this.a = -1;
            return this;
        }
        if (object2 == null) {
            this.a = 1;
            return this;
        }
        if (object.getClass().isArray()) {
            if (object instanceof long[]) {
                this.a((long[])object, (long[])object2);
            } else if (object instanceof int[]) {
                this.a((int[])object, (int[])object2);
            } else if (object instanceof short[]) {
                this.a((short[])object, (short[])object2);
            } else if (object instanceof char[]) {
                this.a((char[])object, (char[])object2);
            } else if (object instanceof byte[]) {
                this.a((byte[])object, (byte[])object2);
            } else if (object instanceof double[]) {
                this.a((double[])object, (double[])object2);
            } else if (object instanceof float[]) {
                this.a((float[])object, (float[])object2);
            } else if (object instanceof boolean[]) {
                this.a((boolean[])object, (boolean[])object2);
            } else {
                this.a((Object[])object, (Object[])object2, comparator);
            }
        } else if (comparator == null) {
            Comparable comparable = (Comparable)object;
            this.a = comparable.compareTo(object2);
        } else {
            Comparator comparator2 = comparator;
            this.a = comparator2.compare(object, object2);
        }
        return this;
    }

    public b a(long l2, long l3) {
        if (this.a != 0) {
            return this;
        }
        this.a = l2 < l3 ? -1 : (l2 > l3 ? 1 : 0);
        return this;
    }

    public b a(int n2, int n3) {
        if (this.a != 0) {
            return this;
        }
        this.a = n2 < n3 ? -1 : (n2 > n3 ? 1 : 0);
        return this;
    }

    public b a(short s2, short s3) {
        if (this.a != 0) {
            return this;
        }
        this.a = s2 < s3 ? -1 : (s2 > s3 ? 1 : 0);
        return this;
    }

    public b a(char c2, char c3) {
        if (this.a != 0) {
            return this;
        }
        this.a = c2 < c3 ? -1 : (c2 > c3 ? 1 : 0);
        return this;
    }

    public b a(byte by2, byte by3) {
        if (this.a != 0) {
            return this;
        }
        this.a = by2 < by3 ? -1 : (by2 > by3 ? 1 : 0);
        return this;
    }

    public b a(double d2, double d3) {
        if (this.a != 0) {
            return this;
        }
        this.a = Double.compare(d2, d3);
        return this;
    }

    public b a(float f2, float f3) {
        if (this.a != 0) {
            return this;
        }
        this.a = Float.compare(f2, f3);
        return this;
    }

    public b a(boolean bl2, boolean bl3) {
        if (this.a != 0) {
            return this;
        }
        if (bl2 == bl3) {
            return this;
        }
        this.a = !bl2 ? -1 : 1;
        return this;
    }

    public b a(Object[] arrobject, Object[] arrobject2) {
        return this.a(arrobject, arrobject2, (Comparator)null);
    }

    public b a(Object[] arrobject, Object[] arrobject2, Comparator comparator) {
        if (this.a != 0) {
            return this;
        }
        if (arrobject == arrobject2) {
            return this;
        }
        if (arrobject == null) {
            this.a = -1;
            return this;
        }
        if (arrobject2 == null) {
            this.a = 1;
            return this;
        }
        if (arrobject.length != arrobject2.length) {
            this.a = arrobject.length < arrobject2.length ? -1 : 1;
            return this;
        }
        for (int i2 = 0; i2 < arrobject.length && this.a == 0; ++i2) {
            this.a(arrobject[i2], arrobject2[i2], comparator);
        }
        return this;
    }

    public b a(long[] arrl, long[] arrl2) {
        if (this.a != 0) {
            return this;
        }
        if (arrl == arrl2) {
            return this;
        }
        if (arrl == null) {
            this.a = -1;
            return this;
        }
        if (arrl2 == null) {
            this.a = 1;
            return this;
        }
        if (arrl.length != arrl2.length) {
            this.a = arrl.length < arrl2.length ? -1 : 1;
            return this;
        }
        for (int i2 = 0; i2 < arrl.length && this.a == 0; ++i2) {
            this.a(arrl[i2], arrl2[i2]);
        }
        return this;
    }

    public b a(int[] arrn, int[] arrn2) {
        if (this.a != 0) {
            return this;
        }
        if (arrn == arrn2) {
            return this;
        }
        if (arrn == null) {
            this.a = -1;
            return this;
        }
        if (arrn2 == null) {
            this.a = 1;
            return this;
        }
        if (arrn.length != arrn2.length) {
            this.a = arrn.length < arrn2.length ? -1 : 1;
            return this;
        }
        for (int i2 = 0; i2 < arrn.length && this.a == 0; ++i2) {
            this.a(arrn[i2], arrn2[i2]);
        }
        return this;
    }

    public b a(short[] arrs, short[] arrs2) {
        if (this.a != 0) {
            return this;
        }
        if (arrs == arrs2) {
            return this;
        }
        if (arrs == null) {
            this.a = -1;
            return this;
        }
        if (arrs2 == null) {
            this.a = 1;
            return this;
        }
        if (arrs.length != arrs2.length) {
            this.a = arrs.length < arrs2.length ? -1 : 1;
            return this;
        }
        for (int i2 = 0; i2 < arrs.length && this.a == 0; ++i2) {
            this.a(arrs[i2], arrs2[i2]);
        }
        return this;
    }

    public b a(char[] arrc, char[] arrc2) {
        if (this.a != 0) {
            return this;
        }
        if (arrc == arrc2) {
            return this;
        }
        if (arrc == null) {
            this.a = -1;
            return this;
        }
        if (arrc2 == null) {
            this.a = 1;
            return this;
        }
        if (arrc.length != arrc2.length) {
            this.a = arrc.length < arrc2.length ? -1 : 1;
            return this;
        }
        for (int i2 = 0; i2 < arrc.length && this.a == 0; ++i2) {
            this.a(arrc[i2], arrc2[i2]);
        }
        return this;
    }

    public b a(byte[] arrby, byte[] arrby2) {
        if (this.a != 0) {
            return this;
        }
        if (arrby == arrby2) {
            return this;
        }
        if (arrby == null) {
            this.a = -1;
            return this;
        }
        if (arrby2 == null) {
            this.a = 1;
            return this;
        }
        if (arrby.length != arrby2.length) {
            this.a = arrby.length < arrby2.length ? -1 : 1;
            return this;
        }
        for (int i2 = 0; i2 < arrby.length && this.a == 0; ++i2) {
            this.a(arrby[i2], arrby2[i2]);
        }
        return this;
    }

    public b a(double[] arrd, double[] arrd2) {
        if (this.a != 0) {
            return this;
        }
        if (arrd == arrd2) {
            return this;
        }
        if (arrd == null) {
            this.a = -1;
            return this;
        }
        if (arrd2 == null) {
            this.a = 1;
            return this;
        }
        if (arrd.length != arrd2.length) {
            this.a = arrd.length < arrd2.length ? -1 : 1;
            return this;
        }
        for (int i2 = 0; i2 < arrd.length && this.a == 0; ++i2) {
            this.a(arrd[i2], arrd2[i2]);
        }
        return this;
    }

    public b a(float[] arrf, float[] arrf2) {
        if (this.a != 0) {
            return this;
        }
        if (arrf == arrf2) {
            return this;
        }
        if (arrf == null) {
            this.a = -1;
            return this;
        }
        if (arrf2 == null) {
            this.a = 1;
            return this;
        }
        if (arrf.length != arrf2.length) {
            this.a = arrf.length < arrf2.length ? -1 : 1;
            return this;
        }
        for (int i2 = 0; i2 < arrf.length && this.a == 0; ++i2) {
            this.a(arrf[i2], arrf2[i2]);
        }
        return this;
    }

    public b a(boolean[] arrbl, boolean[] arrbl2) {
        if (this.a != 0) {
            return this;
        }
        if (arrbl == arrbl2) {
            return this;
        }
        if (arrbl == null) {
            this.a = -1;
            return this;
        }
        if (arrbl2 == null) {
            this.a = 1;
            return this;
        }
        if (arrbl.length != arrbl2.length) {
            this.a = arrbl.length < arrbl2.length ? -1 : 1;
            return this;
        }
        for (int i2 = 0; i2 < arrbl.length && this.a == 0; ++i2) {
            this.a(arrbl[i2], arrbl2[i2]);
        }
        return this;
    }

    public int b() {
        return this.a;
    }

    public Integer c() {
        return this.b();
    }

    @Override
    public /* synthetic */ Object a() {
        return this.c();
    }
}

