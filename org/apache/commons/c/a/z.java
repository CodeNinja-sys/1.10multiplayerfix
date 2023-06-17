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

public class z
implements a {
    private static final ThreadLocal a = new ThreadLocal();
    private final int b;
    private int c = 0;

    static Set b() {
        return (Set)a.get();
    }

    static boolean a(Object object) {
        Set set = z.b();
        return set != null && set.contains(new aa(object));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static void a(Object object, Class class_, z z2, boolean bl2, String[] arrstring) {
        if (z.a(object)) {
            return;
        }
        try {
            z.b(object);
            AccessibleObject[] arraccessibleObject = class_.getDeclaredFields();
            AccessibleObject.setAccessible(arraccessibleObject, true);
            for (AccessibleObject accessibleObject : arraccessibleObject) {
                if (org.apache.commons.c.c.c((Object[])arrstring, (Object)((Field)accessibleObject).getName()) || ((Field)accessibleObject).getName().indexOf(36) != -1 || !bl2 && Modifier.isTransient(((Field)accessibleObject).getModifiers()) || Modifier.isStatic(((Field)accessibleObject).getModifiers())) continue;
                try {
                    Object object2 = ((Field)accessibleObject).get(object);
                    z2.d(object2);
                }
                catch (IllegalAccessException illegalAccessException) {
                    throw new InternalError("Unexpected IllegalAccessException");
                }
            }
        }
        finally {
            z.c(object);
        }
    }

    public static int a(int n2, int n3, Object object) {
        return z.a(n2, n3, object, false, null, new String[0]);
    }

    public static int a(int n2, int n3, Object object, boolean bl2) {
        return z.a(n2, n3, object, bl2, null, new String[0]);
    }

    public static int a(int n2, int n3, Object object, boolean bl2, Class class_, String ... arrstring) {
        Class<?> class_2;
        if (object == null) {
            throw new IllegalArgumentException("The object to build a hash code for must not be null");
        }
        z z2 = new z(n2, n3);
        z.a(object, class_2, z2, bl2, arrstring);
        for (class_2 = object.getClass(); class_2.getSuperclass() != null && class_2 != class_; class_2 = class_2.getSuperclass()) {
            z.a(object, class_2, z2, bl2, arrstring);
        }
        return z2.c();
    }

    public static int a(Object object, boolean bl2) {
        return z.a(17, 37, object, bl2, null, new String[0]);
    }

    public static int a(Object object, Collection collection) {
        return z.a(object, ac.a(collection));
    }

    public static int a(Object object, String ... arrstring) {
        return z.a(17, 37, object, false, null, arrstring);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    static void b(Object object) {
        Class<z> class_ = z.class;
        synchronized (z.class) {
            if (z.b() == null) {
                a.set(new HashSet());
            }
            // ** MonitorExit[var1_1] (shouldn't be in output)
            z.b().add(new aa(object));
            return;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static void c(Object object) {
        Set set = z.b();
        if (set == null) return;
        set.remove(new aa(object));
        Class<z> class_ = z.class;
        synchronized (z.class) {
            set = z.b();
            if (set == null || !set.isEmpty()) return;
            a.remove();
            // ** MonitorExit[var2_2] (shouldn't be in output)
            return;
        }
    }

    public z() {
        this.b = 37;
        this.c = 17;
    }

    public z(int n2, int n3) {
        if (n2 % 2 == 0) {
            throw new IllegalArgumentException("HashCodeBuilder requires an odd initial value");
        }
        if (n3 % 2 == 0) {
            throw new IllegalArgumentException("HashCodeBuilder requires an odd multiplier");
        }
        this.b = n3;
        this.c = n2;
    }

    public z a(boolean bl2) {
        this.c = this.c * this.b + (bl2 ? 0 : 1);
        return this;
    }

    public z a(boolean[] arrbl) {
        if (arrbl == null) {
            this.c *= this.b;
        } else {
            for (boolean bl2 : arrbl) {
                this.a(bl2);
            }
        }
        return this;
    }

    public z a(byte by2) {
        this.c = this.c * this.b + by2;
        return this;
    }

    public z a(byte[] arrby) {
        if (arrby == null) {
            this.c *= this.b;
        } else {
            for (byte by2 : arrby) {
                this.a(by2);
            }
        }
        return this;
    }

    public z a(char c2) {
        this.c = this.c * this.b + c2;
        return this;
    }

    public z a(char[] arrc) {
        if (arrc == null) {
            this.c *= this.b;
        } else {
            for (char c2 : arrc) {
                this.a(c2);
            }
        }
        return this;
    }

    public z a(double d2) {
        return this.a(Double.doubleToLongBits(d2));
    }

    public z a(double[] arrd) {
        if (arrd == null) {
            this.c *= this.b;
        } else {
            for (double d2 : arrd) {
                this.a(d2);
            }
        }
        return this;
    }

    public z a(float f2) {
        this.c = this.c * this.b + Float.floatToIntBits(f2);
        return this;
    }

    public z a(float[] arrf) {
        if (arrf == null) {
            this.c *= this.b;
        } else {
            for (float f2 : arrf) {
                this.a(f2);
            }
        }
        return this;
    }

    public z a(int n2) {
        this.c = this.c * this.b + n2;
        return this;
    }

    public z a(int[] arrn) {
        if (arrn == null) {
            this.c *= this.b;
        } else {
            for (int n2 : arrn) {
                this.a(n2);
            }
        }
        return this;
    }

    public z a(long l2) {
        this.c = this.c * this.b + (int)(l2 ^ l2 >> 32);
        return this;
    }

    public z a(long[] arrl) {
        if (arrl == null) {
            this.c *= this.b;
        } else {
            for (long l2 : arrl) {
                this.a(l2);
            }
        }
        return this;
    }

    public z d(Object object) {
        if (object == null) {
            this.c *= this.b;
        } else if (object.getClass().isArray()) {
            if (object instanceof long[]) {
                this.a((long[])object);
            } else if (object instanceof int[]) {
                this.a((int[])object);
            } else if (object instanceof short[]) {
                this.a((short[])object);
            } else if (object instanceof char[]) {
                this.a((char[])object);
            } else if (object instanceof byte[]) {
                this.a((byte[])object);
            } else if (object instanceof double[]) {
                this.a((double[])object);
            } else if (object instanceof float[]) {
                this.a((float[])object);
            } else if (object instanceof boolean[]) {
                this.a((boolean[])object);
            } else {
                this.a((Object[])object);
            }
        } else {
            this.c = this.c * this.b + object.hashCode();
        }
        return this;
    }

    public z a(Object[] arrobject) {
        if (arrobject == null) {
            this.c *= this.b;
        } else {
            for (Object object : arrobject) {
                this.d(object);
            }
        }
        return this;
    }

    public z a(short s2) {
        this.c = this.c * this.b + s2;
        return this;
    }

    public z a(short[] arrs) {
        if (arrs == null) {
            this.c *= this.b;
        } else {
            for (short s2 : arrs) {
                this.a(s2);
            }
        }
        return this;
    }

    public z b(int n2) {
        this.c = this.c * this.b + n2;
        return this;
    }

    public int c() {
        return this.c;
    }

    public Integer d() {
        return this.c();
    }

    public int hashCode() {
        return this.c();
    }

    @Override
    public /* synthetic */ Object a() {
        return this.d();
    }
}

