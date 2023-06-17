/*
 * Decompiled with CFR 0.150.
 */
package a.a.a.a.a;

import a.a.a.a.a;
import a.a.a.a.a.ci;
import a.a.a.a.a.cj;
import a.a.a.a.a.ck;
import a.a.a.a.a.cl;
import a.a.a.a.a.cm;
import a.a.a.a.a.cn;
import a.a.a.a.a.co;
import a.a.a.a.a.cp;
import a.a.a.a.a.cq;
import a.a.a.a.a.cy;
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
    public static final int[] a = new int[0];
    private static final int d = 16;
    private static final int e = 8192;
    private static final int f = 128;
    private static final int g = 16;
    private static final int h = 8;
    private static final int i = 255;
    private static final int j = 4;
    private static final int k = 1024;
    private static final int l = 1024;
    protected static final cq b = new cq(-1, -1, -1);
    public static final f c = new cl(null);

    private ch() {
    }

    public static int[] a(int[] arrn, int n2) {
        if (n2 > arrn.length) {
            int[] arrn2 = new int[n2];
            System.arraycopy(arrn, 0, arrn2, 0, arrn.length);
            return arrn2;
        }
        return arrn;
    }

    public static int[] a(int[] arrn, int n2, int n3) {
        if (n2 > arrn.length) {
            int[] arrn2 = new int[n2];
            System.arraycopy(arrn, 0, arrn2, 0, n3);
            return arrn2;
        }
        return arrn;
    }

    public static int[] b(int[] arrn, int n2) {
        if (n2 > arrn.length) {
            int n3 = (int)Math.max(Math.min(2L * (long)arrn.length, 0x7FFFFFF7L), (long)n2);
            int[] arrn2 = new int[n3];
            System.arraycopy(arrn, 0, arrn2, 0, arrn.length);
            return arrn2;
        }
        return arrn;
    }

    public static int[] b(int[] arrn, int n2, int n3) {
        if (n2 > arrn.length) {
            int n4 = (int)Math.max(Math.min(2L * (long)arrn.length, 0x7FFFFFF7L), (long)n2);
            int[] arrn2 = new int[n4];
            System.arraycopy(arrn, 0, arrn2, 0, n3);
            return arrn2;
        }
        return arrn;
    }

    public static int[] c(int[] arrn, int n2) {
        if (n2 >= arrn.length) {
            return arrn;
        }
        int[] arrn2 = n2 == 0 ? a : new int[n2];
        System.arraycopy(arrn, 0, arrn2, 0, n2);
        return arrn2;
    }

    public static int[] d(int[] arrn, int n2) {
        if (n2 == arrn.length) {
            return arrn;
        }
        if (n2 < arrn.length) {
            return ch.c(arrn, n2);
        }
        return ch.a(arrn, n2);
    }

    public static int[] c(int[] arrn, int n2, int n3) {
        ch.e(arrn, n2, n3);
        int[] arrn2 = n3 == 0 ? a : new int[n3];
        System.arraycopy(arrn, n2, arrn2, 0, n3);
        return arrn2;
    }

    public static int[] a(int[] arrn) {
        return (int[])arrn.clone();
    }

    public static void e(int[] arrn, int n2) {
        int n3 = arrn.length;
        while (n3-- != 0) {
            arrn[n3] = n2;
        }
    }

    public static void a(int[] arrn, int n2, int n3, int n4) {
        ch.d(arrn, n2, n3);
        if (n2 == 0) {
            while (n3-- != 0) {
                arrn[n3] = n4;
            }
        } else {
            for (int i2 = n2; i2 < n3; ++i2) {
                arrn[i2] = n4;
            }
        }
    }

    public static boolean a(int[] arrn, int[] arrn2) {
        int n2 = arrn.length;
        if (n2 != arrn2.length) {
            return false;
        }
        while (n2-- != 0) {
            if (arrn[n2] == arrn2[n2]) continue;
            return false;
        }
        return true;
    }

    public static void d(int[] arrn, int n2, int n3) {
        a.a.a.a.a.a(arrn.length, n2, n3);
    }

    public static void e(int[] arrn, int n2, int n3) {
        a.a.a.a.a.b(arrn.length, n2, n3);
    }

    public static void b(int[] arrn, int[] arrn2) {
        if (arrn.length != arrn2.length) {
            throw new IllegalArgumentException("Array size mismatch: " + arrn.length + " != " + arrn2.length);
        }
    }

    public static void f(int[] arrn, int n2, int n3) {
        int n4 = arrn[n2];
        arrn[n2] = arrn[n3];
        arrn[n3] = n4;
    }

    public static void b(int[] arrn, int n2, int n3, int n4) {
        int n5 = 0;
        while (n5 < n4) {
            ch.f(arrn, n2, n3);
            ++n5;
            ++n2;
            ++n3;
        }
    }

    private static int c(int[] arrn, int n2, int n3, int n4, cy cy2) {
        int n5 = cy2.a(arrn[n2], arrn[n3]);
        int n6 = cy2.a(arrn[n2], arrn[n4]);
        int n7 = cy2.a(arrn[n3], arrn[n4]);
        return n5 < 0 ? (n7 < 0 ? n3 : (n6 < 0 ? n4 : n2)) : (n7 > 0 ? n3 : (n6 > 0 ? n4 : n2));
    }

    private static void d(int[] arrn, int n2, int n3, cy cy2) {
        for (int i2 = n2; i2 < n3 - 1; ++i2) {
            int n4;
            int n5 = i2;
            for (n4 = i2 + 1; n4 < n3; ++n4) {
                if (cy2.a(arrn[n4], arrn[n5]) >= 0) continue;
                n5 = n4;
            }
            if (n5 == i2) continue;
            n4 = arrn[i2];
            arrn[i2] = arrn[n5];
            arrn[n5] = n4;
        }
    }

    private static void e(int[] arrn, int n2, int n3, cy cy2) {
        int n4 = n2;
        while (++n4 < n3) {
            int n5 = arrn[n4];
            int n6 = n4;
            int n7 = arrn[n6 - 1];
            while (cy2.a(n5, n7) < 0) {
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

    public static void a(int[] arrn, int n2, int n3, cy cy2) {
        int n4;
        int n5;
        int n6;
        int n7;
        int n8 = n3 - n2;
        if (n8 < 16) {
            ch.d(arrn, n2, n3, cy2);
            return;
        }
        int n9 = n2 + n8 / 2;
        int n10 = n2;
        int n11 = n3 - 1;
        if (n8 > 128) {
            n7 = n8 / 8;
            n10 = ch.c(arrn, n10, n10 + n7, n10 + 2 * n7, cy2);
            n9 = ch.c(arrn, n9 - n7, n9, n9 + n7, cy2);
            n11 = ch.c(arrn, n11 - 2 * n7, n11 - n7, n11, cy2);
        }
        n9 = ch.c(arrn, n10, n9, n11, cy2);
        n7 = arrn[n9];
        int n12 = n6 = n2;
        int n13 = n5 = n3 - 1;
        while (true) {
            if (n12 <= n5 && (n4 = cy2.a(arrn[n12], n7)) <= 0) {
                if (n4 == 0) {
                    ch.f(arrn, n6++, n12);
                }
                ++n12;
                continue;
            }
            while (n5 >= n12 && (n4 = cy2.a(arrn[n5], n7)) >= 0) {
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
            ch.a(arrn, n2, n2 + n4, cy2);
        }
        if ((n4 = n13 - n5) > 1) {
            ch.a(arrn, n3 - n4, n3, cy2);
        }
    }

    public static void a(int[] arrn, cy cy2) {
        ch.a(arrn, 0, arrn.length, cy2);
    }

    public static void b(int[] arrn, int n2, int n3, cy cy2) {
        if (n3 - n2 < 8192) {
            ch.a(arrn, n2, n3, cy2);
        } else {
            ForkJoinPool forkJoinPool = new ForkJoinPool(Runtime.getRuntime().availableProcessors());
            forkJoinPool.invoke(new co(arrn, n2, n3, cy2));
            forkJoinPool.shutdown();
        }
    }

    public static void b(int[] arrn, cy cy2) {
        ch.b(arrn, 0, arrn.length, cy2);
    }

    private static int e(int[] arrn, int n2, int n3, int n4) {
        int n5 = Integer.compare(arrn[n2], arrn[n3]);
        int n6 = Integer.compare(arrn[n2], arrn[n4]);
        int n7 = Integer.compare(arrn[n3], arrn[n4]);
        return n5 < 0 ? (n7 < 0 ? n3 : (n6 < 0 ? n4 : n2)) : (n7 > 0 ? n3 : (n6 > 0 ? n4 : n2));
    }

    private static void m(int[] arrn, int n2, int n3) {
        for (int i2 = n2; i2 < n3 - 1; ++i2) {
            int n4;
            int n5 = i2;
            for (n4 = i2 + 1; n4 < n3; ++n4) {
                if (arrn[n4] >= arrn[n5]) continue;
                n5 = n4;
            }
            if (n5 == i2) continue;
            n4 = arrn[i2];
            arrn[i2] = arrn[n5];
            arrn[n5] = n4;
        }
    }

    private static void n(int[] arrn, int n2, int n3) {
        int n4 = n2;
        while (++n4 < n3) {
            int n5 = arrn[n4];
            int n6 = n4;
            int n7 = arrn[n6 - 1];
            while (n5 < n7) {
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

    public static void g(int[] arrn, int n2, int n3) {
        int n4;
        int n5;
        int n6;
        int n7;
        int n8 = n3 - n2;
        if (n8 < 16) {
            ch.m(arrn, n2, n3);
            return;
        }
        int n9 = n2 + n8 / 2;
        int n10 = n2;
        int n11 = n3 - 1;
        if (n8 > 128) {
            n7 = n8 / 8;
            n10 = ch.e(arrn, n10, n10 + n7, n10 + 2 * n7);
            n9 = ch.e(arrn, n9 - n7, n9, n9 + n7);
            n11 = ch.e(arrn, n11 - 2 * n7, n11 - n7, n11);
        }
        n9 = ch.e(arrn, n10, n9, n11);
        n7 = arrn[n9];
        int n12 = n6 = n2;
        int n13 = n5 = n3 - 1;
        while (true) {
            if (n12 <= n5 && (n4 = Integer.compare(arrn[n12], n7)) <= 0) {
                if (n4 == 0) {
                    ch.f(arrn, n6++, n12);
                }
                ++n12;
                continue;
            }
            while (n5 >= n12 && (n4 = Integer.compare(arrn[n5], n7)) >= 0) {
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
            ch.g(arrn, n2, n2 + n4);
        }
        if ((n4 = n13 - n5) > 1) {
            ch.g(arrn, n3 - n4, n3);
        }
    }

    public static void b(int[] arrn) {
        ch.g(arrn, 0, arrn.length);
    }

    public static void h(int[] arrn, int n2, int n3) {
        if (n3 - n2 < 8192) {
            ch.g(arrn, n2, n3);
        } else {
            ForkJoinPool forkJoinPool = new ForkJoinPool(Runtime.getRuntime().availableProcessors());
            forkJoinPool.invoke(new cm(arrn, n2, n3));
            forkJoinPool.shutdown();
        }
    }

    public static void c(int[] arrn) {
        ch.h(arrn, 0, arrn.length);
    }

    private static int d(int[] arrn, int[] arrn2, int n2, int n3, int n4) {
        int n5 = arrn2[arrn[n2]];
        int n6 = arrn2[arrn[n3]];
        int n7 = arrn2[arrn[n4]];
        int n8 = Integer.compare(n5, n6);
        int n9 = Integer.compare(n5, n7);
        int n10 = Integer.compare(n6, n7);
        return n8 < 0 ? (n10 < 0 ? n3 : (n9 < 0 ? n4 : n2)) : (n10 > 0 ? n3 : (n9 > 0 ? n4 : n2));
    }

    private static void i(int[] arrn, int[] arrn2, int n2, int n3) {
        int n4 = n2;
        while (++n4 < n3) {
            int n5 = arrn[n4];
            int n6 = n4;
            int n7 = arrn[n6 - 1];
            while (arrn2[n5] < arrn2[n7]) {
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

    public static void a(int[] arrn, int[] arrn2, int n2, int n3) {
        int n4;
        int n5;
        int n6;
        int n7;
        int n8 = n3 - n2;
        if (n8 < 16) {
            ch.i(arrn, arrn2, n2, n3);
            return;
        }
        int n9 = n2 + n8 / 2;
        int n10 = n2;
        int n11 = n3 - 1;
        if (n8 > 128) {
            n7 = n8 / 8;
            n10 = ch.d(arrn, arrn2, n10, n10 + n7, n10 + 2 * n7);
            n9 = ch.d(arrn, arrn2, n9 - n7, n9, n9 + n7);
            n11 = ch.d(arrn, arrn2, n11 - 2 * n7, n11 - n7, n11);
        }
        n9 = ch.d(arrn, arrn2, n10, n9, n11);
        n7 = arrn2[arrn[n9]];
        int n12 = n6 = n2;
        int n13 = n5 = n3 - 1;
        while (true) {
            if (n12 <= n5 && (n4 = Integer.compare(arrn2[arrn[n12]], n7)) <= 0) {
                if (n4 == 0) {
                    ch.f(arrn, n6++, n12);
                }
                ++n12;
                continue;
            }
            while (n5 >= n12 && (n4 = Integer.compare(arrn2[arrn[n5]], n7)) >= 0) {
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
            ch.a(arrn, arrn2, n2, n2 + n4);
        }
        if ((n4 = n13 - n5) > 1) {
            ch.a(arrn, arrn2, n3 - n4, n3);
        }
    }

    public static void c(int[] arrn, int[] arrn2) {
        ch.a(arrn, arrn2, 0, arrn2.length);
    }

    public static void b(int[] arrn, int[] arrn2, int n2, int n3) {
        if (n3 - n2 < 8192) {
            ch.a(arrn, arrn2, n2, n3);
        } else {
            ForkJoinPool forkJoinPool = new ForkJoinPool(Runtime.getRuntime().availableProcessors());
            forkJoinPool.invoke(new cp(arrn, arrn2, n2, n3));
            forkJoinPool.shutdown();
        }
    }

    public static void d(int[] arrn, int[] arrn2) {
        ch.b(arrn, arrn2, 0, arrn2.length);
    }

    public static void c(int[] arrn, int[] arrn2, int n2, int n3) {
        int n4 = n2;
        for (int i2 = n2 + 1; i2 < n3; ++i2) {
            if (arrn2[arrn[i2]] == arrn2[arrn[n4]]) continue;
            if (i2 - n4 > 1) {
                ch.h(arrn, n4, i2);
            }
            n4 = i2;
        }
        if (n3 - n4 > 1) {
            ch.h(arrn, n4, n3);
        }
    }

    public static void e(int[] arrn, int[] arrn2) {
        ch.c(arrn, arrn2, 0, arrn.length);
    }

    private static int e(int[] arrn, int[] arrn2, int n2, int n3, int n4) {
        int n5;
        int n6 = Integer.compare(arrn[n2], arrn[n3]);
        int n7 = n6 == 0 ? Integer.compare(arrn2[n2], arrn2[n3]) : n6;
        n6 = Integer.compare(arrn[n2], arrn[n4]);
        int n8 = n6 == 0 ? Integer.compare(arrn2[n2], arrn2[n4]) : n6;
        n6 = Integer.compare(arrn[n3], arrn[n4]);
        int n9 = n5 = n6 == 0 ? Integer.compare(arrn2[n3], arrn2[n4]) : n6;
        return n7 < 0 ? (n5 < 0 ? n3 : (n8 < 0 ? n4 : n2)) : (n5 > 0 ? n3 : (n8 > 0 ? n4 : n2));
    }

    private static void j(int[] arrn, int[] arrn2, int n2, int n3) {
        int n4 = arrn[n2];
        int n5 = arrn2[n2];
        arrn[n2] = arrn[n3];
        arrn2[n2] = arrn2[n3];
        arrn[n3] = n4;
        arrn2[n3] = n5;
    }

    private static void f(int[] arrn, int[] arrn2, int n2, int n3, int n4) {
        int n5 = 0;
        while (n5 < n4) {
            ch.j(arrn, arrn2, n2, n3);
            ++n5;
            ++n2;
            ++n3;
        }
    }

    private static void k(int[] arrn, int[] arrn2, int n2, int n3) {
        for (int i2 = n2; i2 < n3 - 1; ++i2) {
            int n4;
            int n5 = i2;
            for (n4 = i2 + 1; n4 < n3; ++n4) {
                int n6 = Integer.compare(arrn[n4], arrn[n5]);
                if (n6 >= 0 && (n6 != 0 || arrn2[n4] >= arrn2[n5])) continue;
                n5 = n4;
            }
            if (n5 == i2) continue;
            n4 = arrn[i2];
            arrn[i2] = arrn[n5];
            arrn[n5] = n4;
            n4 = arrn2[i2];
            arrn2[i2] = arrn2[n5];
            arrn2[n5] = n4;
        }
    }

    public static void d(int[] arrn, int[] arrn2, int n2, int n3) {
        int n4;
        int n5;
        int n6;
        int n7;
        int n8 = n3 - n2;
        if (n8 < 16) {
            ch.k(arrn, arrn2, n2, n3);
            return;
        }
        int n9 = n2 + n8 / 2;
        int n10 = n2;
        int n11 = n3 - 1;
        if (n8 > 128) {
            n7 = n8 / 8;
            n10 = ch.e(arrn, arrn2, n10, n10 + n7, n10 + 2 * n7);
            n9 = ch.e(arrn, arrn2, n9 - n7, n9, n9 + n7);
            n11 = ch.e(arrn, arrn2, n11 - 2 * n7, n11 - n7, n11);
        }
        n9 = ch.e(arrn, arrn2, n10, n9, n11);
        n7 = arrn[n9];
        int n12 = arrn2[n9];
        int n13 = n6 = n2;
        int n14 = n5 = n3 - 1;
        while (true) {
            int n15;
            if (n13 <= n5 && (n4 = (n15 = Integer.compare(arrn[n13], n7)) == 0 ? Integer.compare(arrn2[n13], n12) : n15) <= 0) {
                if (n4 == 0) {
                    ch.j(arrn, arrn2, n6++, n13);
                }
                ++n13;
                continue;
            }
            while (n5 >= n13 && (n4 = (n15 = Integer.compare(arrn[n5], n7)) == 0 ? Integer.compare(arrn2[n5], n12) : n15) >= 0) {
                if (n4 == 0) {
                    ch.j(arrn, arrn2, n5, n14--);
                }
                --n5;
            }
            if (n13 > n5) break;
            ch.j(arrn, arrn2, n13++, n5--);
        }
        n4 = Math.min(n6 - n2, n13 - n6);
        ch.f(arrn, arrn2, n2, n13 - n4, n4);
        n4 = Math.min(n14 - n5, n3 - n14 - 1);
        ch.f(arrn, arrn2, n13, n3 - n4, n4);
        n4 = n13 - n6;
        if (n4 > 1) {
            ch.d(arrn, arrn2, n2, n2 + n4);
        }
        if ((n4 = n14 - n5) > 1) {
            ch.d(arrn, arrn2, n3 - n4, n3);
        }
    }

    public static void f(int[] arrn, int[] arrn2) {
        ch.b(arrn, arrn2);
        ch.d(arrn, arrn2, 0, arrn.length);
    }

    public static void e(int[] arrn, int[] arrn2, int n2, int n3) {
        if (n3 - n2 < 8192) {
            ch.d(arrn, arrn2, n2, n3);
        }
        ForkJoinPool forkJoinPool = new ForkJoinPool(Runtime.getRuntime().availableProcessors());
        forkJoinPool.invoke(new cn(arrn, arrn2, n2, n3));
        forkJoinPool.shutdown();
    }

    public static void g(int[] arrn, int[] arrn2) {
        ch.b(arrn, arrn2);
        ch.e(arrn, arrn2, 0, arrn.length);
    }

    public static void a(int[] arrn, int n2, int n3, int[] arrn2) {
        int n4 = n3 - n2;
        if (n4 < 16) {
            ch.n(arrn, n2, n3);
            return;
        }
        int n5 = n2 + n3 >>> 1;
        ch.a(arrn2, n2, n5, arrn);
        ch.a(arrn2, n5, n3, arrn);
        if (arrn2[n5 - 1] <= arrn2[n5]) {
            System.arraycopy(arrn2, n2, arrn, n2, n4);
            return;
        }
        int n6 = n2;
        int n7 = n5;
        for (int i2 = n2; i2 < n3; ++i2) {
            arrn[i2] = n7 >= n3 || n6 < n5 && arrn2[n6] <= arrn2[n7] ? arrn2[n6++] : arrn2[n7++];
        }
    }

    public static void i(int[] arrn, int n2, int n3) {
        ch.a(arrn, n2, n3, (int[])arrn.clone());
    }

    public static void d(int[] arrn) {
        ch.i(arrn, 0, arrn.length);
    }

    public static void a(int[] arrn, int n2, int n3, cy cy2, int[] arrn2) {
        int n4 = n3 - n2;
        if (n4 < 16) {
            ch.e(arrn, n2, n3, cy2);
            return;
        }
        int n5 = n2 + n3 >>> 1;
        ch.a(arrn2, n2, n5, cy2, arrn);
        ch.a(arrn2, n5, n3, cy2, arrn);
        if (cy2.a(arrn2[n5 - 1], arrn2[n5]) <= 0) {
            System.arraycopy(arrn2, n2, arrn, n2, n4);
            return;
        }
        int n6 = n2;
        int n7 = n5;
        for (int i2 = n2; i2 < n3; ++i2) {
            arrn[i2] = n7 >= n3 || n6 < n5 && cy2.a(arrn2[n6], arrn2[n7]) <= 0 ? arrn2[n6++] : arrn2[n7++];
        }
    }

    public static void c(int[] arrn, int n2, int n3, cy cy2) {
        ch.a(arrn, n2, n3, cy2, (int[])arrn.clone());
    }

    public static void c(int[] arrn, cy cy2) {
        ch.c(arrn, 0, arrn.length, cy2);
    }

    public static int c(int[] arrn, int n2, int n3, int n4) {
        --n3;
        while (n2 <= n3) {
            int n5 = n2 + n3 >>> 1;
            int n6 = arrn[n5];
            if (n6 < n4) {
                n2 = n5 + 1;
                continue;
            }
            if (n6 > n4) {
                n3 = n5 - 1;
                continue;
            }
            return n5;
        }
        return -(n2 + 1);
    }

    public static int f(int[] arrn, int n2) {
        return ch.c(arrn, 0, arrn.length, n2);
    }

    public static int a(int[] arrn, int n2, int n3, int n4, cy cy2) {
        --n3;
        while (n2 <= n3) {
            int n5 = n2 + n3 >>> 1;
            int n6 = arrn[n5];
            int n7 = cy2.a(n6, n4);
            if (n7 < 0) {
                n2 = n5 + 1;
                continue;
            }
            if (n7 > 0) {
                n3 = n5 - 1;
                continue;
            }
            return n5;
        }
        return -(n2 + 1);
    }

    public static int a(int[] arrn, int n2, cy cy2) {
        return ch.a(arrn, 0, arrn.length, n2, cy2);
    }

    public static void e(int[] arrn) {
        ch.j(arrn, 0, arrn.length);
    }

    public static void j(int[] arrn, int n2, int n3) {
        if (n3 - n2 < 1024) {
            ch.g(arrn, n2, n3);
            return;
        }
        int n4 = 3;
        int n5 = 766;
        int n6 = 0;
        int[] arrn2 = new int[766];
        int[] arrn3 = new int[766];
        int[] arrn4 = new int[766];
        arrn2[n6] = n2;
        arrn3[n6] = n3 - n2;
        arrn4[n6++] = 0;
        int[] arrn5 = new int[256];
        int[] arrn6 = new int[256];
        while (n6 > 0) {
            int n7;
            int n8 = arrn2[--n6];
            int n9 = arrn3[n6];
            int n10 = arrn4[n6];
            int n11 = n10 % 4 == 0 ? 128 : 0;
            int n12 = (3 - n10 % 4) * 8;
            int n13 = n8 + n9;
            while (n13-- != n8) {
                int n14 = arrn[n13] >>> n12 & 0xFF ^ n11;
                arrn5[n14] = arrn5[n14] + 1;
            }
            n13 = -1;
            int n15 = n8;
            for (n7 = 0; n7 < 256; ++n7) {
                if (arrn5[n7] != 0) {
                    n13 = n7;
                }
                arrn6[n7] = n15 += arrn5[n7];
            }
            n7 = n8 + n9 - arrn5[n13];
            int n16 = -1;
            for (n15 = n8; n15 <= n7; n15 += arrn5[n16]) {
                int n17 = arrn[n15];
                n16 = n17 >>> n12 & 0xFF ^ n11;
                if (n15 < n7) {
                    while (true) {
                        int n18 = n16;
                        int n19 = arrn6[n18] - 1;
                        arrn6[n18] = n19;
                        int n20 = n19;
                        if (n19 <= n15) break;
                        int n21 = n17;
                        n17 = arrn[n20];
                        arrn[n20] = n21;
                        n16 = n17 >>> n12 & 0xFF ^ n11;
                    }
                    arrn[n15] = n17;
                }
                if (n10 < 3 && arrn5[n16] > 1) {
                    if (arrn5[n16] < 1024) {
                        ch.g(arrn, n15, n15 + arrn5[n16]);
                    } else {
                        arrn2[n6] = n15;
                        arrn3[n6] = arrn5[n16];
                        arrn4[n6++] = n10 + 1;
                    }
                }
                arrn5[n16] = 0;
            }
        }
    }

    public static void k(int[] arrn, int n2, int n3) {
        if (n3 - n2 < 1024) {
            ch.g(arrn, n2, n3);
            return;
        }
        int n4 = 3;
        LinkedBlockingQueue<cq> linkedBlockingQueue = new LinkedBlockingQueue<cq>();
        linkedBlockingQueue.add(new cq(n2, n3 - n2, 0));
        AtomicInteger atomicInteger = new AtomicInteger(1);
        int n5 = Runtime.getRuntime().availableProcessors();
        ExecutorService executorService = Executors.newFixedThreadPool(n5, Executors.defaultThreadFactory());
        ExecutorCompletionService executorCompletionService = new ExecutorCompletionService(executorService);
        int n6 = n5;
        while (n6-- != 0) {
            executorCompletionService.submit(new ci(atomicInteger, n5, linkedBlockingQueue, arrn));
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

    public static void f(int[] arrn) {
        ch.k(arrn, 0, arrn.length);
    }

    public static void a(int[] arrn, int[] arrn2, boolean bl2) {
        ch.a(arrn, arrn2, 0, arrn.length, bl2);
    }

    public static void a(int[] arrn, int[] arrn2, int n2, int n3, boolean bl2) {
        int[] arrn3;
        if (n3 - n2 < 1024) {
            ch.i(arrn, arrn2, n2, n3);
            return;
        }
        int n4 = 3;
        int n5 = 766;
        int n6 = 0;
        int[] arrn4 = new int[766];
        int[] arrn5 = new int[766];
        int[] arrn6 = new int[766];
        arrn4[n6] = n2;
        arrn5[n6] = n3 - n2;
        arrn6[n6++] = 0;
        int[] arrn7 = new int[256];
        int[] arrn8 = new int[256];
        int[] arrn9 = arrn3 = bl2 ? new int[arrn.length] : null;
        while (n6 > 0) {
            int n7;
            int n8;
            int n9 = arrn4[--n6];
            int n10 = arrn5[n6];
            int n11 = arrn6[n6];
            int n12 = n11 % 4 == 0 ? 128 : 0;
            int n13 = (3 - n11 % 4) * 8;
            int n14 = n9 + n10;
            while (n14-- != n9) {
                int n15 = arrn2[arrn[n14]] >>> n13 & 0xFF ^ n12;
                arrn7[n15] = arrn7[n15] + 1;
            }
            n14 = -1;
            int n16 = n8 = bl2 ? 0 : n9;
            for (n7 = 0; n7 < 256; ++n7) {
                if (arrn7[n7] != 0) {
                    n14 = n7;
                }
                arrn8[n7] = n8 += arrn7[n7];
            }
            if (bl2) {
                n7 = n9 + n10;
                while (n7-- != n9) {
                    int n17 = arrn2[arrn[n7]] >>> n13 & 0xFF ^ n12;
                    int n18 = arrn8[n17] - 1;
                    arrn8[n17] = n18;
                    arrn3[n18] = arrn[n7];
                }
                System.arraycopy(arrn3, 0, arrn, n9, n10);
                n8 = n9;
                for (n7 = 0; n7 <= n14; ++n7) {
                    if (n11 < 3 && arrn7[n7] > 1) {
                        if (arrn7[n7] < 1024) {
                            ch.i(arrn, arrn2, n8, n8 + arrn7[n7]);
                        } else {
                            arrn4[n6] = n8;
                            arrn5[n6] = arrn7[n7];
                            arrn6[n6++] = n11 + 1;
                        }
                    }
                    n8 += arrn7[n7];
                }
                Arrays.fill(arrn7, 0);
                continue;
            }
            n7 = n9 + n10 - arrn7[n14];
            int n19 = -1;
            for (n8 = n9; n8 <= n7; n8 += arrn7[n19]) {
                int n20 = arrn[n8];
                n19 = arrn2[n20] >>> n13 & 0xFF ^ n12;
                if (n8 < n7) {
                    while (true) {
                        int n21 = n19;
                        int n22 = arrn8[n21] - 1;
                        arrn8[n21] = n22;
                        int n23 = n22;
                        if (n22 <= n8) break;
                        int n24 = n20;
                        n20 = arrn[n23];
                        arrn[n23] = n24;
                        n19 = arrn2[n20] >>> n13 & 0xFF ^ n12;
                    }
                    arrn[n8] = n20;
                }
                if (n11 < 3 && arrn7[n19] > 1) {
                    if (arrn7[n19] < 1024) {
                        ch.i(arrn, arrn2, n8, n8 + arrn7[n19]);
                    } else {
                        arrn4[n6] = n8;
                        arrn5[n6] = arrn7[n19];
                        arrn6[n6++] = n11 + 1;
                    }
                }
                arrn7[n19] = 0;
            }
        }
    }

    public static void b(int[] arrn, int[] arrn2, int n2, int n3, boolean bl2) {
        if (n3 - n2 < 1024) {
            ch.a(arrn, arrn2, n2, n3, bl2);
            return;
        }
        int n4 = 3;
        LinkedBlockingQueue<cq> linkedBlockingQueue = new LinkedBlockingQueue<cq>();
        linkedBlockingQueue.add(new cq(n2, n3 - n2, 0));
        AtomicInteger atomicInteger = new AtomicInteger(1);
        int n5 = Runtime.getRuntime().availableProcessors();
        ExecutorService executorService = Executors.newFixedThreadPool(n5, Executors.defaultThreadFactory());
        ExecutorCompletionService executorCompletionService = new ExecutorCompletionService(executorService);
        int[] arrn3 = bl2 ? new int[arrn.length] : null;
        int n6 = n5;
        while (n6-- != 0) {
            executorCompletionService.submit(new cj(atomicInteger, n5, linkedBlockingQueue, arrn2, arrn, bl2, arrn3));
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

    public static void b(int[] arrn, int[] arrn2, boolean bl2) {
        ch.b(arrn, arrn2, 0, arrn2.length, bl2);
    }

    public static void h(int[] arrn, int[] arrn2) {
        ch.b(arrn, arrn2);
        ch.f(arrn, arrn2, 0, arrn.length);
    }

    public static void f(int[] arrn, int[] arrn2, int n2, int n3) {
        if (n3 - n2 < 1024) {
            ch.k(arrn, arrn2, n2, n3);
            return;
        }
        int n4 = 2;
        int n5 = 7;
        int n6 = 1786;
        int n7 = 0;
        int[] arrn3 = new int[1786];
        int[] arrn4 = new int[1786];
        int[] arrn5 = new int[1786];
        arrn3[n7] = n2;
        arrn4[n7] = n3 - n2;
        arrn5[n7++] = 0;
        int[] arrn6 = new int[256];
        int[] arrn7 = new int[256];
        while (n7 > 0) {
            int n8;
            int n9 = arrn3[--n7];
            int n10 = arrn4[n7];
            int n11 = arrn5[n7];
            int n12 = n11 % 4 == 0 ? 128 : 0;
            int[] arrn8 = n11 < 4 ? arrn : arrn2;
            int n13 = (3 - n11 % 4) * 8;
            int n14 = n9 + n10;
            while (n14-- != n9) {
                int n15 = arrn8[n14] >>> n13 & 0xFF ^ n12;
                arrn6[n15] = arrn6[n15] + 1;
            }
            n14 = -1;
            int n16 = n9;
            for (n8 = 0; n8 < 256; ++n8) {
                if (arrn6[n8] != 0) {
                    n14 = n8;
                }
                arrn7[n8] = n16 += arrn6[n8];
            }
            n8 = n9 + n10 - arrn6[n14];
            int n17 = -1;
            for (n16 = n9; n16 <= n8; n16 += arrn6[n17]) {
                int n18 = arrn[n16];
                int n19 = arrn2[n16];
                n17 = arrn8[n16] >>> n13 & 0xFF ^ n12;
                if (n16 < n8) {
                    while (true) {
                        int n20 = n17;
                        int n21 = arrn7[n20] - 1;
                        arrn7[n20] = n21;
                        int n22 = n21;
                        if (n21 <= n16) break;
                        n17 = arrn8[n22] >>> n13 & 0xFF ^ n12;
                        int n23 = n18;
                        n18 = arrn[n22];
                        arrn[n22] = n23;
                        n23 = n19;
                        n19 = arrn2[n22];
                        arrn2[n22] = n23;
                    }
                    arrn[n16] = n18;
                    arrn2[n16] = n19;
                }
                if (n11 < 7 && arrn6[n17] > 1) {
                    if (arrn6[n17] < 1024) {
                        ch.k(arrn, arrn2, n16, n16 + arrn6[n17]);
                    } else {
                        arrn3[n7] = n16;
                        arrn4[n7] = arrn6[n17];
                        arrn5[n7++] = n11 + 1;
                    }
                }
                arrn6[n17] = 0;
            }
        }
    }

    public static void g(int[] arrn, int[] arrn2, int n2, int n3) {
        if (n3 - n2 < 1024) {
            ch.d(arrn, arrn2, n2, n3);
            return;
        }
        int n4 = 2;
        if (arrn.length != arrn2.length) {
            throw new IllegalArgumentException("Array size mismatch.");
        }
        int n5 = 7;
        LinkedBlockingQueue<cq> linkedBlockingQueue = new LinkedBlockingQueue<cq>();
        linkedBlockingQueue.add(new cq(n2, n3 - n2, 0));
        AtomicInteger atomicInteger = new AtomicInteger(1);
        int n6 = Runtime.getRuntime().availableProcessors();
        ExecutorService executorService = Executors.newFixedThreadPool(n6, Executors.defaultThreadFactory());
        ExecutorCompletionService executorCompletionService = new ExecutorCompletionService(executorService);
        int n7 = n6;
        while (n7-- != 0) {
            executorCompletionService.submit(new ck(atomicInteger, n6, linkedBlockingQueue, arrn, arrn2));
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

    public static void i(int[] arrn, int[] arrn2) {
        ch.b(arrn, arrn2);
        ch.g(arrn, arrn2, 0, arrn.length);
    }

    private static void a(int[] arrn, int[] arrn2, int[] arrn3, int n2, int n3) {
        int n4 = n2;
        while (++n4 < n3) {
            int n5 = arrn[n4];
            int n6 = n4;
            int n7 = arrn[n6 - 1];
            while (arrn2[n5] < arrn2[n7] || arrn2[n5] == arrn2[n7] && arrn3[n5] < arrn3[n7]) {
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

    public static void a(int[] arrn, int[] arrn2, int[] arrn3, boolean bl2) {
        ch.b(arrn2, arrn3);
        ch.a(arrn, arrn2, arrn3, 0, arrn2.length, bl2);
    }

    public static void a(int[] arrn, int[] arrn2, int[] arrn3, int n2, int n3, boolean bl2) {
        int[] arrn4;
        if (n3 - n2 < 1024) {
            ch.a(arrn, arrn2, arrn3, n2, n3);
            return;
        }
        int n4 = 2;
        int n5 = 7;
        int n6 = 1786;
        int n7 = 0;
        int[] arrn5 = new int[1786];
        int[] arrn6 = new int[1786];
        int[] arrn7 = new int[1786];
        arrn5[n7] = n2;
        arrn6[n7] = n3 - n2;
        arrn7[n7++] = 0;
        int[] arrn8 = new int[256];
        int[] arrn9 = new int[256];
        int[] arrn10 = arrn4 = bl2 ? new int[arrn.length] : null;
        while (n7 > 0) {
            int n8;
            int n9;
            int n10 = arrn5[--n7];
            int n11 = arrn6[n7];
            int n12 = arrn7[n7];
            int n13 = n12 % 4 == 0 ? 128 : 0;
            int[] arrn11 = n12 < 4 ? arrn2 : arrn3;
            int n14 = (3 - n12 % 4) * 8;
            int n15 = n10 + n11;
            while (n15-- != n10) {
                int n16 = arrn11[arrn[n15]] >>> n14 & 0xFF ^ n13;
                arrn8[n16] = arrn8[n16] + 1;
            }
            n15 = -1;
            int n17 = n9 = bl2 ? 0 : n10;
            for (n8 = 0; n8 < 256; ++n8) {
                if (arrn8[n8] != 0) {
                    n15 = n8;
                }
                arrn9[n8] = n9 += arrn8[n8];
            }
            if (bl2) {
                n8 = n10 + n11;
                while (n8-- != n10) {
                    int n18 = arrn11[arrn[n8]] >>> n14 & 0xFF ^ n13;
                    int n19 = arrn9[n18] - 1;
                    arrn9[n18] = n19;
                    arrn4[n19] = arrn[n8];
                }
                System.arraycopy(arrn4, 0, arrn, n10, n11);
                n9 = n10;
                for (n8 = 0; n8 < 256; ++n8) {
                    if (n12 < 7 && arrn8[n8] > 1) {
                        if (arrn8[n8] < 1024) {
                            ch.a(arrn, arrn2, arrn3, n9, n9 + arrn8[n8]);
                        } else {
                            arrn5[n7] = n9;
                            arrn6[n7] = arrn8[n8];
                            arrn7[n7++] = n12 + 1;
                        }
                    }
                    n9 += arrn8[n8];
                }
                Arrays.fill(arrn8, 0);
                continue;
            }
            n8 = n10 + n11 - arrn8[n15];
            int n20 = -1;
            for (n9 = n10; n9 <= n8; n9 += arrn8[n20]) {
                int n21 = arrn[n9];
                n20 = arrn11[n21] >>> n14 & 0xFF ^ n13;
                if (n9 < n8) {
                    while (true) {
                        int n22 = n20;
                        int n23 = arrn9[n22] - 1;
                        arrn9[n22] = n23;
                        int n24 = n23;
                        if (n23 <= n9) break;
                        int n25 = n21;
                        n21 = arrn[n24];
                        arrn[n24] = n25;
                        n20 = arrn11[n21] >>> n14 & 0xFF ^ n13;
                    }
                    arrn[n9] = n21;
                }
                if (n12 < 7 && arrn8[n20] > 1) {
                    if (arrn8[n20] < 1024) {
                        ch.a(arrn, arrn2, arrn3, n9, n9 + arrn8[n20]);
                    } else {
                        arrn5[n7] = n9;
                        arrn6[n7] = arrn8[n20];
                        arrn7[n7++] = n12 + 1;
                    }
                }
                arrn8[n20] = 0;
            }
        }
    }

    private static void a(int[][] arrn, int n2, int n3, int n4) {
        int n5 = arrn.length;
        int n6 = n4 / 4;
        for (int i2 = n2; i2 < n3 - 1; ++i2) {
            int n7;
            int n8;
            int n9 = i2;
            block1: for (n8 = i2 + 1; n8 < n3; ++n8) {
                for (n7 = n6; n7 < n5; ++n7) {
                    if (arrn[n7][n8] < arrn[n7][n9]) {
                        n9 = n8;
                        continue block1;
                    }
                    if (arrn[n7][n8] > arrn[n7][n9]) continue block1;
                }
            }
            if (n9 == i2) continue;
            n8 = n5;
            while (n8-- != 0) {
                n7 = arrn[n8][i2];
                arrn[n8][i2] = arrn[n8][n9];
                arrn[n8][n9] = n7;
            }
        }
    }

    public static void a(int[][] arrn) {
        ch.a(arrn, 0, arrn[0].length);
    }

    public static void a(int[][] arrn, int n2, int n3) {
        if (n3 - n2 < 1024) {
            ch.a(arrn, n2, n3, 0);
            return;
        }
        int n4 = arrn.length;
        int n5 = 4 * n4 - 1;
        int n6 = n4;
        int n7 = arrn[0].length;
        while (n6-- != 0) {
            if (arrn[n6].length == n7) continue;
            throw new IllegalArgumentException("The array of index " + n6 + " has not the same length of the array of index 0.");
        }
        n6 = 255 * (n4 * 4 - 1) + 1;
        n7 = 0;
        int[] arrn2 = new int[n6];
        int[] arrn3 = new int[n6];
        int[] arrn4 = new int[n6];
        arrn2[n7] = n2;
        arrn3[n7] = n3 - n2;
        arrn4[n7++] = 0;
        int[] arrn5 = new int[256];
        int[] arrn6 = new int[256];
        int[] arrn7 = new int[n4];
        while (n7 > 0) {
            int n8;
            int n9 = arrn2[--n7];
            int n10 = arrn3[n7];
            int n11 = arrn4[n7];
            int n12 = n11 % 4 == 0 ? 128 : 0;
            int[] arrn8 = arrn[n11 / 4];
            int n13 = (3 - n11 % 4) * 8;
            int n14 = n9 + n10;
            while (n14-- != n9) {
                int n15 = arrn8[n14] >>> n13 & 0xFF ^ n12;
                arrn5[n15] = arrn5[n15] + 1;
            }
            n14 = -1;
            int n16 = n9;
            for (n8 = 0; n8 < 256; ++n8) {
                if (arrn5[n8] != 0) {
                    n14 = n8;
                }
                arrn6[n8] = n16 += arrn5[n8];
            }
            n8 = n9 + n10 - arrn5[n14];
            int n17 = -1;
            for (n16 = n9; n16 <= n8; n16 += arrn5[n17]) {
                int n18 = n4;
                while (n18-- != 0) {
                    arrn7[n18] = arrn[n18][n16];
                }
                n17 = arrn8[n16] >>> n13 & 0xFF ^ n12;
                if (n16 < n8) {
                    block6: while (true) {
                        int n19 = n17;
                        int n20 = arrn6[n19] - 1;
                        arrn6[n19] = n20;
                        int n21 = n20;
                        if (n20 <= n16) break;
                        n17 = arrn8[n21] >>> n13 & 0xFF ^ n12;
                        n18 = n4;
                        while (true) {
                            if (n18-- == 0) continue block6;
                            int n22 = arrn7[n18];
                            arrn7[n18] = arrn[n18][n21];
                            arrn[n18][n21] = n22;
                        }
                        break;
                    }
                    n18 = n4;
                    while (n18-- != 0) {
                        arrn[n18][n16] = arrn7[n18];
                    }
                }
                if (n11 < n5 && arrn5[n17] > 1) {
                    if (arrn5[n17] < 1024) {
                        ch.a(arrn, n16, n16 + arrn5[n17], n11 + 1);
                    } else {
                        arrn2[n7] = n16;
                        arrn3[n7] = arrn5[n17];
                        arrn4[n7++] = n11 + 1;
                    }
                }
                arrn5[n17] = 0;
            }
        }
    }

    public static int[] a(int[] arrn, int n2, int n3, Random random) {
        int n4 = n3 - n2;
        while (n4-- != 0) {
            int n5 = random.nextInt(n4 + 1);
            int n6 = arrn[n2 + n4];
            arrn[n2 + n4] = arrn[n2 + n5];
            arrn[n2 + n5] = n6;
        }
        return arrn;
    }

    public static int[] a(int[] arrn, Random random) {
        int n2 = arrn.length;
        while (n2-- != 0) {
            int n3 = random.nextInt(n2 + 1);
            int n4 = arrn[n2];
            arrn[n2] = arrn[n3];
            arrn[n3] = n4;
        }
        return arrn;
    }

    public static int[] g(int[] arrn) {
        int n2 = arrn.length;
        int n3 = n2 / 2;
        while (n3-- != 0) {
            int n4 = arrn[n2 - n3 - 1];
            arrn[n2 - n3 - 1] = arrn[n3];
            arrn[n3] = n4;
        }
        return arrn;
    }

    public static int[] l(int[] arrn, int n2, int n3) {
        int n4 = n3 - n2;
        int n5 = n4 / 2;
        while (n5-- != 0) {
            int n6 = arrn[n2 + n4 - n5 - 1];
            arrn[n2 + n4 - n5 - 1] = arrn[n2 + n5];
            arrn[n2 + n5] = n6;
        }
        return arrn;
    }

    static /* synthetic */ int b(int[] arrn, int n2, int n3, int n4, cy cy2) {
        return ch.c(arrn, n2, n3, n4, cy2);
    }

    static /* synthetic */ int d(int[] arrn, int n2, int n3, int n4) {
        return ch.e(arrn, n2, n3, n4);
    }

    static /* synthetic */ int a(int[] arrn, int[] arrn2, int n2, int n3, int n4) {
        return ch.d(arrn, arrn2, n2, n3, n4);
    }

    static /* synthetic */ int b(int[] arrn, int[] arrn2, int n2, int n3, int n4) {
        return ch.e(arrn, arrn2, n2, n3, n4);
    }

    static /* synthetic */ void h(int[] arrn, int[] arrn2, int n2, int n3) {
        ch.j(arrn, arrn2, n2, n3);
    }

    static /* synthetic */ void c(int[] arrn, int[] arrn2, int n2, int n3, int n4) {
        ch.f(arrn, arrn2, n2, n3, n4);
    }
}

