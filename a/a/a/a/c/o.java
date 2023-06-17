/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.c;

import a.a.a.a.a;
import a.a.a.a.a.ch;
import a.a.a.a.c.q;
import a.a.a.a.c.r;
import a.a.a.a.c.s;
import a.a.a.a.c.t;
import a.a.a.a.c.u;
import a.a.a.a.f;
import java.lang.reflect.Array;
import java.util.Comparator;
import java.util.Random;
import java.util.concurrent.ForkJoinPool;

public class o {
    public static final Object[] a = new Object[0];
    private static final int c = 16;
    private static final int d = 8192;
    private static final int e = 128;
    private static final int f = 16;
    public static final f b = new q(null);

    private o() {
    }

    private static Object[] e(Object[] arrobject, int n2) {
        Class<?> class_ = arrobject.getClass();
        if (class_ == Object[].class) {
            return n2 == 0 ? a : new Object[n2];
        }
        return (Object[])Array.newInstance(class_.getComponentType(), n2);
    }

    public static Object[] a(Object[] arrobject, int n2) {
        if (n2 > arrobject.length) {
            Object[] arrobject2 = o.e(arrobject, n2);
            System.arraycopy(arrobject, 0, arrobject2, 0, arrobject.length);
            return arrobject2;
        }
        return arrobject;
    }

    public static Object[] a(Object[] arrobject, int n2, int n3) {
        if (n2 > arrobject.length) {
            Object[] arrobject2 = o.e(arrobject, n2);
            System.arraycopy(arrobject, 0, arrobject2, 0, n3);
            return arrobject2;
        }
        return arrobject;
    }

    public static Object[] b(Object[] arrobject, int n2) {
        if (n2 > arrobject.length) {
            int n3 = (int)Math.max(Math.min(2L * (long)arrobject.length, 0x7FFFFFF7L), (long)n2);
            Object[] arrobject2 = o.e(arrobject, n3);
            System.arraycopy(arrobject, 0, arrobject2, 0, arrobject.length);
            return arrobject2;
        }
        return arrobject;
    }

    public static Object[] b(Object[] arrobject, int n2, int n3) {
        if (n2 > arrobject.length) {
            int n4 = (int)Math.max(Math.min(2L * (long)arrobject.length, 0x7FFFFFF7L), (long)n2);
            Object[] arrobject2 = o.e(arrobject, n4);
            System.arraycopy(arrobject, 0, arrobject2, 0, n3);
            return arrobject2;
        }
        return arrobject;
    }

    public static Object[] c(Object[] arrobject, int n2) {
        if (n2 >= arrobject.length) {
            return arrobject;
        }
        Object[] arrobject2 = o.e(arrobject, n2);
        System.arraycopy(arrobject, 0, arrobject2, 0, n2);
        return arrobject2;
    }

    public static Object[] d(Object[] arrobject, int n2) {
        if (n2 == arrobject.length) {
            return arrobject;
        }
        if (n2 < arrobject.length) {
            return o.c(arrobject, n2);
        }
        return o.a(arrobject, n2);
    }

    public static Object[] c(Object[] arrobject, int n2, int n3) {
        o.e(arrobject, n2, n3);
        Object[] arrobject2 = o.e(arrobject, n3);
        System.arraycopy(arrobject, n2, arrobject2, 0, n3);
        return arrobject2;
    }

    public static Object[] a(Object[] arrobject) {
        return (Object[])arrobject.clone();
    }

    public static void a(Object[] arrobject, Object object) {
        int n2 = arrobject.length;
        while (n2-- != 0) {
            arrobject[n2] = object;
        }
    }

    public static void a(Object[] arrobject, int n2, int n3, Object object) {
        o.d(arrobject, n2, n3);
        if (n2 == 0) {
            while (n3-- != 0) {
                arrobject[n3] = object;
            }
        } else {
            for (int i2 = n2; i2 < n3; ++i2) {
                arrobject[i2] = object;
            }
        }
    }

    public static boolean a(Object[] arrobject, Object[] arrobject2) {
        int n2 = arrobject.length;
        if (n2 != arrobject2.length) {
            return false;
        }
        while (n2-- != 0) {
            if (arrobject[n2] != null ? arrobject[n2].equals(arrobject2[n2]) : arrobject2[n2] == null) continue;
            return false;
        }
        return true;
    }

    public static void d(Object[] arrobject, int n2, int n3) {
        a.a.a.a.a.a(arrobject.length, n2, n3);
    }

    public static void e(Object[] arrobject, int n2, int n3) {
        a.a.a.a.a.b(arrobject.length, n2, n3);
    }

    public static void b(Object[] arrobject, Object[] arrobject2) {
        if (arrobject.length != arrobject2.length) {
            throw new IllegalArgumentException("Array size mismatch: " + arrobject.length + " != " + arrobject2.length);
        }
    }

    public static void f(Object[] arrobject, int n2, int n3) {
        Object object = arrobject[n2];
        arrobject[n2] = arrobject[n3];
        arrobject[n3] = object;
    }

    public static void a(Object[] arrobject, int n2, int n3, int n4) {
        int n5 = 0;
        while (n5 < n4) {
            o.f(arrobject, n2, n3);
            ++n5;
            ++n2;
            ++n3;
        }
    }

    private static int b(Object[] arrobject, int n2, int n3, int n4, Comparator comparator) {
        int n5 = comparator.compare(arrobject[n2], arrobject[n3]);
        int n6 = comparator.compare(arrobject[n2], arrobject[n4]);
        int n7 = comparator.compare(arrobject[n3], arrobject[n4]);
        return n5 < 0 ? (n7 < 0 ? n3 : (n6 < 0 ? n4 : n2)) : (n7 > 0 ? n3 : (n6 > 0 ? n4 : n2));
    }

    private static void d(Object[] arrobject, int n2, int n3, Comparator comparator) {
        for (int i2 = n2; i2 < n3 - 1; ++i2) {
            int n4 = i2;
            for (int i3 = i2 + 1; i3 < n3; ++i3) {
                if (comparator.compare(arrobject[i3], arrobject[n4]) >= 0) continue;
                n4 = i3;
            }
            if (n4 == i2) continue;
            Object object = arrobject[i2];
            arrobject[i2] = arrobject[n4];
            arrobject[n4] = object;
        }
    }

    private static void e(Object[] arrobject, int n2, int n3, Comparator comparator) {
        int n4 = n2;
        while (++n4 < n3) {
            Object object = arrobject[n4];
            int n5 = n4;
            Object object2 = arrobject[n5 - 1];
            while (comparator.compare(object, object2) < 0) {
                arrobject[n5] = object2;
                if (n2 == n5 - 1) {
                    --n5;
                    break;
                }
                object2 = arrobject[--n5 - 1];
            }
            arrobject[n5] = object;
        }
    }

    public static void a(Object[] arrobject, int n2, int n3, Comparator comparator) {
        int n4;
        int n5;
        int n6;
        int n7 = n3 - n2;
        if (n7 < 16) {
            o.d(arrobject, n2, n3, comparator);
            return;
        }
        int n8 = n2 + n7 / 2;
        int n9 = n2;
        int n10 = n3 - 1;
        if (n7 > 128) {
            int n11 = n7 / 8;
            n9 = o.b(arrobject, n9, n9 + n11, n9 + 2 * n11, comparator);
            n8 = o.b(arrobject, n8 - n11, n8, n8 + n11, comparator);
            n10 = o.b(arrobject, n10 - 2 * n11, n10 - n11, n10, comparator);
        }
        n8 = o.b(arrobject, n9, n8, n10, comparator);
        Object object = arrobject[n8];
        int n12 = n6 = n2;
        int n13 = n5 = n3 - 1;
        while (true) {
            if (n12 <= n5 && (n4 = comparator.compare(arrobject[n12], object)) <= 0) {
                if (n4 == 0) {
                    o.f(arrobject, n6++, n12);
                }
                ++n12;
                continue;
            }
            while (n5 >= n12 && (n4 = comparator.compare(arrobject[n5], object)) >= 0) {
                if (n4 == 0) {
                    o.f(arrobject, n5, n13--);
                }
                --n5;
            }
            if (n12 > n5) break;
            o.f(arrobject, n12++, n5--);
        }
        n4 = Math.min(n6 - n2, n12 - n6);
        o.a(arrobject, n2, n12 - n4, n4);
        n4 = Math.min(n13 - n5, n3 - n13 - 1);
        o.a(arrobject, n12, n3 - n4, n4);
        n4 = n12 - n6;
        if (n4 > 1) {
            o.a(arrobject, n2, n2 + n4, comparator);
        }
        if ((n4 = n13 - n5) > 1) {
            o.a(arrobject, n3 - n4, n3, comparator);
        }
    }

    public static void a(Object[] arrobject, Comparator comparator) {
        o.a(arrobject, 0, arrobject.length, comparator);
    }

    public static void b(Object[] arrobject, int n2, int n3, Comparator comparator) {
        if (n3 - n2 < 8192) {
            o.a(arrobject, n2, n3, comparator);
        } else {
            ForkJoinPool forkJoinPool = new ForkJoinPool(Runtime.getRuntime().availableProcessors());
            forkJoinPool.invoke(new t(arrobject, n2, n3, comparator));
            forkJoinPool.shutdown();
        }
    }

    public static void b(Object[] arrobject, Comparator comparator) {
        o.b(arrobject, 0, arrobject.length, comparator);
    }

    private static int c(Object[] arrobject, int n2, int n3, int n4) {
        int n5 = ((Comparable)arrobject[n2]).compareTo(arrobject[n3]);
        int n6 = ((Comparable)arrobject[n2]).compareTo(arrobject[n4]);
        int n7 = ((Comparable)arrobject[n3]).compareTo(arrobject[n4]);
        return n5 < 0 ? (n7 < 0 ? n3 : (n6 < 0 ? n4 : n2)) : (n7 > 0 ? n3 : (n6 > 0 ? n4 : n2));
    }

    private static void k(Object[] arrobject, int n2, int n3) {
        for (int i2 = n2; i2 < n3 - 1; ++i2) {
            int n4 = i2;
            for (int i3 = i2 + 1; i3 < n3; ++i3) {
                if (((Comparable)arrobject[i3]).compareTo(arrobject[n4]) >= 0) continue;
                n4 = i3;
            }
            if (n4 == i2) continue;
            Object object = arrobject[i2];
            arrobject[i2] = arrobject[n4];
            arrobject[n4] = object;
        }
    }

    private static void l(Object[] arrobject, int n2, int n3) {
        int n4 = n2;
        while (++n4 < n3) {
            Object object = arrobject[n4];
            int n5 = n4;
            Object object2 = arrobject[n5 - 1];
            while (((Comparable)object).compareTo(object2) < 0) {
                arrobject[n5] = object2;
                if (n2 == n5 - 1) {
                    --n5;
                    break;
                }
                object2 = arrobject[--n5 - 1];
            }
            arrobject[n5] = object;
        }
    }

    public static void g(Object[] arrobject, int n2, int n3) {
        int n4;
        int n5;
        int n6;
        int n7 = n3 - n2;
        if (n7 < 16) {
            o.k(arrobject, n2, n3);
            return;
        }
        int n8 = n2 + n7 / 2;
        int n9 = n2;
        int n10 = n3 - 1;
        if (n7 > 128) {
            int n11 = n7 / 8;
            n9 = o.c(arrobject, n9, n9 + n11, n9 + 2 * n11);
            n8 = o.c(arrobject, n8 - n11, n8, n8 + n11);
            n10 = o.c(arrobject, n10 - 2 * n11, n10 - n11, n10);
        }
        n8 = o.c(arrobject, n9, n8, n10);
        Object object = arrobject[n8];
        int n12 = n6 = n2;
        int n13 = n5 = n3 - 1;
        while (true) {
            if (n12 <= n5 && (n4 = ((Comparable)arrobject[n12]).compareTo(object)) <= 0) {
                if (n4 == 0) {
                    o.f(arrobject, n6++, n12);
                }
                ++n12;
                continue;
            }
            while (n5 >= n12 && (n4 = ((Comparable)arrobject[n5]).compareTo(object)) >= 0) {
                if (n4 == 0) {
                    o.f(arrobject, n5, n13--);
                }
                --n5;
            }
            if (n12 > n5) break;
            o.f(arrobject, n12++, n5--);
        }
        n4 = Math.min(n6 - n2, n12 - n6);
        o.a(arrobject, n2, n12 - n4, n4);
        n4 = Math.min(n13 - n5, n3 - n13 - 1);
        o.a(arrobject, n12, n3 - n4, n4);
        n4 = n12 - n6;
        if (n4 > 1) {
            o.g(arrobject, n2, n2 + n4);
        }
        if ((n4 = n13 - n5) > 1) {
            o.g(arrobject, n3 - n4, n3);
        }
    }

    public static void b(Object[] arrobject) {
        o.g(arrobject, 0, arrobject.length);
    }

    public static void h(Object[] arrobject, int n2, int n3) {
        if (n3 - n2 < 8192) {
            o.g(arrobject, n2, n3);
        } else {
            ForkJoinPool forkJoinPool = new ForkJoinPool(Runtime.getRuntime().availableProcessors());
            forkJoinPool.invoke(new r(arrobject, n2, n3));
            forkJoinPool.shutdown();
        }
    }

    public static void c(Object[] arrobject) {
        o.h(arrobject, 0, arrobject.length);
    }

    private static int b(int[] arrn, Object[] arrobject, int n2, int n3, int n4) {
        Object object = arrobject[arrn[n2]];
        Object object2 = arrobject[arrn[n3]];
        Object object3 = arrobject[arrn[n4]];
        int n5 = ((Comparable)object).compareTo(object2);
        int n6 = ((Comparable)object).compareTo(object3);
        int n7 = ((Comparable)object2).compareTo(object3);
        return n5 < 0 ? (n7 < 0 ? n3 : (n6 < 0 ? n4 : n2)) : (n7 > 0 ? n3 : (n6 > 0 ? n4 : n2));
    }

    private static void d(int[] arrn, Object[] arrobject, int n2, int n3) {
        int n4 = n2;
        while (++n4 < n3) {
            int n5 = arrn[n4];
            int n6 = n4;
            int n7 = arrn[n6 - 1];
            while (((Comparable)arrobject[n5]).compareTo(arrobject[n7]) < 0) {
                arrn[n6] = n7;
                if (n2 == n6 - 1) {
                    --n6;
                    break;
                }
                n7 = arrn[--n6 - 1];
            }
            arrn[n6] = n5;
        }
    }

    public static void a(int[] arrn, Object[] arrobject, int n2, int n3) {
        int n4;
        int n5;
        int n6;
        int n7 = n3 - n2;
        if (n7 < 16) {
            o.d(arrn, arrobject, n2, n3);
            return;
        }
        int n8 = n2 + n7 / 2;
        int n9 = n2;
        int n10 = n3 - 1;
        if (n7 > 128) {
            int n11 = n7 / 8;
            n9 = o.b(arrn, arrobject, n9, n9 + n11, n9 + 2 * n11);
            n8 = o.b(arrn, arrobject, n8 - n11, n8, n8 + n11);
            n10 = o.b(arrn, arrobject, n10 - 2 * n11, n10 - n11, n10);
        }
        n8 = o.b(arrn, arrobject, n9, n8, n10);
        Object object = arrobject[arrn[n8]];
        int n12 = n6 = n2;
        int n13 = n5 = n3 - 1;
        while (true) {
            if (n12 <= n5 && (n4 = ((Comparable)arrobject[arrn[n12]]).compareTo(object)) <= 0) {
                if (n4 == 0) {
                    ch.f(arrn, n6++, n12);
                }
                ++n12;
                continue;
            }
            while (n5 >= n12 && (n4 = ((Comparable)arrobject[arrn[n5]]).compareTo(object)) >= 0) {
                if (n4 == 0) {
                    ch.f(arrn, n5, n13--);
                }
                --n5;
            }
            if (n12 > n5) break;
            ch.f(arrn, n12++, n5--);
        }
        n4 = Math.min(n6 - n2, n12 - n6);
        ch.b(arrn, n2, n12 - n4, n4);
        n4 = Math.min(n13 - n5, n3 - n13 - 1);
        ch.b(arrn, n12, n3 - n4, n4);
        n4 = n12 - n6;
        if (n4 > 1) {
            o.a(arrn, arrobject, n2, n2 + n4);
        }
        if ((n4 = n13 - n5) > 1) {
            o.a(arrn, arrobject, n3 - n4, n3);
        }
    }

    public static void a(int[] arrn, Object[] arrobject) {
        o.a(arrn, arrobject, 0, arrobject.length);
    }

    public static void b(int[] arrn, Object[] arrobject, int n2, int n3) {
        if (n3 - n2 < 8192) {
            o.a(arrn, arrobject, n2, n3);
        } else {
            ForkJoinPool forkJoinPool = new ForkJoinPool(Runtime.getRuntime().availableProcessors());
            forkJoinPool.invoke(new u(arrn, arrobject, n2, n3));
            forkJoinPool.shutdown();
        }
    }

    public static void b(int[] arrn, Object[] arrobject) {
        o.b(arrn, arrobject, 0, arrobject.length);
    }

    public static void c(int[] arrn, Object[] arrobject, int n2, int n3) {
        int n4 = n2;
        for (int i2 = n2 + 1; i2 < n3; ++i2) {
            if (arrobject[arrn[i2]] == arrobject[arrn[n4]]) continue;
            if (i2 - n4 > 1) {
                ch.h(arrn, n4, i2);
            }
            n4 = i2;
        }
        if (n3 - n4 > 1) {
            ch.h(arrn, n4, n3);
        }
    }

    public static void c(int[] arrn, Object[] arrobject) {
        o.c(arrn, arrobject, 0, arrn.length);
    }

    private static int c(Object[] arrobject, Object[] arrobject2, int n2, int n3, int n4) {
        int n5;
        int n6 = ((Comparable)arrobject[n2]).compareTo(arrobject[n3]);
        int n7 = n6 == 0 ? ((Comparable)arrobject2[n2]).compareTo(arrobject2[n3]) : n6;
        n6 = ((Comparable)arrobject[n2]).compareTo(arrobject[n4]);
        int n8 = n6 == 0 ? ((Comparable)arrobject2[n2]).compareTo(arrobject2[n4]) : n6;
        n6 = ((Comparable)arrobject[n3]).compareTo(arrobject[n4]);
        int n9 = n5 = n6 == 0 ? ((Comparable)arrobject2[n3]).compareTo(arrobject2[n4]) : n6;
        return n7 < 0 ? (n5 < 0 ? n3 : (n8 < 0 ? n4 : n2)) : (n5 > 0 ? n3 : (n8 > 0 ? n4 : n2));
    }

    private static void d(Object[] arrobject, Object[] arrobject2, int n2, int n3) {
        Object object = arrobject[n2];
        Object object2 = arrobject2[n2];
        arrobject[n2] = arrobject[n3];
        arrobject2[n2] = arrobject2[n3];
        arrobject[n3] = object;
        arrobject2[n3] = object2;
    }

    private static void d(Object[] arrobject, Object[] arrobject2, int n2, int n3, int n4) {
        int n5 = 0;
        while (n5 < n4) {
            o.d(arrobject, arrobject2, n2, n3);
            ++n5;
            ++n2;
            ++n3;
        }
    }

    private static void e(Object[] arrobject, Object[] arrobject2, int n2, int n3) {
        for (int i2 = n2; i2 < n3 - 1; ++i2) {
            int n4 = i2;
            for (int i3 = i2 + 1; i3 < n3; ++i3) {
                int n5 = ((Comparable)arrobject[i3]).compareTo(arrobject[n4]);
                if (n5 >= 0 && (n5 != 0 || ((Comparable)arrobject2[i3]).compareTo(arrobject2[n4]) >= 0)) continue;
                n4 = i3;
            }
            if (n4 == i2) continue;
            Object object = arrobject[i2];
            arrobject[i2] = arrobject[n4];
            arrobject[n4] = object;
            object = arrobject2[i2];
            arrobject2[i2] = arrobject2[n4];
            arrobject2[n4] = object;
        }
    }

    public static void a(Object[] arrobject, Object[] arrobject2, int n2, int n3) {
        int n4;
        int n5;
        int n6;
        int n7 = n3 - n2;
        if (n7 < 16) {
            o.e(arrobject, arrobject2, n2, n3);
            return;
        }
        int n8 = n2 + n7 / 2;
        int n9 = n2;
        int n10 = n3 - 1;
        if (n7 > 128) {
            int n11 = n7 / 8;
            n9 = o.c(arrobject, arrobject2, n9, n9 + n11, n9 + 2 * n11);
            n8 = o.c(arrobject, arrobject2, n8 - n11, n8, n8 + n11);
            n10 = o.c(arrobject, arrobject2, n10 - 2 * n11, n10 - n11, n10);
        }
        n8 = o.c(arrobject, arrobject2, n9, n8, n10);
        Object object = arrobject[n8];
        Object object2 = arrobject2[n8];
        int n12 = n6 = n2;
        int n13 = n5 = n3 - 1;
        while (true) {
            int n14;
            if (n12 <= n5 && (n4 = (n14 = ((Comparable)arrobject[n12]).compareTo(object)) == 0 ? ((Comparable)arrobject2[n12]).compareTo(object2) : n14) <= 0) {
                if (n4 == 0) {
                    o.d(arrobject, arrobject2, n6++, n12);
                }
                ++n12;
                continue;
            }
            while (n5 >= n12 && (n4 = (n14 = ((Comparable)arrobject[n5]).compareTo(object)) == 0 ? ((Comparable)arrobject2[n5]).compareTo(object2) : n14) >= 0) {
                if (n4 == 0) {
                    o.d(arrobject, arrobject2, n5, n13--);
                }
                --n5;
            }
            if (n12 > n5) break;
            o.d(arrobject, arrobject2, n12++, n5--);
        }
        n4 = Math.min(n6 - n2, n12 - n6);
        o.d(arrobject, arrobject2, n2, n12 - n4, n4);
        n4 = Math.min(n13 - n5, n3 - n13 - 1);
        o.d(arrobject, arrobject2, n12, n3 - n4, n4);
        n4 = n12 - n6;
        if (n4 > 1) {
            o.a(arrobject, arrobject2, n2, n2 + n4);
        }
        if ((n4 = n13 - n5) > 1) {
            o.a(arrobject, arrobject2, n3 - n4, n3);
        }
    }

    public static void c(Object[] arrobject, Object[] arrobject2) {
        o.b(arrobject, arrobject2);
        o.a(arrobject, arrobject2, 0, arrobject.length);
    }

    public static void b(Object[] arrobject, Object[] arrobject2, int n2, int n3) {
        if (n3 - n2 < 8192) {
            o.a(arrobject, arrobject2, n2, n3);
        }
        ForkJoinPool forkJoinPool = new ForkJoinPool(Runtime.getRuntime().availableProcessors());
        forkJoinPool.invoke(new s(arrobject, arrobject2, n2, n3));
        forkJoinPool.shutdown();
    }

    public static void d(Object[] arrobject, Object[] arrobject2) {
        o.b(arrobject, arrobject2);
        o.b(arrobject, arrobject2, 0, arrobject.length);
    }

    public static void a(Object[] arrobject, int n2, int n3, Object[] arrobject2) {
        int n4 = n3 - n2;
        if (n4 < 16) {
            o.l(arrobject, n2, n3);
            return;
        }
        int n5 = n2 + n3 >>> 1;
        o.a(arrobject2, n2, n5, arrobject);
        o.a(arrobject2, n5, n3, arrobject);
        if (((Comparable)arrobject2[n5 - 1]).compareTo(arrobject2[n5]) <= 0) {
            System.arraycopy(arrobject2, n2, arrobject, n2, n4);
            return;
        }
        int n6 = n2;
        int n7 = n5;
        for (int i2 = n2; i2 < n3; ++i2) {
            arrobject[i2] = n7 >= n3 || n6 < n5 && ((Comparable)arrobject2[n6]).compareTo(arrobject2[n7]) <= 0 ? arrobject2[n6++] : arrobject2[n7++];
        }
    }

    public static void i(Object[] arrobject, int n2, int n3) {
        o.a(arrobject, n2, n3, (Object[])arrobject.clone());
    }

    public static void d(Object[] arrobject) {
        o.i(arrobject, 0, arrobject.length);
    }

    public static void a(Object[] arrobject, int n2, int n3, Comparator comparator, Object[] arrobject2) {
        int n4 = n3 - n2;
        if (n4 < 16) {
            o.e(arrobject, n2, n3, comparator);
            return;
        }
        int n5 = n2 + n3 >>> 1;
        o.a(arrobject2, n2, n5, comparator, arrobject);
        o.a(arrobject2, n5, n3, comparator, arrobject);
        if (comparator.compare(arrobject2[n5 - 1], arrobject2[n5]) <= 0) {
            System.arraycopy(arrobject2, n2, arrobject, n2, n4);
            return;
        }
        int n6 = n2;
        int n7 = n5;
        for (int i2 = n2; i2 < n3; ++i2) {
            arrobject[i2] = n7 >= n3 || n6 < n5 && comparator.compare(arrobject2[n6], arrobject2[n7]) <= 0 ? arrobject2[n6++] : arrobject2[n7++];
        }
    }

    public static void c(Object[] arrobject, int n2, int n3, Comparator comparator) {
        o.a(arrobject, n2, n3, comparator, (Object[])arrobject.clone());
    }

    public static void c(Object[] arrobject, Comparator comparator) {
        o.c(arrobject, 0, arrobject.length, comparator);
    }

    public static int b(Object[] arrobject, int n2, int n3, Object object) {
        --n3;
        while (n2 <= n3) {
            int n4 = n2 + n3 >>> 1;
            Object object2 = arrobject[n4];
            int n5 = ((Comparable)object2).compareTo(object);
            if (n5 < 0) {
                n2 = n4 + 1;
                continue;
            }
            if (n5 > 0) {
                n3 = n4 - 1;
                continue;
            }
            return n4;
        }
        return -(n2 + 1);
    }

    public static int b(Object[] arrobject, Object object) {
        return o.b(arrobject, 0, arrobject.length, object);
    }

    public static int a(Object[] arrobject, int n2, int n3, Object object, Comparator comparator) {
        --n3;
        while (n2 <= n3) {
            int n4 = n2 + n3 >>> 1;
            Object object2 = arrobject[n4];
            int n5 = comparator.compare(object2, object);
            if (n5 < 0) {
                n2 = n4 + 1;
                continue;
            }
            if (n5 > 0) {
                n3 = n4 - 1;
                continue;
            }
            return n4;
        }
        return -(n2 + 1);
    }

    public static int a(Object[] arrobject, Object object, Comparator comparator) {
        return o.a(arrobject, 0, arrobject.length, object, comparator);
    }

    public static Object[] a(Object[] arrobject, int n2, int n3, Random random) {
        int n4 = n3 - n2;
        while (n4-- != 0) {
            int n5 = random.nextInt(n4 + 1);
            Object object = arrobject[n2 + n4];
            arrobject[n2 + n4] = arrobject[n2 + n5];
            arrobject[n2 + n5] = object;
        }
        return arrobject;
    }

    public static Object[] a(Object[] arrobject, Random random) {
        int n2 = arrobject.length;
        while (n2-- != 0) {
            int n3 = random.nextInt(n2 + 1);
            Object object = arrobject[n2];
            arrobject[n2] = arrobject[n3];
            arrobject[n3] = object;
        }
        return arrobject;
    }

    public static Object[] e(Object[] arrobject) {
        int n2 = arrobject.length;
        int n3 = n2 / 2;
        while (n3-- != 0) {
            Object object = arrobject[n2 - n3 - 1];
            arrobject[n2 - n3 - 1] = arrobject[n3];
            arrobject[n3] = object;
        }
        return arrobject;
    }

    public static Object[] j(Object[] arrobject, int n2, int n3) {
        int n4 = n3 - n2;
        int n5 = n4 / 2;
        while (n5-- != 0) {
            Object object = arrobject[n2 + n4 - n5 - 1];
            arrobject[n2 + n4 - n5 - 1] = arrobject[n2 + n5];
            arrobject[n2 + n5] = object;
        }
        return arrobject;
    }

    static /* synthetic */ int a(Object[] arrobject, int n2, int n3, int n4, Comparator comparator) {
        return o.b(arrobject, n2, n3, n4, comparator);
    }

    static /* synthetic */ int b(Object[] arrobject, int n2, int n3, int n4) {
        return o.c(arrobject, n2, n3, n4);
    }

    static /* synthetic */ int a(int[] arrn, Object[] arrobject, int n2, int n3, int n4) {
        return o.b(arrn, arrobject, n2, n3, n4);
    }

    static /* synthetic */ int a(Object[] arrobject, Object[] arrobject2, int n2, int n3, int n4) {
        return o.c(arrobject, arrobject2, n2, n3, n4);
    }

    static /* synthetic */ void c(Object[] arrobject, Object[] arrobject2, int n2, int n3) {
        o.d(arrobject, arrobject2, n2, n3);
    }

    static /* synthetic */ void b(Object[] arrobject, Object[] arrobject2, int n2, int n3, int n4) {
        o.d(arrobject, arrobject2, n2, n3, n4);
    }
}

