/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.a;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.apache.commons.c.a.a;
import org.apache.commons.c.a.aa;
import org.apache.commons.c.a.ac;
import org.apache.commons.c.c;
import org.apache.commons.c.j.e;

public class y
implements a {
    private static final ThreadLocal a = new ThreadLocal();
    private boolean b = true;

    static Set b() {
        return (Set)a.get();
    }

    static e a(Object object, Object object2) {
        aa aa2 = new aa(object);
        aa aa3 = new aa(object2);
        return e.b(aa2, aa3);
    }

    static boolean b(Object object, Object object2) {
        Set set = y.b();
        e e2 = y.a(object, object2);
        e e3 = e.b(e2.f(), e2.e());
        return set != null && (set.contains(e2) || set.contains(e3));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    static void c(Object object, Object object2) {
        Object object3 = y.class;
        synchronized (y.class) {
            if (y.b() == null) {
                a.set(new HashSet());
            }
            // ** MonitorExit[var2_2] (shouldn't be in output)
            object3 = y.b();
            e e2 = y.a(object, object2);
            object3.add(e2);
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static void d(Object object, Object object2) {
        Set set = y.b();
        if (set == null) return;
        e e2 = y.a(object, object2);
        set.remove(e2);
        Class<y> class_ = y.class;
        synchronized (y.class) {
            set = y.b();
            if (set == null || !set.isEmpty()) return;
            a.remove();
            // ** MonitorExit[var4_4] (shouldn't be in output)
            return;
        }
    }

    public static boolean a(Object object, Object object2, Collection collection) {
        return y.a(object, object2, ac.a(collection));
    }

    public static boolean a(Object object, Object object2, String ... arrstring) {
        return y.a(object, object2, false, null, arrstring);
    }

    public static boolean a(Object object, Object object2, boolean bl2) {
        return y.a(object, object2, bl2, null, new String[0]);
    }

    public static boolean a(Object object, Object object2, boolean bl2, Class class_, String ... arrstring) {
        Class<?> class_2;
        if (object == object2) {
            return true;
        }
        if (object == null || object2 == null) {
            return false;
        }
        Class<?> class_3 = object.getClass();
        Class<?> class_4 = object2.getClass();
        if (class_3.isInstance(object2)) {
            class_2 = class_3;
            if (!class_4.isInstance(object)) {
                class_2 = class_4;
            }
        } else if (class_4.isInstance(object)) {
            class_2 = class_4;
            if (!class_3.isInstance(object2)) {
                class_2 = class_3;
            }
        } else {
            return false;
        }
        y y2 = new y();
        try {
            if (class_2.isArray()) {
                y2.e(object, object2);
            } else {
                y.a(object, object2, class_2, y2, bl2, arrstring);
                while (class_2.getSuperclass() != null && class_2 != class_) {
                    class_2 = class_2.getSuperclass();
                    y.a(object, object2, class_2, y2, bl2, arrstring);
                }
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return false;
        }
        return y2.c();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static void a(Object object, Object object2, Class class_, y y2, boolean bl2, String[] arrstring) {
        if (y.b(object, object2)) {
            return;
        }
        try {
            y.c(object, object2);
            AccessibleObject[] arraccessibleObject = class_.getDeclaredFields();
            AccessibleObject.setAccessible(arraccessibleObject, true);
            for (int i2 = 0; i2 < arraccessibleObject.length && y2.b; ++i2) {
                AccessibleObject accessibleObject = arraccessibleObject[i2];
                if (c.c((Object[])arrstring, (Object)((Field)accessibleObject).getName()) || ((Field)accessibleObject).getName().indexOf(36) != -1 || !bl2 && Modifier.isTransient(((Field)accessibleObject).getModifiers()) || Modifier.isStatic(((Field)accessibleObject).getModifiers())) continue;
                try {
                    y2.e(((Field)accessibleObject).get(object), ((Field)accessibleObject).get(object2));
                    continue;
                }
                catch (IllegalAccessException illegalAccessException) {
                    throw new InternalError("Unexpected IllegalAccessException");
                }
            }
        }
        finally {
            y.d(object, object2);
        }
    }

    public y a(boolean bl2) {
        if (!this.b) {
            return this;
        }
        this.b = bl2;
        return this;
    }

    public y e(Object object, Object object2) {
        if (!this.b) {
            return this;
        }
        if (object == object2) {
            return this;
        }
        if (object == null || object2 == null) {
            this.b(false);
            return this;
        }
        Class<?> class_ = object.getClass();
        if (!class_.isArray()) {
            this.b = object.equals(object2);
        } else if (object.getClass() != object2.getClass()) {
            this.b(false);
        } else if (object instanceof long[]) {
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
            this.a((Object[])object, (Object[])object2);
        }
        return this;
    }

    public y a(long l2, long l3) {
        if (!this.b) {
            return this;
        }
        this.b = l2 == l3;
        return this;
    }

    public y a(int n2, int n3) {
        if (!this.b) {
            return this;
        }
        this.b = n2 == n3;
        return this;
    }

    public y a(short s2, short s3) {
        if (!this.b) {
            return this;
        }
        this.b = s2 == s3;
        return this;
    }

    public y a(char c2, char c3) {
        if (!this.b) {
            return this;
        }
        this.b = c2 == c3;
        return this;
    }

    public y a(byte by2, byte by3) {
        if (!this.b) {
            return this;
        }
        this.b = by2 == by3;
        return this;
    }

    public y a(double d2, double d3) {
        if (!this.b) {
            return this;
        }
        return this.a(Double.doubleToLongBits(d2), Double.doubleToLongBits(d3));
    }

    public y a(float f2, float f3) {
        if (!this.b) {
            return this;
        }
        return this.a(Float.floatToIntBits(f2), Float.floatToIntBits(f3));
    }

    public y a(boolean bl2, boolean bl3) {
        if (!this.b) {
            return this;
        }
        this.b = bl2 == bl3;
        return this;
    }

    public y a(Object[] arrobject, Object[] arrobject2) {
        if (!this.b) {
            return this;
        }
        if (arrobject == arrobject2) {
            return this;
        }
        if (arrobject == null || arrobject2 == null) {
            this.b(false);
            return this;
        }
        if (arrobject.length != arrobject2.length) {
            this.b(false);
            return this;
        }
        for (int i2 = 0; i2 < arrobject.length && this.b; ++i2) {
            this.e(arrobject[i2], arrobject2[i2]);
        }
        return this;
    }

    public y a(long[] arrl, long[] arrl2) {
        if (!this.b) {
            return this;
        }
        if (arrl == arrl2) {
            return this;
        }
        if (arrl == null || arrl2 == null) {
            this.b(false);
            return this;
        }
        if (arrl.length != arrl2.length) {
            this.b(false);
            return this;
        }
        for (int i2 = 0; i2 < arrl.length && this.b; ++i2) {
            this.a(arrl[i2], arrl2[i2]);
        }
        return this;
    }

    public y a(int[] arrn, int[] arrn2) {
        if (!this.b) {
            return this;
        }
        if (arrn == arrn2) {
            return this;
        }
        if (arrn == null || arrn2 == null) {
            this.b(false);
            return this;
        }
        if (arrn.length != arrn2.length) {
            this.b(false);
            return this;
        }
        for (int i2 = 0; i2 < arrn.length && this.b; ++i2) {
            this.a(arrn[i2], arrn2[i2]);
        }
        return this;
    }

    public y a(short[] arrs, short[] arrs2) {
        if (!this.b) {
            return this;
        }
        if (arrs == arrs2) {
            return this;
        }
        if (arrs == null || arrs2 == null) {
            this.b(false);
            return this;
        }
        if (arrs.length != arrs2.length) {
            this.b(false);
            return this;
        }
        for (int i2 = 0; i2 < arrs.length && this.b; ++i2) {
            this.a(arrs[i2], arrs2[i2]);
        }
        return this;
    }

    public y a(char[] arrc, char[] arrc2) {
        if (!this.b) {
            return this;
        }
        if (arrc == arrc2) {
            return this;
        }
        if (arrc == null || arrc2 == null) {
            this.b(false);
            return this;
        }
        if (arrc.length != arrc2.length) {
            this.b(false);
            return this;
        }
        for (int i2 = 0; i2 < arrc.length && this.b; ++i2) {
            this.a(arrc[i2], arrc2[i2]);
        }
        return this;
    }

    public y a(byte[] arrby, byte[] arrby2) {
        if (!this.b) {
            return this;
        }
        if (arrby == arrby2) {
            return this;
        }
        if (arrby == null || arrby2 == null) {
            this.b(false);
            return this;
        }
        if (arrby.length != arrby2.length) {
            this.b(false);
            return this;
        }
        for (int i2 = 0; i2 < arrby.length && this.b; ++i2) {
            this.a(arrby[i2], arrby2[i2]);
        }
        return this;
    }

    public y a(double[] arrd, double[] arrd2) {
        if (!this.b) {
            return this;
        }
        if (arrd == arrd2) {
            return this;
        }
        if (arrd == null || arrd2 == null) {
            this.b(false);
            return this;
        }
        if (arrd.length != arrd2.length) {
            this.b(false);
            return this;
        }
        for (int i2 = 0; i2 < arrd.length && this.b; ++i2) {
            this.a(arrd[i2], arrd2[i2]);
        }
        return this;
    }

    public y a(float[] arrf, float[] arrf2) {
        if (!this.b) {
            return this;
        }
        if (arrf == arrf2) {
            return this;
        }
        if (arrf == null || arrf2 == null) {
            this.b(false);
            return this;
        }
        if (arrf.length != arrf2.length) {
            this.b(false);
            return this;
        }
        for (int i2 = 0; i2 < arrf.length && this.b; ++i2) {
            this.a(arrf[i2], arrf2[i2]);
        }
        return this;
    }

    public y a(boolean[] arrbl, boolean[] arrbl2) {
        if (!this.b) {
            return this;
        }
        if (arrbl == arrbl2) {
            return this;
        }
        if (arrbl == null || arrbl2 == null) {
            this.b(false);
            return this;
        }
        if (arrbl.length != arrbl2.length) {
            this.b(false);
            return this;
        }
        for (int i2 = 0; i2 < arrbl.length && this.b; ++i2) {
            this.a(arrbl[i2], arrbl2[i2]);
        }
        return this;
    }

    public boolean c() {
        return this.b;
    }

    public Boolean d() {
        return this.c();
    }

    protected void b(boolean bl2) {
        this.b = bl2;
    }

    public void e() {
        this.b = true;
    }

    @Override
    public /* synthetic */ Object a() {
        return this.d();
    }
}

