/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.c.a.ae;
import org.apache.commons.c.a.af;
import org.apache.commons.c.a.y;
import org.apache.commons.c.a.z;
import org.apache.commons.c.f.f;

public class c {
    public static final Object[] a = new Object[0];
    public static final Class[] b = new Class[0];
    public static final String[] c = new String[0];
    public static final long[] d = new long[0];
    public static final Long[] e = new Long[0];
    public static final int[] f = new int[0];
    public static final Integer[] g = new Integer[0];
    public static final short[] h = new short[0];
    public static final Short[] i = new Short[0];
    public static final byte[] j = new byte[0];
    public static final Byte[] k = new Byte[0];
    public static final double[] l = new double[0];
    public static final Double[] m = new Double[0];
    public static final float[] n = new float[0];
    public static final Float[] o = new Float[0];
    public static final boolean[] p = new boolean[0];
    public static final Boolean[] q = new Boolean[0];
    public static final char[] r = new char[0];
    public static final Character[] s = new Character[0];
    public static final int t = -1;

    public static String a(Object object) {
        return org.apache.commons.c.c.a(object, "{}");
    }

    public static String a(Object object, String string) {
        if (object == null) {
            return string;
        }
        return new ae(object, af.e).d(object).toString();
    }

    public static int b(Object object) {
        return new z().d(object).c();
    }

    public static boolean a(Object object, Object object2) {
        return new y().e(object, object2).c();
    }

    public static Map a(Object[] arrobject) {
        if (arrobject == null) {
            return null;
        }
        HashMap<Object, Object> hashMap = new HashMap<Object, Object>((int)((double)arrobject.length * 1.5));
        for (int i2 = 0; i2 < arrobject.length; ++i2) {
            Object[] arrobject2;
            Object object = arrobject[i2];
            if (object instanceof Map.Entry) {
                arrobject2 = (Object[])object;
                hashMap.put(arrobject2.getKey(), arrobject2.getValue());
                continue;
            }
            if (object instanceof Object[]) {
                arrobject2 = (Object[])object;
                if (arrobject2.length < 2) {
                    throw new IllegalArgumentException("Array element " + i2 + ", '" + object + "', has a length less than 2");
                }
                hashMap.put(arrobject2[0], arrobject2[1]);
                continue;
            }
            throw new IllegalArgumentException("Array element " + i2 + ", '" + object + "', is neither of type Map.Entry nor an Array");
        }
        return hashMap;
    }

    public static Object[] b(Object ... arrobject) {
        return arrobject;
    }

    public static Object[] c(Object[] arrobject) {
        if (arrobject == null) {
            return null;
        }
        return (Object[])arrobject.clone();
    }

    public static long[] a(long[] arrl) {
        if (arrl == null) {
            return null;
        }
        return (long[])arrl.clone();
    }

    public static int[] a(int[] arrn) {
        if (arrn == null) {
            return null;
        }
        return (int[])arrn.clone();
    }

    public static short[] a(short[] arrs) {
        if (arrs == null) {
            return null;
        }
        return (short[])arrs.clone();
    }

    public static char[] a(char[] arrc) {
        if (arrc == null) {
            return null;
        }
        return (char[])arrc.clone();
    }

    public static byte[] a(byte[] arrby) {
        if (arrby == null) {
            return null;
        }
        return (byte[])arrby.clone();
    }

    public static double[] a(double[] arrd) {
        if (arrd == null) {
            return null;
        }
        return (double[])arrd.clone();
    }

    public static float[] a(float[] arrf) {
        if (arrf == null) {
            return null;
        }
        return (float[])arrf.clone();
    }

    public static boolean[] a(boolean[] arrbl) {
        if (arrbl == null) {
            return null;
        }
        return (boolean[])arrbl.clone();
    }

    public static Object[] d(Object[] arrobject) {
        if (arrobject == null || arrobject.length == 0) {
            return a;
        }
        return arrobject;
    }

    public static Class[] a(Class[] arrclass) {
        if (arrclass == null || arrclass.length == 0) {
            return b;
        }
        return arrclass;
    }

    public static String[] a(String[] arrstring) {
        if (arrstring == null || arrstring.length == 0) {
            return c;
        }
        return arrstring;
    }

    public static long[] b(long[] arrl) {
        if (arrl == null || arrl.length == 0) {
            return d;
        }
        return arrl;
    }

    public static int[] b(int[] arrn) {
        if (arrn == null || arrn.length == 0) {
            return f;
        }
        return arrn;
    }

    public static short[] b(short[] arrs) {
        if (arrs == null || arrs.length == 0) {
            return h;
        }
        return arrs;
    }

    public static char[] b(char[] arrc) {
        if (arrc == null || arrc.length == 0) {
            return r;
        }
        return arrc;
    }

    public static byte[] b(byte[] arrby) {
        if (arrby == null || arrby.length == 0) {
            return j;
        }
        return arrby;
    }

    public static double[] b(double[] arrd) {
        if (arrd == null || arrd.length == 0) {
            return l;
        }
        return arrd;
    }

    public static float[] b(float[] arrf) {
        if (arrf == null || arrf.length == 0) {
            return n;
        }
        return arrf;
    }

    public static boolean[] b(boolean[] arrbl) {
        if (arrbl == null || arrbl.length == 0) {
            return p;
        }
        return arrbl;
    }

    public static Long[] a(Long[] arrlong) {
        if (arrlong == null || arrlong.length == 0) {
            return e;
        }
        return arrlong;
    }

    public static Integer[] a(Integer[] arrinteger) {
        if (arrinteger == null || arrinteger.length == 0) {
            return g;
        }
        return arrinteger;
    }

    public static Short[] a(Short[] arrshort) {
        if (arrshort == null || arrshort.length == 0) {
            return i;
        }
        return arrshort;
    }

    public static Character[] a(Character[] arrcharacter) {
        if (arrcharacter == null || arrcharacter.length == 0) {
            return s;
        }
        return arrcharacter;
    }

    public static Byte[] a(Byte[] arrbyte) {
        if (arrbyte == null || arrbyte.length == 0) {
            return k;
        }
        return arrbyte;
    }

    public static Double[] a(Double[] arrdouble) {
        if (arrdouble == null || arrdouble.length == 0) {
            return m;
        }
        return arrdouble;
    }

    public static Float[] a(Float[] arrfloat) {
        if (arrfloat == null || arrfloat.length == 0) {
            return o;
        }
        return arrfloat;
    }

    public static Boolean[] a(Boolean[] arrboolean) {
        if (arrboolean == null || arrboolean.length == 0) {
            return q;
        }
        return arrboolean;
    }

    public static Object[] a(Object[] arrobject, int n2, int n3) {
        if (arrobject == null) {
            return null;
        }
        if (n2 < 0) {
            n2 = 0;
        }
        if (n3 > arrobject.length) {
            n3 = arrobject.length;
        }
        int n4 = n3 - n2;
        Class<?> class_ = arrobject.getClass().getComponentType();
        if (n4 <= 0) {
            Object[] arrobject2 = (Object[])Array.newInstance(class_, 0);
            return arrobject2;
        }
        Object[] arrobject3 = (Object[])Array.newInstance(class_, n4);
        System.arraycopy(arrobject, n2, arrobject3, 0, n4);
        return arrobject3;
    }

    public static long[] a(long[] arrl, int n2, int n3) {
        int n4;
        if (arrl == null) {
            return null;
        }
        if (n2 < 0) {
            n2 = 0;
        }
        if (n3 > arrl.length) {
            n3 = arrl.length;
        }
        if ((n4 = n3 - n2) <= 0) {
            return d;
        }
        long[] arrl2 = new long[n4];
        System.arraycopy(arrl, n2, arrl2, 0, n4);
        return arrl2;
    }

    public static int[] a(int[] arrn, int n2, int n3) {
        int n4;
        if (arrn == null) {
            return null;
        }
        if (n2 < 0) {
            n2 = 0;
        }
        if (n3 > arrn.length) {
            n3 = arrn.length;
        }
        if ((n4 = n3 - n2) <= 0) {
            return f;
        }
        int[] arrn2 = new int[n4];
        System.arraycopy(arrn, n2, arrn2, 0, n4);
        return arrn2;
    }

    public static short[] a(short[] arrs, int n2, int n3) {
        int n4;
        if (arrs == null) {
            return null;
        }
        if (n2 < 0) {
            n2 = 0;
        }
        if (n3 > arrs.length) {
            n3 = arrs.length;
        }
        if ((n4 = n3 - n2) <= 0) {
            return h;
        }
        short[] arrs2 = new short[n4];
        System.arraycopy(arrs, n2, arrs2, 0, n4);
        return arrs2;
    }

    public static char[] a(char[] arrc, int n2, int n3) {
        int n4;
        if (arrc == null) {
            return null;
        }
        if (n2 < 0) {
            n2 = 0;
        }
        if (n3 > arrc.length) {
            n3 = arrc.length;
        }
        if ((n4 = n3 - n2) <= 0) {
            return r;
        }
        char[] arrc2 = new char[n4];
        System.arraycopy(arrc, n2, arrc2, 0, n4);
        return arrc2;
    }

    public static byte[] a(byte[] arrby, int n2, int n3) {
        int n4;
        if (arrby == null) {
            return null;
        }
        if (n2 < 0) {
            n2 = 0;
        }
        if (n3 > arrby.length) {
            n3 = arrby.length;
        }
        if ((n4 = n3 - n2) <= 0) {
            return j;
        }
        byte[] arrby2 = new byte[n4];
        System.arraycopy(arrby, n2, arrby2, 0, n4);
        return arrby2;
    }

    public static double[] a(double[] arrd, int n2, int n3) {
        int n4;
        if (arrd == null) {
            return null;
        }
        if (n2 < 0) {
            n2 = 0;
        }
        if (n3 > arrd.length) {
            n3 = arrd.length;
        }
        if ((n4 = n3 - n2) <= 0) {
            return l;
        }
        double[] arrd2 = new double[n4];
        System.arraycopy(arrd, n2, arrd2, 0, n4);
        return arrd2;
    }

    public static float[] a(float[] arrf, int n2, int n3) {
        int n4;
        if (arrf == null) {
            return null;
        }
        if (n2 < 0) {
            n2 = 0;
        }
        if (n3 > arrf.length) {
            n3 = arrf.length;
        }
        if ((n4 = n3 - n2) <= 0) {
            return n;
        }
        float[] arrf2 = new float[n4];
        System.arraycopy(arrf, n2, arrf2, 0, n4);
        return arrf2;
    }

    public static boolean[] a(boolean[] arrbl, int n2, int n3) {
        int n4;
        if (arrbl == null) {
            return null;
        }
        if (n2 < 0) {
            n2 = 0;
        }
        if (n3 > arrbl.length) {
            n3 = arrbl.length;
        }
        if ((n4 = n3 - n2) <= 0) {
            return p;
        }
        boolean[] arrbl2 = new boolean[n4];
        System.arraycopy(arrbl, n2, arrbl2, 0, n4);
        return arrbl2;
    }

    public static boolean a(Object[] arrobject, Object[] arrobject2) {
        return !(arrobject == null && arrobject2 != null && arrobject2.length > 0 || arrobject2 == null && arrobject != null && arrobject.length > 0) && (arrobject == null || arrobject2 == null || arrobject.length == arrobject2.length);
    }

    public static boolean a(long[] arrl, long[] arrl2) {
        return !(arrl == null && arrl2 != null && arrl2.length > 0 || arrl2 == null && arrl != null && arrl.length > 0) && (arrl == null || arrl2 == null || arrl.length == arrl2.length);
    }

    public static boolean a(int[] arrn, int[] arrn2) {
        return !(arrn == null && arrn2 != null && arrn2.length > 0 || arrn2 == null && arrn != null && arrn.length > 0) && (arrn == null || arrn2 == null || arrn.length == arrn2.length);
    }

    public static boolean a(short[] arrs, short[] arrs2) {
        return !(arrs == null && arrs2 != null && arrs2.length > 0 || arrs2 == null && arrs != null && arrs.length > 0) && (arrs == null || arrs2 == null || arrs.length == arrs2.length);
    }

    public static boolean a(char[] arrc, char[] arrc2) {
        return !(arrc == null && arrc2 != null && arrc2.length > 0 || arrc2 == null && arrc != null && arrc.length > 0) && (arrc == null || arrc2 == null || arrc.length == arrc2.length);
    }

    public static boolean a(byte[] arrby, byte[] arrby2) {
        return !(arrby == null && arrby2 != null && arrby2.length > 0 || arrby2 == null && arrby != null && arrby.length > 0) && (arrby == null || arrby2 == null || arrby.length == arrby2.length);
    }

    public static boolean a(double[] arrd, double[] arrd2) {
        return !(arrd == null && arrd2 != null && arrd2.length > 0 || arrd2 == null && arrd != null && arrd.length > 0) && (arrd == null || arrd2 == null || arrd.length == arrd2.length);
    }

    public static boolean a(float[] arrf, float[] arrf2) {
        return !(arrf == null && arrf2 != null && arrf2.length > 0 || arrf2 == null && arrf != null && arrf.length > 0) && (arrf == null || arrf2 == null || arrf.length == arrf2.length);
    }

    public static boolean a(boolean[] arrbl, boolean[] arrbl2) {
        return !(arrbl == null && arrbl2 != null && arrbl2.length > 0 || arrbl2 == null && arrbl != null && arrbl.length > 0) && (arrbl == null || arrbl2 == null || arrbl.length == arrbl2.length);
    }

    public static int c(Object object) {
        if (object == null) {
            return 0;
        }
        return Array.getLength(object);
    }

    public static boolean b(Object object, Object object2) {
        if (object == null || object2 == null) {
            throw new IllegalArgumentException("The Array must not be null");
        }
        return object.getClass().getName().equals(object2.getClass().getName());
    }

    public static void e(Object[] arrobject) {
        if (arrobject == null) {
            return;
        }
        org.apache.commons.c.c.b(arrobject, 0, arrobject.length);
    }

    public static void c(long[] arrl) {
        if (arrl == null) {
            return;
        }
        org.apache.commons.c.c.b(arrl, 0, arrl.length);
    }

    public static void c(int[] arrn) {
        if (arrn == null) {
            return;
        }
        org.apache.commons.c.c.b(arrn, 0, arrn.length);
    }

    public static void c(short[] arrs) {
        if (arrs == null) {
            return;
        }
        org.apache.commons.c.c.b(arrs, 0, arrs.length);
    }

    public static void c(char[] arrc) {
        if (arrc == null) {
            return;
        }
        org.apache.commons.c.c.b(arrc, 0, arrc.length);
    }

    public static void c(byte[] arrby) {
        if (arrby == null) {
            return;
        }
        org.apache.commons.c.c.b(arrby, 0, arrby.length);
    }

    public static void c(double[] arrd) {
        if (arrd == null) {
            return;
        }
        org.apache.commons.c.c.b(arrd, 0, arrd.length);
    }

    public static void c(float[] arrf) {
        if (arrf == null) {
            return;
        }
        org.apache.commons.c.c.b(arrf, 0, arrf.length);
    }

    public static void c(boolean[] arrbl) {
        if (arrbl == null) {
            return;
        }
        org.apache.commons.c.c.b(arrbl, 0, arrbl.length);
    }

    public static void b(boolean[] arrbl, int n2, int n3) {
        if (arrbl == null) {
            return;
        }
        int n4 = n2 < 0 ? 0 : n2;
        for (int i2 = Math.min(arrbl.length, n3) - 1; i2 > n4; --i2, ++n4) {
            boolean bl2 = arrbl[i2];
            arrbl[i2] = arrbl[n4];
            arrbl[n4] = bl2;
        }
    }

    public static void b(byte[] arrby, int n2, int n3) {
        if (arrby == null) {
            return;
        }
        int n4 = n2 < 0 ? 0 : n2;
        for (int i2 = Math.min(arrby.length, n3) - 1; i2 > n4; --i2, ++n4) {
            byte by2 = arrby[i2];
            arrby[i2] = arrby[n4];
            arrby[n4] = by2;
        }
    }

    public static void b(char[] arrc, int n2, int n3) {
        if (arrc == null) {
            return;
        }
        int n4 = n2 < 0 ? 0 : n2;
        for (int i2 = Math.min(arrc.length, n3) - 1; i2 > n4; --i2, ++n4) {
            char c2 = arrc[i2];
            arrc[i2] = arrc[n4];
            arrc[n4] = c2;
        }
    }

    public static void b(double[] arrd, int n2, int n3) {
        if (arrd == null) {
            return;
        }
        int n4 = n2 < 0 ? 0 : n2;
        for (int i2 = Math.min(arrd.length, n3) - 1; i2 > n4; --i2, ++n4) {
            double d2 = arrd[i2];
            arrd[i2] = arrd[n4];
            arrd[n4] = d2;
        }
    }

    public static void b(float[] arrf, int n2, int n3) {
        if (arrf == null) {
            return;
        }
        int n4 = n2 < 0 ? 0 : n2;
        for (int i2 = Math.min(arrf.length, n3) - 1; i2 > n4; --i2, ++n4) {
            float f2 = arrf[i2];
            arrf[i2] = arrf[n4];
            arrf[n4] = f2;
        }
    }

    public static void b(int[] arrn, int n2, int n3) {
        if (arrn == null) {
            return;
        }
        int n4 = n2 < 0 ? 0 : n2;
        for (int i2 = Math.min(arrn.length, n3) - 1; i2 > n4; --i2, ++n4) {
            int n5 = arrn[i2];
            arrn[i2] = arrn[n4];
            arrn[n4] = n5;
        }
    }

    public static void b(long[] arrl, int n2, int n3) {
        if (arrl == null) {
            return;
        }
        int n4 = n2 < 0 ? 0 : n2;
        for (int i2 = Math.min(arrl.length, n3) - 1; i2 > n4; --i2, ++n4) {
            long l2 = arrl[i2];
            arrl[i2] = arrl[n4];
            arrl[n4] = l2;
        }
    }

    public static void b(Object[] arrobject, int n2, int n3) {
        if (arrobject == null) {
            return;
        }
        int n4 = n2 < 0 ? 0 : n2;
        for (int i2 = Math.min(arrobject.length, n3) - 1; i2 > n4; --i2, ++n4) {
            Object object = arrobject[i2];
            arrobject[i2] = arrobject[n4];
            arrobject[n4] = object;
        }
    }

    public static void b(short[] arrs, int n2, int n3) {
        if (arrs == null) {
            return;
        }
        int n4 = n2 < 0 ? 0 : n2;
        for (int i2 = Math.min(arrs.length, n3) - 1; i2 > n4; --i2, ++n4) {
            short s2 = arrs[i2];
            arrs[i2] = arrs[n4];
            arrs[n4] = s2;
        }
    }

    public static int a(Object[] arrobject, Object object) {
        return org.apache.commons.c.c.a(arrobject, object, 0);
    }

    public static int a(Object[] arrobject, Object object, int n2) {
        block5: {
            block4: {
                if (arrobject == null) {
                    return -1;
                }
                if (n2 < 0) {
                    n2 = 0;
                }
                if (object != null) break block4;
                for (int i2 = n2; i2 < arrobject.length; ++i2) {
                    if (arrobject[i2] != null) continue;
                    return i2;
                }
                break block5;
            }
            if (!arrobject.getClass().getComponentType().isInstance(object)) break block5;
            for (int i3 = n2; i3 < arrobject.length; ++i3) {
                if (!object.equals(arrobject[i3])) continue;
                return i3;
            }
        }
        return -1;
    }

    public static int b(Object[] arrobject, Object object) {
        return org.apache.commons.c.c.b(arrobject, object, Integer.MAX_VALUE);
    }

    public static int b(Object[] arrobject, Object object, int n2) {
        block6: {
            block5: {
                if (arrobject == null) {
                    return -1;
                }
                if (n2 < 0) {
                    return -1;
                }
                if (n2 >= arrobject.length) {
                    n2 = arrobject.length - 1;
                }
                if (object != null) break block5;
                for (int i2 = n2; i2 >= 0; --i2) {
                    if (arrobject[i2] != null) continue;
                    return i2;
                }
                break block6;
            }
            if (!arrobject.getClass().getComponentType().isInstance(object)) break block6;
            for (int i3 = n2; i3 >= 0; --i3) {
                if (!object.equals(arrobject[i3])) continue;
                return i3;
            }
        }
        return -1;
    }

    public static boolean c(Object[] arrobject, Object object) {
        return org.apache.commons.c.c.a(arrobject, object) != -1;
    }

    public static int a(long[] arrl, long l2) {
        return org.apache.commons.c.c.a(arrl, l2, 0);
    }

    public static int a(long[] arrl, long l2, int n2) {
        if (arrl == null) {
            return -1;
        }
        if (n2 < 0) {
            n2 = 0;
        }
        for (int i2 = n2; i2 < arrl.length; ++i2) {
            if (l2 != arrl[i2]) continue;
            return i2;
        }
        return -1;
    }

    public static int b(long[] arrl, long l2) {
        return org.apache.commons.c.c.b(arrl, l2, Integer.MAX_VALUE);
    }

    public static int b(long[] arrl, long l2, int n2) {
        if (arrl == null) {
            return -1;
        }
        if (n2 < 0) {
            return -1;
        }
        if (n2 >= arrl.length) {
            n2 = arrl.length - 1;
        }
        for (int i2 = n2; i2 >= 0; --i2) {
            if (l2 != arrl[i2]) continue;
            return i2;
        }
        return -1;
    }

    public static boolean c(long[] arrl, long l2) {
        return org.apache.commons.c.c.a(arrl, l2) != -1;
    }

    public static int a(int[] arrn, int n2) {
        return org.apache.commons.c.c.c(arrn, n2, 0);
    }

    public static int c(int[] arrn, int n2, int n3) {
        if (arrn == null) {
            return -1;
        }
        if (n3 < 0) {
            n3 = 0;
        }
        for (int i2 = n3; i2 < arrn.length; ++i2) {
            if (n2 != arrn[i2]) continue;
            return i2;
        }
        return -1;
    }

    public static int b(int[] arrn, int n2) {
        return org.apache.commons.c.c.d(arrn, n2, Integer.MAX_VALUE);
    }

    public static int d(int[] arrn, int n2, int n3) {
        if (arrn == null) {
            return -1;
        }
        if (n3 < 0) {
            return -1;
        }
        if (n3 >= arrn.length) {
            n3 = arrn.length - 1;
        }
        for (int i2 = n3; i2 >= 0; --i2) {
            if (n2 != arrn[i2]) continue;
            return i2;
        }
        return -1;
    }

    public static boolean c(int[] arrn, int n2) {
        return org.apache.commons.c.c.a(arrn, n2) != -1;
    }

    public static int a(short[] arrs, short s2) {
        return org.apache.commons.c.c.a(arrs, s2, 0);
    }

    public static int a(short[] arrs, short s2, int n2) {
        if (arrs == null) {
            return -1;
        }
        if (n2 < 0) {
            n2 = 0;
        }
        for (int i2 = n2; i2 < arrs.length; ++i2) {
            if (s2 != arrs[i2]) continue;
            return i2;
        }
        return -1;
    }

    public static int b(short[] arrs, short s2) {
        return org.apache.commons.c.c.b(arrs, s2, Integer.MAX_VALUE);
    }

    public static int b(short[] arrs, short s2, int n2) {
        if (arrs == null) {
            return -1;
        }
        if (n2 < 0) {
            return -1;
        }
        if (n2 >= arrs.length) {
            n2 = arrs.length - 1;
        }
        for (int i2 = n2; i2 >= 0; --i2) {
            if (s2 != arrs[i2]) continue;
            return i2;
        }
        return -1;
    }

    public static boolean c(short[] arrs, short s2) {
        return org.apache.commons.c.c.a(arrs, s2) != -1;
    }

    public static int a(char[] arrc, char c2) {
        return org.apache.commons.c.c.a(arrc, c2, 0);
    }

    public static int a(char[] arrc, char c2, int n2) {
        if (arrc == null) {
            return -1;
        }
        if (n2 < 0) {
            n2 = 0;
        }
        for (int i2 = n2; i2 < arrc.length; ++i2) {
            if (c2 != arrc[i2]) continue;
            return i2;
        }
        return -1;
    }

    public static int b(char[] arrc, char c2) {
        return org.apache.commons.c.c.b(arrc, c2, Integer.MAX_VALUE);
    }

    public static int b(char[] arrc, char c2, int n2) {
        if (arrc == null) {
            return -1;
        }
        if (n2 < 0) {
            return -1;
        }
        if (n2 >= arrc.length) {
            n2 = arrc.length - 1;
        }
        for (int i2 = n2; i2 >= 0; --i2) {
            if (c2 != arrc[i2]) continue;
            return i2;
        }
        return -1;
    }

    public static boolean c(char[] arrc, char c2) {
        return org.apache.commons.c.c.a(arrc, c2) != -1;
    }

    public static int a(byte[] arrby, byte by2) {
        return org.apache.commons.c.c.a(arrby, by2, 0);
    }

    public static int a(byte[] arrby, byte by2, int n2) {
        if (arrby == null) {
            return -1;
        }
        if (n2 < 0) {
            n2 = 0;
        }
        for (int i2 = n2; i2 < arrby.length; ++i2) {
            if (by2 != arrby[i2]) continue;
            return i2;
        }
        return -1;
    }

    public static int b(byte[] arrby, byte by2) {
        return org.apache.commons.c.c.b(arrby, by2, Integer.MAX_VALUE);
    }

    public static int b(byte[] arrby, byte by2, int n2) {
        if (arrby == null) {
            return -1;
        }
        if (n2 < 0) {
            return -1;
        }
        if (n2 >= arrby.length) {
            n2 = arrby.length - 1;
        }
        for (int i2 = n2; i2 >= 0; --i2) {
            if (by2 != arrby[i2]) continue;
            return i2;
        }
        return -1;
    }

    public static boolean c(byte[] arrby, byte by2) {
        return org.apache.commons.c.c.a(arrby, by2) != -1;
    }

    public static int a(double[] arrd, double d2) {
        return org.apache.commons.c.c.a(arrd, d2, 0);
    }

    public static int a(double[] arrd, double d2, double d3) {
        return org.apache.commons.c.c.a(arrd, d2, 0, d3);
    }

    public static int a(double[] arrd, double d2, int n2) {
        if (org.apache.commons.c.c.e(arrd)) {
            return -1;
        }
        if (n2 < 0) {
            n2 = 0;
        }
        for (int i2 = n2; i2 < arrd.length; ++i2) {
            if (d2 != arrd[i2]) continue;
            return i2;
        }
        return -1;
    }

    public static int a(double[] arrd, double d2, int n2, double d3) {
        if (org.apache.commons.c.c.e(arrd)) {
            return -1;
        }
        if (n2 < 0) {
            n2 = 0;
        }
        double d4 = d2 - d3;
        double d5 = d2 + d3;
        for (int i2 = n2; i2 < arrd.length; ++i2) {
            if (!(arrd[i2] >= d4) || !(arrd[i2] <= d5)) continue;
            return i2;
        }
        return -1;
    }

    public static int b(double[] arrd, double d2) {
        return org.apache.commons.c.c.b(arrd, d2, Integer.MAX_VALUE);
    }

    public static int b(double[] arrd, double d2, double d3) {
        return org.apache.commons.c.c.b(arrd, d2, Integer.MAX_VALUE, d3);
    }

    public static int b(double[] arrd, double d2, int n2) {
        if (org.apache.commons.c.c.e(arrd)) {
            return -1;
        }
        if (n2 < 0) {
            return -1;
        }
        if (n2 >= arrd.length) {
            n2 = arrd.length - 1;
        }
        for (int i2 = n2; i2 >= 0; --i2) {
            if (d2 != arrd[i2]) continue;
            return i2;
        }
        return -1;
    }

    public static int b(double[] arrd, double d2, int n2, double d3) {
        if (org.apache.commons.c.c.e(arrd)) {
            return -1;
        }
        if (n2 < 0) {
            return -1;
        }
        if (n2 >= arrd.length) {
            n2 = arrd.length - 1;
        }
        double d4 = d2 - d3;
        double d5 = d2 + d3;
        for (int i2 = n2; i2 >= 0; --i2) {
            if (!(arrd[i2] >= d4) || !(arrd[i2] <= d5)) continue;
            return i2;
        }
        return -1;
    }

    public static boolean c(double[] arrd, double d2) {
        return org.apache.commons.c.c.a(arrd, d2) != -1;
    }

    public static boolean c(double[] arrd, double d2, double d3) {
        return org.apache.commons.c.c.a(arrd, d2, 0, d3) != -1;
    }

    public static int a(float[] arrf, float f2) {
        return org.apache.commons.c.c.a(arrf, f2, 0);
    }

    public static int a(float[] arrf, float f2, int n2) {
        if (org.apache.commons.c.c.e(arrf)) {
            return -1;
        }
        if (n2 < 0) {
            n2 = 0;
        }
        for (int i2 = n2; i2 < arrf.length; ++i2) {
            if (f2 != arrf[i2]) continue;
            return i2;
        }
        return -1;
    }

    public static int b(float[] arrf, float f2) {
        return org.apache.commons.c.c.b(arrf, f2, Integer.MAX_VALUE);
    }

    public static int b(float[] arrf, float f2, int n2) {
        if (org.apache.commons.c.c.e(arrf)) {
            return -1;
        }
        if (n2 < 0) {
            return -1;
        }
        if (n2 >= arrf.length) {
            n2 = arrf.length - 1;
        }
        for (int i2 = n2; i2 >= 0; --i2) {
            if (f2 != arrf[i2]) continue;
            return i2;
        }
        return -1;
    }

    public static boolean c(float[] arrf, float f2) {
        return org.apache.commons.c.c.a(arrf, f2) != -1;
    }

    public static int a(boolean[] arrbl, boolean bl2) {
        return org.apache.commons.c.c.a(arrbl, bl2, 0);
    }

    public static int a(boolean[] arrbl, boolean bl2, int n2) {
        if (org.apache.commons.c.c.e(arrbl)) {
            return -1;
        }
        if (n2 < 0) {
            n2 = 0;
        }
        for (int i2 = n2; i2 < arrbl.length; ++i2) {
            if (bl2 != arrbl[i2]) continue;
            return i2;
        }
        return -1;
    }

    public static int b(boolean[] arrbl, boolean bl2) {
        return org.apache.commons.c.c.b(arrbl, bl2, Integer.MAX_VALUE);
    }

    public static int b(boolean[] arrbl, boolean bl2, int n2) {
        if (org.apache.commons.c.c.e(arrbl)) {
            return -1;
        }
        if (n2 < 0) {
            return -1;
        }
        if (n2 >= arrbl.length) {
            n2 = arrbl.length - 1;
        }
        for (int i2 = n2; i2 >= 0; --i2) {
            if (bl2 != arrbl[i2]) continue;
            return i2;
        }
        return -1;
    }

    public static boolean c(boolean[] arrbl, boolean bl2) {
        return org.apache.commons.c.c.a(arrbl, bl2) != -1;
    }

    public static char[] b(Character[] arrcharacter) {
        if (arrcharacter == null) {
            return null;
        }
        if (arrcharacter.length == 0) {
            return r;
        }
        char[] arrc = new char[arrcharacter.length];
        for (int i2 = 0; i2 < arrcharacter.length; ++i2) {
            arrc[i2] = arrcharacter[i2].charValue();
        }
        return arrc;
    }

    public static char[] a(Character[] arrcharacter, char c2) {
        if (arrcharacter == null) {
            return null;
        }
        if (arrcharacter.length == 0) {
            return r;
        }
        char[] arrc = new char[arrcharacter.length];
        for (int i2 = 0; i2 < arrcharacter.length; ++i2) {
            Character c3 = arrcharacter[i2];
            arrc[i2] = c3 == null ? c2 : c3.charValue();
        }
        return arrc;
    }

    public static Character[] d(char[] arrc) {
        if (arrc == null) {
            return null;
        }
        if (arrc.length == 0) {
            return s;
        }
        Character[] arrcharacter = new Character[arrc.length];
        for (int i2 = 0; i2 < arrc.length; ++i2) {
            arrcharacter[i2] = Character.valueOf(arrc[i2]);
        }
        return arrcharacter;
    }

    public static long[] b(Long[] arrlong) {
        if (arrlong == null) {
            return null;
        }
        if (arrlong.length == 0) {
            return d;
        }
        long[] arrl = new long[arrlong.length];
        for (int i2 = 0; i2 < arrlong.length; ++i2) {
            arrl[i2] = arrlong[i2];
        }
        return arrl;
    }

    public static long[] a(Long[] arrlong, long l2) {
        if (arrlong == null) {
            return null;
        }
        if (arrlong.length == 0) {
            return d;
        }
        long[] arrl = new long[arrlong.length];
        for (int i2 = 0; i2 < arrlong.length; ++i2) {
            Long l3 = arrlong[i2];
            arrl[i2] = l3 == null ? l2 : l3;
        }
        return arrl;
    }

    public static Long[] d(long[] arrl) {
        if (arrl == null) {
            return null;
        }
        if (arrl.length == 0) {
            return e;
        }
        Long[] arrlong = new Long[arrl.length];
        for (int i2 = 0; i2 < arrl.length; ++i2) {
            arrlong[i2] = arrl[i2];
        }
        return arrlong;
    }

    public static int[] b(Integer[] arrinteger) {
        if (arrinteger == null) {
            return null;
        }
        if (arrinteger.length == 0) {
            return f;
        }
        int[] arrn = new int[arrinteger.length];
        for (int i2 = 0; i2 < arrinteger.length; ++i2) {
            arrn[i2] = arrinteger[i2];
        }
        return arrn;
    }

    public static int[] a(Integer[] arrinteger, int n2) {
        if (arrinteger == null) {
            return null;
        }
        if (arrinteger.length == 0) {
            return f;
        }
        int[] arrn = new int[arrinteger.length];
        for (int i2 = 0; i2 < arrinteger.length; ++i2) {
            Integer n3 = arrinteger[i2];
            arrn[i2] = n3 == null ? n2 : n3;
        }
        return arrn;
    }

    public static Integer[] d(int[] arrn) {
        if (arrn == null) {
            return null;
        }
        if (arrn.length == 0) {
            return g;
        }
        Integer[] arrinteger = new Integer[arrn.length];
        for (int i2 = 0; i2 < arrn.length; ++i2) {
            arrinteger[i2] = arrn[i2];
        }
        return arrinteger;
    }

    public static short[] b(Short[] arrshort) {
        if (arrshort == null) {
            return null;
        }
        if (arrshort.length == 0) {
            return h;
        }
        short[] arrs = new short[arrshort.length];
        for (int i2 = 0; i2 < arrshort.length; ++i2) {
            arrs[i2] = arrshort[i2];
        }
        return arrs;
    }

    public static short[] a(Short[] arrshort, short s2) {
        if (arrshort == null) {
            return null;
        }
        if (arrshort.length == 0) {
            return h;
        }
        short[] arrs = new short[arrshort.length];
        for (int i2 = 0; i2 < arrshort.length; ++i2) {
            Short s3 = arrshort[i2];
            arrs[i2] = s3 == null ? s2 : s3;
        }
        return arrs;
    }

    public static Short[] d(short[] arrs) {
        if (arrs == null) {
            return null;
        }
        if (arrs.length == 0) {
            return i;
        }
        Short[] arrshort = new Short[arrs.length];
        for (int i2 = 0; i2 < arrs.length; ++i2) {
            arrshort[i2] = arrs[i2];
        }
        return arrshort;
    }

    public static byte[] b(Byte[] arrbyte) {
        if (arrbyte == null) {
            return null;
        }
        if (arrbyte.length == 0) {
            return j;
        }
        byte[] arrby = new byte[arrbyte.length];
        for (int i2 = 0; i2 < arrbyte.length; ++i2) {
            arrby[i2] = arrbyte[i2];
        }
        return arrby;
    }

    public static byte[] a(Byte[] arrbyte, byte by2) {
        if (arrbyte == null) {
            return null;
        }
        if (arrbyte.length == 0) {
            return j;
        }
        byte[] arrby = new byte[arrbyte.length];
        for (int i2 = 0; i2 < arrbyte.length; ++i2) {
            Byte by3 = arrbyte[i2];
            arrby[i2] = by3 == null ? by2 : by3;
        }
        return arrby;
    }

    public static Byte[] d(byte[] arrby) {
        if (arrby == null) {
            return null;
        }
        if (arrby.length == 0) {
            return k;
        }
        Byte[] arrbyte = new Byte[arrby.length];
        for (int i2 = 0; i2 < arrby.length; ++i2) {
            arrbyte[i2] = arrby[i2];
        }
        return arrbyte;
    }

    public static double[] b(Double[] arrdouble) {
        if (arrdouble == null) {
            return null;
        }
        if (arrdouble.length == 0) {
            return l;
        }
        double[] arrd = new double[arrdouble.length];
        for (int i2 = 0; i2 < arrdouble.length; ++i2) {
            arrd[i2] = arrdouble[i2];
        }
        return arrd;
    }

    public static double[] a(Double[] arrdouble, double d2) {
        if (arrdouble == null) {
            return null;
        }
        if (arrdouble.length == 0) {
            return l;
        }
        double[] arrd = new double[arrdouble.length];
        for (int i2 = 0; i2 < arrdouble.length; ++i2) {
            Double d3 = arrdouble[i2];
            arrd[i2] = d3 == null ? d2 : d3;
        }
        return arrd;
    }

    public static Double[] d(double[] arrd) {
        if (arrd == null) {
            return null;
        }
        if (arrd.length == 0) {
            return m;
        }
        Double[] arrdouble = new Double[arrd.length];
        for (int i2 = 0; i2 < arrd.length; ++i2) {
            arrdouble[i2] = arrd[i2];
        }
        return arrdouble;
    }

    public static float[] b(Float[] arrfloat) {
        if (arrfloat == null) {
            return null;
        }
        if (arrfloat.length == 0) {
            return n;
        }
        float[] arrf = new float[arrfloat.length];
        for (int i2 = 0; i2 < arrfloat.length; ++i2) {
            arrf[i2] = arrfloat[i2].floatValue();
        }
        return arrf;
    }

    public static float[] a(Float[] arrfloat, float f2) {
        if (arrfloat == null) {
            return null;
        }
        if (arrfloat.length == 0) {
            return n;
        }
        float[] arrf = new float[arrfloat.length];
        for (int i2 = 0; i2 < arrfloat.length; ++i2) {
            Float f3 = arrfloat[i2];
            arrf[i2] = f3 == null ? f2 : f3.floatValue();
        }
        return arrf;
    }

    public static Float[] d(float[] arrf) {
        if (arrf == null) {
            return null;
        }
        if (arrf.length == 0) {
            return o;
        }
        Float[] arrfloat = new Float[arrf.length];
        for (int i2 = 0; i2 < arrf.length; ++i2) {
            arrfloat[i2] = Float.valueOf(arrf[i2]);
        }
        return arrfloat;
    }

    public static boolean[] b(Boolean[] arrboolean) {
        if (arrboolean == null) {
            return null;
        }
        if (arrboolean.length == 0) {
            return p;
        }
        boolean[] arrbl = new boolean[arrboolean.length];
        for (int i2 = 0; i2 < arrboolean.length; ++i2) {
            arrbl[i2] = arrboolean[i2];
        }
        return arrbl;
    }

    public static boolean[] a(Boolean[] arrboolean, boolean bl2) {
        if (arrboolean == null) {
            return null;
        }
        if (arrboolean.length == 0) {
            return p;
        }
        boolean[] arrbl = new boolean[arrboolean.length];
        for (int i2 = 0; i2 < arrboolean.length; ++i2) {
            Boolean bl3 = arrboolean[i2];
            arrbl[i2] = bl3 == null ? bl2 : bl3;
        }
        return arrbl;
    }

    public static Boolean[] d(boolean[] arrbl) {
        if (arrbl == null) {
            return null;
        }
        if (arrbl.length == 0) {
            return q;
        }
        Boolean[] arrboolean = new Boolean[arrbl.length];
        for (int i2 = 0; i2 < arrbl.length; ++i2) {
            arrboolean[i2] = arrbl[i2] ? Boolean.TRUE : Boolean.FALSE;
        }
        return arrboolean;
    }

    public static boolean f(Object[] arrobject) {
        return arrobject == null || arrobject.length == 0;
    }

    public static boolean e(long[] arrl) {
        return arrl == null || arrl.length == 0;
    }

    public static boolean e(int[] arrn) {
        return arrn == null || arrn.length == 0;
    }

    public static boolean e(short[] arrs) {
        return arrs == null || arrs.length == 0;
    }

    public static boolean e(char[] arrc) {
        return arrc == null || arrc.length == 0;
    }

    public static boolean e(byte[] arrby) {
        return arrby == null || arrby.length == 0;
    }

    public static boolean e(double[] arrd) {
        return arrd == null || arrd.length == 0;
    }

    public static boolean e(float[] arrf) {
        return arrf == null || arrf.length == 0;
    }

    public static boolean e(boolean[] arrbl) {
        return arrbl == null || arrbl.length == 0;
    }

    public static boolean g(Object[] arrobject) {
        return arrobject != null && arrobject.length != 0;
    }

    public static boolean f(long[] arrl) {
        return arrl != null && arrl.length != 0;
    }

    public static boolean f(int[] arrn) {
        return arrn != null && arrn.length != 0;
    }

    public static boolean f(short[] arrs) {
        return arrs != null && arrs.length != 0;
    }

    public static boolean f(char[] arrc) {
        return arrc != null && arrc.length != 0;
    }

    public static boolean f(byte[] arrby) {
        return arrby != null && arrby.length != 0;
    }

    public static boolean f(double[] arrd) {
        return arrd != null && arrd.length != 0;
    }

    public static boolean f(float[] arrf) {
        return arrf != null && arrf.length != 0;
    }

    public static boolean f(boolean[] arrbl) {
        return arrbl != null && arrbl.length != 0;
    }

    public static Object[] b(Object[] arrobject, Object ... arrobject2) {
        if (arrobject == null) {
            return org.apache.commons.c.c.c(arrobject2);
        }
        if (arrobject2 == null) {
            return org.apache.commons.c.c.c(arrobject);
        }
        Class<?> class_ = arrobject.getClass().getComponentType();
        Object[] arrobject3 = (Object[])Array.newInstance(class_, arrobject.length + arrobject2.length);
        System.arraycopy(arrobject, 0, arrobject3, 0, arrobject.length);
        try {
            System.arraycopy(arrobject2, 0, arrobject3, arrobject.length, arrobject2.length);
        }
        catch (ArrayStoreException arrayStoreException) {
            Class<?> class_2 = arrobject2.getClass().getComponentType();
            if (!class_.isAssignableFrom(class_2)) {
                throw new IllegalArgumentException("Cannot store " + class_2.getName() + " in an array of " + class_.getName(), arrayStoreException);
            }
            throw arrayStoreException;
        }
        return arrobject3;
    }

    public static boolean[] b(boolean[] arrbl, boolean ... arrbl2) {
        if (arrbl == null) {
            return org.apache.commons.c.c.a(arrbl2);
        }
        if (arrbl2 == null) {
            return org.apache.commons.c.c.a(arrbl);
        }
        boolean[] arrbl3 = new boolean[arrbl.length + arrbl2.length];
        System.arraycopy(arrbl, 0, arrbl3, 0, arrbl.length);
        System.arraycopy(arrbl2, 0, arrbl3, arrbl.length, arrbl2.length);
        return arrbl3;
    }

    public static char[] b(char[] arrc, char ... arrc2) {
        if (arrc == null) {
            return org.apache.commons.c.c.a(arrc2);
        }
        if (arrc2 == null) {
            return org.apache.commons.c.c.a(arrc);
        }
        char[] arrc3 = new char[arrc.length + arrc2.length];
        System.arraycopy(arrc, 0, arrc3, 0, arrc.length);
        System.arraycopy(arrc2, 0, arrc3, arrc.length, arrc2.length);
        return arrc3;
    }

    public static byte[] b(byte[] arrby, byte ... arrby2) {
        if (arrby == null) {
            return org.apache.commons.c.c.a(arrby2);
        }
        if (arrby2 == null) {
            return org.apache.commons.c.c.a(arrby);
        }
        byte[] arrby3 = new byte[arrby.length + arrby2.length];
        System.arraycopy(arrby, 0, arrby3, 0, arrby.length);
        System.arraycopy(arrby2, 0, arrby3, arrby.length, arrby2.length);
        return arrby3;
    }

    public static short[] b(short[] arrs, short ... arrs2) {
        if (arrs == null) {
            return org.apache.commons.c.c.a(arrs2);
        }
        if (arrs2 == null) {
            return org.apache.commons.c.c.a(arrs);
        }
        short[] arrs3 = new short[arrs.length + arrs2.length];
        System.arraycopy(arrs, 0, arrs3, 0, arrs.length);
        System.arraycopy(arrs2, 0, arrs3, arrs.length, arrs2.length);
        return arrs3;
    }

    public static int[] b(int[] arrn, int ... arrn2) {
        if (arrn == null) {
            return org.apache.commons.c.c.a(arrn2);
        }
        if (arrn2 == null) {
            return org.apache.commons.c.c.a(arrn);
        }
        int[] arrn3 = new int[arrn.length + arrn2.length];
        System.arraycopy(arrn, 0, arrn3, 0, arrn.length);
        System.arraycopy(arrn2, 0, arrn3, arrn.length, arrn2.length);
        return arrn3;
    }

    public static long[] b(long[] arrl, long ... arrl2) {
        if (arrl == null) {
            return org.apache.commons.c.c.a(arrl2);
        }
        if (arrl2 == null) {
            return org.apache.commons.c.c.a(arrl);
        }
        long[] arrl3 = new long[arrl.length + arrl2.length];
        System.arraycopy(arrl, 0, arrl3, 0, arrl.length);
        System.arraycopy(arrl2, 0, arrl3, arrl.length, arrl2.length);
        return arrl3;
    }

    public static float[] b(float[] arrf, float ... arrf2) {
        if (arrf == null) {
            return org.apache.commons.c.c.a(arrf2);
        }
        if (arrf2 == null) {
            return org.apache.commons.c.c.a(arrf);
        }
        float[] arrf3 = new float[arrf.length + arrf2.length];
        System.arraycopy(arrf, 0, arrf3, 0, arrf.length);
        System.arraycopy(arrf2, 0, arrf3, arrf.length, arrf2.length);
        return arrf3;
    }

    public static double[] b(double[] arrd, double ... arrd2) {
        if (arrd == null) {
            return org.apache.commons.c.c.a(arrd2);
        }
        if (arrd2 == null) {
            return org.apache.commons.c.c.a(arrd);
        }
        double[] arrd3 = new double[arrd.length + arrd2.length];
        System.arraycopy(arrd, 0, arrd3, 0, arrd.length);
        System.arraycopy(arrd2, 0, arrd3, arrd.length, arrd2.length);
        return arrd3;
    }

    public static Object[] d(Object[] arrobject, Object object) {
        Class<?> class_;
        if (arrobject != null) {
            class_ = arrobject.getClass();
        } else if (object != null) {
            class_ = object.getClass();
        } else {
            throw new IllegalArgumentException("Arguments cannot both be null");
        }
        Object[] arrobject2 = (Object[])org.apache.commons.c.c.a((Object)arrobject, class_);
        arrobject2[arrobject2.length - 1] = object;
        return arrobject2;
    }

    public static boolean[] d(boolean[] arrbl, boolean bl2) {
        boolean[] arrbl2 = (boolean[])org.apache.commons.c.c.a((Object)arrbl, Boolean.TYPE);
        arrbl2[arrbl2.length - 1] = bl2;
        return arrbl2;
    }

    public static byte[] d(byte[] arrby, byte by2) {
        byte[] arrby2 = (byte[])org.apache.commons.c.c.a((Object)arrby, Byte.TYPE);
        arrby2[arrby2.length - 1] = by2;
        return arrby2;
    }

    public static char[] d(char[] arrc, char c2) {
        char[] arrc2 = (char[])org.apache.commons.c.c.a((Object)arrc, Character.TYPE);
        arrc2[arrc2.length - 1] = c2;
        return arrc2;
    }

    public static double[] d(double[] arrd, double d2) {
        double[] arrd2 = (double[])org.apache.commons.c.c.a((Object)arrd, Double.TYPE);
        arrd2[arrd2.length - 1] = d2;
        return arrd2;
    }

    public static float[] d(float[] arrf, float f2) {
        float[] arrf2 = (float[])org.apache.commons.c.c.a((Object)arrf, Float.TYPE);
        arrf2[arrf2.length - 1] = f2;
        return arrf2;
    }

    public static int[] d(int[] arrn, int n2) {
        int[] arrn2 = (int[])org.apache.commons.c.c.a((Object)arrn, Integer.TYPE);
        arrn2[arrn2.length - 1] = n2;
        return arrn2;
    }

    public static long[] d(long[] arrl, long l2) {
        long[] arrl2 = (long[])org.apache.commons.c.c.a((Object)arrl, Long.TYPE);
        arrl2[arrl2.length - 1] = l2;
        return arrl2;
    }

    public static short[] d(short[] arrs, short s2) {
        short[] arrs2 = (short[])org.apache.commons.c.c.a((Object)arrs, Short.TYPE);
        arrs2[arrs2.length - 1] = s2;
        return arrs2;
    }

    private static Object a(Object object, Class class_) {
        if (object != null) {
            int n2 = Array.getLength(object);
            Object object2 = Array.newInstance(object.getClass().getComponentType(), n2 + 1);
            System.arraycopy(object, 0, object2, 0, n2);
            return object2;
        }
        return Array.newInstance(class_, 1);
    }

    public static Object[] a(Object[] arrobject, int n2, Object object) {
        Class<?> class_ = null;
        if (arrobject != null) {
            class_ = arrobject.getClass().getComponentType();
        } else if (object != null) {
            class_ = object.getClass();
        } else {
            throw new IllegalArgumentException("Array and element cannot both be null");
        }
        Object[] arrobject2 = (Object[])org.apache.commons.c.c.a((Object)arrobject, n2, object, class_);
        return arrobject2;
    }

    public static boolean[] a(boolean[] arrbl, int n2, boolean bl2) {
        return (boolean[])org.apache.commons.c.c.a((Object)arrbl, n2, bl2, Boolean.TYPE);
    }

    public static char[] a(char[] arrc, int n2, char c2) {
        return (char[])org.apache.commons.c.c.a((Object)arrc, n2, Character.valueOf(c2), Character.TYPE);
    }

    public static byte[] a(byte[] arrby, int n2, byte by2) {
        return (byte[])org.apache.commons.c.c.a((Object)arrby, n2, (Object)by2, Byte.TYPE);
    }

    public static short[] a(short[] arrs, int n2, short s2) {
        return (short[])org.apache.commons.c.c.a((Object)arrs, n2, (Object)s2, Short.TYPE);
    }

    public static int[] e(int[] arrn, int n2, int n3) {
        return (int[])org.apache.commons.c.c.a((Object)arrn, n2, (Object)n3, Integer.TYPE);
    }

    public static long[] a(long[] arrl, int n2, long l2) {
        return (long[])org.apache.commons.c.c.a((Object)arrl, n2, l2, Long.TYPE);
    }

    public static float[] a(float[] arrf, int n2, float f2) {
        return (float[])org.apache.commons.c.c.a((Object)arrf, n2, Float.valueOf(f2), Float.TYPE);
    }

    public static double[] a(double[] arrd, int n2, double d2) {
        return (double[])org.apache.commons.c.c.a((Object)arrd, n2, d2, Double.TYPE);
    }

    private static Object a(Object object, int n2, Object object2, Class class_) {
        if (object == null) {
            if (n2 != 0) {
                throw new IndexOutOfBoundsException("Index: " + n2 + ", Length: 0");
            }
            Object object3 = Array.newInstance(class_, 1);
            Array.set(object3, 0, object2);
            return object3;
        }
        int n3 = Array.getLength(object);
        if (n2 > n3 || n2 < 0) {
            throw new IndexOutOfBoundsException("Index: " + n2 + ", Length: " + n3);
        }
        Object object4 = Array.newInstance(class_, n3 + 1);
        System.arraycopy(object, 0, object4, 0, n2);
        Array.set(object4, n2, object2);
        if (n2 < n3) {
            System.arraycopy(object, n2, object4, n2 + 1, n3 - n2);
        }
        return object4;
    }

    public static Object[] a(Object[] arrobject, int n2) {
        return (Object[])org.apache.commons.c.c.a((Object)arrobject, n2);
    }

    public static Object[] e(Object[] arrobject, Object object) {
        int n2 = org.apache.commons.c.c.a(arrobject, object);
        if (n2 == -1) {
            return org.apache.commons.c.c.c(arrobject);
        }
        return org.apache.commons.c.c.a(arrobject, n2);
    }

    public static boolean[] a(boolean[] arrbl, int n2) {
        return (boolean[])org.apache.commons.c.c.a((Object)arrbl, n2);
    }

    public static boolean[] e(boolean[] arrbl, boolean bl2) {
        int n2 = org.apache.commons.c.c.a(arrbl, bl2);
        if (n2 == -1) {
            return org.apache.commons.c.c.a(arrbl);
        }
        return org.apache.commons.c.c.a(arrbl, n2);
    }

    public static byte[] a(byte[] arrby, int n2) {
        return (byte[])org.apache.commons.c.c.a((Object)arrby, n2);
    }

    public static byte[] e(byte[] arrby, byte by2) {
        int n2 = org.apache.commons.c.c.a(arrby, by2);
        if (n2 == -1) {
            return org.apache.commons.c.c.a(arrby);
        }
        return org.apache.commons.c.c.a(arrby, n2);
    }

    public static char[] a(char[] arrc, int n2) {
        return (char[])org.apache.commons.c.c.a((Object)arrc, n2);
    }

    public static char[] e(char[] arrc, char c2) {
        int n2 = org.apache.commons.c.c.a(arrc, c2);
        if (n2 == -1) {
            return org.apache.commons.c.c.a(arrc);
        }
        return org.apache.commons.c.c.a(arrc, n2);
    }

    public static double[] a(double[] arrd, int n2) {
        return (double[])org.apache.commons.c.c.a((Object)arrd, n2);
    }

    public static double[] e(double[] arrd, double d2) {
        int n2 = org.apache.commons.c.c.a(arrd, d2);
        if (n2 == -1) {
            return org.apache.commons.c.c.a(arrd);
        }
        return org.apache.commons.c.c.a(arrd, n2);
    }

    public static float[] a(float[] arrf, int n2) {
        return (float[])org.apache.commons.c.c.a((Object)arrf, n2);
    }

    public static float[] e(float[] arrf, float f2) {
        int n2 = org.apache.commons.c.c.a(arrf, f2);
        if (n2 == -1) {
            return org.apache.commons.c.c.a(arrf);
        }
        return org.apache.commons.c.c.a(arrf, n2);
    }

    public static int[] e(int[] arrn, int n2) {
        return (int[])org.apache.commons.c.c.a((Object)arrn, n2);
    }

    public static int[] f(int[] arrn, int n2) {
        int n3 = org.apache.commons.c.c.a(arrn, n2);
        if (n3 == -1) {
            return org.apache.commons.c.c.a(arrn);
        }
        return org.apache.commons.c.c.e(arrn, n3);
    }

    public static long[] a(long[] arrl, int n2) {
        return (long[])org.apache.commons.c.c.a((Object)arrl, n2);
    }

    public static long[] e(long[] arrl, long l2) {
        int n2 = org.apache.commons.c.c.a(arrl, l2);
        if (n2 == -1) {
            return org.apache.commons.c.c.a(arrl);
        }
        return org.apache.commons.c.c.a(arrl, n2);
    }

    public static short[] a(short[] arrs, int n2) {
        return (short[])org.apache.commons.c.c.a((Object)arrs, n2);
    }

    public static short[] e(short[] arrs, short s2) {
        int n2 = org.apache.commons.c.c.a(arrs, s2);
        if (n2 == -1) {
            return org.apache.commons.c.c.a(arrs);
        }
        return org.apache.commons.c.c.a(arrs, n2);
    }

    private static Object a(Object object, int n2) {
        int n3 = org.apache.commons.c.c.c(object);
        if (n2 < 0 || n2 >= n3) {
            throw new IndexOutOfBoundsException("Index: " + n2 + ", Length: " + n3);
        }
        Object object2 = Array.newInstance(object.getClass().getComponentType(), n3 - 1);
        System.arraycopy(object, 0, object2, 0, n2);
        if (n2 < n3 - 1) {
            System.arraycopy(object, n2 + 1, object2, n2, n3 - n2 - 1);
        }
        return object2;
    }

    public static Object[] a(Object[] arrobject, int ... arrn) {
        return (Object[])org.apache.commons.c.c.a((Object)arrobject, org.apache.commons.c.c.a(arrn));
    }

    public static Object[] c(Object[] arrobject, Object ... arrobject2) {
        if (org.apache.commons.c.c.f(arrobject) || org.apache.commons.c.c.f(arrobject2)) {
            return org.apache.commons.c.c.c(arrobject);
        }
        HashMap<Object, f> hashMap = new HashMap<Object, f>(arrobject2.length);
        for (Object object : arrobject2) {
            f f2 = (f)hashMap.get(object);
            if (f2 == null) {
                hashMap.put(object, new f(1));
                continue;
            }
            f2.c();
        }
        BitSet bitSet = new BitSet();
        for (Map.Entry entry : hashMap.entrySet()) {
            Object object;
            object = entry.getKey();
            int n2 = 0;
            int n3 = ((f)entry.getValue()).intValue();
            for (int i2 = 0; i2 < n3 && (n2 = org.apache.commons.c.c.a(arrobject, object, n2)) >= 0; ++i2) {
                bitSet.set(n2++);
            }
        }
        Object[] arrobject3 = (Object[])org.apache.commons.c.c.a((Object)arrobject, bitSet);
        return arrobject3;
    }

    public static byte[] a(byte[] arrby, int ... arrn) {
        return (byte[])org.apache.commons.c.c.a((Object)arrby, org.apache.commons.c.c.a(arrn));
    }

    public static byte[] c(byte[] arrby, byte ... arrby2) {
        if (org.apache.commons.c.c.e(arrby) || org.apache.commons.c.c.e(arrby2)) {
            return org.apache.commons.c.c.a(arrby);
        }
        HashMap<Byte, f> hashMap = new HashMap<Byte, f>(arrby2.length);
        for (byte by2 : arrby2) {
            Byte by3 = by2;
            f f2 = (f)hashMap.get(by3);
            if (f2 == null) {
                hashMap.put(by3, new f(1));
                continue;
            }
            f2.c();
        }
        Object object = new BitSet();
        for (Map.Entry entry : hashMap.entrySet()) {
            Byte by4 = (Byte)entry.getKey();
            int n2 = 0;
            int n3 = ((f)entry.getValue()).intValue();
            for (int i2 = 0; i2 < n3 && (n2 = org.apache.commons.c.c.a(arrby, by4, n2)) >= 0; ++i2) {
                ((BitSet)object).set(n2++);
            }
        }
        return (byte[])org.apache.commons.c.c.a((Object)arrby, (BitSet)object);
    }

    public static short[] a(short[] arrs, int ... arrn) {
        return (short[])org.apache.commons.c.c.a((Object)arrs, org.apache.commons.c.c.a(arrn));
    }

    public static short[] c(short[] arrs, short ... arrs2) {
        if (org.apache.commons.c.c.e(arrs) || org.apache.commons.c.c.e(arrs2)) {
            return org.apache.commons.c.c.a(arrs);
        }
        HashMap<Short, f> hashMap = new HashMap<Short, f>(arrs2.length);
        for (short s2 : arrs2) {
            Short s3 = s2;
            f f2 = (f)hashMap.get(s3);
            if (f2 == null) {
                hashMap.put(s3, new f(1));
                continue;
            }
            f2.c();
        }
        Object object = new BitSet();
        for (Map.Entry entry : hashMap.entrySet()) {
            Short s4 = (Short)entry.getKey();
            int n2 = 0;
            int n3 = ((f)entry.getValue()).intValue();
            for (int i2 = 0; i2 < n3 && (n2 = org.apache.commons.c.c.a(arrs, s4, n2)) >= 0; ++i2) {
                ((BitSet)object).set(n2++);
            }
        }
        return (short[])org.apache.commons.c.c.a((Object)arrs, (BitSet)object);
    }

    public static int[] c(int[] arrn, int ... arrn2) {
        return (int[])org.apache.commons.c.c.a((Object)arrn, org.apache.commons.c.c.a(arrn2));
    }

    public static int[] d(int[] arrn, int ... arrn2) {
        if (org.apache.commons.c.c.e(arrn) || org.apache.commons.c.c.e(arrn2)) {
            return org.apache.commons.c.c.a(arrn);
        }
        HashMap<Integer, f> hashMap = new HashMap<Integer, f>(arrn2.length);
        for (int n2 : arrn2) {
            Integer n3 = n2;
            f f2 = (f)hashMap.get(n3);
            if (f2 == null) {
                hashMap.put(n3, new f(1));
                continue;
            }
            f2.c();
        }
        Object object = new BitSet();
        for (Map.Entry entry : hashMap.entrySet()) {
            Integer n4 = (Integer)entry.getKey();
            int n5 = 0;
            int n6 = ((f)entry.getValue()).intValue();
            for (int i2 = 0; i2 < n6 && (n5 = org.apache.commons.c.c.c(arrn, (int)n4, n5)) >= 0; ++i2) {
                ((BitSet)object).set(n5++);
            }
        }
        return (int[])org.apache.commons.c.c.a((Object)arrn, (BitSet)object);
    }

    public static char[] a(char[] arrc, int ... arrn) {
        return (char[])org.apache.commons.c.c.a((Object)arrc, org.apache.commons.c.c.a(arrn));
    }

    public static char[] c(char[] arrc, char ... arrc2) {
        if (org.apache.commons.c.c.e(arrc) || org.apache.commons.c.c.e(arrc2)) {
            return org.apache.commons.c.c.a(arrc);
        }
        HashMap<Character, f> hashMap = new HashMap<Character, f>(arrc2.length);
        for (char c2 : arrc2) {
            Character c3 = Character.valueOf(c2);
            f f2 = (f)hashMap.get(c3);
            if (f2 == null) {
                hashMap.put(c3, new f(1));
                continue;
            }
            f2.c();
        }
        Object object = new BitSet();
        for (Map.Entry entry : hashMap.entrySet()) {
            Character c4 = (Character)entry.getKey();
            int n2 = 0;
            int n3 = ((f)entry.getValue()).intValue();
            for (int i2 = 0; i2 < n3 && (n2 = org.apache.commons.c.c.a(arrc, c4.charValue(), n2)) >= 0; ++i2) {
                ((BitSet)object).set(n2++);
            }
        }
        return (char[])org.apache.commons.c.c.a((Object)arrc, (BitSet)object);
    }

    public static long[] a(long[] arrl, int ... arrn) {
        return (long[])org.apache.commons.c.c.a((Object)arrl, org.apache.commons.c.c.a(arrn));
    }

    public static long[] c(long[] arrl, long ... arrl2) {
        if (org.apache.commons.c.c.e(arrl) || org.apache.commons.c.c.e(arrl2)) {
            return org.apache.commons.c.c.a(arrl);
        }
        HashMap<Long, f> hashMap = new HashMap<Long, f>(arrl2.length);
        for (long l2 : arrl2) {
            Long l3 = l2;
            f f2 = (f)hashMap.get(l3);
            if (f2 == null) {
                hashMap.put(l3, new f(1));
                continue;
            }
            f2.c();
        }
        Object object = new BitSet();
        for (Map.Entry entry : hashMap.entrySet()) {
            Long l4 = (Long)entry.getKey();
            int n2 = 0;
            int n3 = ((f)entry.getValue()).intValue();
            for (int i2 = 0; i2 < n3 && (n2 = org.apache.commons.c.c.a(arrl, l4, n2)) >= 0; ++i2) {
                ((BitSet)object).set(n2++);
            }
        }
        return (long[])org.apache.commons.c.c.a((Object)arrl, (BitSet)object);
    }

    public static float[] a(float[] arrf, int ... arrn) {
        return (float[])org.apache.commons.c.c.a((Object)arrf, org.apache.commons.c.c.a(arrn));
    }

    public static float[] c(float[] arrf, float ... arrf2) {
        if (org.apache.commons.c.c.e(arrf) || org.apache.commons.c.c.e(arrf2)) {
            return org.apache.commons.c.c.a(arrf);
        }
        HashMap<Float, f> hashMap = new HashMap<Float, f>(arrf2.length);
        for (float f2 : arrf2) {
            Float f3 = Float.valueOf(f2);
            f f4 = (f)hashMap.get(f3);
            if (f4 == null) {
                hashMap.put(f3, new f(1));
                continue;
            }
            f4.c();
        }
        Object object = new BitSet();
        for (Map.Entry entry : hashMap.entrySet()) {
            Float f5 = (Float)entry.getKey();
            int n2 = 0;
            int n3 = ((f)entry.getValue()).intValue();
            for (int i2 = 0; i2 < n3 && (n2 = org.apache.commons.c.c.a(arrf, f5.floatValue(), n2)) >= 0; ++i2) {
                ((BitSet)object).set(n2++);
            }
        }
        return (float[])org.apache.commons.c.c.a((Object)arrf, (BitSet)object);
    }

    public static double[] a(double[] arrd, int ... arrn) {
        return (double[])org.apache.commons.c.c.a((Object)arrd, org.apache.commons.c.c.a(arrn));
    }

    public static double[] c(double[] arrd, double ... arrd2) {
        if (org.apache.commons.c.c.e(arrd) || org.apache.commons.c.c.e(arrd2)) {
            return org.apache.commons.c.c.a(arrd);
        }
        HashMap<Double, f> hashMap = new HashMap<Double, f>(arrd2.length);
        for (double d2 : arrd2) {
            Double d3 = d2;
            f f2 = (f)hashMap.get(d3);
            if (f2 == null) {
                hashMap.put(d3, new f(1));
                continue;
            }
            f2.c();
        }
        Object object = new BitSet();
        for (Map.Entry entry : hashMap.entrySet()) {
            Double d4 = (Double)entry.getKey();
            int n2 = 0;
            int n3 = ((f)entry.getValue()).intValue();
            for (int i2 = 0; i2 < n3 && (n2 = org.apache.commons.c.c.a(arrd, (double)d4, n2)) >= 0; ++i2) {
                ((BitSet)object).set(n2++);
            }
        }
        return (double[])org.apache.commons.c.c.a((Object)arrd, (BitSet)object);
    }

    public static boolean[] a(boolean[] arrbl, int ... arrn) {
        return (boolean[])org.apache.commons.c.c.a((Object)arrbl, org.apache.commons.c.c.a(arrn));
    }

    public static boolean[] c(boolean[] arrbl, boolean ... arrbl2) {
        if (org.apache.commons.c.c.e(arrbl) || org.apache.commons.c.c.e(arrbl2)) {
            return org.apache.commons.c.c.a(arrbl);
        }
        HashMap<Boolean, f> hashMap = new HashMap<Boolean, f>(2);
        for (boolean bl2 : arrbl2) {
            Boolean bl3 = bl2;
            f f2 = (f)hashMap.get(bl3);
            if (f2 == null) {
                hashMap.put(bl3, new f(1));
                continue;
            }
            f2.c();
        }
        Object object = new BitSet();
        for (Map.Entry entry : hashMap.entrySet()) {
            Boolean bl4 = (Boolean)entry.getKey();
            int n2 = 0;
            int n3 = ((f)entry.getValue()).intValue();
            for (int i2 = 0; i2 < n3 && (n2 = org.apache.commons.c.c.a(arrbl, bl4, n2)) >= 0; ++i2) {
                ((BitSet)object).set(n2++);
            }
        }
        return (boolean[])org.apache.commons.c.c.a((Object)arrbl, (BitSet)object);
    }

    static Object a(Object object, int ... arrn) {
        int n2;
        int n3;
        int n4 = org.apache.commons.c.c.c(object);
        int n5 = 0;
        if (org.apache.commons.c.c.f(arrn)) {
            Arrays.sort(arrn);
            int n6 = arrn.length;
            n3 = n4;
            while (--n6 >= 0) {
                n2 = arrn[n6];
                if (n2 < 0 || n2 >= n4) {
                    throw new IndexOutOfBoundsException("Index: " + n2 + ", Length: " + n4);
                }
                if (n2 >= n3) continue;
                ++n5;
                n3 = n2;
            }
        }
        Object object2 = Array.newInstance(object.getClass().getComponentType(), n4 - n5);
        if (n5 < n4) {
            n3 = n4;
            n2 = n4 - n5;
            for (int i2 = arrn.length - 1; i2 >= 0; --i2) {
                int n7 = arrn[i2];
                if (n3 - n7 > 1) {
                    int n8 = n3 - n7 - 1;
                    System.arraycopy(object, n7 + 1, object2, n2 -= n8, n8);
                }
                n3 = n7;
            }
            if (n3 > 0) {
                System.arraycopy(object, 0, object2, 0, n3);
            }
        }
        return object2;
    }

    static Object a(Object object, BitSet bitSet) {
        int n2;
        int n3;
        int n4 = org.apache.commons.c.c.c(object);
        int n5 = bitSet.cardinality();
        Object object2 = Array.newInstance(object.getClass().getComponentType(), n4 - n5);
        int n6 = 0;
        int n7 = 0;
        while ((n3 = bitSet.nextSetBit(n6)) != -1) {
            n2 = n3 - n6;
            if (n2 > 0) {
                System.arraycopy(object, n6, object2, n7, n2);
                n7 += n2;
            }
            n6 = bitSet.nextClearBit(n3);
        }
        n2 = n4 - n6;
        if (n2 > 0) {
            System.arraycopy(object, n6, object2, n7, n2);
        }
        return object2;
    }
}

