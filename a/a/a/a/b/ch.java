/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.b;

import a.a.a.a.a;
import a.a.a.a.b.ci;
import a.a.a.a.b.cj;
import a.a.a.a.b.ck;
import a.a.a.a.b.cl;
import a.a.a.a.b.cm;
import a.a.a.a.b.cn;
import a.a.a.a.b.co;
import a.a.a.a.b.cp;
import a.a.a.a.b.cq;
import a.a.a.a.b.cy;
import a.a.a.a.f;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class ch {
    public static final long[] a = new long[0];
    private static final int d = 16;
    private static final int e = 8192;
    private static final int f = 128;
    private static final int g = 16;
    private static final int h = 8;
    private static final int i = 255;
    private static final int j = 8;
    private static final int k = 1024;
    private static final int l = 1024;
    protected static final cq b = new cq(-1, -1, -1);
    public static final f c = new cl(null);

    private ch() {
    }

    public static long[] a(long[] arrl, int n2) {
        if (n2 > arrl.length) {
            long[] arrl2 = new long[n2];
            System.arraycopy(arrl, 0, arrl2, 0, arrl.length);
            return arrl2;
        }
        return arrl;
    }

    public static long[] a(long[] arrl, int n2, int n3) {
        if (n2 > arrl.length) {
            long[] arrl2 = new long[n2];
            System.arraycopy(arrl, 0, arrl2, 0, n3);
            return arrl2;
        }
        return arrl;
    }

    public static long[] b(long[] arrl, int n2) {
        if (n2 > arrl.length) {
            int n3 = (int)Math.max(Math.min(2L * (long)arrl.length, 0x7FFFFFF7L), (long)n2);
            long[] arrl2 = new long[n3];
            System.arraycopy(arrl, 0, arrl2, 0, arrl.length);
            return arrl2;
        }
        return arrl;
    }

    public static long[] b(long[] arrl, int n2, int n3) {
        if (n2 > arrl.length) {
            int n4 = (int)Math.max(Math.min(2L * (long)arrl.length, 0x7FFFFFF7L), (long)n2);
            long[] arrl2 = new long[n4];
            System.arraycopy(arrl, 0, arrl2, 0, n3);
            return arrl2;
        }
        return arrl;
    }

    public static long[] c(long[] arrl, int n2) {
        if (n2 >= arrl.length) {
            return arrl;
        }
        long[] arrl2 = n2 == 0 ? a : new long[n2];
        System.arraycopy(arrl, 0, arrl2, 0, n2);
        return arrl2;
    }

    public static long[] d(long[] arrl, int n2) {
        if (n2 == arrl.length) {
            return arrl;
        }
        if (n2 < arrl.length) {
            return ch.c(arrl, n2);
        }
        return ch.a(arrl, n2);
    }

    public static long[] c(long[] arrl, int n2, int n3) {
        ch.e(arrl, n2, n3);
        long[] arrl2 = n3 == 0 ? a : new long[n3];
        System.arraycopy(arrl, n2, arrl2, 0, n3);
        return arrl2;
    }

    public static long[] a(long[] arrl) {
        return (long[])arrl.clone();
    }

    public static void a(long[] arrl, long l2) {
        int n2 = arrl.length;
        while (n2-- != 0) {
            arrl[n2] = l2;
        }
    }

    public static void a(long[] arrl, int n2, int n3, long l2) {
        ch.d(arrl, n2, n3);
        if (n2 == 0) {
            while (n3-- != 0) {
                arrl[n3] = l2;
            }
        } else {
            for (int i2 = n2; i2 < n3; ++i2) {
                arrl[i2] = l2;
            }
        }
    }

    public static boolean a(long[] arrl, long[] arrl2) {
        int n2 = arrl.length;
        if (n2 != arrl2.length) {
            return false;
        }
        while (n2-- != 0) {
            if (arrl[n2] == arrl2[n2]) continue;
            return false;
        }
        return true;
    }

    public static void d(long[] arrl, int n2, int n3) {
        a.a.a.a.a.a(arrl.length, n2, n3);
    }

    public static void e(long[] arrl, int n2, int n3) {
        a.a.a.a.a.b(arrl.length, n2, n3);
    }

    public static void b(long[] arrl, long[] arrl2) {
        if (arrl.length != arrl2.length) {
            throw new IllegalArgumentException("Array size mismatch: " + arrl.length + " != " + arrl2.length);
        }
    }

    public static void f(long[] arrl, int n2, int n3) {
        long l2 = arrl[n2];
        arrl[n2] = arrl[n3];
        arrl[n3] = l2;
    }

    public static void a(long[] arrl, int n2, int n3, int n4) {
        int n5 = 0;
        while (n5 < n4) {
            ch.f(arrl, n2, n3);
            ++n5;
            ++n2;
            ++n3;
        }
    }

    private static int b(long[] arrl, int n2, int n3, int n4, cy cy2) {
        int n5 = cy2.a(arrl[n2], arrl[n3]);
        int n6 = cy2.a(arrl[n2], arrl[n4]);
        int n7 = cy2.a(arrl[n3], arrl[n4]);
        return n5 < 0 ? (n7 < 0 ? n3 : (n6 < 0 ? n4 : n2)) : (n7 > 0 ? n3 : (n6 > 0 ? n4 : n2));
    }

    private static void d(long[] arrl, int n2, int n3, cy cy2) {
        for (int i2 = n2; i2 < n3 - 1; ++i2) {
            int n4 = i2;
            for (int i3 = i2 + 1; i3 < n3; ++i3) {
                if (cy2.a(arrl[i3], arrl[n4]) >= 0) continue;
                n4 = i3;
            }
            if (n4 == i2) continue;
            long l2 = arrl[i2];
            arrl[i2] = arrl[n4];
            arrl[n4] = l2;
        }
    }

    private static void e(long[] arrl, int n2, int n3, cy cy2) {
        int n4 = n2;
        while (++n4 < n3) {
            long l2 = arrl[n4];
            int n5 = n4;
            long l3 = arrl[n5 - 1];
            while (cy2.a(l2, l3) < 0) {
                arrl[n5] = l3;
                if (n2 == n5 - 1) {
                    --n5;
                    break;
                }
                l3 = arrl[--n5 - 1];
            }
            arrl[n5] = l2;
        }
    }

    public static void a(long[] arrl, int n2, int n3, cy cy2) {
        int n4;
        int n5;
        int n6;
        int n7 = n3 - n2;
        if (n7 < 16) {
            ch.d(arrl, n2, n3, cy2);
            return;
        }
        int n8 = n2 + n7 / 2;
        int n9 = n2;
        int n10 = n3 - 1;
        if (n7 > 128) {
            int n11 = n7 / 8;
            n9 = ch.b(arrl, n9, n9 + n11, n9 + 2 * n11, cy2);
            n8 = ch.b(arrl, n8 - n11, n8, n8 + n11, cy2);
            n10 = ch.b(arrl, n10 - 2 * n11, n10 - n11, n10, cy2);
        }
        n8 = ch.b(arrl, n9, n8, n10, cy2);
        long l2 = arrl[n8];
        int n12 = n6 = n2;
        int n13 = n5 = n3 - 1;
        while (true) {
            if (n12 <= n5 && (n4 = cy2.a(arrl[n12], l2)) <= 0) {
                if (n4 == 0) {
                    ch.f(arrl, n6++, n12);
                }
                ++n12;
                continue;
            }
            while (n5 >= n12 && (n4 = cy2.a(arrl[n5], l2)) >= 0) {
                if (n4 == 0) {
                    ch.f(arrl, n5, n13--);
                }
                --n5;
            }
            if (n12 > n5) break;
            ch.f(arrl, n12++, n5--);
        }
        n4 = Math.min(n6 - n2, n12 - n6);
        ch.a(arrl, n2, n12 - n4, n4);
        n4 = Math.min(n13 - n5, n3 - n13 - 1);
        ch.a(arrl, n12, n3 - n4, n4);
        n4 = n12 - n6;
        if (n4 > 1) {
            ch.a(arrl, n2, n2 + n4, cy2);
        }
        if ((n4 = n13 - n5) > 1) {
            ch.a(arrl, n3 - n4, n3, cy2);
        }
    }

    public static void a(long[] arrl, cy cy2) {
        ch.a(arrl, 0, arrl.length, cy2);
    }

    public static void b(long[] arrl, int n2, int n3, cy cy2) {
        if (n3 - n2 < 8192) {
            ch.a(arrl, n2, n3, cy2);
        } else {
            ForkJoinPool forkJoinPool = new ForkJoinPool(Runtime.getRuntime().availableProcessors());
            forkJoinPool.invoke(new co(arrl, n2, n3, cy2));
            forkJoinPool.shutdown();
        }
    }

    public static void b(long[] arrl, cy cy2) {
        ch.b(arrl, 0, arrl.length, cy2);
    }

    private static int c(long[] arrl, int n2, int n3, int n4) {
        int n5 = Long.compare(arrl[n2], arrl[n3]);
        int n6 = Long.compare(arrl[n2], arrl[n4]);
        int n7 = Long.compare(arrl[n3], arrl[n4]);
        return n5 < 0 ? (n7 < 0 ? n3 : (n6 < 0 ? n4 : n2)) : (n7 > 0 ? n3 : (n6 > 0 ? n4 : n2));
    }

    private static void m(long[] arrl, int n2, int n3) {
        for (int i2 = n2; i2 < n3 - 1; ++i2) {
            int n4 = i2;
            for (int i3 = i2 + 1; i3 < n3; ++i3) {
                if (arrl[i3] >= arrl[n4]) continue;
                n4 = i3;
            }
            if (n4 == i2) continue;
            long l2 = arrl[i2];
            arrl[i2] = arrl[n4];
            arrl[n4] = l2;
        }
    }

    private static void n(long[] arrl, int n2, int n3) {
        int n4 = n2;
        while (++n4 < n3) {
            long l2 = arrl[n4];
            int n5 = n4;
            long l3 = arrl[n5 - 1];
            while (l2 < l3) {
                arrl[n5] = l3;
                if (n2 == n5 - 1) {
                    --n5;
                    break;
                }
                l3 = arrl[--n5 - 1];
            }
            arrl[n5] = l2;
        }
    }

    public static void g(long[] arrl, int n2, int n3) {
        int n4;
        int n5;
        int n6;
        int n7 = n3 - n2;
        if (n7 < 16) {
            ch.m(arrl, n2, n3);
            return;
        }
        int n8 = n2 + n7 / 2;
        int n9 = n2;
        int n10 = n3 - 1;
        if (n7 > 128) {
            int n11 = n7 / 8;
            n9 = ch.c(arrl, n9, n9 + n11, n9 + 2 * n11);
            n8 = ch.c(arrl, n8 - n11, n8, n8 + n11);
            n10 = ch.c(arrl, n10 - 2 * n11, n10 - n11, n10);
        }
        n8 = ch.c(arrl, n9, n8, n10);
        long l2 = arrl[n8];
        int n12 = n6 = n2;
        int n13 = n5 = n3 - 1;
        while (true) {
            if (n12 <= n5 && (n4 = Long.compare(arrl[n12], l2)) <= 0) {
                if (n4 == 0) {
                    ch.f(arrl, n6++, n12);
                }
                ++n12;
                continue;
            }
            while (n5 >= n12 && (n4 = Long.compare(arrl[n5], l2)) >= 0) {
                if (n4 == 0) {
                    ch.f(arrl, n5, n13--);
                }
                --n5;
            }
            if (n12 > n5) break;
            ch.f(arrl, n12++, n5--);
        }
        n4 = Math.min(n6 - n2, n12 - n6);
        ch.a(arrl, n2, n12 - n4, n4);
        n4 = Math.min(n13 - n5, n3 - n13 - 1);
        ch.a(arrl, n12, n3 - n4, n4);
        n4 = n12 - n6;
        if (n4 > 1) {
            ch.g(arrl, n2, n2 + n4);
        }
        if ((n4 = n13 - n5) > 1) {
            ch.g(arrl, n3 - n4, n3);
        }
    }

    public static void b(long[] arrl) {
        ch.g(arrl, 0, arrl.length);
    }

    public static void h(long[] arrl, int n2, int n3) {
        if (n3 - n2 < 8192) {
            ch.g(arrl, n2, n3);
        } else {
            ForkJoinPool forkJoinPool = new ForkJoinPool(Runtime.getRuntime().availableProcessors());
            forkJoinPool.invoke(new cm(arrl, n2, n3));
            forkJoinPool.shutdown();
        }
    }

    public static void c(long[] arrl) {
        ch.h(arrl, 0, arrl.length);
    }

    private static int b(int[] arrn, long[] arrl, int n2, int n3, int n4) {
        long l2 = arrl[arrn[n2]];
        long l3 = arrl[arrn[n3]];
        long l4 = arrl[arrn[n4]];
        int n5 = Long.compare(l2, l3);
        int n6 = Long.compare(l2, l4);
        int n7 = Long.compare(l3, l4);
        return n5 < 0 ? (n7 < 0 ? n3 : (n6 < 0 ? n4 : n2)) : (n7 > 0 ? n3 : (n6 > 0 ? n4 : n2));
    }

    private static void d(int[] arrn, long[] arrl, int n2, int n3) {
        int n4 = n2;
        while (++n4 < n3) {
            int n5 = arrn[n4];
            int n6 = n4;
            int n7 = arrn[n6 - 1];
            while (arrl[n5] < arrl[n7]) {
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

    public static void a(int[] arrn, long[] arrl, int n2, int n3) {
        int n4;
        int n5;
        int n6;
        int n7 = n3 - n2;
        if (n7 < 16) {
            ch.d(arrn, arrl, n2, n3);
            return;
        }
        int n8 = n2 + n7 / 2;
        int n9 = n2;
        int n10 = n3 - 1;
        if (n7 > 128) {
            int n11 = n7 / 8;
            n9 = ch.b(arrn, arrl, n9, n9 + n11, n9 + 2 * n11);
            n8 = ch.b(arrn, arrl, n8 - n11, n8, n8 + n11);
            n10 = ch.b(arrn, arrl, n10 - 2 * n11, n10 - n11, n10);
        }
        n8 = ch.b(arrn, arrl, n9, n8, n10);
        long l2 = arrl[arrn[n8]];
        int n12 = n6 = n2;
        int n13 = n5 = n3 - 1;
        while (true) {
            if (n12 <= n5 && (n4 = Long.compare(arrl[arrn[n12]], l2)) <= 0) {
                if (n4 == 0) {
                    a.a.a.a.a.ch.f(arrn, n6++, n12);
                }
                ++n12;
                continue;
            }
            while (n5 >= n12 && (n4 = Long.compare(arrl[arrn[n5]], l2)) >= 0) {
                if (n4 == 0) {
                    a.a.a.a.a.ch.f(arrn, n5, n13--);
                }
                --n5;
            }
            if (n12 > n5) break;
            a.a.a.a.a.ch.f(arrn, n12++, n5--);
        }
        n4 = Math.min(n6 - n2, n12 - n6);
        a.a.a.a.a.ch.b(arrn, n2, n12 - n4, n4);
        n4 = Math.min(n13 - n5, n3 - n13 - 1);
        a.a.a.a.a.ch.b(arrn, n12, n3 - n4, n4);
        n4 = n12 - n6;
        if (n4 > 1) {
            ch.a(arrn, arrl, n2, n2 + n4);
        }
        if ((n4 = n13 - n5) > 1) {
            ch.a(arrn, arrl, n3 - n4, n3);
        }
    }

    public static void a(int[] arrn, long[] arrl) {
        ch.a(arrn, arrl, 0, arrl.length);
    }

    public static void b(int[] arrn, long[] arrl, int n2, int n3) {
        if (n3 - n2 < 8192) {
            ch.a(arrn, arrl, n2, n3);
        } else {
            ForkJoinPool forkJoinPool = new ForkJoinPool(Runtime.getRuntime().availableProcessors());
            forkJoinPool.invoke(new cp(arrn, arrl, n2, n3));
            forkJoinPool.shutdown();
        }
    }

    public static void b(int[] arrn, long[] arrl) {
        ch.b(arrn, arrl, 0, arrl.length);
    }

    public static void c(int[] arrn, long[] arrl, int n2, int n3) {
        int n4 = n2;
        for (int i2 = n2 + 1; i2 < n3; ++i2) {
            if (arrl[arrn[i2]] == arrl[arrn[n4]]) continue;
            if (i2 - n4 > 1) {
                a.a.a.a.a.ch.h(arrn, n4, i2);
            }
            n4 = i2;
        }
        if (n3 - n4 > 1) {
            a.a.a.a.a.ch.h(arrn, n4, n3);
        }
    }

    public static void c(int[] arrn, long[] arrl) {
        ch.c(arrn, arrl, 0, arrn.length);
    }

    private static int c(long[] arrl, long[] arrl2, int n2, int n3, int n4) {
        int n5;
        int n6 = Long.compare(arrl[n2], arrl[n3]);
        int n7 = n6 == 0 ? Long.compare(arrl2[n2], arrl2[n3]) : n6;
        n6 = Long.compare(arrl[n2], arrl[n4]);
        int n8 = n6 == 0 ? Long.compare(arrl2[n2], arrl2[n4]) : n6;
        n6 = Long.compare(arrl[n3], arrl[n4]);
        int n9 = n5 = n6 == 0 ? Long.compare(arrl2[n3], arrl2[n4]) : n6;
        return n7 < 0 ? (n5 < 0 ? n3 : (n8 < 0 ? n4 : n2)) : (n5 > 0 ? n3 : (n8 > 0 ? n4 : n2));
    }

    private static void f(long[] arrl, long[] arrl2, int n2, int n3) {
        long l2 = arrl[n2];
        long l3 = arrl2[n2];
        arrl[n2] = arrl[n3];
        arrl2[n2] = arrl2[n3];
        arrl[n3] = l2;
        arrl2[n3] = l3;
    }

    private static void d(long[] arrl, long[] arrl2, int n2, int n3, int n4) {
        int n5 = 0;
        while (n5 < n4) {
            ch.f(arrl, arrl2, n2, n3);
            ++n5;
            ++n2;
            ++n3;
        }
    }

    private static void g(long[] arrl, long[] arrl2, int n2, int n3) {
        for (int i2 = n2; i2 < n3 - 1; ++i2) {
            int n4 = i2;
            for (int i3 = i2 + 1; i3 < n3; ++i3) {
                int n5 = Long.compare(arrl[i3], arrl[n4]);
                if (n5 >= 0 && (n5 != 0 || arrl2[i3] >= arrl2[n4])) continue;
                n4 = i3;
            }
            if (n4 == i2) continue;
            long l2 = arrl[i2];
            arrl[i2] = arrl[n4];
            arrl[n4] = l2;
            l2 = arrl2[i2];
            arrl2[i2] = arrl2[n4];
            arrl2[n4] = l2;
        }
    }

    public static void a(long[] arrl, long[] arrl2, int n2, int n3) {
        int n4;
        int n5;
        int n6;
        int n7 = n3 - n2;
        if (n7 < 16) {
            ch.g(arrl, arrl2, n2, n3);
            return;
        }
        int n8 = n2 + n7 / 2;
        int n9 = n2;
        int n10 = n3 - 1;
        if (n7 > 128) {
            int n11 = n7 / 8;
            n9 = ch.c(arrl, arrl2, n9, n9 + n11, n9 + 2 * n11);
            n8 = ch.c(arrl, arrl2, n8 - n11, n8, n8 + n11);
            n10 = ch.c(arrl, arrl2, n10 - 2 * n11, n10 - n11, n10);
        }
        n8 = ch.c(arrl, arrl2, n9, n8, n10);
        long l2 = arrl[n8];
        long l3 = arrl2[n8];
        int n12 = n6 = n2;
        int n13 = n5 = n3 - 1;
        while (true) {
            int n14;
            if (n12 <= n5 && (n4 = (n14 = Long.compare(arrl[n12], l2)) == 0 ? Long.compare(arrl2[n12], l3) : n14) <= 0) {
                if (n4 == 0) {
                    ch.f(arrl, arrl2, n6++, n12);
                }
                ++n12;
                continue;
            }
            while (n5 >= n12 && (n4 = (n14 = Long.compare(arrl[n5], l2)) == 0 ? Long.compare(arrl2[n5], l3) : n14) >= 0) {
                if (n4 == 0) {
                    ch.f(arrl, arrl2, n5, n13--);
                }
                --n5;
            }
            if (n12 > n5) break;
            ch.f(arrl, arrl2, n12++, n5--);
        }
        n4 = Math.min(n6 - n2, n12 - n6);
        ch.d(arrl, arrl2, n2, n12 - n4, n4);
        n4 = Math.min(n13 - n5, n3 - n13 - 1);
        ch.d(arrl, arrl2, n12, n3 - n4, n4);
        n4 = n12 - n6;
        if (n4 > 1) {
            ch.a(arrl, arrl2, n2, n2 + n4);
        }
        if ((n4 = n13 - n5) > 1) {
            ch.a(arrl, arrl2, n3 - n4, n3);
        }
    }

    public static void c(long[] arrl, long[] arrl2) {
        ch.b(arrl, arrl2);
        ch.a(arrl, arrl2, 0, arrl.length);
    }

    public static void b(long[] arrl, long[] arrl2, int n2, int n3) {
        if (n3 - n2 < 8192) {
            ch.a(arrl, arrl2, n2, n3);
        }
        ForkJoinPool forkJoinPool = new ForkJoinPool(Runtime.getRuntime().availableProcessors());
        forkJoinPool.invoke(new cn(arrl, arrl2, n2, n3));
        forkJoinPool.shutdown();
    }

    public static void d(long[] arrl, long[] arrl2) {
        ch.b(arrl, arrl2);
        ch.b(arrl, arrl2, 0, arrl.length);
    }

    public static void a(long[] arrl, int n2, int n3, long[] arrl2) {
        int n4 = n3 - n2;
        if (n4 < 16) {
            ch.n(arrl, n2, n3);
            return;
        }
        int n5 = n2 + n3 >>> 1;
        ch.a(arrl2, n2, n5, arrl);
        ch.a(arrl2, n5, n3, arrl);
        if (arrl2[n5 - 1] <= arrl2[n5]) {
            System.arraycopy(arrl2, n2, arrl, n2, n4);
            return;
        }
        int n6 = n2;
        int n7 = n5;
        for (int i2 = n2; i2 < n3; ++i2) {
            arrl[i2] = n7 >= n3 || n6 < n5 && arrl2[n6] <= arrl2[n7] ? arrl2[n6++] : arrl2[n7++];
        }
    }

    public static void i(long[] arrl, int n2, int n3) {
        ch.a(arrl, n2, n3, (long[])arrl.clone());
    }

    public static void d(long[] arrl) {
        ch.i(arrl, 0, arrl.length);
    }

    public static void a(long[] arrl, int n2, int n3, cy cy2, long[] arrl2) {
        int n4 = n3 - n2;
        if (n4 < 16) {
            ch.e(arrl, n2, n3, cy2);
            return;
        }
        int n5 = n2 + n3 >>> 1;
        ch.a(arrl2, n2, n5, cy2, arrl);
        ch.a(arrl2, n5, n3, cy2, arrl);
        if (cy2.a(arrl2[n5 - 1], arrl2[n5]) <= 0) {
            System.arraycopy(arrl2, n2, arrl, n2, n4);
            return;
        }
        int n6 = n2;
        int n7 = n5;
        for (int i2 = n2; i2 < n3; ++i2) {
            arrl[i2] = n7 >= n3 || n6 < n5 && cy2.a(arrl2[n6], arrl2[n7]) <= 0 ? arrl2[n6++] : arrl2[n7++];
        }
    }

    public static void c(long[] arrl, int n2, int n3, cy cy2) {
        ch.a(arrl, n2, n3, cy2, (long[])arrl.clone());
    }

    public static void c(long[] arrl, cy cy2) {
        ch.c(arrl, 0, arrl.length, cy2);
    }

    public static int b(long[] arrl, int n2, int n3, long l2) {
        --n3;
        while (n2 <= n3) {
            int n4 = n2 + n3 >>> 1;
            long l3 = arrl[n4];
            if (l3 < l2) {
                n2 = n4 + 1;
                continue;
            }
            if (l3 > l2) {
                n3 = n4 - 1;
                continue;
            }
            return n4;
        }
        return -(n2 + 1);
    }

    public static int b(long[] arrl, long l2) {
        return ch.b(arrl, 0, arrl.length, l2);
    }

    public static int a(long[] arrl, int n2, int n3, long l2, cy cy2) {
        --n3;
        while (n2 <= n3) {
            int n4 = n2 + n3 >>> 1;
            long l3 = arrl[n4];
            int n5 = cy2.a(l3, l2);
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

    public static int a(long[] arrl, long l2, cy cy2) {
        return ch.a(arrl, 0, arrl.length, l2, cy2);
    }

    public static void e(long[] arrl) {
        ch.j(arrl, 0, arrl.length);
    }

    public static void j(long[] arrl, int n2, int n3) {
        if (n3 - n2 < 1024) {
            ch.g(arrl, n2, n3);
            return;
        }
        int n4 = 7;
        int n5 = 1786;
        int n6 = 0;
        int[] arrn = new int[1786];
        int[] arrn2 = new int[1786];
        int[] arrn3 = new int[1786];
        arrn[n6] = n2;
        arrn2[n6] = n3 - n2;
        arrn3[n6++] = 0;
        int[] arrn4 = new int[256];
        int[] arrn5 = new int[256];
        while (n6 > 0) {
            int n7;
            int n8 = arrn[--n6];
            int n9 = arrn2[n6];
            int n10 = arrn3[n6];
            int n11 = n10 % 8 == 0 ? 128 : 0;
            int n12 = (7 - n10 % 8) * 8;
            int n13 = n8 + n9;
            while (n13-- != n8) {
                int n14 = (int)(arrl[n13] >>> n12 & 0xFFL ^ (long)n11);
                arrn4[n14] = arrn4[n14] + 1;
            }
            n13 = -1;
            int n15 = n8;
            for (n7 = 0; n7 < 256; ++n7) {
                if (arrn4[n7] != 0) {
                    n13 = n7;
                }
                arrn5[n7] = n15 += arrn4[n7];
            }
            n7 = n8 + n9 - arrn4[n13];
            int n16 = -1;
            for (n15 = n8; n15 <= n7; n15 += arrn4[n16]) {
                long l2 = arrl[n15];
                n16 = (int)(l2 >>> n12 & 0xFFL ^ (long)n11);
                if (n15 < n7) {
                    while (true) {
                        int n17 = n16;
                        int n18 = arrn5[n17] - 1;
                        arrn5[n17] = n18;
                        int n19 = n18;
                        if (n18 <= n15) break;
                        long l3 = l2;
                        l2 = arrl[n19];
                        arrl[n19] = l3;
                        n16 = (int)(l2 >>> n12 & 0xFFL ^ (long)n11);
                    }
                    arrl[n15] = l2;
                }
                if (n10 < 7 && arrn4[n16] > 1) {
                    if (arrn4[n16] < 1024) {
                        ch.g(arrl, n15, n15 + arrn4[n16]);
                    } else {
                        arrn[n6] = n15;
                        arrn2[n6] = arrn4[n16];
                        arrn3[n6++] = n10 + 1;
                    }
                }
                arrn4[n16] = 0;
            }
        }
    }

    public static void k(long[] arrl, int n2, int n3) {
        if (n3 - n2 < 1024) {
            ch.g(arrl, n2, n3);
            return;
        }
        int n4 = 7;
        LinkedBlockingQueue<cq> linkedBlockingQueue = new LinkedBlockingQueue<cq>();
        linkedBlockingQueue.add(new cq(n2, n3 - n2, 0));
        AtomicInteger atomicInteger = new AtomicInteger(1);
        int n5 = Runtime.getRuntime().availableProcessors();
        ExecutorService executorService = Executors.newFixedThreadPool(n5, Executors.defaultThreadFactory());
        ExecutorCompletionService executorCompletionService = new ExecutorCompletionService(executorService);
        int n6 = n5;
        while (n6-- != 0) {
            executorCompletionService.submit(new ci(atomicInteger, n5, linkedBlockingQueue, arrl));
        }
        Throwable throwable = null;
        int n7 = n5;
        while (n7-- != 0) {
            try {
                executorCompletionService.take().get();
            }
            catch (Exception exception) {
                throwable = exception.getCause();
            }
        }
        executorService.shutdown();
        if (throwable != null) {
            throw throwable instanceof RuntimeException ? (RuntimeException)throwable : new RuntimeException(throwable);
        }
    }

    public static void f(long[] arrl) {
        ch.k(arrl, 0, arrl.length);
    }

    public static void a(int[] arrn, long[] arrl, boolean bl2) {
        ch.a(arrn, arrl, 0, arrn.length, bl2);
    }

    public static void a(int[] arrn, long[] arrl, int n2, int n3, boolean bl2) {
        int[] arrn2;
        if (n3 - n2 < 1024) {
            ch.d(arrn, arrl, n2, n3);
            return;
        }
        int n4 = 7;
        int n5 = 1786;
        int n6 = 0;
        int[] arrn3 = new int[1786];
        int[] arrn4 = new int[1786];
        int[] arrn5 = new int[1786];
        arrn3[n6] = n2;
        arrn4[n6] = n3 - n2;
        arrn5[n6++] = 0;
        int[] arrn6 = new int[256];
        int[] arrn7 = new int[256];
        int[] arrn8 = arrn2 = bl2 ? new int[arrn.length] : null;
        while (n6 > 0) {
            int n7;
            int n8;
            int n9 = arrn3[--n6];
            int n10 = arrn4[n6];
            int n11 = arrn5[n6];
            int n12 = n11 % 8 == 0 ? 128 : 0;
            int n13 = (7 - n11 % 8) * 8;
            int n14 = n9 + n10;
            while (n14-- != n9) {
                int n15 = (int)(arrl[arrn[n14]] >>> n13 & 0xFFL ^ (long)n12);
                arrn6[n15] = arrn6[n15] + 1;
            }
            n14 = -1;
            int n16 = n8 = bl2 ? 0 : n9;
            for (n7 = 0; n7 < 256; ++n7) {
                if (arrn6[n7] != 0) {
                    n14 = n7;
                }
                arrn7[n7] = n8 += arrn6[n7];
            }
            if (bl2) {
                n7 = n9 + n10;
                while (n7-- != n9) {
                    int n17 = (int)(arrl[arrn[n7]] >>> n13 & 0xFFL ^ (long)n12);
                    int n18 = arrn7[n17] - 1;
                    arrn7[n17] = n18;
                    arrn2[n18] = arrn[n7];
                }
                System.arraycopy(arrn2, 0, arrn, n9, n10);
                n8 = n9;
                for (n7 = 0; n7 <= n14; ++n7) {
                    if (n11 < 7 && arrn6[n7] > 1) {
                        if (arrn6[n7] < 1024) {
                            ch.d(arrn, arrl, n8, n8 + arrn6[n7]);
                        } else {
                            arrn3[n6] = n8;
                            arrn4[n6] = arrn6[n7];
                            arrn5[n6++] = n11 + 1;
                        }
                    }
                    n8 += arrn6[n7];
                }
                Arrays.fill(arrn6, 0);
                continue;
            }
            n7 = n9 + n10 - arrn6[n14];
            int n19 = -1;
            for (n8 = n9; n8 <= n7; n8 += arrn6[n19]) {
                int n20 = arrn[n8];
                n19 = (int)(arrl[n20] >>> n13 & 0xFFL ^ (long)n12);
                if (n8 < n7) {
                    while (true) {
                        int n21 = n19;
                        int n22 = arrn7[n21] - 1;
                        arrn7[n21] = n22;
                        int n23 = n22;
                        if (n22 <= n8) break;
                        int n24 = n20;
                        n20 = arrn[n23];
                        arrn[n23] = n24;
                        n19 = (int)(arrl[n20] >>> n13 & 0xFFL ^ (long)n12);
                    }
                    arrn[n8] = n20;
                }
                if (n11 < 7 && arrn6[n19] > 1) {
                    if (arrn6[n19] < 1024) {
                        ch.d(arrn, arrl, n8, n8 + arrn6[n19]);
                    } else {
                        arrn3[n6] = n8;
                        arrn4[n6] = arrn6[n19];
                        arrn5[n6++] = n11 + 1;
                    }
                }
                arrn6[n19] = 0;
            }
        }
    }

    public static void b(int[] arrn, long[] arrl, int n2, int n3, boolean bl2) {
        if (n3 - n2 < 1024) {
            ch.a(arrn, arrl, n2, n3, bl2);
            return;
        }
        int n4 = 7;
        LinkedBlockingQueue<cq> linkedBlockingQueue = new LinkedBlockingQueue<cq>();
        linkedBlockingQueue.add(new cq(n2, n3 - n2, 0));
        AtomicInteger atomicInteger = new AtomicInteger(1);
        int n5 = Runtime.getRuntime().availableProcessors();
        ExecutorService executorService = Executors.newFixedThreadPool(n5, Executors.defaultThreadFactory());
        ExecutorCompletionService executorCompletionService = new ExecutorCompletionService(executorService);
        int[] arrn2 = bl2 ? new int[arrn.length] : null;
        int n6 = n5;
        while (n6-- != 0) {
            executorCompletionService.submit(new cj(atomicInteger, n5, linkedBlockingQueue, arrl, arrn, bl2, arrn2));
        }
        Throwable throwable = null;
        int n7 = n5;
        while (n7-- != 0) {
            try {
                executorCompletionService.take().get();
            }
            catch (Exception exception) {
                throwable = exception.getCause();
            }
        }
        executorService.shutdown();
        if (throwable != null) {
            throw throwable instanceof RuntimeException ? (RuntimeException)throwable : new RuntimeException(throwable);
        }
    }

    public static void b(int[] arrn, long[] arrl, boolean bl2) {
        ch.b(arrn, arrl, 0, arrl.length, bl2);
    }

    public static void e(long[] arrl, long[] arrl2) {
        ch.b(arrl, arrl2);
        ch.c(arrl, arrl2, 0, arrl.length);
    }

    public static void c(long[] arrl, long[] arrl2, int n2, int n3) {
        if (n3 - n2 < 1024) {
            ch.g(arrl, arrl2, n2, n3);
            return;
        }
        int n4 = 2;
        int n5 = 15;
        int n6 = 3826;
        int n7 = 0;
        int[] arrn = new int[3826];
        int[] arrn2 = new int[3826];
        int[] arrn3 = new int[3826];
        arrn[n7] = n2;
        arrn2[n7] = n3 - n2;
        arrn3[n7++] = 0;
        int[] arrn4 = new int[256];
        int[] arrn5 = new int[256];
        while (n7 > 0) {
            int n8;
            int n9 = arrn[--n7];
            int n10 = arrn2[n7];
            int n11 = arrn3[n7];
            int n12 = n11 % 8 == 0 ? 128 : 0;
            long[] arrl3 = n11 < 8 ? arrl : arrl2;
            int n13 = (7 - n11 % 8) * 8;
            int n14 = n9 + n10;
            while (n14-- != n9) {
                int n15 = (int)(arrl3[n14] >>> n13 & 0xFFL ^ (long)n12);
                arrn4[n15] = arrn4[n15] + 1;
            }
            n14 = -1;
            int n16 = n9;
            for (n8 = 0; n8 < 256; ++n8) {
                if (arrn4[n8] != 0) {
                    n14 = n8;
                }
                arrn5[n8] = n16 += arrn4[n8];
            }
            n8 = n9 + n10 - arrn4[n14];
            int n17 = -1;
            for (n16 = n9; n16 <= n8; n16 += arrn4[n17]) {
                long l2 = arrl[n16];
                long l3 = arrl2[n16];
                n17 = (int)(arrl3[n16] >>> n13 & 0xFFL ^ (long)n12);
                if (n16 < n8) {
                    while (true) {
                        int n18 = n17;
                        int n19 = arrn5[n18] - 1;
                        arrn5[n18] = n19;
                        int n20 = n19;
                        if (n19 <= n16) break;
                        n17 = (int)(arrl3[n20] >>> n13 & 0xFFL ^ (long)n12);
                        long l4 = l2;
                        l2 = arrl[n20];
                        arrl[n20] = l4;
                        l4 = l3;
                        l3 = arrl2[n20];
                        arrl2[n20] = l4;
                    }
                    arrl[n16] = l2;
                    arrl2[n16] = l3;
                }
                if (n11 < 15 && arrn4[n17] > 1) {
                    if (arrn4[n17] < 1024) {
                        ch.g(arrl, arrl2, n16, n16 + arrn4[n17]);
                    } else {
                        arrn[n7] = n16;
                        arrn2[n7] = arrn4[n17];
                        arrn3[n7++] = n11 + 1;
                    }
                }
                arrn4[n17] = 0;
            }
        }
    }

    public static void d(long[] arrl, long[] arrl2, int n2, int n3) {
        if (n3 - n2 < 1024) {
            ch.a(arrl, arrl2, n2, n3);
            return;
        }
        int n4 = 2;
        if (arrl.length != arrl2.length) {
            throw new IllegalArgumentException("Array size mismatch.");
        }
        int n5 = 15;
        LinkedBlockingQueue<cq> linkedBlockingQueue = new LinkedBlockingQueue<cq>();
        linkedBlockingQueue.add(new cq(n2, n3 - n2, 0));
        AtomicInteger atomicInteger = new AtomicInteger(1);
        int n6 = Runtime.getRuntime().availableProcessors();
        ExecutorService executorService = Executors.newFixedThreadPool(n6, Executors.defaultThreadFactory());
        ExecutorCompletionService executorCompletionService = new ExecutorCompletionService(executorService);
        int n7 = n6;
        while (n7-- != 0) {
            executorCompletionService.submit(new ck(atomicInteger, n6, linkedBlockingQueue, arrl, arrl2));
        }
        Throwable throwable = null;
        int n8 = n6;
        while (n8-- != 0) {
            try {
                executorCompletionService.take().get();
            }
            catch (Exception exception) {
                throwable = exception.getCause();
            }
        }
        executorService.shutdown();
        if (throwable != null) {
            throw throwable instanceof RuntimeException ? (RuntimeException)throwable : new RuntimeException(throwable);
        }
    }

    public static void f(long[] arrl, long[] arrl2) {
        ch.b(arrl, arrl2);
        ch.d(arrl, arrl2, 0, arrl.length);
    }

    private static void a(int[] arrn, long[] arrl, long[] arrl2, int n2, int n3) {
        int n4 = n2;
        while (++n4 < n3) {
            int n5 = arrn[n4];
            int n6 = n4;
            int n7 = arrn[n6 - 1];
            while (arrl[n5] < arrl[n7] || arrl[n5] == arrl[n7] && arrl2[n5] < arrl2[n7]) {
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

    public static void a(int[] arrn, long[] arrl, long[] arrl2, boolean bl2) {
        ch.b(arrl, arrl2);
        ch.a(arrn, arrl, arrl2, 0, arrl.length, bl2);
    }

    public static void a(int[] arrn, long[] arrl, long[] arrl2, int n2, int n3, boolean bl2) {
        int[] arrn2;
        if (n3 - n2 < 1024) {
            ch.a(arrn, arrl, arrl2, n2, n3);
            return;
        }
        int n4 = 2;
        int n5 = 15;
        int n6 = 3826;
        int n7 = 0;
        int[] arrn3 = new int[3826];
        int[] arrn4 = new int[3826];
        int[] arrn5 = new int[3826];
        arrn3[n7] = n2;
        arrn4[n7] = n3 - n2;
        arrn5[n7++] = 0;
        int[] arrn6 = new int[256];
        int[] arrn7 = new int[256];
        int[] arrn8 = arrn2 = bl2 ? new int[arrn.length] : null;
        while (n7 > 0) {
            int n8;
            int n9;
            int n10 = arrn3[--n7];
            int n11 = arrn4[n7];
            int n12 = arrn5[n7];
            int n13 = n12 % 8 == 0 ? 128 : 0;
            long[] arrl3 = n12 < 8 ? arrl : arrl2;
            int n14 = (7 - n12 % 8) * 8;
            int n15 = n10 + n11;
            while (n15-- != n10) {
                int n16 = (int)(arrl3[arrn[n15]] >>> n14 & 0xFFL ^ (long)n13);
                arrn6[n16] = arrn6[n16] + 1;
            }
            n15 = -1;
            int n17 = n9 = bl2 ? 0 : n10;
            for (n8 = 0; n8 < 256; ++n8) {
                if (arrn6[n8] != 0) {
                    n15 = n8;
                }
                arrn7[n8] = n9 += arrn6[n8];
            }
            if (bl2) {
                n8 = n10 + n11;
                while (n8-- != n10) {
                    int n18 = (int)(arrl3[arrn[n8]] >>> n14 & 0xFFL ^ (long)n13);
                    int n19 = arrn7[n18] - 1;
                    arrn7[n18] = n19;
                    arrn2[n19] = arrn[n8];
                }
                System.arraycopy(arrn2, 0, arrn, n10, n11);
                n9 = n10;
                for (n8 = 0; n8 < 256; ++n8) {
                    if (n12 < 15 && arrn6[n8] > 1) {
                        if (arrn6[n8] < 1024) {
                            ch.a(arrn, arrl, arrl2, n9, n9 + arrn6[n8]);
                        } else {
                            arrn3[n7] = n9;
                            arrn4[n7] = arrn6[n8];
                            arrn5[n7++] = n12 + 1;
                        }
                    }
                    n9 += arrn6[n8];
                }
                Arrays.fill(arrn6, 0);
                continue;
            }
            n8 = n10 + n11 - arrn6[n15];
            int n20 = -1;
            for (n9 = n10; n9 <= n8; n9 += arrn6[n20]) {
                int n21 = arrn[n9];
                n20 = (int)(arrl3[n21] >>> n14 & 0xFFL ^ (long)n13);
                if (n9 < n8) {
                    while (true) {
                        int n22 = n20;
                        int n23 = arrn7[n22] - 1;
                        arrn7[n22] = n23;
                        int n24 = n23;
                        if (n23 <= n9) break;
                        int n25 = n21;
                        n21 = arrn[n24];
                        arrn[n24] = n25;
                        n20 = (int)(arrl3[n21] >>> n14 & 0xFFL ^ (long)n13);
                    }
                    arrn[n9] = n21;
                }
                if (n12 < 15 && arrn6[n20] > 1) {
                    if (arrn6[n20] < 1024) {
                        ch.a(arrn, arrl, arrl2, n9, n9 + arrn6[n20]);
                    } else {
                        arrn3[n7] = n9;
                        arrn4[n7] = arrn6[n20];
                        arrn5[n7++] = n12 + 1;
                    }
                }
                arrn6[n20] = 0;
            }
        }
    }

    private static void a(long[][] arrl, int n2, int n3, int n4) {
        int n5 = arrl.length;
        int n6 = n4 / 8;
        for (int i2 = n2; i2 < n3 - 1; ++i2) {
            int n7;
            int n8 = i2;
            block1: for (n7 = i2 + 1; n7 < n3; ++n7) {
                for (int i3 = n6; i3 < n5; ++i3) {
                    if (arrl[i3][n7] < arrl[i3][n8]) {
                        n8 = n7;
                        continue block1;
                    }
                    if (arrl[i3][n7] > arrl[i3][n8]) continue block1;
                }
            }
            if (n8 == i2) continue;
            n7 = n5;
            while (n7-- != 0) {
                long l2 = arrl[n7][i2];
                arrl[n7][i2] = arrl[n7][n8];
                arrl[n7][n8] = l2;
            }
        }
    }

    public static void a(long[][] arrl) {
        ch.a(arrl, 0, arrl[0].length);
    }

    public static void a(long[][] arrl, int n2, int n3) {
        if (n3 - n2 < 1024) {
            ch.a(arrl, n2, n3, 0);
            return;
        }
        int n4 = arrl.length;
        int n5 = 8 * n4 - 1;
        int n6 = n4;
        int n7 = arrl[0].length;
        while (n6-- != 0) {
            if (arrl[n6].length == n7) continue;
            throw new IllegalArgumentException("The array of index " + n6 + " has not the same length of the array of index 0.");
        }
        n6 = 255 * (n4 * 8 - 1) + 1;
        n7 = 0;
        int[] arrn = new int[n6];
        int[] arrn2 = new int[n6];
        int[] arrn3 = new int[n6];
        arrn[n7] = n2;
        arrn2[n7] = n3 - n2;
        arrn3[n7++] = 0;
        int[] arrn4 = new int[256];
        int[] arrn5 = new int[256];
        long[] arrl2 = new long[n4];
        while (n7 > 0) {
            int n8;
            int n9 = arrn[--n7];
            int n10 = arrn2[n7];
            int n11 = arrn3[n7];
            int n12 = n11 % 8 == 0 ? 128 : 0;
            long[] arrl3 = arrl[n11 / 8];
            int n13 = (7 - n11 % 8) * 8;
            int n14 = n9 + n10;
            while (n14-- != n9) {
                int n15 = (int)(arrl3[n14] >>> n13 & 0xFFL ^ (long)n12);
                arrn4[n15] = arrn4[n15] + 1;
            }
            n14 = -1;
            int n16 = n9;
            for (n8 = 0; n8 < 256; ++n8) {
                if (arrn4[n8] != 0) {
                    n14 = n8;
                }
                arrn5[n8] = n16 += arrn4[n8];
            }
            n8 = n9 + n10 - arrn4[n14];
            int n17 = -1;
            for (n16 = n9; n16 <= n8; n16 += arrn4[n17]) {
                int n18 = n4;
                while (n18-- != 0) {
                    arrl2[n18] = arrl[n18][n16];
                }
                n17 = (int)(arrl3[n16] >>> n13 & 0xFFL ^ (long)n12);
                if (n16 < n8) {
                    block6: while (true) {
                        int n19 = n17;
                        int n20 = arrn5[n19] - 1;
                        arrn5[n19] = n20;
                        int n21 = n20;
                        if (n20 <= n16) break;
                        n17 = (int)(arrl3[n21] >>> n13 & 0xFFL ^ (long)n12);
                        n18 = n4;
                        while (true) {
                            if (n18-- == 0) continue block6;
                            long l2 = arrl2[n18];
                            arrl2[n18] = arrl[n18][n21];
                            arrl[n18][n21] = l2;
                        }
                        break;
                    }
                    n18 = n4;
                    while (n18-- != 0) {
                        arrl[n18][n16] = arrl2[n18];
                    }
                }
                if (n11 < n5 && arrn4[n17] > 1) {
                    if (arrn4[n17] < 1024) {
                        ch.a(arrl, n16, n16 + arrn4[n17], n11 + 1);
                    } else {
                        arrn[n7] = n16;
                        arrn2[n7] = arrn4[n17];
                        arrn3[n7++] = n11 + 1;
                    }
                }
                arrn4[n17] = 0;
            }
        }
    }

    public static long[] a(long[] arrl, int n2, int n3, Random random) {
        int n4 = n3 - n2;
        while (n4-- != 0) {
            int n5 = random.nextInt(n4 + 1);
            long l2 = arrl[n2 + n4];
            arrl[n2 + n4] = arrl[n2 + n5];
            arrl[n2 + n5] = l2;
        }
        return arrl;
    }

    public static long[] a(long[] arrl, Random random) {
        int n2 = arrl.length;
        while (n2-- != 0) {
            int n3 = random.nextInt(n2 + 1);
            long l2 = arrl[n2];
            arrl[n2] = arrl[n3];
            arrl[n3] = l2;
        }
        return arrl;
    }

    public static long[] g(long[] arrl) {
        int n2 = arrl.length;
        int n3 = n2 / 2;
        while (n3-- != 0) {
            long l2 = arrl[n2 - n3 - 1];
            arrl[n2 - n3 - 1] = arrl[n3];
            arrl[n3] = l2;
        }
        return arrl;
    }

    public static long[] l(long[] arrl, int n2, int n3) {
        int n4 = n3 - n2;
        int n5 = n4 / 2;
        while (n5-- != 0) {
            long l2 = arrl[n2 + n4 - n5 - 1];
            arrl[n2 + n4 - n5 - 1] = arrl[n2 + n5];
            arrl[n2 + n5] = l2;
        }
        return arrl;
    }

    static /* synthetic */ int a(long[] arrl, int n2, int n3, int n4, cy cy2) {
        return ch.b(arrl, n2, n3, n4, cy2);
    }

    static /* synthetic */ int b(long[] arrl, int n2, int n3, int n4) {
        return ch.c(arrl, n2, n3, n4);
    }

    static /* synthetic */ int a(int[] arrn, long[] arrl, int n2, int n3, int n4) {
        return ch.b(arrn, arrl, n2, n3, n4);
    }

    static /* synthetic */ int a(long[] arrl, long[] arrl2, int n2, int n3, int n4) {
        return ch.c(arrl, arrl2, n2, n3, n4);
    }

    static /* synthetic */ void e(long[] arrl, long[] arrl2, int n2, int n3) {
        ch.f(arrl, arrl2, n2, n3);
    }

    static /* synthetic */ void b(long[] arrl, long[] arrl2, int n2, int n3, int n4) {
        ch.d(arrl, arrl2, n2, n3, n4);
    }
}

